/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.ModelCellProductos;
import Model.ModelCellVenta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static controller.JsonProductoCRUD.returnProductos;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import static java.lang.String.valueOf;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author yatac
 */
public class JsonVentaCRUD {

    private static List<ModelCellDetalles> ventaGlobal = new ArrayList<ModelCellDetalles>();
    private static LocalDate fechaActual = LocalDate.now();

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
     * *********************CRUD VENTAS*************************
     */
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
        List<ModelCellDetalles> listVentas = returnVentas();
        for (int i = 0; i < listVentas.size(); i++) {
            System.out.println("List" + listVentas.get(i).getCodVenta());
            if (listVentas.get(i).getCodVenta().equals(codeDelete)) {
                listVentas.remove(i);
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
    public static List<ModelCellDetalles> searchListVentaNum(String codigo) {
        List<ModelCellDetalles> searchVentaList = new ArrayList<ModelCellDetalles>();;
        for (ModelCellDetalles p : returnVentas()) {
            if (p.getnVenta().toLowerCase().trim().contains(codigo.toLowerCase().trim())) {
                searchVentaList.add(p);
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellDetalles> searchListVentaTotal(String total) {
        List<ModelCellDetalles> searchVentaList = new ArrayList<ModelCellDetalles>();;
        for (ModelCellDetalles p : returnVentas()) {
            if (valueOf(p.getTotalVenta()).toLowerCase().trim().contains(total.toLowerCase().trim())) {
                searchVentaList.add(p);
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellDetalles> searchListVentaCliente(String nombre) {
        List<ModelCellDetalles> searchVentaList = new ArrayList<ModelCellDetalles>();
        List<ModelCellClientes> searchClienteList = JsonClienteCRUD.returnClientes();

        for (ModelCellDetalles p : returnVentas()) {
            for (ModelCellClientes c : searchClienteList) {
                if (c.getIdCliente().equals(p.getCliente())) {
                    if (c.getNombre().trim().toLowerCase().contains(nombre.trim().toLowerCase())) {
                        searchVentaList.add(p);
                    }
                }
            }
        }
        return searchVentaList;
    }

    public static List<ModelCellDetalles> searchListVentaFecha(String fecha) {
        List<ModelCellDetalles> searchListFecha = new ArrayList<ModelCellDetalles>();
        for (ModelCellDetalles p : returnVentas()) {
            if (valueOf(p.getFecha()).toLowerCase().trim().contains(fecha.toLowerCase().trim())) {
                searchListFecha.add(p);
            }
        }
        return searchListFecha;
    }

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

    /**
     * *****LISTAR VENTAS DEL MESA Y DIAS********
     */
    public static void listarMesesTotalVenta() {
        ValidateRegular.totalesSemana = new double[7];

        int mesActual = fechaActual.getMonthValue();
        System.out.println("EL MES ACUTAL ES: " + mesActual);

        // Recorrer la lista de fechas en formato de cadena
        for (ModelCellDetalles v : returnVentas()) {
            LocalDate fecha = LocalDate.parse(v.getFecha());
            int mesFecha = fecha.getMonthValue();
            if (mesFecha == mesActual) {
                DayOfWeek diaSemana = fecha.getDayOfWeek();
                int indiceDia = diaSemana.getValue(); // Obtener el índice del día de la semana (1 a 7)
                System.out.println("EL DIA OBTENIDO ES " + indiceDia);
                ValidateRegular.totalesSemana[indiceDia-1] += v.getTotalVenta();
            }
        }
    }

    public static void listarAnualTotal() {
        ValidateRegular.totalesMes = new double[12];
        
        /*Obtencion año actual*/
        int añoActual = fechaActual.getYear();
        System.out.println("EL MES ACUTAL ES: " + añoActual);
        for (ModelCellDetalles v : returnVentas()) {
            LocalDate fecha = LocalDate.parse(v.getFecha());
            int añoFecha = fecha.getYear();
            
            if (añoActual == añoFecha) {
                int mesFecha = fecha.getMonthValue();
                ValidateRegular.totalesMes[mesFecha-1] += v.getTotalVenta();
            }
        }
    }



}
