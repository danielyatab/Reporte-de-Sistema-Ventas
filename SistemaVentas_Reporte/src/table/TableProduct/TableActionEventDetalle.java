/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package table.TableProduct;

import Model.ModelCellDetalles;


/**
 *
 * @author yatac
 */
public interface TableActionEventDetalle {
    public void onEdit(ModelCellDetalles producto);
    public void onDelete(ModelCellDetalles producto);
    public void onView(ModelCellDetalles producto);
}
