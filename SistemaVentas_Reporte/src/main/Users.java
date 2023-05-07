/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import design.Maximize;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author yatac
 */
public class Users extends javax.swing.JFrame {

    private static boolean mainEnter;

    public static boolean isMainEnter() {
        return mainEnter;
    }

    public static void setMainEnter(boolean mainEnter) {
        Users.mainEnter = mainEnter;
    }

    
    public Users() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearUser = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JLabel();
        BackgroundCreateUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/btnCreateUsario.png"))); // NOI18N
        btnCrearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUserMouseExited(evt);
            }
        });
        getContentPane().add(btnCrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 550, 290, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 103));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 280, 10));

        txtUsuario.setBackground(new java.awt.Color(42, 53, 110));
        txtUsuario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Ingrese el Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 280, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 103));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 280, 10));

        txtContraseña.setBackground(new java.awt.Color(42, 53, 110));
        txtContraseña.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("Ingrese la Contraseña");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 290, 50));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/VolverUserCreate.png"))); // NOI18N
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, -1, -1));

        BackgroundCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackgroundCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/BackgroundCreateUser.png"))); // NOI18N
        getContentPane().add(BackgroundCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Main main = new Main();
        Login login = new Login();

        if(isMainEnter()){
            main.setVisible(true);
            dispose();
        }else {
            login.setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
       btnVolver.setIcon(new ImageIcon("src/img/Login/VolverUserCreateWhite.png"));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
       btnVolver.setIcon(new ImageIcon("src/img/Login/VolverUserCreate.png"));
    }//GEN-LAST:event_btnVolverMouseExited

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void btnCrearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseClicked
        LoginInit log = new LoginInit();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearUserMouseClicked

    private void btnCrearUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseEntered
        btnCrearUser.setIcon(new ImageIcon("src/img/Login/btnCreateUsarioWhite.png"));
    }//GEN-LAST:event_btnCrearUserMouseEntered

    private void btnCrearUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseExited
        btnCrearUser.setIcon(new ImageIcon("src/img/Login/btnCreateUsario.png"));
    }//GEN-LAST:event_btnCrearUserMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundCreateUser;
    private javax.swing.JLabel btnCrearUser;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
