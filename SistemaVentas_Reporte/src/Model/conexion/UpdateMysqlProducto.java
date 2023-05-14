/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import Model.ModelCellProductos;
import controller.JsonProductoCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yatac
 */
public class UpdateMysqlProducto extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM producto");
            rs = ps.executeQuery();
            List<ModelCellProductos> listProducto =  new ArrayList<ModelCellProductos>();
            while(rs.next()){
                String codigo = rs.getString("codProducto");
                String producto = rs.getString("producto");
                String tipo = rs.getString("tipo");
                String  descripcion = rs.getString("descripcion");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("stock");
                double precio = rs.getDouble("precioU");
                
                ModelCellProductos pd = new ModelCellProductos(codigo, producto, tipo, descripcion, marca, cantidad, precio);
                listProducto.add(pd);
            }         
            JsonProductoCRUD.modificarProducto(listProducto);
        } catch (SQLException e) {
            System.out.println("Error al traer los productos: "+ e.getMessage());
        }     
        
        try {
           ps = Conexion.getCon().prepareStatement("SELECT * FROM producto");
            rs = ps.executeQuery();
            List<ModelCellProductos> listProductohistorial =  new ArrayList<ModelCellProductos>();
            while(rs.next()){
                 String codigo = rs.getString("codproducto");
                String producto = rs.getString("producto");
                String tipo = rs.getString("tipo");
                String  descripcion = rs.getString("descripcion");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("stock");
                double precio = rs.getDouble("precioU");
                
                ModelCellProductos pd = new ModelCellProductos(codigo, producto, tipo, descripcion, marca, cantidad, precio);
                listProductohistorial.add(pd);
            }         
            JsonProductoCRUD.modificarProductoHistorial(listProductohistorial);
        } catch (SQLException e) {
            System.out.println("Error al traer los historial de productos: "+ e.getMessage());
        }
    }

   
}
