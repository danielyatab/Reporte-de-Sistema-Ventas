/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import design.MethodsResponsive;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author yatac
 */
public class Main extends javax.swing.JFrame {

    private boolean maximize = true;
    private int xMouse, yMouse;
    private ArrayList<JLabel> listaLabels =  new ArrayList<>();

    public Main() {
        initComponents();  
        //GlassPanePopup.install(this);      
        initResizeFrame();
        //initResizeDataLabels();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        ButtonExit = new javax.swing.JLabel();
        LogoPanel = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        ButtonsGrid = new javax.swing.JPanel();
        ButtonReporteVentas = new javax.swing.JLabel();
        ButtonProveedores = new javax.swing.JLabel();
        ButtonProductps = new javax.swing.JLabel();
        ButtonClientes = new javax.swing.JLabel();
        ButtonVentas = new javax.swing.JLabel();
        ButtonDetalleVentas = new javax.swing.JLabel();
        ContentJpanel = new javax.swing.JPanel();
        HeadPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JPanel();
        maximizeLabel = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnSalir.png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });

        LogoPanel.setBackground(new java.awt.Color(204, 204, 204));
        LogoPanel.setOpaque(false);
        LogoPanel.setPreferredSize(new java.awt.Dimension(442, 320));

        LogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoIsrael.png"))); // NOI18N

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        ButtonsGrid.setOpaque(false);
        ButtonsGrid.setPreferredSize(new java.awt.Dimension(442, 600));

        ButtonReporteVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnReporteVentas.png"))); // NOI18N
        ButtonReporteVentas.setAlignmentX(0.5F);
        ButtonReporteVentas.setIconTextGap(1);
        ButtonReporteVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReporteVentasMouseClicked(evt);
            }
        });

        ButtonProveedores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnProveedores.png"))); // NOI18N
        ButtonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProveedoresMouseClicked(evt);
            }
        });

        ButtonProductps.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonProductps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnProductos.png"))); // NOI18N
        ButtonProductps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonProductpsMouseClicked(evt);
            }
        });

        ButtonClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnClientes.png"))); // NOI18N
        ButtonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonClientesMouseClicked(evt);
            }
        });

        ButtonVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnVentas.png"))); // NOI18N
        ButtonVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonVentasMouseClicked(evt);
            }
        });

        ButtonDetalleVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonDetalleVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnDetalleVentas.png"))); // NOI18N
        ButtonDetalleVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDetalleVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ButtonsGridLayout = new javax.swing.GroupLayout(ButtonsGrid);
        ButtonsGrid.setLayout(ButtonsGridLayout);
        ButtonsGridLayout.setHorizontalGroup(
            ButtonsGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonProductps, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonDetalleVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ButtonsGridLayout.setVerticalGroup(
            ButtonsGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsGridLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(ButtonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(ButtonProductps, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(ButtonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(ButtonDetalleVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(ButtonsGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap(966, Short.MAX_VALUE)
                        .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        ContentJpanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentJpanel.setPreferredSize(new java.awt.Dimension(1478, 30));

        HeadPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeadPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeadPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeadPanelMouseExited(evt);
            }
        });

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
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addContainerGap(1360, Short.MAX_VALUE)
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
        );

        javax.swing.GroupLayout ContentJpanelLayout = new javax.swing.GroupLayout(ContentJpanel);
        ContentJpanel.setLayout(ContentJpanelLayout);
        ContentJpanelLayout.setHorizontalGroup(
            ContentJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeadPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentJpanelLayout.setVerticalGroup(
            ContentJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentJpanelLayout.createSequentialGroup()
                .addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonReporteVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReporteVentasMouseClicked
        cambiarIconoColor(ButtonReporteVentas);
    }//GEN-LAST:event_ButtonReporteVentasMouseClicked

    private void ButtonProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProveedoresMouseClicked
       cambiarIconoColor(ButtonProveedores);
    }//GEN-LAST:event_ButtonProveedoresMouseClicked

    private void ButtonProductpsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonProductpsMouseClicked
       cambiarIconoColor(ButtonProductps);
    }//GEN-LAST:event_ButtonProductpsMouseClicked

    private void ButtonClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClientesMouseClicked
        cambiarIconoColor(ButtonClientes);
    }//GEN-LAST:event_ButtonClientesMouseClicked

    private void ButtonVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVentasMouseClicked
        cambiarIconoColor(ButtonVentas);
    }//GEN-LAST:event_ButtonVentasMouseClicked

    private void ButtonDetalleVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetalleVentasMouseClicked
       cambiarIconoColor(ButtonDetalleVentas);
    }//GEN-LAST:event_ButtonDetalleVentasMouseClicked

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        //GlassPanePopup.showPopup(new LogOut());
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        closeLabel.setIcon(new ImageIcon("src/img/BtnCloseWhite.png"));
        btnClose.setBackground(new Color(235, 20, 20));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        closeLabel.setIcon(new ImageIcon("src/img/BtnClose.png"));
        btnClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCloseMouseExited

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

    private void HeadPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadPanelMouseEntered
        HeadPanel.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_HeadPanelMouseEntered

    private void HeadPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadPanelMouseExited
        HeadPanel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_HeadPanelMouseExited

    private void maximizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeLabelMouseClicked
        maximizeResize();
    }//GEN-LAST:event_maximizeLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    /**
     * *********METHODS ANIMATION*******************
     */
    public void cambiarIconoColor(JLabel labelWhite) {
        autoList();
        String rutas[]= {"src/img/BtnReporteVentas","src/img/BtnProveedores","src/img/BtnProductos","src/img/BtnClientes","src/img/BtnVentas","src/img/BtnDetalleVentas"};
        String rute="";
        for(int i=0; i<6; i++){
             if (! listaLabels.get(i).equals(labelWhite)) {
                 rute = rutas[i]+".png";
                 listaLabels.get(i).setIcon(new ImageIcon(rute));
             }else {
                 rute = rutas[i]+"White.png";
                 listaLabels.get(i).setIcon(new ImageIcon(rute));
             }
        }
    }

    private void maximizeResize(){
        if (maximize) {
            setSize(1180, 820);                  
            setLocationRelativeTo(null);
            initResizeFrame();
            initResizeDataLabels();  
            pack();
            maximize = false;          
        } else {
            setExtendedState(MAXIMIZED_BOTH);
            initResizeFrame();
           // initResizeDataLabels();  
            maximize = true;         
        }
        System.out.println( "ANCHO DE PANTALLA"+ this.getWidth() + "anhco de menu" + MenuPanel.getWidth());
    }
    
    public void initResizeDataLabels(){      
        autoList();
        /*ResizeButton*/
        double buttonsWidthLabel = (90.5*MenuPanel.getWidth())/100;
        double buttonsHeigthLabel = (5.92592592592592*MenuPanel.getHeight())/100;        
        /*Resize Logo*/
        double buttonLogoWidthLabel = (61.99095022624434*MenuPanel.getWidth())/100;
        double buttonLogoHeigthLabel = (25.37037037037037*MenuPanel.getHeight())/100;        
        String rutas[]= {"src/img/BtnReporteVentas.png","src/img/BtnProveedores.png","src/img/BtnProductos.png","src/img/BtnClientes.png","src/img/BtnVentas.png","src/img/BtnDetalleVentas.png","src/img/BtnDetalleVentas.png"};
         
        for(int i=0; i<listaLabels.size(); i++){
            listaLabels.get(i).setSize(MenuPanel.getWidth(), (int)Math.ceil(buttonsHeigthLabel));
            listaLabels.get(i).setIcon(MethodsResponsive.ScaleIcon(listaLabels.get(i),(int)Math.ceil(buttonsWidthLabel ) , (int)Math.ceil(buttonsHeigthLabel)));          
       
        }      
        System.out.println("Btton reporte" + ButtonReporteVentas.getWidth());
        LogoLabel.setIcon(MethodsResponsive.ScaleIcon(LogoLabel,(int)Math.ceil(buttonLogoWidthLabel ) , (int)Math.ceil(buttonLogoHeigthLabel)));    
        //MenuLabel.setIcon(MethodsResponsive.ScaleIcon(MenuLabel, MenuPanel.getWidth()  , MenuPanel.getHeight()));  
       
    }
    
    public void initResizeFrame(){
        /*Resize PanelMenu*/
        double panelmenuWidth = (24*getWidth())/100;
        double panelmenuHeigth = (getHeight());   
        //MenuPanel.setSize((int)Math.ceil(panelmenuWidth ),(int)Math.ceil(panelmenuHeigth ) );
        MenuPanel.setPreferredSize(new Dimension((int)Math.ceil(panelmenuWidth ), (int)Math.ceil(panelmenuHeigth )));
        
        /*Resize ButtonsGrid*/
        double panelbutttonsWidth = (24*getWidth())/100;;
        double panelbuttonsHeigth = (55*getHeight())/100;   
        ButtonsGrid.setSize((int)Math.ceil(panelbutttonsWidth ),(int)Math.ceil(panelbuttonsHeigth) );
        
     
        /*Resize LogoPanel*/
        double panellogoWidth = (24*getWidth())/100;;
        double panellogoHeigth = (24* getHeight())/100;   
        LogoPanel.setSize((int)Math.ceil( panellogoWidth ),(int)Math.ceil(panellogoHeigth ) );
        
        /*Resize PanelContent*/
        double panelcontentWidth = (76*getWidth())/100;
        double panelcontentHeigth = (getHeight());  
        ContentJpanel.setSize((int)Math.ceil(panelcontentWidth ), (int)Math.ceil(panelcontentHeigth ));
        
        /*Resize PanelHead*/
        double panelheadWidth = (getWidth());
        double panelheadHeigth = (2.8*getHeight());  
        HeadPanel.setSize((int)Math.ceil(panelheadWidth ), (int)Math.ceil(panelheadHeigth ));
       
    }
    
    
    private void autoRisize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int Width = (int) screenSize.getWidth();
        int Height = (int) screenSize.getHeight();
        this.setSize(Width, Height );
    }
    
    private void autoList(){       
        /*List Button*/
        // listaLabels.add(LogoLabel);
        listaLabels.add(ButtonReporteVentas);
        listaLabels.add(ButtonProveedores);
        listaLabels.add(ButtonProductps);
        listaLabels.add(ButtonClientes);
        listaLabels.add(ButtonVentas);
        listaLabels.add(ButtonDetalleVentas);
        listaLabels.add(ButtonExit);       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonClientes;
    private javax.swing.JLabel ButtonDetalleVentas;
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JLabel ButtonProductps;
    private javax.swing.JLabel ButtonProveedores;
    private javax.swing.JLabel ButtonReporteVentas;
    private javax.swing.JLabel ButtonVentas;
    private javax.swing.JPanel ButtonsGrid;
    private javax.swing.JPanel ContentJpanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMaximize;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel maximizeLabel;
    private javax.swing.JLabel minimizeLabel;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("src/imagenes/uno.jpg")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    
}