/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import Model.ModelCellProductos;
import Model.ModelCellVenta;
import controller.JsonDetalleProducto;
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
public class UpdateMysqlDetalleProducto extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM detalleproducto");
            rs = ps.executeQuery();
            List<ModelCellVenta> listProductoVenta =  new ArrayList<ModelCellVenta>();
            while(rs.next()){
                String numventa = rs.getString("numVenta");
                String codigo = rs.getString("codigo");
                String producto = rs.getString("producto");
                String tipo = rs.getString("marca");
                String  descripcion = rs.getString("descripcion");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double total = rs.getDouble("total");
                
                ModelCellVenta pd = new ModelCellVenta(numventa, codigo, producto, tipo, descripcion, cantidad, precio, total);
                listProductoVenta.add(pd);
            }         
            JsonDetalleProducto.modificarListDetalleProducto(listProductoVenta);
        } catch (SQLException e) {
            System.out.println("Error al traer los detalles de los productos: "+ e.getMessage());
        }     
       
    }
}
