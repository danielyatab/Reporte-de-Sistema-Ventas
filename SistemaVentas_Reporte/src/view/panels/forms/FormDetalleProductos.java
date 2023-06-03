/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels.forms;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.ModelCellVenta;
import Model.conexion.CrudMysql;
import com.itextpdf.text.DocumentException;
import controller.GeneratePdf;
import controller.JsonClienteCRUD;
import controller.JsonDetalleProducto;
import controller.JsonNumBoleta;
import controller.JsonProductoCRUD;
import controller.JsonVentaCRUD;
import controller.ValidateRegular;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.image.ImageObserver.ABORT;
import static java.lang.String.valueOf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import table.Venta.TableActionEventVenta;
import view.panels.PanelDetalleVentas;

/**
 *
 * @author yatac
 */
public class FormDetalleProductos extends javax.swing.JPanel {

    public static List<ModelCellVenta> listProducts = new ArrayList<ModelCellVenta>();
    public static ModelCellClientes cliente = new ModelCellClientes();
    public static ModelCellDetalles venta = new ModelCellDetalles();
    public double totalNewVenta = 0;

    /**
     * Creates new form FromDetalleProductos
     */
    public FormDetalleProductos() {
        initComponents();
        setOpaque(false);
        //Maximize.test = true;
        TableVenta.fixTable(jScrollPane2);
        TableVenta.setIconsColumns(8, 7, 10);
        listProducts = ValidateRegular.listDetalleSelect;
        venta = ValidateRegular.ventaSelect;
        cliente = ValidateRegular.clienteSelect;
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
        PanelTotal = new FondoPanelTotal();
        txtTotalVenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableVenta = new table.Venta.TableVenta();
        TextName = new FondoPanelTotal();
        txtNameCliente = new javax.swing.JTextField();
        TextLastName = new FondoPanelTotal();
        txtLastNameCliente = new javax.swing.JTextField();
        TextPhone = new FondoPanelTotal();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelNVenta = new FondoPanelTotal();
        TxtNumVenta = new javax.swing.JTextField();
        btnNewProduct = new javax.swing.JLabel();
        btnBoleta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();

        setOpaque(false);

        PanelContent.setBackground(new java.awt.Color(53, 53, 53));
        PanelContent.setOpaque(false);

        PanelColor.setBackground(new java.awt.Color(153, 255, 153));
        PanelColor.setOpaque(false);

        PanelWhite.setBackground(new java.awt.Color(255, 255, 255));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAceptarDetalleProducto.png"))); // NOI18N
        btnAceptar.setText("jLabel1");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCancelarDetalleProducto.png"))); // NOI18N
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        PanelTotal.setOpaque(false);

        txtTotalVenta.setEditable(false);
        txtTotalVenta.setBackground(new java.awt.Color(245, 244, 244));
        txtTotalVenta.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtTotalVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVenta.setText("123.45");
        txtTotalVenta.setBorder(null);
        txtTotalVenta.setFocusable(false);
        txtTotalVenta.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("S/. ");

        javax.swing.GroupLayout PanelTotalLayout = new javax.swing.GroupLayout(PanelTotal);
        PanelTotal.setLayout(PanelTotalLayout);
        PanelTotalLayout.setHorizontalGroup(
            PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtTotalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTotalLayout.setVerticalGroup(
            PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVenta)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("TOTAL VENTA:");

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableVenta);

        TextName.setOpaque(false);

        txtNameCliente.setBackground(new java.awt.Color(245, 244, 244));
        txtNameCliente.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtNameCliente.setForeground(new java.awt.Color(0, 0, 102));
        txtNameCliente.setBorder(null);
        txtNameCliente.setOpaque(false);
        txtNameCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout TextNameLayout = new javax.swing.GroupLayout(TextName);
        TextName.setLayout(TextNameLayout);
        TextNameLayout.setHorizontalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextNameLayout.setVerticalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameCliente)
                .addContainerGap())
        );

        TextLastName.setOpaque(false);

        txtLastNameCliente.setBackground(new java.awt.Color(245, 244, 244));
        txtLastNameCliente.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtLastNameCliente.setForeground(new java.awt.Color(0, 0, 102));
        txtLastNameCliente.setBorder(null);
        txtLastNameCliente.setOpaque(false);

        javax.swing.GroupLayout TextLastNameLayout = new javax.swing.GroupLayout(TextLastName);
        TextLastName.setLayout(TextLastNameLayout);
        TextLastNameLayout.setHorizontalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLastNameCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastNameLayout.setVerticalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLastNameCliente)
                .addContainerGap())
        );

        TextPhone.setOpaque(false);

        txtTelefono.setBackground(new java.awt.Color(245, 244, 244));
        txtTelefono.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 102));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);

        javax.swing.GroupLayout TextPhoneLayout = new javax.swing.GroupLayout(TextPhone);
        TextPhone.setLayout(TextPhoneLayout);
        TextPhoneLayout.setHorizontalGroup(
            TextPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhoneLayout.setVerticalGroup(
            TextPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Productos de la Venta Nº ");

        PanelNVenta.setOpaque(false);

        TxtNumVenta.setEditable(false);
        TxtNumVenta.setBackground(new java.awt.Color(245, 244, 244));
        TxtNumVenta.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        TxtNumVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumVenta.setText("000011");
        TxtNumVenta.setBorder(null);
        TxtNumVenta.setFocusable(false);
        TxtNumVenta.setOpaque(false);

        javax.swing.GroupLayout PanelNVentaLayout = new javax.swing.GroupLayout(PanelNVenta);
        PanelNVenta.setLayout(PanelNVentaLayout);
        PanelNVentaLayout.setHorizontalGroup(
            PanelNVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtNumVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelNVentaLayout.setVerticalGroup(
            PanelNVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtNumVenta)
                .addContainerGap())
        );

        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddProductDetalle.png"))); // NOI18N
        btnNewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewProductMouseClicked(evt);
            }
        });

        btnBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBoleta.png"))); // NOI18N
        btnBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletaMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Fecha");

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Fecha");

        javax.swing.GroupLayout PanelWhiteLayout = new javax.swing.GroupLayout(PanelWhite);
        PanelWhite.setLayout(PanelWhiteLayout);
        PanelWhiteLayout.setHorizontalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelWhiteLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelNVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelWhiteLayout.createSequentialGroup()
                                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(143, 143, 143))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                                        .addComponent(TextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))))
                .addGap(26, 26, 26))
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBoleta)
                .addGap(18, 18, 18)
                .addComponent(btnNewProduct)
                .addGap(18, 18, 18))
            .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelWhiteLayout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jLabel9)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );
        PanelWhiteLayout.setVerticalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBoleta)
                    .addComponent(btnNewProduct)
                    .addComponent(PanelNVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(PanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelWhiteLayout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(jLabel9)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
        PanelColor.setLayout(PanelColorLayout);
        PanelColorLayout.setHorizontalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(PanelWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelColorLayout.setVerticalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(PanelWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelContentLayout = new javax.swing.GroupLayout(PanelContent);
        PanelContent.setLayout(PanelContentLayout);
        PanelContentLayout.setHorizontalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContentLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(PanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        PanelContentLayout.setVerticalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContentLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(PanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

        generateVenta();


    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMouseClicked
        ValidateRegular.rutaStatic = venta.getRutaBoleta();
        FormBoleta boleta = new FormBoleta();
        addContainer(boleta, PanelContent.getWidth(), PanelContent.getHeight(), PanelContent);
    }//GEN-LAST:event_btnBoletaMouseClicked

    private void txtNameClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameClienteKeyReleased
        ModelCellClientes clienteSearc = JsonClienteCRUD.searchClienteNombre(txtNameCliente.getText().trim());
        if (clienteSearc != null) {
            txtTelefono.setText(clienteSearc.getTelefono());
            txtLastNameCliente.setText(clienteSearc.getApellido());
            //LLenado de cliente encontrado
            cliente = clienteSearc;
        } else {
            System.out.println("No encontre XD");
        }

    }//GEN-LAST:event_txtNameClienteKeyReleased

    private void btnNewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewProductMouseClicked
        FormAddProducto.mostrarDialogo();
        listProducts = ValidateRegular.listDetalleSelect;
        listTable();
    }//GEN-LAST:event_btnNewProductMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon("src/img/message/comprobado.png"); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(null,
                "¿Desea salir del detalle de la venta Nº" + venta.getnVenta() + "?",
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icono,
                opciones,
                opciones[0]);

        if (opcion == JOptionPane.YES_OPTION) {
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

            /*Mostrar otravez lista de detalle Ventas*/
            ValidateRegular.formDetalleProducto = false;
            addContainer(new PanelDetalleVentas(), getWidth(), getHeight(), PanelContent);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    /*EVENTO DE BOTONES*/
    TableActionEventVenta event = new TableActionEventVenta() {
        @Override
        public void onDelete(ModelCellVenta venta) {
            System.out.println("Eliminar venta producto");
            /*Aumentar Cantidad*/

            /*Agregar delete*/
            ValidateRegular.listVentasDelete = new ArrayList<ModelCellVenta>();
            ValidateRegular.listVentasDelete.add(listProducts.get(TableVenta.getSelectedRow()));
            
            JsonProductoCRUD.extraerStock(listProducts.get(TableVenta.getSelectedRow()).getCodigo(), listProducts.get(TableVenta.getSelectedRow()).getCantidad(), true);
            listProducts.remove(TableVenta.getSelectedRow());
            listTable();
        }

        @Override
        public void onEdit(ModelCellVenta venta) {
            System.out.println("Editar venta producto");
        }
    };


    /*INIT DATA*/
    private void initData() {
        if (ValidateRegular.formDetalleProducto) {
            listTable();
            llenadoCliente(cliente);
            llenadoVenta(venta);
            totalNewVenta = venta.getTotalVenta();
        }
    }

    private void listTable() {
        DefaultTableModel modelo = new DefaultTableModel();
        String columns[] = {"Codigo", "Producto", "Marca", "Descrp.", "Cantidad", "Precio U. ", "Importe", "Eliminar"};
        TableVenta.setModel(modelo);
        modelo.setColumnIdentifiers(columns);
        totalNewVenta = 0;

        for (ModelCellVenta v : listProducts) {
            TableVenta.addRow(new ModelCellVenta(v.getCodigo(), v.getProducto(), v.getMarca(), v.getDescripcion(), v.getCantidad(), v.getPrecioU(), v.getTotal()).toRowTable(event));
            totalNewVenta += v.getTotal();
        }

        /*Mostrar nuevo total*/
        txtTotalVenta.setText(valueOf(totalNewVenta));
    }

    public void generateVenta() {
        ImageIcon icononew = new ImageIcon("src/img/message/advertencia.png");

        if (listProducts.size() > 0) {
            if (!txtNameCliente.getText().equals("")) {

                String[] opciones = {"Si", "No"};
                ImageIcon icono = new ImageIcon("src/img/message/comprobado.png"); // Ruta al archivo de imagen del ícono
                int opcion = JOptionPane.showOptionDialog(null, "¿Desea guardar la venta, se generara como una nueva?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
                if (opcion == JOptionPane.YES_OPTION) {
                    addVenta();
                    deleteOldVenta();

                    /*Mostrar otravez lista de detalle Ventas*/
                    ValidateRegular.formDetalleProducto = false;
                    ValidateRegular.listVentasDelete = null;
                    ValidateRegular.listVentasExtrac = null;
                    addContainer(new PanelDetalleVentas(), getWidth(), getHeight(), PanelContent);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se tiene agregado Ningun Cliente", "", 0, icononew);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene ningun producto Agregado", "", 0, icononew);
        }
    }

    public void addDetalleProducto(String newnumventa) {
        List<ModelCellVenta> lisnewventa = new ArrayList<ModelCellVenta>();
        for (ModelCellVenta v : listProducts) {
            v.setNumVenta(newnumventa);
            lisnewventa.add(v);
        }
    }

    public void addVenta() {
        //Obtencion de venta
        String newNumVenta = JsonNumBoleta.generateNumVenta(ValidateRegular.numVenta);
        JsonNumBoleta.modificarNumBoleta(Long.parseLong(newNumVenta));

        //Obtener Fecha Actual
        Date fechaSeleccionada = jDateFecha.getDate();

        // Crear un objeto SimpleDateFormat para formatear la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Obtener la fecha formateada como cadena de texto (string)
        String fechaFormateada = sdf.format(fechaSeleccionada);

        //LLenado de datos de la venta en general
        ModelCellDetalles ventaDetalle = new ModelCellDetalles();
        ventaDetalle.setCodVenta(newNumVenta); //PR CORREGIR

        ventaDetalle.setnVenta(newNumVenta);
        ventaDetalle.setCliente(cliente.getIdCliente());
        ventaDetalle.setTotalVenta(Double.valueOf(txtTotalVenta.getText()));
        ventaDetalle.setFecha(fechaFormateada);
        ventaDetalle.setRutaBoleta(newNumVenta + ".pdf");

        try {
            GeneratePdf.pdf(listProducts, cliente, ventaDetalle, Double.parseDouble("0"), 0);
        } catch (DocumentException e) {
            System.out.println("Error al generar PDf" + e.getMessage());
        }

        /*
         * Json almacenaje
         */
        addDetalleProducto(newNumVenta);

        JsonDetalleProducto.addListDetalleProducto(listProducts);
        JsonVentaCRUD.addVenta(ventaDetalle);

        if (ValidateRegular.conexion) {
            CrudMysql.crudMysqlVentas();
            CrudMysql.crudMysqlVentaHistorial();
            CrudMysql.crudMysqlDetalleProducto();
        } else {
            System.out.println("Sin conexiona  internet");
        }

        addContainer(new PanelDetalleVentas(), PanelContent.getWidth(), PanelContent.getHeight(), PanelContent);
    }

    public void deleteOldVenta() {
        /*Eliminar venta antigua*/
        JsonVentaCRUD.deleteVenta(venta.getCodVenta());
        /*Eliminar detalle de productso antiguos*/
        JsonDetalleProducto.deleteList(venta.getnVenta());
        if (ValidateRegular.conexion) {
            CrudMysql.crudMysqlVentas();
            CrudMysql.crudMysqlDetalleProducto();
        } else {
            System.out.println("Sin conexion para actualizar el delete oldVenta");
        }
    }

    private void llenadoCliente(ModelCellClientes cl) {
        txtNameCliente.setText(cl.getNombre());
        txtLastNameCliente.setText(cl.getApellido());
        txtTelefono.setText(cl.getTelefono());
    }

    private void llenadoVenta(ModelCellDetalles v) {
        TxtNumVenta.setText(v.getnVenta());
        txtTotalVenta.setText(valueOf(v.getTotalVenta()));
        String fecha = v.getFecha();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        Date newFecha = new Date();
        try {
            newFecha = formato.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }

        jDateFecha.setDate(newFecha);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelColor;
    private javax.swing.JPanel PanelContent;
    private javax.swing.JPanel PanelNVenta;
    private javax.swing.JPanel PanelTotal;
    private javax.swing.JPanel PanelWhite;
    private table.Venta.TableVenta TableVenta;
    private javax.swing.JPanel TextLastName;
    private javax.swing.JPanel TextName;
    private javax.swing.JPanel TextPhone;
    private javax.swing.JTextField TxtNumVenta;
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnBoleta;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnNewProduct;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtLastNameCliente;
    private javax.swing.JTextField txtNameCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotalVenta;
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
