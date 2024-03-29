package controller;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
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
     
    //public static boolean setNumBoleta = false; 
     
   // public static boolean productOld = true;
    public static int testValidate = 0;
    public static double vuelto =0;
    public static long numVenta = 0;
     public static long intentConnect = 0;

    public static long listIntentTempTipoPro=0;
     
    public static ModelCellClientes updateCliente;
    public static ModelCellProveedores updateProveedor;
    public static ModelCellProductos updateProducto;
    public static ModelCellProductos oldProducto;
    public static boolean setNumBoleta = false;
    
    //Content VENTAS
    public static List<ModelCellVenta> listVentas = new ArrayList<ModelCellVenta>();
    public static List<ModelCellVenta> listVentasExtrac  = null;
    public static List<ModelCellVenta> listVentasDelete = null;
    
    //Content DetalleVentasForm
    public static List<ModelCellVenta> listDetalleSelect = new ArrayList<ModelCellVenta>();
    public static ModelCellDetalles ventaSelect = new ModelCellDetalles();
    public static ModelCellClientes clienteSelect = new ModelCellClientes();
    //Lista temporal de Tipo Productos
    public static List<String> listaTempTipo = new ArrayList<String>();
    
    
    
    //BANDERAS INTERFACES
    public static boolean passProducto = false;
    public static boolean passCliente = false;


    public static boolean formDetalleProducto = false;
    
    public static String rutaStatic="";

    /*Listado de modfiicaciioones*/
    public static List<ModelCellClientes> ModifClientes = null;
    
    
    /*LISTA ESTATICAS DEL DIA*/
    public static ArrayList<Object[]> listaDiaNombre =new ArrayList<Object[]>() ;
    public static String fechaActual = "";
    public static double TotalVentaDia = 0;
    
    /*LISTA ESTATICAS DIAS DE LA SEMANA*/
    public static double[] totalesSemana =  new double[7];
    
    
    /*Listar Estatico del mes*/
     public static double[] totalesMes =  new double[12];
     
     
     
    /*CONFIRMACION DE VENTA*/
    public static boolean ventaRealizada = false ; 
     
}
