/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Table.TableProduct;

import Model.ModelCellProductos;


/**
 *
 * @author yatac
 */

public interface TableActionEventProduct {
    public void onEdit(ModelCellProductos producto);
    public void onDelete(ModelCellProductos producto);
}
