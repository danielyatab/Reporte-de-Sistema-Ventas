/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelUser;

/**
 *
 * @author yatac
 */
public class NewClass {
    public static void main(String[] args) {
        Threads ejecutor = new Threads();
        Thread hilo = new Thread( ejecutor);
        hilo.start();
        
        JsonUserValidation usuarios = new JsonUserValidation();
        
        ModelUser usuario1 = new ModelUser("admin", "administradora", "admion");
        
        usuarios.addUser(usuario1);
        usuarios.mostrarUsuarios();
        
    }
}
