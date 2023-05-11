package Buttons;

import Model.ModelCellProduct;
import Table.TableProduct.TableActionEventProduct;

public class ModelActionProductos {

    public ModelCellProduct getProducto() {
        return producto;
    }

    public void setProducto(ModelCellProduct producto) {
        this.producto = producto;
    }

    public TableActionEventProduct getEvent() {
        return event;
    }

    public void setEvent(TableActionEventProduct event) {
        this.event = event;
    }

    
    public ModelActionProductos(ModelCellProduct producto, TableActionEventProduct event) {
        this.producto = producto;
        this.event = event;
    }

    public ModelActionProductos() {
        
    }

    private ModelCellProduct producto;
    private TableActionEventProduct event;
}
