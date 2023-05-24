
package Model;

import Buttons.ModelActionDetalles;
import table.TableDetalles.TableActionEventDetalles;

/**
 *
 * @author yatac
 */
public class ModelCellDetalles {
    
    private String codVenta;
    private String nVenta;
    private String cliente;
    private Double totalVenta;
    private String rutaBoleta;
    private String fecha;
    
    
    public ModelCellDetalles(){
        /*Constructor por defecto*/
    }

    public ModelCellDetalles(String codVenta, String nVenta, String cliente,String fecha, String rutaBoleta , double totalVenta ) {
        this.codVenta = codVenta;
        this.nVenta = nVenta;
        this.cliente = cliente;
        this.totalVenta = totalVenta;
        this.rutaBoleta = rutaBoleta;
        this.fecha = fecha;
    }
    
    public ModelCellDetalles(String nVenta, String cliente, Double totalVenta, String fecha) {
        this.nVenta = nVenta;
        this.cliente = cliente;
        this.totalVenta = totalVenta;
        this.fecha = fecha;
    }

    public String getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
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

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getRutaBoleta() {
        return rutaBoleta;
    }

    public void setRutaBoleta(String rutaBoleta) {
        this.rutaBoleta = rutaBoleta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
   
    public Object[] toRowTable(TableActionEventDetalles event){
        return new Object[]{nVenta, cliente, totalVenta, fecha, new ModelActionDetalles(this, event), new ModelActionDetalles(this,  event),new ModelActionDetalles(this, event)};
    }
    
}
