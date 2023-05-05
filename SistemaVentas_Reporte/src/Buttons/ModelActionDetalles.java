package Buttons;

import Model.ModelCellDetalles;
import table.TableDetalles.TableActionEventDetalles;


public class ModelActionDetalles {

    public ModelCellDetalles getDetalles() {
        return detalles;
    }

    public void setDetalles(ModelCellDetalles detalles) {
        this.detalles = detalles;
    }

    public TableActionEventDetalles getEvent() {
        return event;
    }

    public void setEvent(TableActionEventDetalles event) {
        this.event = event;
    }

    public ModelActionDetalles(ModelCellDetalles detalles, TableActionEventDetalles event) {
        this.detalles = detalles;
        this.event = event;
    }


    private ModelCellDetalles detalles;
    private TableActionEventDetalles event;
}
