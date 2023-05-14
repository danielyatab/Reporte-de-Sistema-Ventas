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
    static ImageIcon icono = new ImageIcon("src/img/message/usuarioError.png"); // Ruta al archivo de imagen del ícono
    private static String codeGlobal="";
    /*
    * Return Productos
     */
    public static List<ModelCellProductos> returnProductos() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaProducto)) { // Asegura que se cerrara de manera segura el archivo
            productoGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellProductos>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productoGlobal;
    }

    /**
     * *********************CRUD PRODUCTOS*************************
     */
    /*Retorno de Usuarios*/
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

    public static void updateProducto(ModelCellProductos updateCl) {
        List<ModelCellProductos> listaProductos = returnProductos();
        List<ModelCellProductos> listaProductosHistorial = returnProductoHistorial();

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(updateCl.getCodigo())) {
                listaProductos.set(i, updateCl);
                break;
            }
        }
        for (int i = 0; i < listaProductosHistorial.size(); i++) {
            if (listaProductosHistorial.get(i).getCodigo().equals(updateCl.getCodigo())) {
                listaProductos.set(i, updateCl);
                break;
            }
        }
        modificarProducto(listaProductos);
        modificarProductoHistorial(listaProductos);
        ValidateRegular.setUpdateProducto = true;
    }

    /**
     * ****************************TIPOS DE BUSCADORES*******************
     */
    /*public static List<ModelCellProductos> searchProductoNombre(String nombre) {
        List<ModelCellProductos> searchProductoList = new ArrayList<ModelCellProductos>();;
        for (ModelCellProductos p : returnProductoes()) {
            if (p.getNombres().trim().equals(nombre.trim())) {
                searchProductoList.add(p);
            }
        }
        return searchProductoList;
    }*/

 /*
    public static List<ModelCellProductos> searchProductoApellido(String apellido) {
        List<ModelCellProductos> searchProductoList = null;
        for (ModelCellProductos p : returnProductoes()) {
            if (p.getApellido== apellido) {
                searchProductoList.add(p);
                break;
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchProductoTelefono(String telefono) {
        List<ModelCellProductos> searchProductoList = null;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getTelefono().equals(telefono)) {
                searchProductoList.add(p);
                break;
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchProductoTipoDoc(String tipo) {
        List<ModelCellProductos> searchProductoList = null;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getTipoDocumento().equals(tipo)) {
                searchProductoList.add(p);
                break;
            }
        }
        return searchProductoList;
    }

    public static List<ModelCellProductos> searchProductoNumDocumento(String documento) {
        List<ModelCellProductos> searchProductoList = null;
        for (ModelCellProductos p : returnProductos()) {
            if (p.getNumDocumento().equals(documento)) {
                searchProductoList.add(p);
                break;
            }
        }
        return searchProductoList;
    }
     */
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
        try (Reader reader = new FileReader(FileJson.rutaIdProducto)) { // Asegura que se cerrara de manera segura el archivo
            productoGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellProductos>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productoGlobal;
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

    
    
    /******CODIGO AUTOGENERADO PARA PRODUCTOS******/
     public static String returnCodeGenerate(){
        while(codeGlobal.equals("")){
            generateCode();
        }
        return codeGlobal;
    }
    
    
    public static boolean generateCode() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        String code = "pd-" + String.format("%04d", numeroAleatorio);
        for(ModelCellProductos p: returnProductoHistorial()){
            if(p.getCodigo() == code){
                return false;
            }
        }
        codeGlobal = code;
        return true;
    }
}
