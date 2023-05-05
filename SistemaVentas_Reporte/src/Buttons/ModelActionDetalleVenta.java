package Buttons;

import Model.ModelCellProveedores;
import table.TableProveedores.TableActionEventProveedores;


public class ModelActionDetalleVenta {

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

    
    public ModelActionDetalleVenta(ModelCellProveedores proveedores, TableActionEventProveedores event) {
        this.proveedores = proveedores;
        this.event = event;
    }

    public ModelActionDetalleVenta() {
        
    }

    private ModelCellProveedores proveedores;
    private TableActionEventProveedores event;
}
