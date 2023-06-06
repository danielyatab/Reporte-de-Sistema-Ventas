/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellDetalles;
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
import java.util.Random;

/**
 *
 * @author yatac
 */
public class JsonVentaCRUD {

    private static List<ModelCellDetalles> ventaGlobal = new ArrayList<ModelCellDetalles>();

    public static List<ModelCellDetalles> returnVentas() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaVentas)) { // Asegura que se cerrara de manera segura el archivo
            ventaGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellDetalles>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ventaGlobal;
    }

    /**
     * *********************CRUD CLIENTES*************************
     */
    /*Retorno de Usuarios*/
    public static void addVenta(ModelCellDetalles newVenta) {
        ventaGlobal = returnVentas();

     
        verifCodeVenta(newVenta);
        
        String rutaIncial = newVenta.getRutaBoleta();
       
        newVenta.setRutaBoleta("boleta/" + rutaIncial);
        
        
        /*Verificar llenado*/
        for (ModelCellDetalles v : ventaGlobal) {
            System.out.println("INTEGRAN22222;:" + v.getnVenta());
        }
        ventaGlobal.add(newVenta);
        modificarVentas(ventaGlobal);

        List<ModelCellDetalles> historial = returnVentasHistorial();
        newVenta.setRutaBoleta("boleta-historial/" + rutaIncial);
        historial.add(newVenta);
        modificarVentaHistorial(historial);

    }

    public static ModelCellDetalles searchVentaCode(String codVenta) {
        ventaGlobal = returnVentas();
        for (ModelCellDetalles m : ventaGlobal) {
            if (m.getCodVenta().equals(codVenta.trim())) {
                return m;
            }
        }
        return null;
    }

    public static void modificarVentas(List<ModelCellDetalles> ventas) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaVentas)) {
            gson.toJson(ventas, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteVenta(String codeDelete) {
        System.out.println("El codigo a elimiinar es: " + codeDelete);
        List<ModelCellDetalles> listVentas = returnVentas();
        for (int i = 0; i < listVentas.size(); i++) {
            System.out.println("List" + listVentas.get(i).getCodVenta());
            if (listVentas.get(i).getCodVenta().equals(codeDelete)) {
                listVentas.remove(i);
                System.out.println("Removi la venta");
                break;
            }
        }
        modificarVentas(listVentas);
    }

    public static void updateVenta(ModelCellDetalles updateCl) {
        List<ModelCellDetalles> listaVentas = returnVentas();
        List<ModelCellDetalles> listaVentasHistorial = returnVentasHistorial();

        for (int i = 0; i < listaVentas.size(); i++) {
            if (listaVentas.get(i).getCodVenta().equals(updateCl.getCodVenta())) {
                listaVentas.set(i, updateCl);
                break;
            }
        }

        for (int i = 0; i < listaVentasHistorial.size(); i++) {
            if (listaVentasHistorial.get(i).getCodVenta().equals(updateCl.getCodVenta())) {
                listaVentasHistorial.set(i, updateCl);
                break;
            }
        }
        modificarVentas(listaVentas);
        modificarVentaHistorial(listaVentasHistorial);
        ValidateRegular.setUpdateVenta = true;

    }

    /**
     * ****************************TIPOS DE BUSCADORES*******************
     */
    /*
    public static List<ModelCellVenta> searchListVentaNombre(String nombre) {
        List<ModelCellVenta> searchVentaList = new ArrayList<ModelCellVenta>();;
        for (ModelCellVenta p : returnVentas()) {
            System.out.println("Listando : " + p.getNombre() + " = " + nombre);
            if (p.getNombre().trim().equals(nombre.trim())) {
                System.out.println("Encontre:" + p.getNombre());
                searchVentaList.add(p);
            }
        }
        return searchVentaList;
    }

    public static ModelCellVenta searchVentaNombre(String nombre) {
        for (ModelCellVenta p : returnVentas()) {
            System.out.println("Listando : " + p.getNombre() + " = " + nombre);
            if (p.getNombre().trim().equals(nombre.trim())) {
                System.out.println("Encontre:" + p.getNombre());
                return p;
            }
        }
        return null;
    }

    public static List<ModelCellVenta> searchVentaApellido(String apellido) {
        List<ModelCellVenta> searchVentaList = null;
        for (ModelCellVenta p : returnVentas()) {
            if (p.getApellido() == apellido) {
                searchVentaList.add(p);
                break;
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellVenta> searchVentaTelefono(String telefono) {
        List<ModelCellVenta> searchVentaList = null;
        for (ModelCellVenta p : returnVentas()) {
            if (p.getTelefono().equals(telefono)) {
                searchVentaList.add(p);
                break;
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellVenta> searchVentaTipoDoc(String tipo) {
        List<ModelCellVenta> searchVentaList = null;
        for (ModelCellVenta p : returnVentas()) {
            if (p.getTipoDocumento().equals(tipo)) {
                searchVentaList.add(p);
                break;
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellVenta> searchVentaNumDocumento(String documento) {
        List<ModelCellVenta> searchVentaList = null;
        for (ModelCellVenta p : returnVentas()) {
            if (p.getNumDocumento().equals(documento)) {
                searchVentaList.add(p);
                break;
            }
        }
        return searchVentaList;
    }
     */
    /**
     * ***********************METODOS DE INTEGRACION DE DATOS
     * JSON******************************
     */
    //Veificacion no repetitiva de id
    public static ModelCellDetalles verifCodeVenta(ModelCellDetalles newVenta) {
        newVenta.setCodVenta(idRandom());
        while (!comprobarVentaCode(newVenta)) {
            newVenta.setCodVenta(idRandom());
        }
        return newVenta;
    }

    public static boolean comprobarVentaCode(ModelCellDetalles cl) {
        for (ModelCellDetalles us : returnVentasHistorial()) {
            //Si el id historial es igual o el usuario
            if (us.getCodVenta().equals(cl.getCodVenta())) {
                System.out.println("El id se repite");
                return false;
            }
        }
        return true;
    }

    /*COMPROBAR CLIENTE UPDATE(UPDATECLIENTE, INDICE PARA OBVIARLO CON CONTINUE)*/
    /**
     * *****************HISTORTIAL CLIENTE**************
     */
    private static String idRandom() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        return String.format("%06d", numeroAleatorio);
    }

    public static List<ModelCellDetalles> returnVentasHistorial() {
        Gson gson = new Gson();
        List<ModelCellDetalles> historialglobal = new ArrayList<ModelCellDetalles>();
        try (Reader reader = new FileReader(FileJson.rutaHistorialVentas)) { // Asegura que se cerrara de manera segura el archivo
            historialglobal = gson.fromJson(reader, new TypeToken<List<ModelCellDetalles>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return historialglobal;
    }

    
    public static void modificarVentaHistorial(List<ModelCellDetalles> ventas) {
        Gson gson = new Gson();
        //LLenado clientes
        try (Writer writer2 = new FileWriter(FileJson.rutaHistorialVentas)) {
            gson.toJson(ventas, writer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
