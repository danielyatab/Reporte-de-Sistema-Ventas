/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellVenta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
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

}
