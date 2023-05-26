/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.conexion;

/**
 *
 * @author yatac
 */
public class FullCrudMysql {
    public FullCrudMysql(){
        
        CrudMysql.crudMysqlUsuarios();
        CrudMysql.crudMysqlHistorialUsuarios();
        CrudMysql.crudMysqlClientes();
        CrudMysql.crudMysqlHistorialClientes();
        CrudMysql.crudMysqlProveedores();
        CrudMysql.crudMysqlProveedoresHistorial();
        CrudMysql.crudMysqlProductos();
        CrudMysql.crudMysqlProductosHistorial();
        CrudMysql.crudMysqlDetalleProducto();
        
        
    }
}
