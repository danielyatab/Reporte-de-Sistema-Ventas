package Model.conexion;

import controller.ValidateRegular;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yatac
 */
public class Conexion {
     private static boolean conectado;
    private static Connection con;

    
    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        Conexion.con = con;
    }

    public static boolean getConectado() {
        return conectado;
    }

    public static void setConectado(boolean conectado) {
        Conexion.conectado = conectado;
    }

    
    
    public static void conectar_db(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaventasreporte", "root", "12@danielYting*3");
        } catch (SQLException e) {
            System.out.println("Error al conectar: "+e.getMessage());
        }
    }
    
    
    public static boolean testConecion(){
        conectar_db();
        if (Conexion.getCon() != null) {
            System.out.println("Con conexion internet");
            ValidateRegular.conexion = true;
            return true;
        } else {
            System.out.println("Sin conexion internet" );
            ValidateRegular.conexion = false;
            return false;
        }
    }
}
