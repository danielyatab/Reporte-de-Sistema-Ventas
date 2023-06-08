/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class JsonNumBoleta {

    public static long obtenerNumero() {
        try {
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(new FileReader(FileJson.rutaNumeroBoleta)).getAsJsonObject();
            JsonElement jsonElement = jsonObject.get("numeroboleta");
            if (jsonElement != null && jsonElement.isJsonPrimitive()) {
                return jsonElement.getAsInt();
            } else {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0; // Valor por defecto si no se encuentra la propiedad o hay un error
    }
    
    
    
    public static void modificarNumBoleta(long numero) {
        ValidateRegular.numVenta = numero;
        // Ruta del archivo JSON
        String archivoJSON = FileJson.rutaNumeroBoleta;
        try {
            // Paso 1: Leer el archivo JSON existente y convertirlo en un objeto JSON
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(new FileReader(archivoJSON)).getAsJsonObject();

            // Paso 2: Modificar el valor numérico deseado en el objeto JSON
            jsonObject.addProperty("numeroboleta", numero);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter fileWriter = new FileWriter(archivoJSON);
            gson.toJson(jsonObject, fileWriter);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int generarNumBoleta() {
        String[] opciones = {"Crear nuevo numero de boletario", "Crear desde la boleta nº 1"};
        ImageIcon icono = new ImageIcon(JsonNumBoleta.class.getResource("/img/message/lapiz.png")); // Ruta al archivo de imagen del ícono

        int opcion = JOptionPane.showOptionDialog(null, "¿Desea registrar un nuevo incio de boletas?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        String numero = "";
        if (opcion == JOptionPane.YES_OPTION) {
            boolean isInteger = true;
            while (isInteger) {
                numero = JOptionPane.showInputDialog(null, "Ingresa desde que numero iniciar");
                if (esEntero(numero)) {
                    isInteger = false;
                } else {
                    isInteger = true;
                }
            }
            
            return Integer.parseInt(numero);
        } else if (opcion == JOptionPane.NO_OPTION) {
            
            return 0;
        }

        return 0;
    }

    public static boolean esEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static String generateNumVenta(long numActual) {
        String num = valueOf(numActual);
        String newNum = "";
        long suma = 0;
        for (int i = num.trim().length(); i < 11; i++) {
            if (i == num.trim().length()) {
                suma = Long.parseLong(num) + 1;
            }
            newNum += "0";
        }
        newNum += valueOf(suma);
        return newNum;
    }
    
    public static String actualNumVenta(long numActual) {
        String num = valueOf(numActual);
        String newNum = "";
        long suma = 0;
        for (int i = num.trim().length(); i <= 11; i++) {
            if (i == num.trim().length()) {
                suma = Long.parseLong(num);
            }
            newNum += "0";
        }
        newNum += valueOf(suma);
        return newNum;
    }
    
}
