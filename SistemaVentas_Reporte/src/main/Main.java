package main;

import design.Maximize;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.panels.PanelCliente;
import view.panels.PanelDetalleVentas;
import view.panels.PanelProducts;
import view.panels.PanelProveedores;
import view.panels.PanelReporteVentas;
import view.panels.PanelVentas;
import view.panels.forms.FormDetalleProductos;

/**
 *
 * @author yatac
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<JLabel> listaLabels = new ArrayList<>();
    private ArrayList<JPanel> listaJpanel = new ArrayList<>();
    private ArrayList<JPanel> listaForms = new ArrayList<>();
    private String rutas[] = {"src/img/btn_ReporteVentas", "src/img/btn_Clientes", "src/img/btn_Productos", "src/img/btn_Proveedores", "src/img/btn_Ventas", "src/img/btn_DetalleVentas", "src/img/btn_LogOut"};
    private String rute = "";
    private int indexPanel = 0;
    static boolean maximize = false;

    public Main() {
        initComponents();
        //Reset Design
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        Maximize.width_maximize = getWidth();
        Maximize.heigth_maximize = getHeight();
        Maximize.mainSet = true;
        autoList();
        updatePanelMinMax();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        ButtonReporteVentas = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JLabel();
        ButtonProveedores = new javax.swing.JLabel();
        ButtonProductos = new javax.swing.JLabel();
        ButtonVentas = new javax.swing.JLabel();
        ButtonDetalleVentas = new javax.swing.JLabel();
        ButtonClientes = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        HeadPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JPanel();
        maximizeLabel = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        labelUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MenuPanel.setBackground(new java.awt.Color(0, 153, 204));

        ButtonReporteVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ReporteVentas.png"))); // NOI18N
        ButtonReporteVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReporteVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonReporteVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonReporteVentasMouseExited(evt);
            }
        });

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoIsrael.png"))); // NOI18N

        ButtonExit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_LogOut.png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonExitMouseExited(evt);
            }
        });

        ButtonProveedores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Proveedores.png"))); // NOI18N
        ButtonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonProveedoresMouseExited(evt);
            }
        });

        ButtonProductos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Productos.png"))); // NOI18N
        ButtonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonProductosMouseExited(evt);
            }
        });

        ButtonVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Ventas.png"))); // NOI18N
        ButtonVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonVentasMouseExited(evt);
            }
        });

        ButtonDetalleVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonDetalleVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_DetalleVentas.png"))); // NOI18N
        ButtonDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDetalleVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonDetalleVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonDetalleVentasMouseExited(evt);
            }
        });

        ButtonClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Clientes.png"))); // NOI18N
        ButtonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonReporteVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(ButtonProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(ButtonVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(ButtonDetalleVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(ButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(ButtonClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ButtonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ButtonDetalleVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        HeadPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeadPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
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

        closeLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnClose.png"))); // NOI18N

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));

        maximizeLabel.setBackground(new java.awt.Color(255, 255, 255));
        maximizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnMaximize.png"))); // NOI18N
        maximizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMaximizeLayout = new javax.swing.GroupLayout(btnMaximize);
        btnMaximize.setLayout(btnMaximizeLayout);
        btnMaximizeLayout.setHorizontalGroup(
            btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maximizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        btnMaximizeLayout.setVerticalGroup(
            btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maximizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });

        minimizeLabel.setBackground(new java.awt.Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnMinimize.png"))); // NOI18N

        javax.swing.GroupLayout btnMinimizeLayout = new javax.swing.GroupLayout(btnMinimize);
        btnMinimize.setLayout(btnMinimizeLayout);
        btnMinimizeLayout.setHorizontalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnUsuarios.setBackground(new java.awt.Color(217, 217, 217));

        labelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnUsuarios.png"))); // NOI18N
        labelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuariosLayout.createSequentialGroup()
                .addComponent(labelUsuarios)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        /*
        *   Desactivar modo Nibus por Windows
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(this, "¿Desea salir?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        closeLabel.setIcon(new ImageIcon("src/img/BtnCloseWhite.png"));
        btnClose.setBackground(new Color(235, 20, 20));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        closeLabel.setIcon(new ImageIcon("src/img/BtnClose.png"));
        btnClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void maximizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeLabelMouseClicked
        maximizeResize();
        resizeFormsPanels();
    }//GEN-LAST:event_maximizeLabelMouseClicked

    private void maximizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeLabelMouseEntered
        btnMaximize.setBackground(new Color(220, 220, 220));
    }//GEN-LAST:event_maximizeLabelMouseEntered

    private void maximizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeLabelMouseExited
        btnMaximize.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_maximizeLabelMouseExited

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(220, 220, 220));

    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void ButtonReporteVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReporteVentasMouseClicked
        cambiarIconoColor(ButtonReporteVentas);
        indexPanel = 0;
        Maximize.isForm = false;
        resizeFormsPanels();
    }//GEN-LAST:event_ButtonReporteVentasMouseClicked

    private void ButtonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProductosMouseClicked
        cambiarIconoColor(ButtonProductos);
        Maximize.isForm = false;
        resizeFormsPanels();
        indexPanel = 2;
        updatePanelMinMax();
    }//GEN-LAST:event_ButtonProductosMouseClicked

    private void ButtonProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProveedoresMouseClicked
        Maximize.isForm = false;
        resizeFormsPanels();
        cambiarIconoColor(ButtonProveedores);
        indexPanel = 3;
        updatePanelMinMax();

    }//GEN-LAST:event_ButtonProveedoresMouseClicked

    private void ButtonVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVentasMouseClicked
        Maximize.isForm = false;
        resizeFormsPanels();
        cambiarIconoColor(ButtonVentas);
        indexPanel = 4;
        updatePanelMinMax();

    }//GEN-LAST:event_ButtonVentasMouseClicked

    private void ButtonDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetalleVentasMouseClicked
        cambiarIconoColor(ButtonDetalleVentas);
        indexPanel = 5;
        Maximize.isForm = false;
        resizeFormsPanels();
    }//GEN-LAST:event_ButtonDetalleVentasMouseClicked

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        Maximize.mainSet = true;
        cambiarIconoColor(ButtonExit);
        LoginInit log = new LoginInit();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void ButtonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClientesMouseClicked
        Maximize.isForm = false;
        resizeFormsPanels();
        cambiarIconoColor(ButtonClientes);
        indexPanel = 1;
        updatePanelMinMax();
    }//GEN-LAST:event_ButtonClientesMouseClicked

    private void labelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseClicked
        Users user = new Users();
        user.setMainEnter(true);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelUsuariosMouseClicked

    private void ButtonReporteVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReporteVentasMouseEntered
    }//GEN-LAST:event_ButtonReporteVentasMouseEntered

    private void ButtonReporteVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReporteVentasMouseExited
    }//GEN-LAST:event_ButtonReporteVentasMouseExited

    private void ButtonClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClientesMouseEntered
    }//GEN-LAST:event_ButtonClientesMouseEntered

    private void ButtonClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClientesMouseExited
    }//GEN-LAST:event_ButtonClientesMouseExited

    private void ButtonProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProductosMouseEntered

    }//GEN-LAST:event_ButtonProductosMouseEntered

    private void ButtonProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProductosMouseExited

    }//GEN-LAST:event_ButtonProductosMouseExited

    private void ButtonProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProveedoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonProveedoresMouseEntered

    private void ButtonProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProveedoresMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonProveedoresMouseExited

    private void ButtonVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVentasMouseEntered

    private void ButtonVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVentasMouseExited

    private void ButtonDetalleVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetalleVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDetalleVentasMouseEntered

    private void ButtonDetalleVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetalleVentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDetalleVentasMouseExited

    private void ButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonExitMouseEntered

    private void ButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonExitMouseExited

    public void resizeFormsPanels() {
        if (Maximize.isForm) {
            setUpdateDetalleProduct();
        } else {
            updatePanelMinMax();
        }
    }

    private void maximizeResize() {
        if (maximize) {
            setSize(1220, 760);
            MenuPanel.setPreferredSize(new Dimension(342, getHeight()));
            pack();
            setLocationRelativeTo(null);
            LogoLabel.setIcon(new ImageIcon("src/img/LogoIsrael.png"));
            autoLabelsResize();
            maximize = false;
        } else {
            MenuPanel.setPreferredSize(new Dimension(442, getHeight()));
            pack();
            setExtendedState(MAXIMIZED_BOTH);
            autoLabelsResize();
            LogoLabel.setIcon(new ImageIcon("src/img/LogoIsraelFull.png"));
            maximize = true;
        }
    }

    private void autoLabelsResize() {
        for (int i = 0; i < listaLabels.size(); i++) {
            Icon icono = listaLabels.get(i).getIcon();
            ImageIcon miImagen = (ImageIcon) icono;
            String rutaArchivo = miImagen.getDescription();
            File archivo = new File(rutaArchivo);
            rutaArchivo = archivo.getAbsolutePath();
            if (!maximize) {
                if (rutaArchivo.contains("White")) {
                    rute = rutas[i] + "FullWhite.png";
                } else {
                    rute = rutas[i] + "Full.png";
                }
            } else {
                if (rutaArchivo.contains("White")) {
                    rute = rutas[i] + "White.png";
                } else {
                    rute = rutas[i] + ".png";
                }
            }
            listaLabels.get(i).setIcon(new ImageIcon(rute));
        }
    }

    public void cambiarIconoColor(JLabel labelWhite) {

        for (int i = 0; i < listaLabels.size(); i++) {
            if (maximize) {
                if (!listaLabels.get(i).equals(labelWhite)) {
                    rute = rutas[i] + "Full.png";
                    listaLabels.get(i).setIcon(new ImageIcon(rute));
                } else {
                    rute = rutas[i] + "FullWhite.png";
                    listaLabels.get(i).setIcon(new ImageIcon(rute));
                }
            } else {
                if (!listaLabels.get(i).equals(labelWhite)) {
                    rute = rutas[i] + ".png";
                    listaLabels.get(i).setIcon(new ImageIcon(rute));
                } else {
                    rute = rutas[i] + "White.png";
                    listaLabels.get(i).setIcon(new ImageIcon(rute));
                }
            }

        }
    }

    private void updatePanelMinMax() {
        int width = getWidth() - MenuPanel.getWidth();
        int heigth_min = 760;
        int heigth_max = getHeight() - HeadPanel.getHeight();
        System.out.println("WID:" + width + "Heigth:" + heigth_max);
        if (!maximize) {
            addConatiner(listaJpanel.get(indexPanel), width, heigth_min, ContentPanel);
        } else {
            addConatiner(listaJpanel.get(indexPanel), width, heigth_max, ContentPanel);
        }
    }

    public void setUpdateDetalleProduct() {
        int width = getWidth() - MenuPanel.getWidth();
        int heigth_min = 760;
        int heigth_max = getHeight() - HeadPanel.getHeight();
        System.out.println("LLEGUE A EJECUTAR");
        if (maximize) {
            addConatiner(listaForms.get(Maximize.indexForms), width, heigth_max, ContentPanel);
        } else {
            addConatiner(listaForms.get(Maximize.indexForms), width, heigth_min, ContentPanel);
        }
    }

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

    private void autoList() {

        ButtonReporteVentas.setIcon(new ImageIcon("src/img/btn_ReporteVentasWhite.png"));
        /*JLABEL*/
        listaLabels.add(ButtonReporteVentas);
        listaLabels.add(ButtonClientes);
        listaLabels.add(ButtonProductos);
        listaLabels.add(ButtonProveedores);
        listaLabels.add(ButtonVentas);
        listaLabels.add(ButtonDetalleVentas);
        listaLabels.add(ButtonExit);

        /*JPANEL*/
        listaJpanel.add(new PanelReporteVentas());
        listaJpanel.add(new PanelCliente());
        listaJpanel.add(new PanelProducts());
        listaJpanel.add(new PanelProveedores());
        listaJpanel.add(new PanelVentas());
        listaJpanel.add(new PanelDetalleVentas());

        listaForms.add(new FormDetalleProductos());

        //addConatiner(new PanelReporteVentas(), getWidth()-442, getHeight(), ContentPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonClientes;
    private javax.swing.JLabel ButtonDetalleVentas;
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JLabel ButtonProductos;
    private javax.swing.JLabel ButtonProveedores;
    private javax.swing.JLabel ButtonReporteVentas;
    private javax.swing.JLabel ButtonVentas;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMaximize;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel labelUsuarios;
    private javax.swing.JLabel maximizeLabel;
    private javax.swing.JLabel minimizeLabel;
    // End of variables declaration//GEN-END:variables

    /*
    * BACKGROOUND MENU
     */
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/BackgroundMenu.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
