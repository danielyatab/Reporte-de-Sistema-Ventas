/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

import Model.ModelCellClientes;
import controller.JsonClienteCRUD;
import controller.JsonNumBoleta;
import controller.ValidateRegular;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yatac
 */
public class UpdateMysqlBoleta extends Thread {

    @Override
    public void run() {
        try {
            Connection conn = Conexion.getCon(); // Obtener la conexión
            PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM historialdetalleventa");
            ResultSet rs = ps.executeQuery();

            rs.next();
            int rowCount = rs.getInt(1);

            if (rowCount > 0) {
                String lastRowQuery = "SELECT numventa FROM historialdetalleventa ORDER BY codventa DESC LIMIT 1";
                ps = conn.prepareStatement(lastRowQuery);
                rs = ps.executeQuery();
                if (rs.next()) {
                   String lastValue = rs.getString("numventa");
                   int value = Integer.parseInt(lastValue); 
                   ValidateRegular.setNumBoleta = true;
                   /*Integracion en el json*/
                   JsonNumBoleta.modificarNumBoleta(value);
                } 
            } else {
                //MENSAJE PARA INGRESAR PERSONALIZADO
                System.out.println("La tabla está vacía.");
            }
            conn.close(); // Cerrar la conexión
        } catch (SQLException e) {
            System.out.println("Error al traer los historial de ventas para cod Boleta: " + e.getMessage());
        }
    }
}
