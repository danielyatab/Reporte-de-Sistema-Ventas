
package Model;

import Buttons.ModelActionDetalles;
import table.TableDetalles.TableActionEventDetalles;

/**
 *
 * @author yatac
 */
public class ModelCellDetalles {
    
    private String nVenta;
    private String cliente;
    private String telefono;
    private Float totalVenta;
    private String fecha;
    
    
    public static void ModelCellDetalles(){
        /*Constructor por defecto*/
    }

    public ModelCellDetalles(String nVenta, String cliente, String telefono, Float totalVenta, String fecha) {
        this.nVenta = nVenta;
        this.cliente = cliente;
        this.telefono = telefono;
        this.totalVenta = totalVenta;
        this.fecha = fecha;
    }

    public String getnVenta() {
        return nVenta;
    }

    public void setnVenta(String nVenta) {
        this.nVenta = nVenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public Object[] toRowTable(TableActionEventDetalles event){
        return new Object[]{nVenta, cliente, telefono, totalVenta,fecha, new ModelActionDetalles(this, event), new ModelActionDetalles(this,  event),new ModelActionDetalles(this, event)};
    }
    
}
