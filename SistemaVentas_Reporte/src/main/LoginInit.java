/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Model.ModelUser;
import controller.JsonUserValidation;
import controller.ValidateRegular;
import java.awt.Color;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class LoginInit extends javax.swing.JFrame {

    JsonUserValidation jsonUser = new JsonUserValidation();

    /*Reseteo de campos de texto*/
    private boolean check = true;
    private boolean checkSetUser = true;
    private boolean checkSetPassword = true;

    public LoginInit() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/store.png")).getImage());
        setFocusable(true);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckBoxPassword = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JLabel();
        Bakcground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckBoxPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/CheckOffBlack.png"))); // NOI18N
        CheckBoxPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBoxPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(CheckBoxPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 160, 40));

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
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 30, 30));

        btnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/btnIniciar.png"))); // NOI18N
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 290, 80));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 103));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 103));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 280, 10));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 103));
        txtUsuario.setText("Ingrese el Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 280, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 103));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 103));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 280, 10));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 103));
        txtContraseña.setText("Ingrese Contraseña");
        txtContraseña.setBorder(null);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 290, 50));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/btnVolver_1.png"))); // NOI18N
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 80, 30));

        Bakcground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/BackgroundIniciarSesion.png"))); // NOI18N
        getContentPane().add(Bakcground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setIcon(new ImageIcon(getClass().getResource("/img/Login/btnVolverSelect.png")));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setIcon(new ImageIcon(getClass().getResource("/img/Login/btnVolver_1.png")));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        char[] contraseña = txtContraseña.getPassword();
        String passwordStr = valueOf(contraseña);
        String userName = txtUsuario.getText();
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/usuarioError.png")); // Ruta al archivo de imagen del ícono
        ModelUser user = new ModelUser(userName, passwordStr);

        if (checkSetPassword) {
            JOptionPane.showMessageDialog(null, "Termine de llenar los campos", "", 0, icono);
            ValidateRegular.testValidate++;
        } else {
            ValidateRegular.testValidate++;

            if (ValidateRegular.SYMBOLS_PATTERN.matcher(userName).matches()) {
                if (jsonUser.validarUsuario(user)) {

                    //Reset Intentos
                    ValidateRegular.testValidate = 0;
                    //Aparicion de nueva pantalla
                    Main main = new Main();
                    main.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no puede contener espacios o simbolos, ejemplo: admin123", "", 0, icono);
                txtUsuario.setText("");
                txtContraseña.setText("");
                txtContraseña.setFocusable(true);
            }
        }

        /*
        * Validacion de intentos
         */
        if (ValidateRegular.testValidate > 2) {
            JOptionPane.showMessageDialog(null, "Intentos Fallidos", "", 0, icono);
            System.exit(0);
        } else if (ValidateRegular.testValidate == 2) {
            JOptionPane.showMessageDialog(null, "Te queda solo 1 intento", "", 0, icono);
        }


    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
//        btnClose.setIcon(new ImageIcon("src/img/BtnCloseWhite.png"));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        //btnClose.setIcon(new ImageIcon("src/img/BtnClose.png"));
    }//GEN-LAST:event_btnCloseMouseExited

    private void CheckBoxPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBoxPasswordMouseClicked
        if (check) {
            CheckBoxPassword.setIcon(new ImageIcon(getClass().getResource("/img/Login/CheckOnBlack.png")));
            check = false;
            txtContraseña.setEchoChar((char) 0);
            if (checkSetPassword) {
                txtContraseña.setText("");
                checkSetPassword = false;
            }
        } else {
            CheckBoxPassword.setIcon(new ImageIcon(getClass().getResource("/img/Login/CheckOffBlack.png")));
            check = true;
            txtContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxPasswordMouseClicked

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (checkSetUser) {
            txtUsuario.setText("");
            if (checkSetPassword) {
                txtContraseña.setText("");
                checkSetPassword = false;
            }
            checkSetUser = false;
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        if (checkSetPassword) {
            txtUsuario.setText("");
            if (checkSetUser) {
                txtContraseña.setText("");
                checkSetUser = false;
            }
            checkSetPassword = false;
        }
    }//GEN-LAST:event_txtContraseñaFocusGained


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bakcground;
    private javax.swing.JLabel CheckBoxPassword;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
