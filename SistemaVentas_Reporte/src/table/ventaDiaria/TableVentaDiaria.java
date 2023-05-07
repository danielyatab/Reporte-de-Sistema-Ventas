/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.ventaDiaria;

import Design.ScrollBar;
import Table.TableProduct.TableCell;
//import Table.TableProduct.TableCell;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import table.TableHeader;

/**
 *
 * @author yatac
 */
public class TableVentaDiaria extends JTable{
    private BufferedImage imageShadow;    
    private int columns;

    
    public void setIconsColumns(int columns){
        this.columns = columns;
    }
    
    
    public TableVentaDiaria( ){
        setRowHeight(56);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader h =  new TableHeader(value+"");
                /*Alineacion centrada para cada texto*/
                h.setHorizontalAlignment(JLabel.CENTER);
                if(row == 0 || column == columns){
                    h.setHorizontalAlignment(JLabel.CENTER);
                }
                return h;
            }   
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            
        });
        
            
    }
    
    
    /*Metodo de Sobra para cada lista de tabla*/
   
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
            String value="";
            if(getValueAt(row,column) != null){
                value = getValueAt(row, column).toString();
            }
            TableCellDiario cell = new TableCellDiario(value);
            cell.setHorizontalAlignment(JLabel.CENTER); 
            return cell;
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        //Se COLOCA EL NUMEOR DE COLUMNA EL CUAL CONTENDRA LOS BTNS CON ACCIONES
            return super.getCellEditor(row, col);
    }
    
    /*Metodo para agregar elementos*/
    public void addRow(Object[] row){
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2  = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int space = 12;
        int margin = space/2;
        for (int i = 0; i < getRowCount(); i++) {
            //MODIFICACION A CADA CELDA PAR QUE TENGA EL BORDE DE LISTA
               int row = i;
               Rectangle r =  getCellRect(row,0, true);
               g2.drawImage(imageShadow,0,r.getLocation().y,null);
               g2.setColor(new Color(42,192,216));
               g2.fillRect(margin, r.getLocation().y + margin,3/2, rowHeight - space);
        }
        g2.dispose(); 
    }
    
    public void fixTable(JScrollPane scroll){
        scroll.setBorder(null);
        scroll.getViewport().setBackground(new Color(250,250,250));
        ScrollBar sb = new ScrollBar();
        sb.setBackground(new Color(250,250,250));
        scroll.setVerticalScrollBar(sb);
        JPanel p = new JPanel();
        p.setBackground(new Color(250,250,250));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

}
