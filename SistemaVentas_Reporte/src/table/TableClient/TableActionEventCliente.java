/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package table.TableClient;

import Model.ModelCellClientes;

/**
 *
 * @author yatac
 */
public interface TableActionEventCliente {
    public void onEdit(ModelCellClientes clientes);
    public void onDelete(ModelCellClientes clientes);
}
