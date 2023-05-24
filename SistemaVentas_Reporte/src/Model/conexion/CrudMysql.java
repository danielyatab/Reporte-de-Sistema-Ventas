package Model.conexion;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.ModelCellProductos;
import Model.ModelCellProveedores;
import Model.ModelUser;
import controller.JsonClienteCRUD;
import controller.JsonProductoCRUD;
import controller.JsonProveedoresCRUD;
import controller.JsonUserValidation;
import controller.JsonVentaCRUD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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

    /**
     * *******************PROVEEDOR********************
     */
    public static void crudMysqlProveedores() {
        List<ModelCellProveedores> listProveedor = JsonProveedoresCRUD.returnProveedores();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM proveedor");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellProveedores proveedor : listProveedor) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO proveedor (idProveedor,ruc,nombres,tipo,productos,telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, proveedor.getIdProveedor());
                ps.setString(2, proveedor.getRuc());
                ps.setString(3, proveedor.getNombres());
                ps.setString(4, proveedor.getTipo());
                ps.setString(5, proveedor.getProductos());
                ps.setString(6, proveedor.getTelefono());
                ps.setString(7, proveedor.getCorreo());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla cliente: " + e.getMessage());
        }
    }

    public static void crudMysqlProveedoresHistorial() {
        List<ModelCellProveedores> listProveedor = JsonProveedoresCRUD.returnProveedores();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM historialproveedor");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellProveedores proveedor : listProveedor) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO historialproveedor (idproveedor,ruc,nombres,tipo,productos,telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, proveedor.getIdProveedor());
                ps.setString(2, proveedor.getRuc());
                ps.setString(3, proveedor.getNombres());
                ps.setString(4, proveedor.getTipo());
                ps.setString(5, proveedor.getProductos());
                ps.setString(6, proveedor.getTelefono());
                ps.setString(7, proveedor.getCorreo());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla cliente: " + e.getMessage());
        }
    }

    /**
     * *******************PRODUCTOS********************
     */
    public static void crudMysqlProductos() {
        List<ModelCellProductos> listProductos = JsonProductoCRUD.returnProductos();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM producto");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellProductos producto : listProductos) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO producto (codProducto,producto,tipo,descripcion,marca,stock,precioU) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, producto.getCodigo());
                ps.setString(2, producto.getProducto());
                ps.setString(3, producto.getTipo());
                ps.setString(4, producto.getDescripcion());
                ps.setString(5, producto.getMarca());
                ps.setInt(6, producto.getCantidad());
                ps.setDouble(7, producto.getPrecioU());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla producto: " + e.getMessage());
        }
    }

    public static void crudMysqlProductosHistorial() {
        List<ModelCellProductos> listProductosHistorial = JsonProductoCRUD.returnProductoHistorial();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM historialproducto");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellProductos producto : listProductosHistorial) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO historialproducto(codproducto,producto,tipo,descripcion,marca,stock,precioU) VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, producto.getCodigo());
                ps.setString(2, producto.getProducto());
                ps.setString(3, producto.getTipo());
                ps.setString(4, producto.getDescripcion());
                ps.setString(5, producto.getMarca());
                ps.setInt(6, producto.getCantidad());
                ps.setDouble(7, producto.getPrecioU());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al actualizar la tabla producto: " + e.getMessage());
        }
    }

    /**
     * *******************VENTAS********************
     */
    public static void crudMysqlVentas() {
        List<ModelCellDetalles> listProductos = JsonVentaCRUD.returnVentas();
        try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM detalleventas");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellDetalles venta : listProductos) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO detalleventas (codVenta,numVenta,codCliente, fecha ,boleta,totalVenta) VALUES (?, ?, ?, ?, ?, ?)");

                // Leer el archivo en un array de bytes
                File archivo = new File(venta.getRutaBoleta());
                InputStream inputStream = new FileInputStream(archivo);
                byte[] bytesArchivo = new byte[(int) archivo.length()];
                inputStream.read(bytesArchivo);

                ps.setString(1, venta.getCodVenta());
                ps.setString(2, venta.getnVenta());
                ps.setString(3, venta.getCliente());
                ps.setString(4, venta.getFecha());
                ps.setBytes(5, bytesArchivo);
                ps.setDouble(6, venta.getTotalVenta());
                
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException | FileNotFoundException  e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla ventas: " + e.getMessage());
        } catch (IOException ex){
            ex.getMessage();
        }
    }

    public static void crudMysqlVentaHistorial() {
        List<ModelCellDetalles> listVentaHistorial = JsonVentaCRUD.returnVentasHistorial();
         try {
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Conexion.conectar_db();
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM historialdetalleventa");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (ModelCellDetalles venta : listVentaHistorial) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO historialdetalleventa (codventa,numventa,codCliente, fecha ,boleta,totalventa) VALUES (?, ?, ?, ?, ?, ?)");

                // Leer el archivo en un array de bytes
                File archivo = new File(venta.getRutaBoleta());
                InputStream inputStream = new FileInputStream(archivo);
                byte[] bytesArchivo = new byte[(int) archivo.length()];
                inputStream.read(bytesArchivo);

                ps.setString(1, venta.getCodVenta());
                ps.setString(2, venta.getnVenta());
                ps.setString(3, venta.getCliente());
                ps.setString(4, venta.getFecha());
                ps.setBytes(5, bytesArchivo);
                ps.setDouble(6, venta.getTotalVenta());
                
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");
        } catch (SQLException | FileNotFoundException  e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla historail ventas: " + e.getMessage());
        } catch (IOException ex){
            ex.getMessage();
        }
    }

}
