/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.Venta;


import Buttons.ModelActionVenta;
import Buttons.PanelActionDeleteVenta;
import Buttons.PanelActionEditVenta;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author yatac
 */
public class TableCellActionEditVenta extends DefaultCellEditor{
    private ModelActionVenta data;
    
    public TableCellActionEditVenta() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionVenta) o;        
        PanelActionEditVenta cell = new PanelActionEditVenta(data);
        cell.setBackground(new Color(30, 30, 30, 50));
        return cell;
    }

    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
