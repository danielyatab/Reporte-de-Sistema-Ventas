package controller;

import Model.ModelCellClientes;
import java.util.regex.Pattern;

/**
 *
 * @author yatac
 */
public class ValidateRegular {

    public static final Pattern SYMBOLS_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");
    public static boolean setCreateUser = false;
    public static boolean setCreateCliente = true;
    public static boolean setUpdateCliente = true;
    public static boolean setCreateProveedor = false;
    public static boolean setCreateProducto = false;
    public static int testValidate = 0;
    
    public static ModelCellClientes updateCliente;
}
