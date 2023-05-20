package Model;

import Buttons.ModelActionVenta;
import table.Venta.TableActionEventVenta;

/**
 *
 * @author yatac
 */
public class ModelCellVenta {
   
    private String codigo;
    private String producto;
    private String marca;
    private String descripcion;
    private int cantidad;
    private double precioU;
    private double total;
    

    
    public ModelCellVenta(){
        /*Constructor por defecto*/
    }

    public ModelCellVenta(String producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public ModelCellVenta(String codigo, String producto, String marca, String descripcion, int cantidad, double precioU, double total) {
        this.codigo = codigo;
        this.producto = producto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
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
        return new Object[]{codigo,producto, marca,descripcion,cantidad,precioU,total, new ModelActionVenta(this, event), new ModelActionVenta(this, event)};
    }
    
}
