package Model.conexion;

import Model.ModelCellClientes;
import Model.ModelUser;
import controller.JsonClienteCRUD;
import controller.JsonUserValidation;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author yatac
 */
public class CrudMysql {

    /**
     * *******************USUARIO********************
     */
    public static void crudMysqlUsuarios() {
        List<ModelUser> listUsers = JsonUserValidation.returnUser();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM usuario");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelUser user : listUsers) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO usuario (idUsuario, nameUser, cargo, password) VALUES (?, ?, ?, ?)");
                ps.setString(1, user.getId());
                ps.setString(2, user.getUser());
                ps.setString(3, user.getCargo());
                ps.setString(4, user.getPassword());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla: " + e.getMessage());
        }
    }

    
    
    public static void crudMysqlHistorialUsuarios() {
        List<ModelUser> listUsersHistorial = JsonUserValidation.returnUserHistorial();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM usuariohistorial");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelUser user : listUsersHistorial) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO usuariohistorial (idusuario, nameUser, cargo, password) VALUES (?, ?, ?, ?)");
                ps.setString(1, user.getId());
                ps.setString(2, user.getUser());
                ps.setString(3, user.getCargo());
                ps.setString(4, user.getPassword());
                ps.executeUpdate();

                System.out.println("USUARIOS PASADOS A MYSQL HISTORIAL: " + user.getUser());
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla: " + e.getMessage());
        }
    }

    /**
     * *******************CLIENTE********************
     */
    public static void crudMysqlClientes() {
        List<ModelCellClientes> listCliente = JsonClienteCRUD.returnClientes();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM cliente");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellClientes cliente : listCliente) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO cliente (codCliente,nombres, apellidos,tipoDocumento,documento, telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, cliente.getIdCliente());
                ps.setString(2, cliente.getNombre());
                ps.setString(3, cliente.getApellido());
                ps.setString(4, cliente.getTipoDocumento());
                ps.setString(5, cliente.getNumDocumento());
                ps.setString(6, cliente.getTelefono());
                ps.setString(7, cliente.getCorreo());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla cliente: " + e.getMessage());
        }
    }


    public static void crudMysqlHistorialClientes() {
        List<ModelCellClientes> listClienteHistorial = JsonClienteCRUD.returnClientesHistorial();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM clientehistorial");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellClientes cliente : listClienteHistorial) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO clienteHistorial (codcliente,nombres, apellidos,tipoDocumento,documento, telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, cliente.getIdCliente());
                ps.setString(2, cliente.getNombre());
                ps.setString(3, cliente.getApellido());
                ps.setString(4, cliente.getTipoDocumento());
                ps.setString(5, cliente.getNumDocumento());
                ps.setString(6, cliente.getTelefono());
                ps.setString(7, cliente.getCorreo());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla: " + e.getMessage());
        }
    }

}
