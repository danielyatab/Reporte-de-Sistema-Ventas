
package Model.conexion;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author yatac
 */
public class CrudMysql {

    
    public static void crudMysqlProducto(){
        try {
            // Obtener los datos del archivo JSON
            List<Producto> listProduct = JsonCRUD.returnProductos();
            // Crear una conexión a la base de datos
            // Deshabilitar las comprobaciones de clave externa para evitar problemas con la eliminación de registros
            Connection con = Conexion.getCon();
            java.sql.Statement stmt = con.createStatement();
            stmt.execute("SET FOREIGN_KEY_CHECKS=0;");
            // Vaciar la tabla existente
            PreparedStatement deleteStmt =con.prepareStatement("DELETE FROM product");
            deleteStmt.executeUpdate();
            // Insertar los nuevos registros en la tabla
            for (Producto producto: listProduct) {
                PreparedStatement ps = con.prepareStatement("REPLACE INTO product (codigo, nombre, stock, precio) VALUES (?, ?, ?, ?)");
                ps.setInt(1, producto.getCodigo());
                ps.setString(2, producto.getNombre());
                ps.setInt(3, producto.getStock());
                ps.setFloat(4, producto.getPrecioUni());
                ps.executeUpdate();
            }
            // Volver a habilitar las comprobaciones de clave externa
            stmt.execute("SET FOREIGN_KEY_CHECKS=1;");      
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error al actualizar la tabla: " + e.getMessage());
        }
    }
    

    
}
