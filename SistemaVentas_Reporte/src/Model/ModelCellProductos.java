package Model;

import Buttons.ModelActionProductos;
import view.panels.TableActionEventProduct;

/**
 *
 * @author yatac
 */
public class ModelCellProductos {
    private String codigo;
    private String producto;
    private String tipo;
    private String descripcion;
    private String marca;
    private int cantidad;
    private double precioU;
    
   
    public ModelCellProductos(){
        /*Constructor por defecto*/
    }
   

    public ModelCellProductos(String codigo, String producto, String tipo, String descripcion, String marca, int cantidad, double precioU) {
        this.codigo = codigo;
        this.producto = producto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precioU = precioU;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public Object[] toRowTable(TableActionEventProduct event){
        return new Object[]{codigo, producto, tipo, descripcion, marca, cantidad, precioU, new ModelActionProductos(this, event), new ModelActionProductos(this, event)};
    }
    
}
