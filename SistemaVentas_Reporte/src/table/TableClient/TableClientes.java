/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.TableClient;

import Buttons.ModelActionClientes;
import Design.ShadowRenderer;
import Design.ScrollBar;
import Buttons.PanelActionDeleteClientes;
import Buttons.PanelActionEditClientes;
import Table.TableProduct.TableCell;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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
public class TableClientes extends JTable{
    private BufferedImage imageShadow;    
    private int columns;
    private int columnEdit;
    private int columnDelete;
    
    public void setIconsColumns(int columns, int columnEdit, int columnDelete){
        this.columns = columns;
        this.columnEdit = columnEdit;
        this.columnDelete = columnDelete;
    }
    
    
    public TableClientes( ){
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
        
        addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e) {
                createShadow();
            }
        });      
    }
    
    
    /*Metodo de Sobra para cada lista de tabla*/
    private void createShadow(){
        int width =  getWidth();        
        int heigth = getHeight();
        int space = 12;
        int margin = space/2;
        try {
            imageShadow = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imageShadow.createGraphics();
            g2.fillRect(0, 0, width-margin,heigth-margin);
            g2.drawImage(new ShadowRenderer(6, 0.3f, new Color(160,160,160)).createShadow(imageShadow),-4 , -4,  null);
            g2.fillRect(margin, margin, width-space,heigth-space);
            g2.setComposite(AlphaComposite.Clear);
            g2.fillRect(margin, margin, width-space, heigth-space);
            g2.dispose();
        } catch (Exception e) {
            System.out.println("Error:"+ e.getMessage());
        }
        
        
    }
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        /*Retorno de boton Editar*/
        if(column == columnEdit){
           Object o = null;
           ModelActionClientes data;
           data = (ModelActionClientes) o; 
           PanelActionEditClientes cell = new PanelActionEditClientes(data);           
           return cell;
        /*Retorno de boton Eliminar*/
        }else if(column == columnDelete){
           Object o = null;
           ModelActionClientes data;
           data = (ModelActionClientes) o; 
           PanelActionDeleteClientes cell = new PanelActionDeleteClientes(data);   
           return cell;
        /*Retorno de Celdas con informacion*/
        }else{
            String value="";
            if(getValueAt(row,column) != null){
                value = getValueAt(row, column).toString();
            }
            TableCell cell = new TableCell(value);
            cell.setHorizontalAlignment(JLabel.CENTER); 
            return cell;
        }
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        //Se COLOCA EL NUMEOR DE COLUMNA EL CUAL CONTENDRA LOS BTNS CON ACCIONES
        if (col == columnEdit) {
            return new TableCellActionEditCliente();
        } else if(col == columnDelete){
            return new TableCellActionDeleteCliente();
        } else {
            return super.getCellEditor(row, col);
        }
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
               g2.setColor(new Color(255, 111, 60));
               g2.fillRect(margin, r.getLocation().y + margin,3/2 , rowHeight - space);
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
