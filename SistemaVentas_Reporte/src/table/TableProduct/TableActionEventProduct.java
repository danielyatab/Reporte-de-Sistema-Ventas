/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Table.TableProduct;

import Model.ModelCellProduct;


/**
 *
 * @author yatac
 */

public interface TableActionEventProduct {
    public void onEdit(ModelCellProduct producto);
    public void onDelete(ModelCellProduct producto);
}
