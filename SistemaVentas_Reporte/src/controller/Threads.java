package controller;

/**
 *
 * @author yatac
 */
public class Threads implements Runnable{
            
            public void run() {
                // Creamos una instancia de la otra clase y llamamos a su método
                FileJson.verifRuteNumeroBoleto("json/N_Boleto.json");
                FileJson.verifRuteUser("json/User.json","json/User_Historial.json");
                FileJson.verifRuteCliente("json/Cliente.json","json/Cliente_Historial.json");
                FileJson.verifRuteProveedor("json/Proveedor.json","json/Proveedor_Historial.json");
                FileJson.verifRuteProducto("json/Producto.json","json/Producto_Historial.json" );
                FileJson.verifRuteVenta("json/Ventas.json","json/Ventas_Historial.json" );
                
                // Llamamos a otro método en esta misma clase
                
                //CrudMysql.crudMysqlUsuarios();
            }
            
}

