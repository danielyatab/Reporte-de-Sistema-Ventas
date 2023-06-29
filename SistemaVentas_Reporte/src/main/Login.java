/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Model.conexion.Conexion;
import Model.conexion.FullCrudMysql;
import controller.FileCarpet;
import controller.Threads;
import controller.ValidateRegular;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import main.LoginInit;

/**
 *
 * @author yatac
 */
public class Login extends javax.swing.JFrame {

    Threads ejecutor = new Threads();
    Thread hilo = new Thread(ejecutor);

    public Login() {
        initComponents();
        FileCarpet.crearCarpetas();
        
        if (ValidateRegular.intentConnect != 1) {
            //Validacion Unica
            ValidateRegular.intentConnect =1;   
            //CRUD MYSQL
            hilo.start();
            if (Conexion.testConecion()) {
                try {
                    if (ValidateRegular.conexion) {
                        new FullCrudMysql();
                    }
                } catch (Exception e) {
                    System.out.println("Error de conexion");
                }
            }
        }
        setIconImage(new ImageIcon(getClass().getResource("/store.png")).getImage());
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarSesion = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        backgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/BtnSession.png"))); // NOI18N
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 260, -1));

        btnCrearUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/btnCrearUsuario.png"))); // NOI18N
        btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseExited(evt);
            }
        });
        getContentPane().add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 290, 70));

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnClose.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 30));

        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/LOGIN ORIGIN.png"))); // NOI18N
        getContentPane().add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setIcon(new ImageIcon(getClass().getResource("/img/BtnCloseWhite.png")));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setIcon(new ImageIcon(getClass().getResource("/img/BtnClose.png")));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setIcon(new ImageIcon(getClass().getResource("/img/Login/BtnSessionFull.png")));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setIcon(new ImageIcon(getClass().getResource("/img/Login/BtnSession.png")));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseEntered
        btnCrearUsuario.setIcon(new ImageIcon(getClass().getResource("/img/Login/btnCrearUsuarioWhite.png")));
    }//GEN-LAST:event_btnCrearUsuarioMouseEntered

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
        btnCrearUsuario.setIcon(new ImageIcon(getClass().getResource("/img/Login/btnCrearUsuario.png")));
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        LoginInit login = new LoginInit();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseClicked
        Users user = new Users();
        user.setMainEnter(false);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearUsuarioMouseClicked



    /**
     *
     * @param p Panel de Ingreso
     * @param width Ancho
     * @param height Alto
     * @param c contenedor
     */
    public void addConatiner(JPanel p, int width, int height, JPanel c) {
        p.setSize(width, height);
        p.setLocation(0, 0);
        c.removeAll();
        c.add(p, BorderLayout.CENTER);
        c.revalidate();
        c.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnCrearUsuario;
    private javax.swing.JLabel btnIniciarSesion;
    // End of variables declaration//GEN-END:variables
}
