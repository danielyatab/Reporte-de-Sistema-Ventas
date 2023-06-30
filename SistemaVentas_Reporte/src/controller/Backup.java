/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author yatac
 */
public class Backup {
    
    /*Create Direcotry*/
    public static void createCarpetBackup(){
         // Ruta de la carpeta a crear
        String rutaCarpeta = "C:/backup";
        try {
            // Crear la carpeta
            Files.createDirectory(Path.of(rutaCarpeta));

            // Establecer el atributo oculto en la carpeta
            DosFileAttributeView fileAttributes = Files.getFileAttributeView(
                    Path.of(rutaCarpeta), DosFileAttributeView.class);
            DosFileAttributes attributes = fileAttributes.readAttributes();
            fileAttributes.setHidden(true);
        } catch (IOException e) {
            System.out.println("Error al crear la carpeta de backup: " + e.getMessage());
        }
    }
    
    public static void createCarpetJson(){
         String rutaCarpeta = "C:/backup/json";

        try {
            // Crear la carpeta segura
            Files.createDirectory(Path.of(rutaCarpeta));
        } catch (IOException e) {
            System.out.println("Error al crear la carpeta segura: " + e.getMessage());
        }
    }
    
    /*Copy Files*/
    public static void copyJson(String ruta){
        // Ruta del archivo original y la copia
        Path rutaArchivoOriginal = Path.of(ruta);
        Path rutaArchivoCopia = Path.of("C:/backup/"+ruta);
        try {
            // Hacer la copia del archivo
            Files.copy(rutaArchivoOriginal, rutaArchivoCopia, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException x) {
            System.out.println("Error al hacer la copia del archivo: " + x.getMessage());
        }
    }
  
    
}
