package Buttons;

import Model.ModelCellClientes;
import table.TableClient.TableActionEventCliente;

public class ModelActionClientes {

    public ModelCellClientes getClientes() {
        return clientes;
    }

    public void setClientes(ModelCellClientes clientes) {
        this.clientes = clientes;
    }

    public TableActionEventCliente getEvent() {
        return event;
    }

    public void setEvent(TableActionEventCliente event) {
        this.event = event;
    }

    public ModelActionClientes(ModelCellClientes clientes, TableActionEventCliente event) {
        this.clientes = clientes;
        this.event = event;
    }

    public ModelActionClientes() {
        
    }

    private ModelCellClientes clientes;
    private TableActionEventCliente event;
    
}
