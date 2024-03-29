package controller;

import Model.ModelCellClientes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static controller.JsonUserValidation.icono;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yatac
 */
public class JsonClienteCRUD {

    private static List<ModelCellClientes> clienteGlobal = null;

    public static List<ModelCellClientes> returnClientes() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaCliente)) { 
            clienteGlobal = gson.fromJson(reader, new TypeToken<List<ModelCellClientes>>() {
            }.getType()); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clienteGlobal;
    }

    /**
     * *********************CRUD CLIENTES*************************
     */
    /*Retorno de Usuarios*/
    public static void addCliente(ModelCellClientes newCliente) {
        clienteGlobal = returnClientes();
        if (clienteGlobal != null) {
            verifCodeCliente(newCliente);
            comprobarCliente(newCliente);
        } else {
            List<ModelCellClientes> clList = new ArrayList<ModelCellClientes>();
            newCliente.setIdCliente(idRandom());
            clList.add(newCliente);
            modificarClientes(clList);
            modificarClienteHistorial(clList);
        }
    }

    public static void modificarClientes(List<ModelCellClientes> cliente) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaCliente)) {
            gson.toJson(cliente, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCliente(String codeDelete) {
        List<ModelCellClientes> listClientes = returnClientes();
        for (int i = 0; i < listClientes.size(); i++) {
            if (listClientes.get(i).getIdCliente().equals(codeDelete)) {
                listClientes.remove(i);
                break;
            }
        }
        modificarClientes(listClientes);
    }

    public static void updateCliente(ModelCellClientes updateCl) {
        List<ModelCellClientes> listaClientes = returnClientes();
        List<ModelCellClientes> listaClientesHistorial = returnClientesHistorial();

        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getIdCliente().equals(updateCl.getIdCliente())) {
                listaClientes.set(i, updateCl);
                break;
            }
        }

        for (int i = 0; i < listaClientesHistorial.size(); i++) {
            if (listaClientesHistorial.get(i).getIdCliente().equals(updateCl.getIdCliente())) {
                listaClientesHistorial.set(i, updateCl);
                break;
            }
        }
        modificarClientes(listaClientes);
        modificarClienteHistorial(listaClientesHistorial);
        ValidateRegular.setUpdateCliente = true;
    }

    /**
     * ****************************TIPOS DE BUSCADORES*******************
     */
    public static List<ModelCellClientes> searchListClienteNombre(String nombre) {
        List<ModelCellClientes> searchClienteList = new ArrayList<ModelCellClientes>();;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getNombre().toLowerCase().trim().contains(nombre.toLowerCase().trim())) {
                searchClienteList.add(p);
            }
        }
        return searchClienteList;
    }

    public static List<ModelCellClientes> searchListClienteApellido(String apellido) {
        List<ModelCellClientes> searchClienteList = new ArrayList<ModelCellClientes>();;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getApellido().toLowerCase().trim().contains(apellido.toLowerCase().trim())) {
                searchClienteList.add(p);
            }
        }
        return searchClienteList;
    }

    public static List<ModelCellClientes> searchListClienteTelefono(String telefono) {
        List<ModelCellClientes> searchClienteList = new ArrayList<ModelCellClientes>();;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getTelefono().toLowerCase().trim().contains(telefono.toLowerCase().trim())) {
                searchClienteList.add(p);
            }
        }
        return searchClienteList;
    }

    public static List<ModelCellClientes> searchListClienteNumero(String numero) {
        List<ModelCellClientes> searchClienteList = new ArrayList<ModelCellClientes>();;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getNumDocumento().toLowerCase().trim().contains(numero.toLowerCase().trim())) {
                searchClienteList.add(p);
            }
        }
        return searchClienteList;
    }

    
    /*BUSUQEDA DE JCOMBO*/
    
    public static ModelCellClientes searchClienteNombre(String nombre) {
        for (ModelCellClientes p : returnClientes()) {
            if (p.getNombre().trim().toLowerCase().equals(nombre.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }
    
    public static ModelCellClientes searchClienteApellido(String apellido) {
        for (ModelCellClientes p : returnClientes()) {
            if (p.getApellido().trim().toLowerCase().equals(apellido.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }
    
    
    public static ModelCellClientes searchClienteTelefono(String telefono) {
        for (ModelCellClientes p : returnClientes()) {
            if (p.getTelefono().trim().toLowerCase().equals(telefono.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }

     public static ModelCellClientes searchClienteNumDoc(String numDoc) {
        for (ModelCellClientes p : returnClientes()) {
            if (p.getNumDocumento().trim().toLowerCase().equals(numDoc.trim().toLowerCase())) {
                return p;
            }
        }
        return null;
    }
    
     
    public static ModelCellClientes searchClienteCodigo(String codigo) {
        for (ModelCellClientes p : returnClientes()) {
            if (p.getIdCliente().trim().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public static ModelCellClientes searchClienteHistorialCodigo(String codigo) {
        for (ModelCellClientes p : returnClientesHistorial()) {
            if (p.getIdCliente().trim().equals(codigo)) {
                return p;
            }
        }
        return null;
    }


    public static List<ModelCellClientes> searchClienteTipoDoc(String tipo) {
        List<ModelCellClientes> searchClienteList = null;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getTipoDocumento().equals(tipo)) {
                searchClienteList.add(p);
                break;
            }
        }
        return searchClienteList;
    }

    public static List<ModelCellClientes> searchClienteNumDocumento(String documento) {
        List<ModelCellClientes> searchClienteList = null;
        for (ModelCellClientes p : returnClientes()) {
            if (p.getNumDocumento().equals(documento)) {
                searchClienteList.add(p);
                break;
            }
        }
        return searchClienteList;
    }



    /********************************METODOS LISTADOS*********************************/
    public static ArrayList<String> listarNombres(){
        ArrayList<String> nombres = new ArrayList<String>();
            for(ModelCellClientes cl : returnClientes()){
                nombres.add(cl.getNombre());
            }
        return nombres;
    }
    
    public static ArrayList<String> listarTelefonos(){
        ArrayList<String> telefonos = new ArrayList<String>();
            for(ModelCellClientes cl : returnClientes()){
                telefonos.add(cl.getTelefono());
            }
        return telefonos;
    }
    
    public static ArrayList<String> listarApellidos(){
        ArrayList<String> apellidos = new ArrayList<String>();
            for(ModelCellClientes cl : returnClientes()){
                apellidos.add(cl.getApellido());
            }
        return apellidos;
    }
    
    public static ArrayList<String> listarNumDocumento(){
        ArrayList<String> documento = new ArrayList<String>();
            for(ModelCellClientes cl : returnClientes()){
                documento.add(cl.getNumDocumento());
            }
        return documento;
    }
    

    /**
     * ***********************METODOS DE INTEGRACION DE DATOS
     * JSON******************************
     */
    //Veificacion no repetitiva de id
    public static boolean comprobarCliente(ModelCellClientes cl) {
        List<ModelCellClientes> clientes = returnClientes();
        if (comprobarNombreCliente(cl)) {
            ValidateRegular.setCreateCliente = false;
            return false;
        } else {
            ValidateRegular.setCreateCliente = true;
            clientes.add(cl);
            modificarClientes(clientes);
            modificarClienteHistorial(clientes);
            return true;
        }
    }

    public static void verifCodeCliente(ModelCellClientes newCliente) {
        newCliente.setIdCliente(idRandom());
        while (!comprobarClientCode(newCliente)) {
            newCliente.setIdCliente(idRandom());
        }
    }

    public static boolean comprobarClientCode(ModelCellClientes cl) {
        for (ModelCellClientes u : returnClientes()) {
            //Si el id es igual o el usuario
            if (u.getIdCliente().equals(cl.getIdCliente())) {
                return false;
            }
        }
        for (ModelCellClientes us : returnClientesHistorial()) {
            //Si el id historial es igual o el usuario
            if (us.getIdCliente().equals(cl.getIdCliente())) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarNombreCliente(ModelCellClientes cl) {
        for (ModelCellClientes u : returnClientes()) {
            if (u.getNombre().equals(cl.getNombre())) {
                //MessageError
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "El cliente ya se encuentra registrado", "", 0, icono);
                return true;
            }
        }
        return false;
    }

    
    /*COMPROBAR CLIENTE UPDATE(UPDATECLIENTE, INDICE PARA OBVIARLO CON CONTINUE)*/
    /**
     * *****************HISTORTIAL CLIENTE**************
     */
    private static String idRandom() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        return String.format("%04d", numeroAleatorio);
    }

    public static List<ModelCellClientes> returnClientesHistorial() {
        Gson gson = new Gson();
        List<ModelCellClientes> clienteglobalHistorial = new ArrayList<ModelCellClientes>();
        try (Reader reader = new FileReader(FileJson.rutaIdCliente)) { // Asegura que se cerrara de manera segura el archivo
            clienteglobalHistorial = gson.fromJson(reader, new TypeToken<List<ModelCellClientes>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clienteglobalHistorial;
    }

    public static void modificarClienteHistorial(List<ModelCellClientes> cliente) {
        Gson gson = new Gson();
        //LLenado clientes
        try (Writer writer2 = new FileWriter(FileJson.rutaIdCliente)) {
            gson.toJson(cliente, writer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
