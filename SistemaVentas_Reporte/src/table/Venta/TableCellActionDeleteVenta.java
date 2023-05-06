/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table.Venta;

import table.TableClient.*;
import Buttons.ModelActionClientes;
import table.TableProveedores.*;
import table.TableProduct.*;
import Buttons.ModelActionProductos;
import Buttons.ModelActionProveedores;
import Buttons.ModelActionVenta;
import Buttons.PanelActionDeleteVenta;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author yatac
 */
public class TableCellActionDeleteVenta extends DefaultCellEditor{
    private ModelActionVenta data;
    
    public TableCellActionDeleteVenta() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionVenta) o;        
        PanelActionDeleteVenta cell = new PanelActionDeleteVenta(data);
        cell.setBackground(new Color(30, 30, 30, 50));
        return cell;
    }

    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
