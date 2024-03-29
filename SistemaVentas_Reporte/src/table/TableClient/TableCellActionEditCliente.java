
package table.TableClient;

import Buttons.ModelActionClientes;
import Buttons.PanelActionEditClientes;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 * @author yatac
 */
public class TableCellActionEditCliente extends DefaultCellEditor{
    
    private ModelActionClientes data;

    public TableCellActionEditCliente() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        data = (ModelActionClientes) o;        
        PanelActionEditClientes cell = new PanelActionEditClientes(data);
        cell.setBackground(new Color(30, 30, 30, 50));
        return cell;
    }

    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
