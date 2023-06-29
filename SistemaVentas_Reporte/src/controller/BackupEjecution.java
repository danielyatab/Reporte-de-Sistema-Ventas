/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Backup.copyJson;

/**
 *
 * @author yatac
 */
public class BackupEjecution extends Thread {

    @Override
    public void run() {
        copyJson("json/Cliente.json");
        copyJson("json/Cliente_Historial.json");
        copyJson("json/DetalleVentas.json");
        copyJson("json/N_Boleto.json");
        copyJson("json/Producto.json");
        copyJson("json/Producto_Historial.json");
        copyJson("json/Proveedor.json");
        copyJson("json/Proveedor_Historial.json");
        copyJson("json/TipoProducto.json");
        copyJson("json/User.json");
        copyJson("json/User_Historial.json");
        copyJson("json/Ventas.json");
        copyJson("json/Ventas_Historial.json");
    }
}
