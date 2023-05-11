package Model.conexion;

import Model.ModelUser;
import controller.JsonUserValidation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author yatac
 */
public class UpdateMysqlUser extends Thread{
    
    private static PreparedStatement ps;
    private static ResultSet rs; 
    
    @Override
    public void run() {
        
        Conexion.conectar_db();
        //Creacion de un modelo que almacenara todo la lista de la base de datos
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM usuario");
            rs = ps.executeQuery();
            List<ModelUser> listUser =  new ArrayList<ModelUser>();
            while(rs.next()){
                String codigo = rs.getString("idUsuario");
                String nombre = rs.getString("nameUser");
                String cargo = rs.getString("cargo");
                String password = rs.getString("password");
               
                ModelUser p = new ModelUser(codigo, nombre, cargo, password);
                listUser.add(p);
                System.out.println(p.getId());
            }         
            System.out.println("List user CUANDO CREO EL ARCHIVO Y LISTO:"+ listUser.get(0).getUser());
            JsonUserValidation.modificarUsuario(listUser);
        } catch (SQLException e) {
            System.out.println("Error al traer los usuarios: "+ e.getMessage());
        }     
        
        try {
            ps = Conexion.getCon().prepareStatement("SELECT * FROM usuariohistorial");
            rs = ps.executeQuery();
            
            List<ModelUser> listUser =  new ArrayList<ModelUser>();
            while(rs.next()){
                String codigo = rs.getString("idusuario");
                String nombre = rs.getString("nameUser");
                String cargo = rs.getString("cargo");
                String password = rs.getString("password");
               
                ModelUser p = new ModelUser(codigo, nombre, cargo, password);
                listUser.add(p);
                System.out.println(p.getId());
            }         
            System.out.println("List HISTORIAL user CUANDO CREO EL ARCHIVO Y LISTO:"+ listUser.get(0).getUser());
            JsonUserValidation.modificarUserHistorial(listUser);
        } catch (SQLException e) {
            System.out.println("Error al traer los usuarios: "+ e.getMessage());
        }   
        
        
    
    }
    
    
}
