/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yatac
 */
public class ArchivosVO {
    
    /*Todo los atributos*/
    int idArchivos;
    private byte[] Archivos;
    int Actas_idActas;

    public ArchivosVO() {
    }

    /*Todo los codigos get*/
    public int getIdArchivos() {
        return idArchivos;
    }

    public byte[] getArchivos() {
        return Archivos;
    }

    public int getActas_idActas() {
        return Actas_idActas;
    }


    /*Todo los codigos set*/
    public void setIdArchivos(int idArchivos) {
        this.idArchivos = idArchivos;
    }

    public void setArchivos(byte[] Archivos) {
        this.Archivos = Archivos;
    }

    public void setActas_idActas(int Actas_idActas) {
        this.Actas_idActas = Actas_idActas;
    }
}
