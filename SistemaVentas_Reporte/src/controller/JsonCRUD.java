/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Producto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author yatac
 */
public class JsonCRUD {
    
    private static List<Producto> productos = null;
    
    /*Retorno de productos*/
    public static List<Producto> returnProductos(){
        Gson gson = new Gson();
        
        try (Reader reader = new FileReader(FileJson.rutaProducto)){ // Asegura que se cerrara de manera segura el archivo
            productos = gson.fromJson(reader, new TypeToken<List<Producto>>(){}.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
    
    public static void modificarProductos(List<Producto> persona){
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaProducto)){
            gson.toJson(persona, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static String mostrarProductos(){
        String mostrar="";
        if(productos == null){
            throw new Error("El objeto productos esta vacio");        
        }else {
           for(Producto p: productos){
               mostrar+= "dni=" + p.getCodigo() + ", nombres=" + p.getNombre() + ", stock: "+ p.getStock()+ ", precioUnitario: " + p.getPrecioUni()+"\n";
           }
        }
        return mostrar;
    }
    
    
    /*******CRUD JSON********/
    
    public static void updateProducto(Producto productoModificado, int code){
        List<Producto> productos = returnProductos();
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigo() == code){
               productos.set(i, productoModificado);
               break;
            }
        }
        modificarProductos(productos);
    }
    
     public static void addProducto(Producto producto){
        List<Producto> productos = returnProductos();
        productos.add(producto);
        modificarProductos(productos);
    }
    
    public static Producto searchProducto(int codeSearch){
        Producto searchPerson =  new Producto();
        for(Producto p: returnProductos()){
            if(p.getCodigo() == codeSearch){
                searchPerson = p;
                break;
            }else {
                searchPerson = null;
            }
        }       
        return searchPerson;
    }
        
    public static void deleteProducto(int codeDelete){
        Producto searchPerson =  new Producto();
        List<Producto> listProduct = returnProductos();
       for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getCodigo() == codeDelete){
               listProduct.remove(i);
               break;
            }
        }             
        modificarProductos(listProduct);
    }
}
