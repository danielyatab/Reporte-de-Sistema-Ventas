package controller;

import Model.conexion.UpdateMysqlCliente;
import Model.conexion.UpdateMysqlUser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author yatac
 */
public class FileJson {

    public static String rutaUser;
    public static String rutaIdUser;
    public static String rutaCliente;
    public static String rutaIdCliente;
    public static String rutaProducto;
    public static String rutaProveedores;

    public static void verifRuteUser(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);
        if (!file.exists() && !file2.exists() ) {
            try {
                file.createNewFile();
                file2.createNewFile();
                /*Sobreescribir en Arreglo de objetos json*/
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write("[ ]");
                    try (FileWriter writer2 = new FileWriter(archivoId)) {
                        writer2.write("[ ]");
                    } catch (IOException e) {
                         e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                new UpdateMysqlUser().start();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaUser = archivo;
        rutaIdUser = archivoId;
    }

    public static void verifRuteCliente(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);
        if (!file.exists() && !file2.exists() ) {
            try {
                file.createNewFile();
                file2.createNewFile();
                /*Sobreescribir en Arreglo de objetos json*/
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write("[ ]");
                    try (FileWriter writer2 = new FileWriter(archivoId)) {
                        writer2.write("[ ]");
                    } catch (IOException e) {
                         e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                new UpdateMysqlCliente().start();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaCliente = archivo;
        rutaIdCliente = archivoId;
    }

    public static void verifRuteProveedor(String archivo) {
        File file = new File(archivo);
        if (!file.exists()) {
            try {
                file.createNewFile();
                /*Sobreescribir en Arreglo de objetos json*/
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write("[ ]");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaProveedores = archivo;
    }
    
    public static void verifRuteProducto(String archivo) {
        File file = new File(archivo);
        if (!file.exists()) {
            try {
                file.createNewFile();
                /*Sobreescribir en Arreglo de objetos json*/
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write("[ ]");
                    /* Agregado de datos de base de datos si es que se encuentran datos */
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaProducto = archivo;
    }
}
