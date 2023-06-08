/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelUser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
public class JsonUserValidation {

    private static List<ModelUser> usersGlobal = null;
    static ImageIcon icono = new ImageIcon(JsonUserValidation.class.getResource("/img/message/usuarioError.png")); // Ruta al archivo de imagen del ícono

    /*Retorno de Usuarios*/
    public static List<ModelUser> returnUser() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FileJson.rutaUser)) { // Asegura que se cerrara de manera segura el archivo
            usersGlobal = gson.fromJson(reader, new TypeToken<List<ModelUser>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usersGlobal;
    }

    /*Retorno de Usuarios*/
    public static void addUser(ModelUser newUser) {
        verifCodeUser(newUser);
        comprobarUser(newUser);
    }

    /*Update Usuarios*/
    public static void modificarUsuario(List<ModelUser> usersMod) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FileJson.rutaUser)) {
            gson.toJson(usersMod, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String mostrarUsuarios() {
        String mostrar = "";
        if (usersGlobal == null) {
            throw new Error("El objeto productos esta vacio");
        } else {
            for (ModelUser p : usersGlobal) {
                mostrar += "id: " + "";
                mostrar += "ID=" + p.getId() + ", usuario=" + p.getUser() + ", password: " + p.getPassword() + "\n";
            }
        }
        return mostrar;
    }

    /**
     * ***********************CRUD JSON******************************
     */
    public static boolean validarUsuario(ModelUser usuario) {
        List<ModelUser> users = returnUser();
        for (ModelUser u : users) {
            if (usuario.getUser().equals(u.getUser())) {
                if (encriptarSha256(usuario.getPassword()).equals(u.getPassword())) {
                    ImageIcon icononew = new ImageIcon(JsonUserValidation.class.getResource("/img/message/comprobado.png"));
                    JOptionPane.showMessageDialog(null, "Regitro Exitoso", "", 0, icononew);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es valido", "", 0, icono);
                    return false;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado", "", 0, icono);
        return false;
    }

    /**
     * ***********************METODOS DE INTEGRACION DE DATOS
     * JSON******************************
     */
    //Veificacion no repetitiva de id
    public static boolean comprobarUser(ModelUser us) {
        List<ModelUser> users = returnUser();
        if (comprobarNombreUser(us)) {
            return false;
        } else {
            us.setPassword(encriptarSha256(us.getPassword()));
            users.add(us);
            modificarUsuario(users);
            modificarUserHistorial(users);
            ValidateRegular.setCreateUser = true;
            return true;
        }

    }

    public static void verifCodeUser(ModelUser newUser) {
        newUser.setId(idRandom());
        while (!comprobarUserCode(newUser)) {
            newUser.setId(idRandom());
        }
    }

    public static boolean comprobarUserCode(ModelUser us) {
        for (ModelUser u : returnUser()) {
            //Si el id es igual o el usuario
            if (u.getId().equals(us.getId())) {
                return false;
            }
        }

        for (ModelUser user : returnUserHistorial()) {
            //Si el id historial es igual o el usuario
            if (user.getId().equals(us.getId())) {
                System.out.println("El id se repite");
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarNombreUser(ModelUser user) {
        for (ModelUser u : returnUser()) {
            if (u.getUser().equals(user.getUser())) {
                //MessageError
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "El Usuario ya se encuentra registrado", "", 0, icono);
                return true;
            }
        }
        return false;
    }

    //Id random
    private static String idRandom() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1001);
        return String.format("%04d", numeroAleatorio);
    }

    //Encriptador de contraseñas
    public static String encriptarSha256(String contrasena) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(contrasena.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<ModelUser> returnUserHistorial() {
        Gson gson = new Gson();
        List<ModelUser> globalhistorialuser = new ArrayList<ModelUser>();
        try (Reader reader = new FileReader(FileJson.rutaIdUser)) { // Asegura que se cerrara de manera segura el archivo
                globalhistorialuser = gson.fromJson(reader, new TypeToken<List<ModelUser>>() {
            }.getType()); // Como debe de convertir los datos json (en este caso almacena los datos en tipo persona a una lista)
        } catch (IOException e) {
            e.printStackTrace();
        }
        return globalhistorialuser;
    }

    public static void modificarUserHistorial(List<ModelUser> user) {
        Gson gson = new Gson();
        //LLenado clientes
        try (Writer writer2 = new FileWriter(FileJson.rutaIdUser)) {
            gson.toJson(user, writer2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
