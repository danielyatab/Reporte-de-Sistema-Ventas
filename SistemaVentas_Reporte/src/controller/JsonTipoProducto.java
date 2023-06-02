/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yatac
 */
public class JsonTipoProducto {

    public static List<String> returnTiposProductos() {
        List<String> tiposProductos = new ArrayList<>();
        
        try (FileReader reader = new FileReader(FileJson.rutaTiposProductos)) {
            Gson gson = new Gson();
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject tipoProducto = jsonArray.get(i).getAsJsonObject();
                String nombreTipoProducto = tipoProducto.get("tipoProducto").getAsString();
                tiposProductos.add(nombreTipoProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tiposProductos;
    }

    public static void modificarTiposProductos(List<String> nuevosTiposProductos) {
        try (FileReader reader = new FileReader(FileJson.rutaTiposProductos)) {
            Gson gson = new Gson();
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);

            // Eliminar todos los tipos de productos existentes en el archivo JSON
            while (jsonArray.size() > 0) {
                jsonArray.remove(0);
            }

            // Agregar los nuevos tipos de productos al archivo JSON
            for (String tipoProducto : nuevosTiposProductos) {
                JsonObject tipoProductoJson = new JsonObject();
                tipoProductoJson.addProperty("tipoProducto", tipoProducto);
                jsonArray.add(tipoProductoJson);
            }

            // Escribir el contenido actualizado en el archivo JSON
            try (FileWriter writer = new FileWriter(FileJson.rutaTiposProductos)) {
                gson.toJson(jsonArray, writer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteTipoProductos(String tipoProducto) {
        List<String> listGlobalTipo = returnTiposProductos();
        for (int i = 0; i < listGlobalTipo.size(); i++) {
            if (listGlobalTipo.get(i).trim().equals(tipoProducto.trim())) {
                listGlobalTipo.remove(i);
            }
        }
        modificarTiposProductos(listGlobalTipo);
    }

    public static void addTipoProductos(String tipoProducto) {
        List<String> listGlobalTipo = returnTiposProductos();
        listGlobalTipo.add(tipoProducto);
        modificarTiposProductos(listGlobalTipo);
    }

    public static void updateTipoProductos(String oldTipoProducto, String tipoProducto) {
        List<String> listGlobalTipo = returnTiposProductos();
        for (int i = 0; i < listGlobalTipo.size(); i++) {
            if (listGlobalTipo.get(i).trim().equals(oldTipoProducto.trim())) {
                listGlobalTipo.remove(i);
                listGlobalTipo.add(tipoProducto);
            }
        }
        modificarTiposProductos(listGlobalTipo);
    }

}
