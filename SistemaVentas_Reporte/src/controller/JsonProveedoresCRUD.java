/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellProveedores;
import Model.ModelCellProductos;
import Model.ModelCellProveedores;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yatac
 */
public class JsonProveedoresCRUD {

    private static List<ModelCellProveedores> proveedorGlobal = null;
    static ImageIcon icono = new ImageIcon("src/img/message/usuarioError.png"); // Ruta al archivo de imagen del ícono

    public static List<ModelCellProveedores> returnProveedores() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaProveedores)) { // Asegura que se cerrara de manera segura el archivo
            proveedorGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellProveedores>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proveedorGlobal;
    }

    /**
     * *********************CRUD CLIENTES*************************
     */
    /*Retorno de Usuarios*/
    public static void addProveedor(ModelCellProveedores newProveedor) {
        System.out.println("Agregabndo Proveedor ;" + newProveedor.getNombres());
        proveedorGlobal = returnProveedores();
        if (proveedorGlobal != null) {
            verifCodeProveedor(newProveedor);
            comprobarProveedor(newProveedor);
        } else {
            List<ModelCellProveedores> pvList = new ArrayList<ModelCellProveedores>();
            newProveedor.setIdProveedor(idRandom());
            pvList.add(newProveedor);
            modificarProveedor(pvList);
            modificarProveedorHistorial(pvList);
        }
    }

    public static void modificarProveedor(List<ModelCellProveedores> proveedor) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaProveedores)) {
            gson.toJson(proveedor, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProveedor(String codeDelete) {
        List<ModelCellProveedores> listProveedors = returnProveedores();
        for (int i = 0; i < listProveedors.size(); i++) {
            if (listProveedors.get(i).getIdProveedor().equals(codeDelete)) {
                listProveedors.remove(i);
                break;
            }
        }
        modificarProveedor(listProveedors);
    }

    public static void updateProveedor(ModelCellProveedores updateCl) {
        List<ModelCellProveedores> listaProveedors = returnProveedores();
        List<ModelCellProveedores> listaProveedorsHistorial = returnProveedorHistorial();

        for (int i = 0; i < listaProveedors.size(); i++) {
            if (listaProveedors.get(i).getIdProveedor().equals(updateCl.getIdProveedor())) {
                listaProveedors.set(i, updateCl);
                break;
            }
        }

        for (int i = 0; i < listaProveedorsHistorial.size(); i++) {
            if (listaProveedorsHistorial.get(i).getIdProveedor().equals(updateCl.getIdProveedor())) {
                listaProveedorsHistorial.set(i, updateCl);
                break;
            }
        }
        modificarProveedor(listaProveedors);
        modificarProveedorHistorial(listaProveedorsHistorial);
        ValidateRegular.setUpdateProveedor = true;
    }

    /*
     * ****************************TIPOS DE BUSCADORES*******************
     */
    public static List<ModelCellProveedores> searchListProveedorNombre(String nombre) {
        List<ModelCellProveedores> searchProveedorList = new ArrayList<ModelCellProveedores>();;
        for (ModelCellProveedores p : returnProveedores()) {
            System.out.println("Listando  CONTIENE EN CLIENTES ::::: " + p.getNombres() + " = " + nombre);
            if (p.getNombres().toLowerCase().trim().contains(nombre.toLowerCase().trim())) {
                searchProveedorList.add(p);
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchListProveedorProductos(String producto) {
        List<ModelCellProveedores> searchProveedorList = new ArrayList<ModelCellProveedores>();;
        for (ModelCellProveedores p : returnProveedores()) {
            System.out.println("Listando  CONTIENE APELLIDOS EN CLIENTES ::::: " + p.getProductos() + " = " + producto);
            if (p.getProductos().toLowerCase().trim().contains(producto.toLowerCase().trim())) {
                searchProveedorList.add(p);
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchListProveedorTelefono(String telefono) {
        List<ModelCellProveedores> searchProveedorList = new ArrayList<ModelCellProveedores>();;
        for (ModelCellProveedores p : returnProveedores()) {
            System.out.println("Listando  CONTIENE TELEFONOS EN CLIENTES ::::: " + p.getTelefono() + " = " + telefono);
            if (p.getTelefono().toLowerCase().trim().contains(telefono.toLowerCase().trim())) {
                searchProveedorList.add(p);
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchListProveedorNumero(String numero) {
        List<ModelCellProveedores> searchProveedorList = new ArrayList<ModelCellProveedores>();;
        for (ModelCellProveedores p : returnProveedores()) {
            System.out.println("Listando  CONTIENE NUMEROS EN CLIENTES ::::: " + p.getRuc() + " = " + numero);
            if (p.getRuc().toLowerCase().trim().contains(numero.toLowerCase().trim())) {
                searchProveedorList.add(p);
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchListProveedorTipoProveedor(String numero) {
        List<ModelCellProveedores> searchProveedorList = new ArrayList<ModelCellProveedores>();;
        for (ModelCellProveedores p : returnProveedores()) {
            System.out.println("Listando  CONTIENE NUMEROS EN CLIENTES ::::: " + p.getRuc()+ " = " + numero);
            if (p.getTipo().toLowerCase().trim().contains(numero.toLowerCase().trim())) {
                searchProveedorList.add(p);
            }
        }
        return searchProveedorList;
    }

    /*
    public static List<ModelCellProveedores> searchProveedorApellido(String apellido) {
        List<ModelCellProveedores> searchProveedorList = null;
        for (ModelCellProveedores p : returnProveedores()) {
            if (p.getApellido== apellido) {
                searchProveedorList.add(p);
                break;
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchProveedorTelefono(String telefono) {
        List<ModelCellProveedores> searchProveedorList = null;
        for (ModelCellProveedores p : returnProveedors()) {
            if (p.getTelefono().equals(telefono)) {
                searchProveedorList.add(p);
                break;
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchProveedorTipoDoc(String tipo) {
        List<ModelCellProveedores> searchProveedorList = null;
        for (ModelCellProveedores p : returnProveedors()) {
            if (p.getTipoDocumento().equals(tipo)) {
                searchProveedorList.add(p);
                break;
            }
        }
        return searchProveedorList;
    }

    public static List<ModelCellProveedores> searchProveedorNumDocumento(String documento) {
        List<ModelCellProveedores> searchProveedorList = null;
        for (ModelCellProveedores p : returnProveedors()) {
            if (p.getNumDocumento().equals(documento)) {
                searchProveedorList.add(p);
                break;
            }
        }
        return searchProveedorList;
    }
     */
    /**
     * ***********************METODOS DE INTEGRACION DE DATOS
     * JSON******************************
     */
    //Verificacion no repetitiva de id
    public static boolean comprobarProveedor(ModelCellProveedores cl) {
        List<ModelCellProveedores> proveedor = returnProveedores();
        if (comprobarNombreProveedor(cl)) {
            ValidateRegular.setCreateProveedor = false;
            return false;
        } else {
            ValidateRegular.setCreateProveedor = true;
            proveedor.add(cl);
            modificarProveedor(proveedor);
            modificarProveedorHistorial(proveedor);
            return true;
        }
    }

    public static void verifCodeProveedor(ModelCellProveedores newProveedor) {
        newProveedor.setIdProveedor(idRandom());
        while (!comprobarProveedorCode(newProveedor)) {
            newProveedor.setIdProveedor(idRandom());
        }
    }

    public static boolean comprobarProveedorCode(ModelCellProveedores cl) {
        for (ModelCellProveedores u : returnProveedores()) {
            //Si el id es igual o el usuario
            if (u.getIdProveedor().equals(cl.getIdProveedor())) {
                return false;
            }
        }
        for (ModelCellProveedores us : returnProveedorHistorial()) {
            //Si el id historial es igual o el usuario
            if (us.getIdProveedor().equals(cl.getIdProveedor())) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarNombreProveedor(ModelCellProveedores cl) {
        for (ModelCellProveedores u : returnProveedores()) {
            if (u.getNombres().equals(cl.getNombres())) {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado", "", 0, icono);
                return true;
            }
        }
        return false;
    }

    /*COMPROBAR PROVEEDOR UPDATE(UPDATEPROVEEDOR, INDICE PARA OBVIARLO CON CONTINUE)*/
    /**
     * *****************HISTORTIAL PROVEEDOR**************
     */
    private static String idRandom() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        return String.format("%04d", numeroAleatorio);
    }

    public static List<ModelCellProveedores> returnProveedorHistorial() {
        Gson gson = new Gson();
        List<ModelCellProveedores> proveedorglobalHistorial = new ArrayList<ModelCellProveedores>();
        try (Reader reader = new FileReader(FileJson.rutaIdProveedores)) { // Asegura que se cerrara de manera segura el archivo
            proveedorglobalHistorial = gson.fromJson(reader, new TypeToken<List<ModelCellProveedores>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proveedorglobalHistorial;
    }

    public static void modificarProveedorHistorial(List<ModelCellProveedores> proveedor) {
        Gson gson = new Gson();
        //LLenado clientes
        try (Writer writer2 = new FileWriter(FileJson.rutaIdProveedores)) {
            gson.toJson(proveedor, writer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
