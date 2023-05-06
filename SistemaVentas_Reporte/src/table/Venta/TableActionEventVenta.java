/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package table.Venta;

import table.TableClient.*;
import Model.ModelCellClientes;
import Model.ModelCellVenta;

/**
 *
 * @author yatac
 */
public interface TableActionEventVenta {
    public void onDelete(ModelCellVenta venta);
    public void onEdit(ModelCellVenta venta);
}
