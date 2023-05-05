/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package table.TableDetalles;

import table.TableClient.*;
import Model.ModelCellClientes;
import Model.ModelCellDetalles;

/**
 *
 * @author yatac
 */
public interface TableActionEventDetalles {
    public void onEdit(ModelCellDetalles detalles);
    public void onDelete(ModelCellDetalles detalles);
    public void onView(ModelCellDetalles detalles);
}
