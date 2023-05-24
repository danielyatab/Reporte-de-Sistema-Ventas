package controller;

import Model.conexion.Conexion;
import Model.conexion.UpdateMysqlCliente;
import Model.conexion.UpdateMysqlProducto;
import Model.conexion.UpdateMysqlProveedor;
import Model.conexion.UpdateMysqlUser;
import Model.conexion.UpdateMysqlVenta;
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
    public static String rutaIdProducto;

    public static String rutaProveedores;
    public static String rutaIdProveedores;

    public static String rutaVentas;
    public static String rutaHistorialVentas;
    
    public static String rutaDetalleProductos;
    public static String rutaHistorialDetalleProductos;

    public static void verifRuteUser(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);
        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlUser().start();
                }
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
        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlCliente().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaCliente = archivo;
        rutaIdCliente = archivoId;
    }

    public static void verifRuteProveedor(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);

        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlProveedor().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaProveedores = archivo;
        rutaIdProveedores = archivoId;
    }

    public static void verifRuteProducto(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);

        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlProducto().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaProducto = archivo;
        rutaIdProducto = archivoId;
    }
    
    
    public static void verifRuteVenta(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);

        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlVenta().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaVentas = archivo;
        rutaHistorialVentas = archivoId;
    }
    
    
    public static void verifRuteDetalleProductos(String archivo, String archivoId) {
        File file = new File(archivo);
        File file2 = new File(archivoId);

        if (!file.exists() && !file2.exists()) {
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
                if (Conexion.testConecion()) {
                    //new UpdateMysqlDetalleProducto().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaDetalleProductos= archivo;
        rutaHistorialDetalleProductos = archivoId;
    }
}
