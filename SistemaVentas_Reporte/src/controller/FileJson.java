package controller;

import Model.conexion.Conexion;
import Model.conexion.UpdateMysqlBoleta;
import Model.conexion.UpdateMysqlCliente;
import Model.conexion.UpdateMysqlDetalleProducto;
import Model.conexion.UpdateMysqlProducto;
import Model.conexion.UpdateMysqlProveedor;
import Model.conexion.UpdateMysqlUser;
import Model.conexion.UpdateMysqlVenta;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

    public static String rutaNumeroBoleta;

    public static String rutaTiposProductos;

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

    public static void verifRuteDetalleProductos(String archivo) {
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
                if (Conexion.testConecion()) {
                    new UpdateMysqlDetalleProducto().start();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        rutaDetalleProductos = archivo;
    }

    public static void verifRuteNumeroBoleto(String archivo) {
        File file = new File(archivo);
        if (!file.exists()) {
            int numeroboleta = 0;
            // Crear objeto JSON
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("numeroboleta", numeroboleta);

            try (FileWriter writer = new FileWriter(archivo)) {
                // Crear objeto Gson para formatear el JSON
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                // Escribir el objeto JSON en el archivo
                gson.toJson(jsonObject, writer);
                rutaNumeroBoleta = archivo;
                if (Conexion.testConecion()) {
                    new UpdateMysqlBoleta().start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*Llenado*/
            if (ValidateRegular.setNumBoleta == false) {
                JsonNumBoleta.modificarNumBoleta(JsonNumBoleta.generarNumBoleta());
            }
        }
        rutaNumeroBoleta = archivo;
        ValidateRegular.numVenta = JsonNumBoleta.obtenerNumero();
    }

    
    
    public static void verifRutaTipoProducto(String archivo) {
        
        File file = new File(archivo);
        
        if (!file.exists()) {
            JsonArray tiposProductos = new JsonArray();
            JsonObject tipoProducto1 = new JsonObject();
            tipoProducto1.addProperty("tipoProducto", "Golosinas");

            JsonObject tipoProducto2 = new JsonObject();
            tipoProducto2.addProperty("tipoProducto", "Lacteos");

            tiposProductos.add(tipoProducto1);
            tiposProductos.add(tipoProducto2);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(tiposProductos);

            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        rutaTiposProductos = archivo;
    }

}
