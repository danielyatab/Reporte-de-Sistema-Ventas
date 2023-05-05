/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Buttons.ModelActionProductos;

/**
 *
 * @author yatac
 */
public class ModelCellVentaProductos {
    private String codigo;
    private String producto;
    private int cantidad;
    private float precioU;
    private String estado;
   
    public static void ModelCellClientes(){
        /*Constructor por defecto*/
    }
    
    public ModelCellVentaProductos(String codigo, String producto, int cantidad, float precioU, String estado) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.estado = estado;
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

    
    
    public Object[] toRowTable(TableActionEvent event){
        return new Object[]{codigo, producto, cantidad, precioU, new ModelActionProductos(this, event), new ModelActionProductos(this, event),new ModelActionProductos(this, event)};
    }
    
}
