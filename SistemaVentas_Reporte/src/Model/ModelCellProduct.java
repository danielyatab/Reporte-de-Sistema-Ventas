package Model;

import Buttons.ModelActionProductos;
import Table.TableProduct.TableActionEventProduct;

/**
 *
 * @author yatac
 */
public class ModelCellProduct {
    private String codigo;
    private String producto;
    private String tipo;
    private int cantidad;
    private float precioU;
    
   
    public static void ModelCellProduct(){
        /*Constructor por defecto*/
    }
    
    public ModelCellProduct(String codigo, String producto,String tipo, int cantidad, float precioU) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.tipo = tipo;
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

    public float getPrecioU() {
        return precioU;
    }

    public void setPrecioU(float precioU) {
        this.precioU = precioU;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public Object[] toRowTable(TableActionEventProduct event){
        return new Object[]{codigo, producto, tipo,cantidad, precioU, new ModelActionProductos(this, event), new ModelActionProductos(this, event)};
    }
    
}
