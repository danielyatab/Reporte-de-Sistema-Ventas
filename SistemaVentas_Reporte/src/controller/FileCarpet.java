/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author yatac
 */
public class FileCarpet {

    public static void crearCarpetas() {
        // Especifica la ruta y el nombre de la carpeta que deseas crear
        String nombreCarpeta = "json";
        String nombreCarpetaBoleta = "boleta";
        String nombreCarpetaBoletaHistorial = "boleta-historial";

        // Obtiene el directorio actual del proyecto
        String directorioActual = System.getProperty("user.dir");

        // Crea el objeto Path con la ruta completa de la carpeta
        Path carpeta = Path.of(directorioActual, nombreCarpetaBoleta);
        Path carpeta2 = Path.of(directorioActual, nombreCarpetaBoletaHistorial);
        Path carpeta3 = Path.of(directorioActual, nombreCarpeta);

        // Verifica si la carpeta ya existe
        if (!Files.exists(carpeta) || !Files.exists(carpeta2) || !Files.exists(carpeta3)) {
            try {
                // Intenta crear la carpeta
                Files.createDirectory(carpeta);
                Files.createDirectory(carpeta2);
                Files.createDirectory(carpeta3);

                System.out.println("La carpeta se ha creado exitosamente.");
            } catch (IOException e) {
                System.out.println("No se pudo crear la carpeta: " + e.getMessage());
            }
        }
    }
}
