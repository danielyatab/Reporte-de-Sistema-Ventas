package Buttons;

import Model.ModelCellVenta;
import table.Venta.TableActionEventVenta;

public class ModelActionVenta {

    public ModelCellVenta getVenta() {
        return venta;
    }

    public void setVenta(ModelCellVenta venta) {
        this.venta = venta;
    }

    public TableActionEventVenta getEvent() {
        return event;
    }

    public void setEvent(TableActionEventVenta event) {
        this.event = event;
    }

    public ModelActionVenta(ModelCellVenta venta, TableActionEventVenta event) {
        this.venta = venta;
        this.event = event;
    }
   
    public ModelActionVenta() {
        
    }

    private ModelCellVenta venta;
    private TableActionEventVenta event;
}
