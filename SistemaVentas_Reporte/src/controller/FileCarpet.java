/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;

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

        // Crea el objeto File con la ruta completa de la carpeta
        File carpeta = new File(directorioActual, nombreCarpetaBoleta);
        File carpeta2 = new File(directorioActual, nombreCarpetaBoletaHistorial);
        File carpeta3 = new File(directorioActual, nombreCarpeta);

        // Verifica si la carpeta ya existe
        if (!carpeta.exists() || !carpeta2.exists() || !carpeta3.exists()) {
            // Intenta crear la carpeta
            boolean carpetaCreada = carpeta.mkdir();
            boolean carpetaCreada1 = carpeta2.mkdir();
            boolean carpetaCreada2 = carpeta3.mkdir();

            if (carpetaCreada && carpetaCreada1 && carpetaCreada2) {
                System.out.println("La carpeta se ha creado exitosamente.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
    }
}
