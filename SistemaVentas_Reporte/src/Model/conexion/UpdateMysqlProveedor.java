/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import Model.ModelCellProveedores;
import controller.JsonProveedoresCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yatac
 */
public class UpdateMysqlProveedor extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM proveedor");
            rs = ps.executeQuery();
            List<ModelCellProveedores> listProveedor =  new ArrayList<ModelCellProveedores>();
            while(rs.next()){
                String idProveedor = rs.getString("idProveedor");
                String ruc = rs.getString("ruc");
                String nombres = rs.getString("nombres");
                String tipo = rs.getString("tipo");
                String productos = rs.getString("productos");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                
                ModelCellProveedores pv = new ModelCellProveedores(idProveedor, ruc, nombres, tipo, productos, telefono, correo);
                
                listProveedor.add(pv);
            }         
            JsonProveedoresCRUD.modificarProveedor(listProveedor);
        } catch (SQLException e) {
            System.out.println("Error al traer los proveedor: "+ e.getMessage());
        }     
        
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM historialproveedor");
            rs = ps.executeQuery();
            List<ModelCellProveedores> listProveedores=  new ArrayList<ModelCellProveedores>();
            while(rs.next()){
                String idProveedor = rs.getString("idproveedor");
                String ruc = rs.getString("ruc");
                String nombres = rs.getString("nombres");
                String tipo = rs.getString("tipo");
                String productos = rs.getString("productos");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                
                ModelCellProveedores pv = new ModelCellProveedores(idProveedor, ruc, nombres, tipo, productos, telefono, correo);
               
                listProveedores.add(pv);
            }         
            JsonProveedoresCRUD.modificarProveedorHistorial(listProveedores);
        } catch (SQLException e) {
            System.out.println("Error al traer los historial proveedor: "+ e.getMessage());
        }
    }

}
