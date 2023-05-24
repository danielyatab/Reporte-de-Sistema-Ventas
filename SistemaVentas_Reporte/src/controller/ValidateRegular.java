package controller;

import Model.ModelCellClientes;
import Model.ModelCellProductos;
import Model.ModelCellProveedores;
import Model.ModelCellVenta;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author yatac
 */
public class ValidateRegular {

    public static boolean conexion = true;

    public static final Pattern SYMBOLS_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");
    public static boolean setCreateUser = false;
    public static boolean setCreateCliente = true;
    public static boolean setUpdateCliente = true;
    public static boolean setCreateProveedor = false;
    public static boolean setUpdateProveedor = true;
    public static boolean setCreateProducto = false;
    public static boolean setUpdateProducto = true;
    
     public static boolean setCreateVenta = false;
     public static boolean setUpdateVenta = true;
     
   // public static boolean productOld = true;
    public static int testValidate = 0;
    public static double vuelto =0;
    public static long numVenta = 1;

    public static ModelCellClientes updateCliente;
    public static ModelCellProveedores updateProveedor;
    public static ModelCellProductos updateProducto;
    public static ModelCellProductos oldProducto;
    
    
    //Content VENTAS
    public static List<ModelCellVenta> listVentas = new ArrayList<ModelCellVenta>();
    
    
    //BANDERAS INTERFACES
    public static boolean passProducto = false;
    public static boolean passCliente = false;


}
