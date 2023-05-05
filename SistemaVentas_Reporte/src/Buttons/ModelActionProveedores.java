package Buttons;

import Model.ModelCellProveedores;
import table.TableProveedores.TableActionEventProveedores;


public class ModelActionProveedores {

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

    
    public ModelActionProveedores(ModelCellProveedores proveedores, TableActionEventProveedores event) {
        this.proveedores = proveedores;
        this.event = event;
    }

    public ModelActionProveedores() {
        
    }

    private ModelCellProveedores proveedores;
    private TableActionEventProveedores event;
}
