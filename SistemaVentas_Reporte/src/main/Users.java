package main;

import Model.ModelUser;
import Model.conexion.Conexion;
import Model.conexion.CrudMysql;
import controller.JsonUserValidation;
import controller.ValidateRegular;
import java.awt.Color;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yatac
 */
public class Users extends javax.swing.JFrame {

    private static boolean mainEnter;
    private static boolean check = true;
    private static boolean checkSetUser = true;
    private static boolean checkSetPassword = true;
    private JsonUserValidation crudUser = new JsonUserValidation();

    public static boolean isMainEnter() {
        return mainEnter;
    }

    public static void setMainEnter(boolean mainEnter) {
        Users.mainEnter = mainEnter;
    }

    public Users() {
        initComponents();
        setFocusable(true);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckBoxPassword = new javax.swing.JLabel();
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

        CheckBoxPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login/CheckOff.png"))); // NOI18N
        CheckBoxPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBoxPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(CheckBoxPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 160, 40));

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 280, 10));

        txtContraseña.setBackground(new java.awt.Color(42, 53, 110));
        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("Ingrese Contraseña");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 50));

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

        if (isMainEnter()) {
            main.setVisible(true);
            dispose();
        } else {
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
        if (checkSetUser) {
            txtUsuario.setText("");

            if (checkSetPassword) {
                txtContraseña.setText("");
                checkSetPassword = false;
            }
            checkSetUser = false;
        }
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        if (checkSetPassword) {
            txtUsuario.setText("");
            if (checkSetUser) {
                txtContraseña.setText("");
                checkSetUser = false;
            }
            checkSetPassword = false;
        }
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void btnCrearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseClicked
        char[] contraseña = txtContraseña.getPassword();
        String passwordStr = valueOf(contraseña);
        int newPassword = contraseña.length;
        String userName = txtUsuario.getText();
        ImageIcon icono = new ImageIcon("src/img/message/usuarioError.png"); // Ruta al archivo de imagen del ícono
        ModelUser user = new ModelUser();

        if (checkSetPassword) {
            JOptionPane.showMessageDialog(null, "Termine de llenar los campos", "", 0, icono);
        } else {
            //Reset Diseño
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            if (ValidateRegular.SYMBOLS_PATTERN.matcher(userName).matches()) {
                if (newPassword < 5) {
                    JOptionPane.showMessageDialog(null, "La contraseña requiere mas de 9 caracteres", "", 0, icono);
                    txtContraseña.setText("");
                    txtContraseña.setFocusable(true);
                } else {
                    user.setUser(userName);
                    user.setCargo("Empleado");
                    user.setPassword(passwordStr);
                    //JSON
                    crudUser.addUser(user);

                    //MYSQL => Actualizado de base de datos de ambos contenidos
                    try {
                        CrudMysql.crudMysqlUsuarios();
                        CrudMysql.crudMysqlHistorialUsuarios();
                    } catch (Exception e) {
                        System.out.println("Sin conexion a internet Mysql");
                    }

                    if (ValidateRegular.setCreateUser) {
                        LoginInit login = new LoginInit();
                        setMainEnter(false);
                        login.setVisible(true);
                        ValidateRegular.setCreateUser = false;
                    } else {
                        System.out.println("No entro opero si agreggo");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario no puede contener espacios o simbolos, ejemplo: admin123", "", 0, icono);
                txtUsuario.setText("");
                txtContraseña.setText("");
                txtContraseña.setFocusable(true);
            }
        }
    }//GEN-LAST:event_btnCrearUserMouseClicked

    private void btnCrearUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseEntered
        btnCrearUser.setIcon(new ImageIcon("src/img/Login/btnCreateUsarioWhite.png"));
    }//GEN-LAST:event_btnCrearUserMouseEntered

    private void btnCrearUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseExited
        btnCrearUser.setIcon(new ImageIcon("src/img/Login/btnCreateUsario.png"));
    }//GEN-LAST:event_btnCrearUserMouseExited

    private void CheckBoxPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBoxPasswordMouseClicked
        if (check) {
            CheckBoxPassword.setIcon(new ImageIcon("src/img/Login/CheckOn.png"));
            check = false;
            if (checkSetPassword) {
                txtContraseña.setText("");
                checkSetPassword = false;
            }
            txtContraseña.setEchoChar((char) 0);
        } else {
            CheckBoxPassword.setIcon(new ImageIcon("src/img/Login/CheckOff.png"));
            check = true;
            txtContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundCreateUser;
    private javax.swing.JLabel CheckBoxPassword;
    private javax.swing.JLabel btnCrearUser;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
