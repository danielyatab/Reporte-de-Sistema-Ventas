package Model;

import Buttons.ModelActionClientes;
import table.TableClient.TableActionEventCliente;
/**
 *
 * @author yatac
 */
public class ModelCellClientes {
    
    private String idCliente;
    private String tipoDocumento;
    private String numDocumento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public ModelCellClientes(){
    
    }

    public ModelCellClientes(String idCliente, String nombre, String apellido , String tipoDocumento, String numDocumento, String telefono, String correo) {
        this.idCliente = idCliente;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public ModelCellClientes(String nombre, String apellido , String tipoDocumento, String numDocumento, String telefono, String correo) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    public Object[] toRowTable(TableActionEventCliente event){
        return new Object[]{nombre, apellido,  tipoDocumento,numDocumento, telefono,correo, new ModelActionClientes(this, event), new ModelActionClientes(this, event)};
    }
    
}
