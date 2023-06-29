package main;

import Model.ModelCellVenta;
import controller.JsonProductoCRUD;
import controller.ValidateRegular;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.panels.PanelCliente;
import view.panels.PanelDetalleVentas;
import view.panels.PanelProducto;
import view.panels.PanelProveedores;
import view.panels.PanelReporteVentas;
import view.panels.PanelVentas;
import view.panels.forms.Maximize;

/**
 *
 * @author yatac
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<JLabel> listaLabels = new ArrayList<>();
    private ArrayList<JPanel> listaJpanel = new ArrayList<>();
    private ArrayList<JPanel> listaForms = new ArrayList<>();
    private String rutas[] = {"/img/btn_ReporteVentas", "/img/btn_Clientes", "/img/btn_Productos", "/img/btn_Proveedores", "/img/btn_Ventas", "/img/btn_DetalleVentas", "/img/btn_LogOut"};
    private String rute = "";
    private int indexPanel = 0;
    static boolean maximize = false;

    public Main() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/store.png")).getImage());
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
        JsonProductoCRUD.verificarStockProductos();
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
        });

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoIsrael.png"))); // NOI18N

        ButtonExit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_LogOut.png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });

        ButtonProveedores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Proveedores.png"))); // NOI18N
        ButtonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProveedoresMouseClicked(evt);
            }
        });

        ButtonProductos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Productos.png"))); // NOI18N
        ButtonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProductosMouseClicked(evt);
            }
        });

        ButtonVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Ventas.png"))); // NOI18N
        ButtonVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonVentasMouseClicked(evt);
            }
        });

        ButtonDetalleVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonDetalleVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_DetalleVentas.png"))); // NOI18N
        ButtonDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDetalleVentasMouseClicked(evt);
            }
        });

        ButtonClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Clientes.png"))); // NOI18N
        ButtonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonClientesMouseClicked(evt);
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
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addGroup(HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(this, "¿Desea salir?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            
            if (ValidateRegular.ventaRealizada == false) {
                ValidateRegular.listDetalleSelect = new ArrayList<ModelCellVenta>();
                ValidateRegular.listVentasExtrac = ValidateRegular.listVentas;

                ValidateRegular.listVentasDelete = new ArrayList<ModelCellVenta>();

                if (ValidateRegular.listVentasExtrac != null) {
                    for (int i = 0; i < ValidateRegular.listVentasExtrac.size(); i++) {
                        JsonProductoCRUD.extraerStock(ValidateRegular.listVentasExtrac.get(i).getCodigo(),
                                ValidateRegular.listVentasExtrac.get(i).getCantidad(),
                                true);
                    }
                    ValidateRegular.listVentasExtrac = null;
                }

                if (ValidateRegular.listVentasDelete != null) {
                    for (int i = 0; i < ValidateRegular.listVentasDelete.size(); i++) {
                        JsonProductoCRUD.extraerStock(ValidateRegular.listVentasDelete.get(i).getCodigo(),
                                ValidateRegular.listVentasDelete.get(i).getCantidad(),
                                false);
                    }
                    ValidateRegular.listVentasDelete = null;
                }
            }

            System.exit(0);

        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        closeLabel.setIcon(new ImageIcon(getClass().getResource("/img/BtnCloseWhite.png")));
        btnClose.setBackground(new Color(235, 20, 20));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        closeLabel.setIcon(new ImageIcon(getClass().getResource("/img/BtnClose.png")));
        btnClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCloseMouseExited

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
        addConatiner(new PanelReporteVentas(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonReporteVentasMouseClicked

    private void ButtonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProductosMouseClicked
        cambiarIconoColor(ButtonProductos);
        indexPanel = 2;
        addConatiner(new PanelProducto(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonProductosMouseClicked

    private void ButtonProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProveedoresMouseClicked
        cambiarIconoColor(ButtonProveedores);
        indexPanel = 3;
        addConatiner(new PanelProveedores(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonProveedoresMouseClicked

    private void ButtonVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVentasMouseClicked
       cambiarIconoColor(ButtonVentas);
        indexPanel = 4;
        addConatiner(new PanelVentas(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonVentasMouseClicked

    private void ButtonDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetalleVentasMouseClicked
        cambiarIconoColor(ButtonDetalleVentas);
        indexPanel = 5;
        addConatiner(new PanelDetalleVentas(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonDetalleVentasMouseClicked

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        Maximize.mainSet = true;
        cambiarIconoColor(ButtonExit);
        LoginInit log = new LoginInit();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void ButtonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClientesMouseClicked
        cambiarIconoColor(ButtonClientes);
        indexPanel = 1;
        addConatiner(new PanelCliente(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_ButtonClientesMouseClicked

    private void labelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseClicked
        Users user = new Users();
        user.setMainEnter(true);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelUsuariosMouseClicked

    public void resizeFormsPanels() {
        updatePanelMinMax();
    }



    public void cambiarIconoColor(JLabel labelWhite) {
        for (int i = 0; i < listaLabels.size(); i++) {
            if (maximize) {
                if (!listaLabels.get(i).equals(labelWhite)) {
                    rute = rutas[i] + "Full.png";
                    listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
                } else {
                    rute = rutas[i] + "FullWhite.png";
                    listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
                }
            } else {
                if (!listaLabels.get(i).equals(labelWhite)) {
                    rute = rutas[i] + ".png";
                    listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
                } else {
                    rute = rutas[i] + "White.png";
                    listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
                }
            }
        }
    }

    private void updatePanelMinMax() {
        int width = getWidth() - MenuPanel.getWidth();
        int heigth_min = 760;
        int heigth_max = getHeight() - HeadPanel.getHeight();
        System.out.println("ES HORA DE APRCER VENTANA: PANEL DETALLE VENTA");
        addConatiner(listaJpanel.get(indexPanel), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }

    public void setUpdateDetalleProduct() {
        int width = getWidth() - MenuPanel.getWidth();
        int heigth_min = 760;
        int heigth_max = getHeight() - HeadPanel.getHeight();

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

        ButtonReporteVentas.setIcon(new ImageIcon(getClass().getResource("/img/btn_ReporteVentasWhite.png")));
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
        listaJpanel.add(new PanelProducto());
        listaJpanel.add(new PanelProveedores());
        listaJpanel.add(new PanelVentas());
        listaJpanel.add(new PanelDetalleVentas());

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
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel labelUsuarios;
    private javax.swing.JLabel minimizeLabel;
    // End of variables declaration//GEN-END:variables


}
