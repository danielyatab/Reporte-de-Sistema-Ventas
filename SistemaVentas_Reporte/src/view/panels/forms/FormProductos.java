/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels.forms;

import Model.ModelCellProductos;
import Model.conexion.CrudMysql;
import controller.JsonProductoCRUD;
import controller.JsonTipoProducto;
import controller.ValidateRegular;
import design.Maximize;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.panels.PanelProducto;
import view.panels.PanelVentas;

/**
 *
 * @author yatac
 */
public class FormProductos extends javax.swing.JPanel {

    public boolean passCode = true;
    ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
    public boolean add = true;

    public FormProductos() {
        initComponents();
        txtCodigo.requestFocus();
        setOpaque(false);
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContent = new FondoPanel();
        PanelColor = new FondoPanelColor();
        PanelWhite = new FondoPanelWhite();
        btnAceptar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        TextName = new FondoPanelTotal();
        txtCodigo = new javax.swing.JTextField();
        TextLastName = new FondoPanelTotal();
        txtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextLastName1 = new FondoPanelTotal();
        txtMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPhone1 = new FondoPanelTotal();
        txtDescripcion = new javax.swing.JTextField();
        btnAddTipo = new javax.swing.JLabel();
        btnGeneraCodigo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        TextLastName2 = new FondoPanelTotal();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TextPhone2 = new FondoPanelTotal();
        txtPrecioU = new javax.swing.JTextField();
        btnAddCantidad = new javax.swing.JLabel();

        setOpaque(false);

        PanelContent.setBackground(new java.awt.Color(53, 53, 53));
        PanelContent.setOpaque(false);

        PanelColor.setBackground(new java.awt.Color(153, 255, 153));
        PanelColor.setOpaque(false);

        PanelWhite.setBackground(new java.awt.Color(250, 250, 250));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Agregar.png"))); // NOI18N
        btnAceptar.setText("jLabel1");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cancelar.png"))); // NOI18N
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        TextName.setOpaque(false);

        txtCodigo.setBackground(new java.awt.Color(245, 244, 244));
        txtCodigo.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 102));
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout TextNameLayout = new javax.swing.GroupLayout(TextName);
        TextName.setLayout(TextNameLayout);
        TextNameLayout.setHorizontalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextNameLayout.setVerticalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo)
                .addContainerGap())
        );

        TextLastName.setOpaque(false);

        txtProducto.setBackground(new java.awt.Color(245, 244, 244));
        txtProducto.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 102));
        txtProducto.setBorder(null);
        txtProducto.setOpaque(false);

        javax.swing.GroupLayout TextLastNameLayout = new javax.swing.GroupLayout(TextLastName);
        TextLastName.setLayout(TextLastNameLayout);
        TextLastNameLayout.setHorizontalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastNameLayout.setVerticalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProducto)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Marca");

        TextLastName1.setOpaque(false);

        txtMarca.setBackground(new java.awt.Color(245, 244, 244));
        txtMarca.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 102));
        txtMarca.setBorder(null);
        txtMarca.setOpaque(false);

        javax.swing.GroupLayout TextLastName1Layout = new javax.swing.GroupLayout(TextLastName1);
        TextLastName1.setLayout(TextLastName1Layout);
        TextLastName1Layout.setHorizontalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastName1Layout.setVerticalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMarca)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Descripción");

        TextPhone1.setOpaque(false);

        txtDescripcion.setBackground(new java.awt.Color(245, 244, 244));
        txtDescripcion.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 102));
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);

        javax.swing.GroupLayout TextPhone1Layout = new javax.swing.GroupLayout(TextPhone1);
        TextPhone1.setLayout(TextPhone1Layout);
        TextPhone1Layout.setHorizontalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhone1Layout.setVerticalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDescripcion)
                .addContainerGap())
        );

        btnAddTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddTipo.png"))); // NOI18N
        btnAddTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTipoMouseClicked(evt);
            }
        });

        btnGeneraCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_GenerarCodigo.png"))); // NOI18N
        btnGeneraCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGeneraCodigoMouseClicked(evt);
            }
        });

        title.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("AGREGAR PRODUCTO");

        comboTipo.setBackground(new java.awt.Color(255, 255, 255));
        comboTipo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(16, 21, 64));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Consumibles", "Libros" }));
        comboTipo.setBorder(null);
        comboTipo.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Cantidad");

        TextLastName2.setOpaque(false);

        txtCantidad.setBackground(new java.awt.Color(245, 244, 244));
        txtCantidad.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 102));
        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextLastName2Layout = new javax.swing.GroupLayout(TextLastName2);
        TextLastName2.setLayout(TextLastName2Layout);
        TextLastName2Layout.setHorizontalGroup(
            TextLastName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastName2Layout.setVerticalGroup(
            TextLastName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCantidad)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Precio Unitario");

        TextPhone2.setOpaque(false);

        txtPrecioU.setBackground(new java.awt.Color(245, 244, 244));
        txtPrecioU.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtPrecioU.setForeground(new java.awt.Color(0, 0, 102));
        txtPrecioU.setBorder(null);
        txtPrecioU.setOpaque(false);
        txtPrecioU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextPhone2Layout = new javax.swing.GroupLayout(TextPhone2);
        TextPhone2.setLayout(TextPhone2Layout);
        TextPhone2Layout.setHorizontalGroup(
            TextPhone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrecioU, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhone2Layout.setVerticalGroup(
            TextPhone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrecioU)
                .addContainerGap())
        );

        btnAddCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddTipo.png"))); // NOI18N

        javax.swing.GroupLayout PanelWhiteLayout = new javax.swing.GroupLayout(PanelWhite);
        PanelWhite.setLayout(PanelWhiteLayout);
        PanelWhiteLayout.setHorizontalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TextLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelWhiteLayout.createSequentialGroup()
                                .addComponent(TextLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCantidad))
                            .addComponent(jLabel13)))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(TextPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                            .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGeneraCodigo)
                                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10)
                                            .addComponent(TextPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50))
                                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddTipo))))
                            .addGap(25, 25, 25)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        PanelWhiteLayout.setVerticalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addComponent(btnGeneraCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
        PanelColor.setLayout(PanelColorLayout);
        PanelColorLayout.setHorizontalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(PanelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PanelColorLayout.setVerticalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(PanelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelContentLayout = new javax.swing.GroupLayout(PanelContent);
        PanelContent.setLayout(PanelContentLayout);
        PanelContentLayout.setHorizontalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContentLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        PanelContentLayout.setVerticalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContentLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if (nullTxt()) {
            ModelCellProductos newPd = new ModelCellProductos();
            if (add) {
                newPd = newProducto();
                /*LLENADO JSON*/
                JsonProductoCRUD.addProducto(newPd);
                /*LLENADO MYSQL*/
                pushMysql();
            } else {
                newPd = newProducto();
                JsonProductoCRUD.updateProducto(newPd);
                /*LLENADO MYSQL*/
                pushMysql();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Termina de llenar los campos", "", 0, icono);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (JsonProductoCRUD.searchCodeExistente(txtCodigo.getText())) {
            getElements(ValidateRegular.oldProducto);
        }
        if (evt.getKeyCode() == evt.VK_SPACE) {
            txtCodigo.setEditable(false); // Establecer editable en false cuando se suelta la tecla de espacio
            txtProducto.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(this, "¿Desea salir sin agregar al producto?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            if (ValidateRegular.passProducto) {
                ValidateRegular.passProducto = false;
                addContainer(new PanelVentas(), getWidth(), getHeight(), PanelContent);
            } else {
                addContainer(new PanelProducto(), getWidth(), getHeight(), PanelContent);
            }
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGeneraCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeneraCodigoMouseClicked
        txtCodigo.setText(JsonProductoCRUD.returnCodeGenerate());
        txtCodigo.setEditable(false);
    }//GEN-LAST:event_btnGeneraCodigoMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        // Verificar si el carácter no es un número o si ya hay 9 cifras
        if (!Character.isDigit(c)) {
            evt.consume(); // Cancelar el evento para evitar la entrada
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUKeyTyped
        char c = evt.getKeyChar();

        // Permitir teclas de control como backspace y delete
        if (Character.isISOControl(c)) {
            txtPrecioU.setEditable(true);
            return;
        }

        // Permitir el punto decimal si no se ha ingresado previamente
        if (c == '.' && txtPrecioU.getText().contains(".")) {
            txtPrecioU.setEditable(false);
            evt.consume();
            return;
        }

        // Permitir solo dígitos y el punto decimal
        if (!Character.isDigit(c) && c != '.') {
            txtPrecioU.setEditable(false);
            evt.consume();
        } else {
            // Validar que solo haya hasta 2 decimales
            String text = txtPrecioU.getText();
            int dotIndex = text.indexOf('.');
            if (dotIndex != -1 && text.substring(dotIndex).length() > 2) {
                txtPrecioU.setEditable(false);
                evt.consume();
            } else {
                txtPrecioU.setEditable(true);
            }
        }
    }//GEN-LAST:event_txtPrecioUKeyTyped

    private void btnAddTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTipoMouseClicked
        FormAddTipoProducto.mostrarDialogo();
        listaTiposProductos();
    }//GEN-LAST:event_btnAddTipoMouseClicked

 
    /*INIT DATA*/
    private void initData() {
        System.out.print("INIT DATA sssssXD");
        //txtCodigo.setSelectionStart(0);
        if (Maximize.updateCrud) {
            add = false;
            btnAceptar.setIcon(new ImageIcon("src/img/btn_Actualizar.png"));
            title.setText("ACTUALIZAR PRODUCTO");
            Maximize.updateCrud = false;
            getElements(ValidateRegular.updateProducto);
        } else {
            btnAceptar.setIcon(new ImageIcon("src/img/btn_Agregar.png"));
            add = true;
            title.setText("AGREGAR PRODUCTO");
        }
        listaTiposProductos();
    }

    public void listaTiposProductos() {
       comboTipo.removeAllItems();
        // Agregar los elementos del ArrayList al JComboBox
        for (String elemento : JsonTipoProducto.returnTiposProductos()) {
           comboTipo.addItem(elemento);
        }
    }
   

    /**
     *
     * @param p Panel de Ingreso
     * @param width Ancho
     * @param height Alto
     * @param c contenedor
     */
    public void addContainer(JPanel p, int width, int height, JPanel c) {
        p.setSize(width, height);
        p.setLocation(0, 0);
        c.removeAll();
        c.add(p, BorderLayout.CENTER);
        c.revalidate();
        c.repaint();
    }

    private void getElements(ModelCellProductos updateP) {
        txtCodigo.setText(updateP.getCodigo());
        txtProducto.setText(updateP.getProducto());
        txtMarca.setText(updateP.getMarca());
        txtDescripcion.setText(updateP.getDescripcion());
        txtCantidad.setText(valueOf(updateP.getCantidad()));
        comboTipo.setSelectedItem(updateP.getTipo());
        txtPrecioU.setText(valueOf(updateP.getPrecioU()));
    }

    public boolean nullTxt() {
        if (txtCodigo.getText().equals("") || txtProducto.getText().equals("") || txtPrecioU.equals("") || txtCantidad.equals("") || txtMarca.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public ModelCellProductos newProducto() {
        ModelCellProductos newPd = new ModelCellProductos();
        newPd.setCodigo(txtCodigo.getText());
        newPd.setProducto(txtProducto.getText());
        newPd.setTipo(comboTipo.getSelectedItem().toString());
        newPd.setMarca(txtMarca.getText());
        newPd.setDescripcion(txtDescripcion.getText());
        newPd.setCantidad(Integer.parseInt(txtCantidad.getText()));
        newPd.setPrecioU(Double.parseDouble(txtPrecioU.getText()));
        System.out.println("New opv: + " + newPd.getProducto());
        return newPd;
    }

    public void pushMysql() {
        ImageIcon icononew = new ImageIcon("src/img/message/comprobado.png");
        JOptionPane.showMessageDialog(null, "Regitro exitoso del Producto", "", 0, icononew);
        if (ValidateRegular.conexion) {
            try {
                CrudMysql.crudMysqlProductos();
                CrudMysql.crudMysqlProductosHistorial();
            } catch (Exception e) {
                System.out.println("Sin conexion a internet HISTORIALproducto");
            }
        }
        if (ValidateRegular.passProducto) {
            ValidateRegular.passProducto = false;
            addContainer(new PanelVentas(), getWidth(), getHeight(), PanelContent);
        } else {
            addContainer(new PanelProducto(), getWidth(), getHeight(), PanelContent);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelColor;
    private javax.swing.JPanel PanelContent;
    private javax.swing.JPanel PanelWhite;
    private javax.swing.JPanel TextLastName;
    private javax.swing.JPanel TextLastName1;
    private javax.swing.JPanel TextLastName2;
    private javax.swing.JPanel TextName;
    private javax.swing.JPanel TextPhone1;
    private javax.swing.JPanel TextPhone2;
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnAddCantidad;
    private javax.swing.JLabel btnAddTipo;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGeneraCodigo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/transparentPanel.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelWhite extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/PanelFormColorWhite.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelColor extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/PanelFormColor.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelTotal extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/PanelTotal.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
