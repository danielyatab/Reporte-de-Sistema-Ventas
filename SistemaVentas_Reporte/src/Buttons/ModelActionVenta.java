package Buttons;

import Model.ModelCellProveedores;
import table.TableProveedores.TableActionEventProveedores;


public class ModelActionVenta {

    public ModelCellProveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(ModelCellProveedores proveedores) {
        this.proveedores = proveedores;
    }

    public TableActionEventProveedores getEvent() {
        return event;
    }

    public void setEvent(TableActionEventProveedores event) {
        this.event = event;
    }

    
    public ModelActionVenta(ModelCellProveedores proveedores, TableActionEventProveedores event) {
        this.proveedores = proveedores;
        this.event = event;
    }

    public ModelActionVenta() {
        
    }

    private ModelCellProveedores proveedores;
    private TableActionEventProveedores event;
}
