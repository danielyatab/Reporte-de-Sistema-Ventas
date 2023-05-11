package Model;

import Buttons.ModelActionVenta;
import table.Venta.TableActionEventVenta;

/**
 *
 * @author yatac
 */
public class ModelCellVenta {
   
    
    private String producto;
    private int cantidad;
    private double total;
    

    public static void ModelCellVenta(){
        /*Constructor por defecto*/
    }

    public ModelCellVenta(String producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public Object[] toRowTable(TableActionEventVenta event){
        return new Object[]{producto, cantidad, total, new ModelActionVenta(this, event), new ModelActionVenta(this, event)};
    }
    
}
