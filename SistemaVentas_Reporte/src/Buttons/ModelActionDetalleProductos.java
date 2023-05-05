package Buttons;

import Model.ModelCellProveedores;
import table.TableProveedores.TableActionEventProveedores;


public class ModelActionDetalleProductos {

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

    
    public ModelActionDetalleProductos(ModelCellProveedores proveedores, TableActionEventProveedores event) {
        this.proveedores = proveedores;
        this.event = event;
    }

    public ModelActionDetalleProductos() {
        
    }

    private ModelCellProveedores proveedores;
    private TableActionEventProveedores event;
}
