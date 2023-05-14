package controller;

import Model.ModelCellClientes;
import Model.ModelCellProductos;
import Model.ModelCellProveedores;
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
    public static int testValidate = 0;

    public static ModelCellClientes updateCliente;
    public static ModelCellProveedores updateProveedor;
    public static ModelCellProductos updateProducto;
    public static ModelCellProductos updateOldProducto;

}
