/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author yatac
 */
public class Conexion {
     private static boolean conectado;
    private static Connection con;
    static PreparedStatement ps;

    
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "12@danielYting*3");
        } catch (SQLException e) {
            System.out.println("ERROR al conectar:" + e.getMessage());
        }
    }
    
    
    public static void testConecion(){
        if (Conexion.getCon() != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("Error al establecer la conexión.");
        }
    }
}
