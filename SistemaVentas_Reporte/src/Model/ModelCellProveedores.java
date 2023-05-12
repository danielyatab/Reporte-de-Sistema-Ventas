package Model;

import Buttons.ModelActionProveedores;
import table.TableProveedores.TableActionEventProveedores;

/**
 *
 * @author yatac
 */
public class ModelCellProveedores {
    private String idProveedor;
    private String ruc;
    private String nombres;
    private String tipo;
    private String productos;
    private String telefono;
    private String correo;

    public ModelCellProveedores() {
    }

    public ModelCellProveedores(String idProveedor, String ruc, String nombres, String tipo, String productos, String telefono, String correo) {
        this.idProveedor = idProveedor;
        this.ruc = ruc;
        this.nombres = nombres;
        this.tipo = tipo;
        this.telefono = telefono;
        this.correo = correo;
        this.productos = productos;
    }

    public ModelCellProveedores(String ruc, String nombres, String tipo, String productos, String telefono, String correo) {
        this.ruc = ruc;
        this.nombres = nombres;
        this.tipo = tipo;
        this.telefono = telefono;
        this.productos = productos;
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Object[] toRowTable(TableActionEventProveedores event) {
        return new Object[]{ruc, nombres, tipo, productos, telefono, correo, new ModelActionProveedores(this, event), new ModelActionProveedores(this, event)};
    }
    
}
