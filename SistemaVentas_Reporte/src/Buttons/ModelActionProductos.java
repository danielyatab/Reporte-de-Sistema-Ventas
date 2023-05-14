package Buttons;

import Model.ModelCellProductos;
import Table.TableProduct.TableActionEventProduct;

public class ModelActionProductos {

    public ModelCellProductos getProducto() {
        return producto;
    }

    public void setProducto(ModelCellProductos producto) {
        this.producto = producto;
    }

    public TableActionEventProduct getEvent() {
        return event;
    }

    public void setEvent(TableActionEventProduct event) {
        this.event = event;
    }

    
    public ModelActionProductos(ModelCellProductos producto, TableActionEventProduct event) {
        this.producto = producto;
        this.event = event;
    }

    public ModelActionProductos() {
        
    }

    private ModelCellProductos producto;
    private TableActionEventProduct event;
}
