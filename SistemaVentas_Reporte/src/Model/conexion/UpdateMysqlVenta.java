/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import Model.ModelCellDetalles;
import Model.ModelCellProductos;
import Model.ModelCellVenta;
import controller.JsonProductoCRUD;
import controller.JsonVentaCRUD;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yatac
 */
public class UpdateMysqlVenta extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM detalleventas");
            rs = ps.executeQuery();
            List<ModelCellDetalles> listVentas =  new ArrayList<ModelCellDetalles>();
            while(rs.next()){
                String codigo = rs.getString("codVenta");
                String numVenta = rs.getString("numVenta");
                String codCliente = rs.getString("codCliente");
                String fecha = rs.getString("fecha");
                /*CAPTURA DE ARCHIVO*/
                byte[] archivoBytes = rs.getBytes("boleta");
                
                // Guardar el archivo en la carpeta destino
                String rutaArchivoDestino = "boleta/"+numVenta+".pdf";
                try (OutputStream outputStream = new FileOutputStream(rutaArchivoDestino)) {
                    outputStream.write(archivoBytes);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(UpdateMysqlVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateMysqlVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                double totalVenta = rs.getDouble("totalVenta");
                
                ModelCellDetalles vd = new ModelCellDetalles(codigo, numVenta, codCliente, fecha, rutaArchivoDestino, totalVenta);
                listVentas.add(vd);
            }         
            JsonVentaCRUD.modificarVentas(listVentas);
            
        } catch (SQLException e) {
            System.out.println("Error al traer las ventas: "+ e.getMessage());
        }     
        
        try {
           ps = Conexion.getCon().prepareStatement("SELECT * FROM historialdetalleventa");
            rs = ps.executeQuery();
            List<ModelCellDetalles> listVentas =  new ArrayList<ModelCellDetalles>();
            while(rs.next()){
                String codigo = rs.getString("codventa");
                String numVenta = rs.getString("numventa");
                String codCliente = rs.getString("codcliente");
                String fecha = rs.getString("fecha");
                /*CAPTURA DE ARCHIVO*/
                byte[] archivoBytes = rs.getBytes("boleta");
                
                // Guardar el archivo en la carpeta destino
                String rutaArchivoDestino = "boleta-historial/"+numVenta+".pdf";
                try (OutputStream outputStream = new FileOutputStream(rutaArchivoDestino)) {
                    
                    outputStream.write(archivoBytes);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(UpdateMysqlVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateMysqlVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                double totalVenta = rs.getDouble("totalventa");
                
                ModelCellDetalles vd = new ModelCellDetalles(codigo, numVenta, codCliente, fecha, rutaArchivoDestino, totalVenta);
                listVentas.add(vd);
            }         
            JsonVentaCRUD.modificarVentaHistorial(listVentas);
        } catch (SQLException e) {
            System.out.println("Error al traer los historial de ventas: "+ e.getMessage());
        }
    }
}
