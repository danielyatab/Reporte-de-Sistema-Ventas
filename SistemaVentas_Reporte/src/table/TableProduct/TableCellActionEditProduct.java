/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table.TableProduct;

import Buttons.ModelActionProductos;
import Buttons.PanelActionEditProductos;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author yatac
 */
public class TableCellActionEditProduct extends DefaultCellEditor{
    
    private ModelActionProductos data;

    public TableCellActionEditProduct() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionProductos) o;        
        PanelActionEditProductos cell = new PanelActionEditProductos(data);
        cell.setBackground(new Color(30, 30, 30, 50));
        return cell;
    }

    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
