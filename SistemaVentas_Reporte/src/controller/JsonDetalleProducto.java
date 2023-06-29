/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellDetalles;
import Model.ModelCellVenta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yatac
 */
public class JsonDetalleProducto {

    public static List<ModelCellVenta> globalDetalleProducto = new ArrayList<ModelCellVenta>();

    public static List<ModelCellVenta> returnListDetalleProducto() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaDetalleProductos)) { // Asegura que se cerrara de manera segura el archivo
            globalDetalleProducto = gson.fromJson(reader, new TypeToken<List<ModelCellVenta>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return globalDetalleProducto;
    }

    public static List<ModelCellVenta> returnListProducts(String numVenta) {
        globalDetalleProducto = returnListDetalleProducto();
        List<ModelCellVenta> listCapture = new ArrayList<ModelCellVenta>();
        for (ModelCellVenta m : globalDetalleProducto) {
            if (m.getNumVenta().trim().equals(numVenta.trim())) {
                listCapture.add(m);
            }
        }
        return listCapture;
    }

    public static void addListDetalleProducto(List<ModelCellVenta> listaddProductos) {
        globalDetalleProducto = returnListDetalleProducto();
        /*Agregado de los nuevos productos*/
        for (ModelCellVenta m : listaddProductos) {
            globalDetalleProducto.add(m);
        }
        modificarListDetalleProducto(globalDetalleProducto);
    }

    public static void modificarListDetalleProducto(List<ModelCellVenta> listmodif) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaDetalleProductos)) {
            gson.toJson(listmodif, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteList(String numVenta) {
        globalDetalleProducto = returnListDetalleProducto();
        for (int i = 0; i < globalDetalleProducto.size(); i++) {
            if (globalDetalleProducto.get(i).getNumVenta().equals(numVenta.trim())) {
                globalDetalleProducto.remove(i);
            }
        }
        modificarListDetalleProducto(globalDetalleProducto);
    }

    /*LISTAR PARA VENTAS DIARIAS*/
    public static void llenadoVentasDia() {
        ValidateRegular.listaDiaNombre = new ArrayList<Object[]>();
        ValidateRegular.TotalVentaDia =0;
        //Fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Crear un formateador de fecha
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       
        // Formatear la fecha actual
        String fechaFormateada = fechaActual.format(formateador);
        ValidateRegular.fechaActual = fechaFormateada;
        
        System.out.println("EL FORMATO DE FECHA ACTUAL ES: " + fechaFormateada);
        for(ModelCellDetalles m : JsonVentaCRUD.returnVentas()){
            for(ModelCellVenta v: returnListDetalleProducto()){
                if(m.getnVenta().trim().equals(v.getNumVenta())){
                    if(m.getFecha().equals(fechaFormateada)){
                        ValidateRegular.TotalVentaDia+= v.getTotal();
                        System.out.println("Encontre un producto co igual fecha: " + v.getProducto());
                        Object[] o = new Object[3];
                        o[0] =  v.getProducto();
                        o[1] =  v.getCantidad();
                        o[2] =  "S/." + v.getTotal();
                        ValidateRegular.listaDiaNombre.add(o);
                    }
                }
            }
        }
    }

}
