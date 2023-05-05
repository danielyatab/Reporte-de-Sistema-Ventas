/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Buttons.ModelActionProductos;
import Buttons.ModelActionProveedores;
import table.TableProveedores.TableActionEventProveedores;

/**
 *
 * @author yatac
 */
public class ModelCellProveedores {
   private String ruc;
   private String nombre;
   private String tipo;
   private String telefono;
   private String correo;

    public ModelCellProveedores() {
    }

    public ModelCellProveedores(String ruc, String nombre, String tipo, String telefono, String correo) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.tipo = tipo;
        this.telefono = telefono;
        this.correo = correo;
    }

   
   
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Object[] toRowTable(TableActionEventProveedores event){
        return new Object[]{ruc, nombre, tipo, telefono, correo, new ModelActionProveedores(this, event), new ModelActionProveedores(this, event)};
    }
    
}
