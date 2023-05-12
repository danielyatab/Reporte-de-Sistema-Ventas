
package Model.conexion;

import Model.ModelCellClientes;
import controller.JsonClienteCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author yatac
 */
public class UpdateMysqlCliente extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM cliente");
            rs = ps.executeQuery();
            List<ModelCellClientes> listClient =  new ArrayList<ModelCellClientes>();
            while(rs.next()){
                String codigo = rs.getString("codCliente");
                String nombre = rs.getString("nombres");
                String apellido = rs.getString("apellidos");
                String tipoDocumento = rs.getString("tipoDocumento");
                String numDocumento = rs.getString("documento");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                
                ModelCellClientes cl = new ModelCellClientes(codigo, nombre, apellido, tipoDocumento, numDocumento, telefono, correo);
               
                listClient.add(cl);
                System.out.println(cl.getIdCliente());
            }         
            JsonClienteCRUD.modificarClientes(listClient);
        } catch (SQLException e) {
            System.out.println("Error al traer los usuarios: "+ e.getMessage());
        }     
        
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM clientehistorial");
            rs = ps.executeQuery();
            List<ModelCellClientes> listClient =  new ArrayList<ModelCellClientes>();
            while(rs.next()){
                String codigo = rs.getString("codcliente");
                String nombre = rs.getString("nombres");
                String apellido = rs.getString("apellidos");
                String tipoDocumento = rs.getString("tipodocumento");
                String numDocumento = rs.getString("documento");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                
                ModelCellClientes cl = new ModelCellClientes(codigo, nombre, apellido, tipoDocumento, numDocumento, telefono, correo);
               
                listClient.add(cl);
                System.out.println(cl.getIdCliente());
            }         
            JsonClienteCRUD.modificarClienteHistorial(listClient);
        } catch (SQLException e) {
            System.out.println("Error al traer los historial usuarios: "+ e.getMessage());
        }
    }
}
