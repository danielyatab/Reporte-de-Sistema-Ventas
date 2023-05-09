/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yatac
 */
public class FileJson {
    
    public static String rutaUser;
       
    public static void verifRuteUser(String archivo){
        File file = new File(archivo);
        if(!file.exists() ){
            try {              
                file.createNewFile();                            
                /*Sobreescribir en Arreglo de objetos json*/
                try (FileWriter writer = new FileWriter(archivo)){
                   writer.write("[ ]");
                } catch (IOException e) {
                    e.printStackTrace();
                }  
            } catch (IOException e) {
                e.getMessage();
            }       
        }
        rutaUser = archivo;
    }

    
    
}
