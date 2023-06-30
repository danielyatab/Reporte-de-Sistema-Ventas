package controller;

import Model.ModelCellProductos;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class JsonProductoCRUD {

    private static List<ModelCellProductos> productoGlobal = null;
    static ImageIcon icono = new ImageIcon(JsonProductoCRUD.class.getResource("/img/message/usuarioError.png")); // Ruta al archivo de imagen del ícono
    private static String codeGlobal = "";

    /*
    * Return Productos
     */
    public static List<ModelCellProductos> returnProductos() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaProducto)) { // Asegura que se cerrara de manera segura el archivo
            productoGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellProductos>>() {
            }.getType()); // (en este caso almacena los datos en tipo producto a una lista
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productoGlobal;
    }

    /**
     * *********************CRUD PRODUCTOS*************************
     */
    /*Agregar Productos*/
    public static void addProducto(ModelCellProductos newProducto) {
        productoGlobal = returnProductos();
        if (productoGlobal != null) {
            productoGlobal.add(newProducto);
            modificarProducto(productoGlobal);
            modificarProductoHistorial(productoGlobal);
        } else {
            List<ModelCellProductos> pdList = new ArrayList<ModelCellProductos>();
            pdList.add(newProducto);
            modificarProducto(pdList);
            modificarProductoHistorial(pdList);
        }
    }

    public static void addCantidad(ModelCellProductos stockProducto, int newCant) {
        List<ModelCellProductos> listaProductos = returnProductos();
        // List<ModelCellProductos> listaProductosHistorial = returnProductoHistorial();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo() == stockProducto.getCodigo()) {
                int total = listaProductos.get(i).getCantidad() + newCant;
                listaProductos.get(i).setCantidad(total);
                break;
            }
        }
        modificarProducto(listaProductos);
        //ValidateRegular.setUpdateProducto = true;
    }

    public static void modificarProducto(List<ModelCellProductos> producto) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaProducto)) {
            gson.toJson(producto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateProducto(ModelCellProductos updateCl) {
        List<ModelCellProductos> listaProductos = returnProductos();
        List<ModelCellProductos> listaProductosHistorial = returnProductoHistorial();

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(updateCl.getCodigo())) {
                listaProductos.set(i, updateCl);
                break;
            }
        }

        for (int j = 0; j < listaProductosHistorial.size(); j++) {
            if (listaProductosHistorial.get(j).getCodigo().equals(updateCl.getCodigo())) {
                listaProductosHistorial.set(j, updateCl);
                break;
            }
        }

        modificarProducto(listaProductos);
        modificarProductoHistorial(listaProductosHistorial);
        ValidateRegular.setUpdateProducto = true;
    }

    public static void deleteProducto(String codeDelete) {
        List<ModelCellProductos> listProductos = returnProductos();
        for (int i = 0; i < listProductos.size(); i++) {
            if (listProductos.get(i).getCodigo().equals(codeDelete)) {
                listProductos.remove(i);
                break;
            }
        }
        modificarProducto(listProductos);
    }

    /**
     * ****************************VERIFICAR STOCK*******************
     */
    public static boolean extraerStock(String code, int stock, boolean aumentar) {
        List<ModelCellProductos> listStocks = returnProductos();
        for (int i = 0; i < listStocks.size(); i++) {
            if (listStocks.get(i).getCodigo().trim().equals(code.trim())) {
                int newStock = 0;
                if (aumentar) {
                    newStock = listStocks.get(i).getCantidad() + stock;
                    listStocks.get(i).setCantidad(newStock);
                    modificarProducto(listStocks);
                    return true;
                } else {
                    newStock = listStocks.get(i).getCantidad() - stock;
                    if (newStock < 0) {
                        JOptionPane.showMessageDialog(null, "La cantidad supera el stock", "", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        listStocks.get(i).setCantidad(newStock);
                        modificarProducto(listStocks);
                        return true;
                    }
                }
            }
        }
        /*Listar stocks*/
        return true;
    }

    /**
     * ****************************TIPOS DE BUSCADORES*******************
     */
    public static ModelCellProductos buscarProductoCodigo(String codigo) {
        for (ModelCellProductos p : returnProductos()) {
            if (p.getCodigo().trim().equals(codigo.trim())) {
                return p;
            }
        }
        return null;
    }

    public static List<ModelCellProductos> searchListProductoCodigo(String codigo) {
        List<ModelCellProductos> searchProductoList = new ArrayList<ModelCellProductos>();;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getCodigo().toLowerCase().trim().contains(codigo.toLowerCase().trim())) {
                searchProductoList.add(p);
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchListProductoNombre(String producto) {
        List<ModelCellProductos> searchProductoList = new ArrayList<ModelCellProductos>();;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getProducto().toLowerCase().trim().contains(producto.toLowerCase().trim())) {
                searchProductoList.add(p);
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchListProductoMarca(String marca) {
        List<ModelCellProductos> searchProductoList = new ArrayList<ModelCellProductos>();;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getMarca().toLowerCase().trim().contains(marca.toLowerCase().trim())) {
                searchProductoList.add(p);
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchListProductoTipo(String tipo) {
        List<ModelCellProductos> searchProductoList = new ArrayList<ModelCellProductos>();;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getTipo().toLowerCase().trim().contains(tipo.toLowerCase().trim())) {
                searchProductoList.add(p);
            }
        }
        return searchProductoList;
    }

    /*LISTAR SINGULARMENTE STRINGS*/
    public static ArrayList<String> listarCodigos() {
        ArrayList<String> codigos = new ArrayList<String>();
        for (ModelCellProductos p : returnProductos()) {
            codigos.add(p.getCodigo());
        }
        return codigos;
    }

    public static ArrayList<String> listarProductosNombres() {
        ArrayList<String> productos = new ArrayList<String>();
        for (ModelCellProductos p : returnProductos()) {
            productos.add(p.getProducto());
        }
        return productos;
    }

    /*LIOSTADO DE BUSQUEDA*/
 /*BUSUQEDA DE JCOMBO*/
    public static ModelCellProductos searchProductoNombre(String nombre) {
        for (ModelCellProductos p : returnProductos()) {
            if (p.getProducto().trim().toLowerCase().equals(nombre.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    public static ModelCellProductos searchProductoCodigo(String codigo) {
        for (ModelCellProductos p : returnProductos()) {
            if (p.getCodigo().trim().toLowerCase().equals(codigo.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    /**
     * ***********************METODOS DE INTEGRACION DE DATOS
     * JSON******************************
     */
    //Verificacion no repetitiva de id
    //Escanear codigo
    public static boolean searchCodeExistente(String code) {
        for (ModelCellProductos p : returnProductoHistorial()) {
            if (p.getCodigo().trim().equals(code.trim())) {
                String[] opciones = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "¿El producto ya se registro anteriormente desea traerlo?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
                if (opcion == JOptionPane.YES_OPTION) {
                    //OldProduct return
                    ValidateRegular.oldProducto = p;
                    return true;
                }
            }
        }
        return false;
    }

    public static ModelCellProductos returnProductoOld(ModelCellProductos newProducto) {

        return null;
    }

    /*COMPROBAR PROVEEDOR UPDATE(UPDATEPROVEEDOR, INDICE PARA OBVIARLO CON CONTINUE)*/
    /**
     * *****************HISTORTIAL PRODUCTO**************
     */
    public static List<ModelCellProductos> returnProductoHistorial() {
        Gson gson = new Gson();
        List<ModelCellProductos> productoglobalHistorial = new ArrayList<ModelCellProductos>();
        try (Reader reader = new FileReader(FileJson.rutaIdProducto)) { // Asegura que se cerrara de manera segura el archivo
            productoglobalHistorial = gson.fromJson(reader, new TypeToken<List<ModelCellProductos>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productoglobalHistorial;
    }

    public static void modificarProductoHistorial(List<ModelCellProductos> producto) {
        Gson gson = new Gson();
        //LLenado clientes
        try (Writer writer2 = new FileWriter(FileJson.rutaIdProducto)) {
            gson.toJson(producto, writer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ****CODIGO AUTOGENERADO PARA PRODUCTOS*****
     */
    public static String returnCodeGenerate() {
        generateCode();
        return codeGlobal;
    }

    public static boolean generateCode() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        String code = "pd-" + String.format("%04d", numeroAleatorio);
        for (ModelCellProductos p : returnProductoHistorial()) {
            if (p.getCodigo() == code) {
                return false;
            }
        }
        codeGlobal = code;
        return true;
    }

    /**
     * *********VERIFICADOR DE CANTIDAD************
     */
    public static void verificarStockProductos() {
        for (ModelCellProductos m : returnProductos()) {
            if (m.getCantidad() <= 4) {
                JOptionPane.showMessageDialog(null, "El producto " + m.getProducto() + "-" + m.getMarca() + "-" + m.getDescripcion() + " solo tiene " + m.getCantidad(), "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
