/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels;

import java.awt.Image;
import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.ModelCellProductos;
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
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.String.valueOf;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import table.Venta.TableActionEventVenta;
import view.panels.forms.FormClientes;
import view.panels.forms.FormProductos;

/**
 *
 * @author yatac
 */
public class PanelVentas extends javax.swing.JPanel {
    public List<ModelCellVenta> listProductos = new ArrayList<ModelCellVenta>();
    public ModelCellClientes clienteVenta = new ModelCellClientes();
    public ModelCellProductos productoVenta = new ModelCellProductos();

    public double total = 0, subTotal = 0;
 
    public String listarTipo ="nombres";
    public String listarTipoProd ="codigos";
    
    public PanelVentas() {
        initComponents();
        TableVenta.fixTable(jScrollPane2);
        TableVenta.setIconsColumns(8, 7, 10);
        listProductos = ValidateRegular.listVentas;
        listarProductos();
        AutoCompleteDecorator.decorate(jcomboSearchCliente);
        AutoCompleteDecorator.decorate(jcomboSearchProducto);
        listarCodigos();
        listarNombres();
        txtCantidadCompra.setText("1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ContentPanel = new javax.swing.JPanel();
        ContentButtonsSearch = new javax.swing.JPanel();
        TitleProveedores = new javax.swing.JLabel();
        ContextSearch = new javax.swing.JPanel();
        TextSearch = new javax.swing.JPanel();
        IconSearch = new javax.swing.JLabel();
        jcomboSearchProducto = new javax.swing.JComboBox<>();
        jcomboTypeSearch = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JPanel();
        txtCantidadCompra = new javax.swing.JTextField();
        btn_AgregarProducto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ContentClienteBoleta = new javax.swing.JPanel();
        PanelFormCliente = new FondoPanelCliente();
        TextDocumento = new FondoPanelTextCliente();
        txtDOC = new javax.swing.JTextField();
        JcomboTipoBusquedaCliente = new javax.swing.JComboBox<>();
        TextNombres = new FondoPanelTextCliente();
        txtName = new javax.swing.JTextField();
        TxtApellidos = new FondoPanelTextCliente();
        txtNumberPhone = new javax.swing.JTextField();
        TxtTelefono = new FondoPanelTextCliente();
        txtLastName = new javax.swing.JTextField();
        TxtCorreo = new FondoPanelTextCliente();
        txtEmail = new javax.swing.JTextField();
        BtnAgregarCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcomboSearchCliente = new javax.swing.JComboBox<>();
        PanelFormBoleta = new FondoPanelBoleta();
        TextEfectivo = new FondoPanelTextCliente();
        txtMoney = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextTotal = new FondoPanelTextCliente();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextVuelto = new FondoPanelTextCliente();
        txtEfective = new javax.swing.JTextField();
        btnCancelarVenta = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGeneraVenta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableVenta = new table.Venta.TableVenta();
        TxtProducto = new FondoPanelTextCliente();
        txtNameProducto = new javax.swing.JTextField();
        TxtApellidos2 = new FondoPanelTextCliente();
        txtMarca = new javax.swing.JTextField();
        TxtApellidos6 = new FondoPanelTextCliente();
        txtDescripcion = new javax.swing.JTextField();
        TxtApellidos10 = new FondoPanelTextCliente();
        txtPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        ContentButtonsSearch.setBackground(new java.awt.Color(250, 250, 250));

        TitleProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TitleVentas.png"))); // NOI18N

        ContextSearch.setBackground(new java.awt.Color(250, 250, 250));

        TextSearch.setBackground(new java.awt.Color(255, 255, 255));
        TextSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextSearch.setForeground(new java.awt.Color(0, 0, 103));

        IconSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N

        jcomboSearchProducto.setBackground(new java.awt.Color(255, 255, 255));
        jcomboSearchProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboSearchProducto.setForeground(new java.awt.Color(0, 0, 103));
        jcomboSearchProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboSearchProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TextSearchLayout = new javax.swing.GroupLayout(TextSearch);
        TextSearch.setLayout(TextSearchLayout);
        TextSearchLayout.setHorizontalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextSearchLayout.createSequentialGroup()
                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboSearchProducto, 0, 251, Short.MAX_VALUE))
        );
        TextSearchLayout.setVerticalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextSearchLayout.createSequentialGroup()
                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jcomboSearchProducto)
        );

        jcomboTypeSearch.setBackground(new java.awt.Color(255, 255, 255));
        jcomboTypeSearch.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        jcomboTypeSearch.setForeground(new java.awt.Color(16, 21, 64));
        jcomboTypeSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        jcomboTypeSearch.setBorder(null);
        jcomboTypeSearch.setFocusable(false);
        jcomboTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboTypeSearchActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCantidad.setForeground(new java.awt.Color(0, 0, 103));

        txtCantidadCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadCompra.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        txtCantidadCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadCompra.setText("Cantidad");
        txtCantidadCompra.setBorder(null);
        txtCantidadCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadCompraMouseClicked(evt);
            }
        });
        txtCantidadCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCompraActionPerformed(evt);
            }
        });
        txtCantidadCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadCompraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout txtCantidadLayout = new javax.swing.GroupLayout(txtCantidad);
        txtCantidad.setLayout(txtCantidadLayout);
        txtCantidadLayout.setHorizontalGroup(
            txtCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCantidadCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        txtCantidadLayout.setVerticalGroup(
            txtCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCantidadCompra)
        );

        btn_AgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_AgregarVenta.png"))); // NOI18N
        btn_AgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContextSearchLayout = new javax.swing.GroupLayout(ContextSearch);
        ContextSearch.setLayout(ContextSearchLayout);
        ContextSearchLayout.setHorizontalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jcomboTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_AgregarProducto)
                .addGap(155, 155, 155))
        );
        ContextSearchLayout.setVerticalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_AgregarProducto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcomboTypeSearch)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator1.setForeground(new java.awt.Color(224, 225, 234));

        jSeparator4.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator4.setForeground(new java.awt.Color(224, 225, 234));

        javax.swing.GroupLayout ContentButtonsSearchLayout = new javax.swing.GroupLayout(ContentButtonsSearch);
        ContentButtonsSearch.setLayout(ContentButtonsSearchLayout);
        ContentButtonsSearchLayout.setHorizontalGroup(
            ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleProveedores)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ContentButtonsSearchLayout.setVerticalGroup(
            ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addComponent(TitleProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContentClienteBoleta.setBackground(new java.awt.Color(255, 255, 255));

        PanelFormCliente.setBackground(new java.awt.Color(204, 255, 255));

        TextDocumento.setPreferredSize(new java.awt.Dimension(112, 33));

        txtDOC.setEditable(false);
        txtDOC.setBackground(new java.awt.Color(229, 228, 228));
        txtDOC.setForeground(new java.awt.Color(0, 0, 102));
        txtDOC.setBorder(null);

        javax.swing.GroupLayout TextDocumentoLayout = new javax.swing.GroupLayout(TextDocumento);
        TextDocumento.setLayout(TextDocumentoLayout);
        TextDocumentoLayout.setHorizontalGroup(
            TextDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextDocumentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDOC, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextDocumentoLayout.setVerticalGroup(
            TextDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDOC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        JcomboTipoBusquedaCliente.setBackground(new java.awt.Color(255, 255, 255));
        JcomboTipoBusquedaCliente.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        JcomboTipoBusquedaCliente.setForeground(new java.awt.Color(16, 21, 64));
        JcomboTipoBusquedaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellidos", "Telefono", "Documento" }));
        JcomboTipoBusquedaCliente.setBorder(null);
        JcomboTipoBusquedaCliente.setFocusable(false);
        JcomboTipoBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboTipoBusquedaClienteActionPerformed(evt);
            }
        });

        TextNombres.setPreferredSize(new java.awt.Dimension(112, 33));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(229, 228, 228));
        txtName.setForeground(new java.awt.Color(0, 0, 102));
        txtName.setBorder(null);

        javax.swing.GroupLayout TextNombresLayout = new javax.swing.GroupLayout(TextNombres);
        TextNombres.setLayout(TextNombresLayout);
        TextNombresLayout.setHorizontalGroup(
            TextNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNombresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextNombresLayout.setVerticalGroup(
            TextNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        TxtApellidos.setPreferredSize(new java.awt.Dimension(112, 33));

        txtNumberPhone.setEditable(false);
        txtNumberPhone.setBackground(new java.awt.Color(229, 228, 228));
        txtNumberPhone.setForeground(new java.awt.Color(0, 0, 102));
        txtNumberPhone.setBorder(null);

        javax.swing.GroupLayout TxtApellidosLayout = new javax.swing.GroupLayout(TxtApellidos);
        TxtApellidos.setLayout(TxtApellidosLayout);
        TxtApellidosLayout.setHorizontalGroup(
            TxtApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtApellidosLayout.setVerticalGroup(
            TxtApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNumberPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(229, 228, 228));
        txtLastName.setForeground(new java.awt.Color(0, 0, 102));
        txtLastName.setBorder(null);

        javax.swing.GroupLayout TxtTelefonoLayout = new javax.swing.GroupLayout(TxtTelefono);
        TxtTelefono.setLayout(TxtTelefonoLayout);
        TxtTelefonoLayout.setHorizontalGroup(
            TxtTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtTelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtTelefonoLayout.setVerticalGroup(
            TxtTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        TxtCorreo.setPreferredSize(new java.awt.Dimension(112, 33));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(229, 228, 228));
        txtEmail.setForeground(new java.awt.Color(0, 0, 102));
        txtEmail.setBorder(null);

        javax.swing.GroupLayout TxtCorreoLayout = new javax.swing.GroupLayout(TxtCorreo);
        TxtCorreo.setLayout(TxtCorreoLayout);
        TxtCorreoLayout.setHorizontalGroup(
            TxtCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtCorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtCorreoLayout.setVerticalGroup(
            TxtCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        BtnAgregarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregarClienteVenta.png"))); // NOI18N
        BtnAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarClienteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Doc.:");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Apellido:");

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Telf.:");

        jLabel11.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("@:");

        jcomboSearchCliente.setBackground(new java.awt.Color(255, 255, 255));
        jcomboSearchCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboSearchCliente.setForeground(new java.awt.Color(0, 0, 103));
        jcomboSearchCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboSearchClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormClienteLayout = new javax.swing.GroupLayout(PanelFormCliente);
        PanelFormCliente.setLayout(PanelFormClienteLayout);
        PanelFormClienteLayout.setHorizontalGroup(
            PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormClienteLayout.createSequentialGroup()
                        .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormClienteLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelFormClienteLayout.createSequentialGroup()
                                .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFormClienteLayout.createSequentialGroup()
                        .addComponent(jcomboSearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(JcomboTipoBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFormClienteLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PanelFormClienteLayout.setVerticalGroup(
            PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormClienteLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcomboTipoBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboSearchCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormClienteLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormClienteLayout.createSequentialGroup()
                        .addComponent(TextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(TextNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(PanelFormClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        PanelFormBoleta.setBackground(new java.awt.Color(204, 255, 204));

        txtMoney.setEditable(false);
        txtMoney.setBackground(new java.awt.Color(229, 228, 228));
        txtMoney.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        txtMoney.setForeground(new java.awt.Color(0, 0, 102));
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setBorder(null);

        javax.swing.GroupLayout TextEfectivoLayout = new javax.swing.GroupLayout(TextEfectivo);
        TextEfectivo.setLayout(TextEfectivoLayout);
        TextEfectivoLayout.setHorizontalGroup(
            TextEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextEfectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextEfectivoLayout.setVerticalGroup(
            TextEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Vuelto:");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(229, 228, 228));
        txtTotal.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 102));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(null);

        javax.swing.GroupLayout TextTotalLayout = new javax.swing.GroupLayout(TextTotal);
        TextTotal.setLayout(TextTotalLayout);
        TextTotalLayout.setHorizontalGroup(
            TextTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextTotalLayout.setVerticalGroup(
            TextTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Efectivo:");

        txtEfective.setBackground(new java.awt.Color(229, 228, 228));
        txtEfective.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        txtEfective.setForeground(new java.awt.Color(0, 0, 102));
        txtEfective.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEfective.setBorder(null);
        txtEfective.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectiveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEfectiveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextVueltoLayout = new javax.swing.GroupLayout(TextVuelto);
        TextVuelto.setLayout(TextVueltoLayout);
        TextVueltoLayout.setHorizontalGroup(
            TextVueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextVueltoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEfective, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextVueltoLayout.setVerticalGroup(
            TextVueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEfective, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnCancelarVenta.png"))); // NOI18N
        btnCancelarVenta.setToolTipText("");
        btnCancelarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarVentaMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("S/.");

        btnGeneraVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BtnGenerarVentapng.png"))); // NOI18N
        btnGeneraVenta.setToolTipText("");
        btnGeneraVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGeneraVentaMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("S/.");

        jLabel18.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("S/.");

        javax.swing.GroupLayout PanelFormBoletaLayout = new javax.swing.GroupLayout(PanelFormBoleta);
        PanelFormBoleta.setLayout(PanelFormBoletaLayout);
        PanelFormBoletaLayout.setHorizontalGroup(
            PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormBoletaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel17))
                    .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addGap(12, 12, 12)
                .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextVuelto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormBoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnGeneraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        PanelFormBoletaLayout.setVerticalGroup(
            PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormBoletaLayout.createSequentialGroup()
                .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                                .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(TextVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(PanelFormBoletaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12)))))
                .addGap(15, 15, 15)
                .addGroup(PanelFormBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentClienteBoletaLayout = new javax.swing.GroupLayout(ContentClienteBoleta);
        ContentClienteBoleta.setLayout(ContentClienteBoletaLayout);
        ContentClienteBoletaLayout.setHorizontalGroup(
            ContentClienteBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentClienteBoletaLayout.createSequentialGroup()
                .addGroup(ContentClienteBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFormCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelFormBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContentClienteBoletaLayout.setVerticalGroup(
            ContentClienteBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentClienteBoletaLayout.createSequentialGroup()
                .addComponent(PanelFormCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelFormBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

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

        TxtProducto.setPreferredSize(new java.awt.Dimension(112, 33));

        txtNameProducto.setEditable(false);
        txtNameProducto.setBackground(new java.awt.Color(229, 228, 228));
        txtNameProducto.setForeground(new java.awt.Color(0, 0, 102));
        txtNameProducto.setBorder(null);

        javax.swing.GroupLayout TxtProductoLayout = new javax.swing.GroupLayout(TxtProducto);
        TxtProducto.setLayout(TxtProductoLayout);
        TxtProductoLayout.setHorizontalGroup(
            TxtProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtProductoLayout.setVerticalGroup(
            TxtProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNameProducto, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        TxtApellidos2.setPreferredSize(new java.awt.Dimension(112, 33));

        txtMarca.setEditable(false);
        txtMarca.setBackground(new java.awt.Color(229, 228, 228));
        txtMarca.setForeground(new java.awt.Color(0, 0, 102));
        txtMarca.setBorder(null);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TxtApellidos2Layout = new javax.swing.GroupLayout(TxtApellidos2);
        TxtApellidos2.setLayout(TxtApellidos2Layout);
        TxtApellidos2Layout.setHorizontalGroup(
            TxtApellidos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtApellidos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtApellidos2Layout.setVerticalGroup(
            TxtApellidos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        TxtApellidos6.setPreferredSize(new java.awt.Dimension(112, 33));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(229, 228, 228));
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 102));
        txtDescripcion.setBorder(null);

        javax.swing.GroupLayout TxtApellidos6Layout = new javax.swing.GroupLayout(TxtApellidos6);
        TxtApellidos6.setLayout(TxtApellidos6Layout);
        TxtApellidos6Layout.setHorizontalGroup(
            TxtApellidos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtApellidos6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtApellidos6Layout.setVerticalGroup(
            TxtApellidos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        TxtApellidos10.setPreferredSize(new java.awt.Dimension(112, 33));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(229, 228, 228));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 102));
        txtPrecio.setBorder(null);

        javax.swing.GroupLayout TxtApellidos10Layout = new javax.swing.GroupLayout(TxtApellidos10);
        TxtApellidos10.setLayout(TxtApellidos10Layout);
        TxtApellidos10Layout.setHorizontalGroup(
            TxtApellidos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtApellidos10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        TxtApellidos10Layout.setVerticalGroup(
            TxtApellidos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel13.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Producto");

        jLabel14.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Marca");

        jLabel15.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Descripcion");

        jLabel16.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Precio");

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellidos6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel16))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtApellidos10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(ContentClienteBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContentClienteBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtApellidos6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(TxtApellidos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(TxtProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(TxtApellidos10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCompraKeyTyped
        char c = evt.getKeyChar();
        // Verificar si el carácter no es un número o si ya hay 9 cifras
        if (!Character.isDigit(c) || txtCantidadCompra.getText().length() > 5) {
            evt.consume(); // Cancelar el evento para evitar la entrada
        }
    }//GEN-LAST:event_txtCantidadCompraKeyTyped

    private void txtCantidadCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadCompraMouseClicked
    }//GEN-LAST:event_txtCantidadCompraMouseClicked

    private void BtnAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarClienteMouseClicked
        ValidateRegular.passCliente = true;
        if(!txtEfective.getText().equals("")) {
                ValidateRegular.vuelto = Double.parseDouble(valueOf(txtEfective.getText()));
        }else {
            System.out.println("Nulo");
        }
        
        addContainer(new FormClientes(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
    }//GEN-LAST:event_BtnAgregarClienteMouseClicked

    private void txtEfectiveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectiveKeyReleased
        calcularVuelto();
    }//GEN-LAST:event_txtEfectiveKeyReleased

    private void btnCancelarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVentaMouseClicked
        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea cancelar la Venta?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            ValidateRegular.listDetalleSelect = new ArrayList<ModelCellVenta>();
            ValidateRegular.listVentasExtrac = listProductos;
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
            ValidateRegular.ventaRealizada = false;
            resetContentVenta();
        }
    }//GEN-LAST:event_btnCancelarVentaMouseClicked

    private void btnGeneraVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeneraVentaMouseClicked
        generateVenta();
    }//GEN-LAST:event_btnGeneraVentaMouseClicked

    private void txtEfectiveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectiveKeyTyped
        char c = evt.getKeyChar();

        // Permitir teclas de control como backspace y delete
        if (Character.isISOControl(c)) {
            txtEfective.setEditable(true);
            return;
        }

        // Permitir el punto decimal si no se ha ingresado previamente
        if (c == '.' && txtEfective.getText().contains(".")) {
            txtEfective.setEditable(false);
            evt.consume();
            return;
        }

        // Permitir solo dígitos y el punto decimal
        if (!Character.isDigit(c) && c != '.') {
            txtEfective.setEditable(false);
            evt.consume();
        } else {
            // Validar que solo haya hasta 2 decimales
            String text = txtEfective.getText();
            int dotIndex = text.indexOf('.');
            if (dotIndex != -1 && text.substring(dotIndex).length() > 2) {
                txtEfective.setEditable(false);
                evt.consume();
            } else {
                txtEfective.setEditable(true);
            }
        }
    }//GEN-LAST:event_txtEfectiveKeyTyped

    private void btn_AgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarProductoMouseClicked
            int cantidad = 1;
            
            //Tabla de datos
            if (JsonProductoCRUD.buscarProductoCodigo(productoVenta.getCodigo()) != null) {
                ModelCellProductos productReturn = JsonProductoCRUD.buscarProductoCodigo( productoVenta.getCodigo());

                if (!txtCantidadCompra.getText().equals("") && Integer.parseInt(txtCantidadCompra.getText()) > 0) {
                    cantidad = Integer.parseInt(valueOf(txtCantidadCompra.getText().trim()));
                    if (JsonProductoCRUD.extraerStock(productReturn.getCodigo(), cantidad, false)) {
                        //LLenado del producto encontrado
                        ModelCellVenta newProducto = new ModelCellVenta();
                        newProducto.setCodigo(productReturn.getCodigo());
                        newProducto.setProducto(productReturn.getProducto());
                        newProducto.setMarca(productReturn.getMarca());
                        newProducto.setDescripcion(productReturn.getDescripcion());
                        newProducto.setCantidad(cantidad);
                        newProducto.setPrecioU(productReturn.getPrecioU());
                        //Redondeo a solo 2 decimales
                        newProducto.setTotal(Math.round(cantidad * productReturn.getPrecioU() * 100.0) / 100.0);
                        if (!repitProduct(newProducto)) {
                            listProductos.add(newProducto);
                            listarProductos();
                        }
                        resetContent();
                    }
                }

            } else {
                String[] opciones = {"Si", "No"};
                ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
                int opcion = JOptionPane.showOptionDialog(null, "No se encontro al producto ¿Desea registrarlo?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
                if (opcion == JOptionPane.YES_OPTION) {
                    ValidateRegular.listVentas = listProductos;
                    ValidateRegular.passProducto = true;
                    addContainer(new FormProductos(), ContentPanel.getWidth(), ContentPanel.getHeight(), ContentPanel);
                }
                resetContent();
            }
    }//GEN-LAST:event_btn_AgregarProductoMouseClicked

    private void JcomboTipoBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboTipoBusquedaClienteActionPerformed
        switch(valueOf(JcomboTipoBusquedaCliente.getSelectedItem())){
            case "Nombre":
                listarNombres();
                break;
            case "Apellidos":
                listarApellidos();
                break;
            case "Telefono":
                listarTelefono();
                break;
            case "Documento":
                listarNumDoc();
                break;
            default:
                System.out.println("Error al listar tipo");
        }
    }//GEN-LAST:event_JcomboTipoBusquedaClienteActionPerformed

    private void jcomboSearchClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboSearchClienteActionPerformed
        /*Busqueda de cliente*/
        listarBusqueda(valueOf(jcomboSearchCliente.getSelectedItem()));
    }//GEN-LAST:event_jcomboSearchClienteActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
       
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void jcomboSearchProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboSearchProductoActionPerformed
        /*Busqueda de producto*/
        listarBusquedaProducto(valueOf(jcomboSearchProducto.getSelectedItem()));
    }//GEN-LAST:event_jcomboSearchProductoActionPerformed

    private void jcomboTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboTypeSearchActionPerformed
        switch(valueOf(jcomboTypeSearch.getSelectedItem())){
            case "Codigo":
                listarCodigos();
                break;
            case "Nombre":
                listarNombresProductos();
                break;
            default:
                System.out.println("Error al listar tipo");
        }
    }//GEN-LAST:event_jcomboTypeSearchActionPerformed

    private void txtCantidadCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCompraActionPerformed
    
    /*EVENTO DE BOTONES*/
    TableActionEventVenta event = new TableActionEventVenta() {
        @Override
        public void onDelete(ModelCellVenta venta) {
            
            
            JsonProductoCRUD.extraerStock(listProductos.get(TableVenta.getSelectedRow()).getCodigo(),
                    listProductos.get(TableVenta.getSelectedRow()).getCantidad(),
               true);
            
            ValidateRegular.listVentasDelete = new ArrayList<ModelCellVenta>();
            ValidateRegular.listVentasDelete.add(listProductos.get(TableVenta.getSelectedRow()));
            
            
            listProductos.remove(TableVenta.getSelectedRow());
            listarProductos();
        }

        @Override
        public void onEdit(ModelCellVenta venta) {
            System.out.println("HOla ");
        }

    };

    /*METODOD DE COMPROBACION*/
    public boolean repitProduct(ModelCellVenta product) {
        for (int i = 0; i < listProductos.size(); i++) {
            if (listProductos.get(i).getCodigo().equals(product.getCodigo())) {
                addProduct(product, i);
                return true;
            }
        }
        listarProductos();
        return false;
    }

    public void addProduct(ModelCellVenta product, int i) {
        int addCant = 0;
        double importeTotal = 0;
        addCant = listProductos.get(i).getCantidad() + product.getCantidad();
        importeTotal = listProductos.get(i).getTotal() + product.getTotal();
        listProductos.get(i).setCantidad(addCant);
        listProductos.get(i).setTotal(importeTotal);
        listarProductos();
    }

    /*INIT DATA*/
    private void listarProductos() {
        total = 0;
        DefaultTableModel modelo = new DefaultTableModel();
        String columns[] = {"Codigo", "Producto", "Marca", "Descrp.", "Cantidad", "Precio U. ", "Importe", "Eliminar"};
        TableVenta.setModel(modelo);
        modelo.setColumnIdentifiers(columns);
        for (ModelCellVenta v : listProductos) {
            
            TableVenta.addRow(new ModelCellVenta(v.getCodigo(), v.getProducto(), v.getMarca(), v.getDescripcion(), v.getCantidad(), v.getPrecioU(), v.getTotal()).toRowTable(event));
            total += v.getTotal();
        }
        /*
        *  Calculos Numericos
         */
        txtTotal.setText(valueOf(total));
        calcularVuelto();
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

    public void resetContent() {
        txtCantidadCompra.setText("1");
        txtNameProducto.setText("");
        txtMarca.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        listarNombres();
    }

    public void resetCliente() {
        txtDOC.setText("");
        txtName.setText("");
        txtNumberPhone.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
    }

    public void generateVenta() {
        ImageIcon icononew = new ImageIcon(getClass().getResource("/img/message/advertencia.png"));
        if (listProductos.size() > 0) {
            if (!txtName.getText().equals("")) {
                if (Double.parseDouble(valueOf(valueOf(txtMoney.getText()))) >= 0) {
                    String[] opciones = {"Si", "No"};
                    ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/comprobado.png")); // Ruta al archivo de imagen del ícono
                    int opcion = JOptionPane.showOptionDialog(null, "¿Desea generar la venta?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
                    if (opcion == JOptionPane.YES_OPTION) {
                        addVenta();
                        ValidateRegular.listVentasDelete = null;
                        ValidateRegular.listVentasExtrac = null;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El vuelto es menor al Total establecido", "", 0, icononew);
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
        for (ModelCellVenta v : listProductos) {
            v.setNumVenta(newnumventa);
            lisnewventa.add(v);
        }
    }

    public void addVenta() {
        //Obtencion de venta
        String newNumVenta = JsonNumBoleta.generateNumVenta(ValidateRegular.numVenta);
        JsonNumBoleta.modificarNumBoleta(Long.parseLong(newNumVenta));

        //Obtener Fecha Actual
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formato);

        //LLenado de datos de la venta en general
        ModelCellDetalles ventaDetalle = new ModelCellDetalles();
        ventaDetalle.setCodVenta(newNumVenta); //PR CORREGIR

        ventaDetalle.setnVenta(newNumVenta);
        ventaDetalle.setCliente(clienteVenta.getIdCliente());
        ventaDetalle.setTotalVenta(Double.valueOf(txtTotal.getText()));
        ventaDetalle.setFecha(fechaFormateada);
        ventaDetalle.setRutaBoleta(newNumVenta + ".pdf");

        try {
            GeneratePdf.pdf(listProductos, clienteVenta, ventaDetalle, Double.parseDouble(txtEfective.getText()), Double.valueOf(txtMoney.getText()));
            ValidateRegular.ventaRealizada = true;
        } catch (DocumentException e) {
            System.out.println("Error al generar PDf" + e.getMessage());
        }

        /*
         * Json almacenaje
         */
        addDetalleProducto(newNumVenta);

        JsonDetalleProducto.addListDetalleProducto(listProductos);
        JsonVentaCRUD.addVenta(ventaDetalle);

        if (ValidateRegular.conexion) {
            CrudMysql.crudMysqlVentas();
            CrudMysql.crudMysqlVentaHistorial();
            CrudMysql.crudMysqlDetalleProducto();
        } else {
            System.out.println("Sin conexiona  internet");
        }
        
        resetContentVenta();
    }

    
    public void resetContentVenta() {
        resetCliente();
        resetContent();
        listProductos = new ArrayList<ModelCellVenta>();
        listarProductos();
        txtMoney.setText("");
        txtTotal.setText("");
        txtEfective.setText("");
        ValidateRegular.listVentas = new ArrayList<ModelCellVenta>();
        jcomboSearchProducto.setSelectedIndex(0);
    }
    
    

    public void calcularVuelto() {
        double efectivo = ValidateRegular.vuelto;
        if (!txtEfective.getText().trim().equals("")) {
            efectivo = Double.parseDouble(txtEfective.getText().trim());
        }
        if (efectivo - total < 0) {
            txtMoney.setForeground(Color.red);
            txtMoney.setText(valueOf(efectivo - total));
        } else {
            txtMoney.setForeground(new Color(0, 0, 103));
            txtMoney.setText(valueOf(efectivo - total));
        }
    }

    
    /*Listar clientes*/
    private void listarNombres(){
        listarTipo ="nombres";
        ArrayList<String> nombres = JsonClienteCRUD.listarNombres();
        listarJcombo(nombres);
    }
    
    private void listarApellidos(){
        listarTipo ="apellidos";
        ArrayList<String> apellidos = JsonClienteCRUD.listarApellidos();
        listarJcombo(apellidos);
    }
    
    private void listarTelefono(){
        listarTipo ="telefonos";
        ArrayList<String> telefono = JsonClienteCRUD.listarTelefonos();
        listarJcombo(telefono);
    }
    
    
    private void  listarNumDoc(){
        listarTipo ="numeros";
        ArrayList<String> numeros = JsonClienteCRUD.listarNumDocumento();
        listarJcombo(numeros);
    }
    
    private void listarJcombo(ArrayList<String> busqueda){
        jcomboSearchCliente.removeAllItems();
        jcomboSearchCliente.addItem("");
        for(String numD : busqueda){
            jcomboSearchCliente.addItem(numD);
        }
    }
   
    /*Listar Productos*/
    
    private void listarCodigos(){
        System.out.println("ANDO LISTA CODIGOS");
        listarTipoProd = "codigos";
        ArrayList<String> codigos = JsonProductoCRUD.listarCodigos();
        listarJcomboProductos(codigos);
    }
    
    private void listarNombresProductos(){
        listarTipoProd = "productos";
        ArrayList<String> productos = JsonProductoCRUD.listarProductosNombres();
        listarJcomboProductos(productos);
    }
    
    private void listarJcomboProductos(ArrayList<String> busqueda){
        jcomboSearchProducto.removeAllItems();
        jcomboSearchProducto.addItem("");
        for(String numD : busqueda){
            jcomboSearchProducto.addItem(numD);
        }
    }
    
    
    /*LISTAR BSUQUEDAS JCOMBO AUTOCOMPLETE*/
    
    
    private void listarBusqueda(String cl){
        ModelCellClientes cliente = new ModelCellClientes();
        switch(listarTipo){
            case "nombres":
                cliente = JsonClienteCRUD.searchClienteNombre(cl);
                break;
            case "apellidos":
                cliente = JsonClienteCRUD.searchClienteApellido(cl);
                break;
            case "telefonos":
                cliente = JsonClienteCRUD.searchClienteTelefono(cl);
                break;
            case "numeros":
                cliente = JsonClienteCRUD.searchClienteNumDoc(cl);
                break;
            default:
                System.out.println("Error al lsitar tipo");
        }
        
        if (cliente != null) {
            txtDOC.setText(cliente.getNumDocumento());
            txtName.setText(cliente.getNombre());
            txtNumberPhone.setText(cliente.getTelefono());
            txtLastName.setText(cliente.getApellido());
            txtEmail.setText(cliente.getCorreo());

            //LLenado de cliente encontrado
            clienteVenta = cliente;
        } else {
            System.out.println("No encontre XD");
        }
    }
    
    
    
    private void listarBusquedaProducto(String p){
        ModelCellProductos producto = new ModelCellProductos();
        switch(listarTipoProd){
            case "codigos":
                producto = JsonProductoCRUD.searchProductoCodigo(p);
                break;
            case "productos":
                producto = JsonProductoCRUD.searchProductoNombre(p);
                break;
            default:
                System.out.println("Error al lsitar tipo Producto");
        }
        
        if (producto != null) {
            txtNameProducto.setText(producto.getProducto());
            txtMarca.setText(producto.getMarca());
            txtDescripcion.setText(producto.getDescripcion());
            txtPrecio.setText("s/. "+producto.getPrecioU());
            
             productoVenta = producto;
        } else {
            System.out.println("No encontre al Producto");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAgregarCliente;
    private javax.swing.JPanel ContentButtonsSearch;
    private javax.swing.JPanel ContentClienteBoleta;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContextSearch;
    private javax.swing.JLabel IconSearch;
    private javax.swing.JComboBox<String> JcomboTipoBusquedaCliente;
    private javax.swing.JPanel PanelFormBoleta;
    private javax.swing.JPanel PanelFormCliente;
    private table.Venta.TableVenta TableVenta;
    private javax.swing.JPanel TextDocumento;
    private javax.swing.JPanel TextEfectivo;
    private javax.swing.JPanel TextNombres;
    private javax.swing.JPanel TextSearch;
    private javax.swing.JPanel TextTotal;
    private javax.swing.JPanel TextVuelto;
    private javax.swing.JLabel TitleProveedores;
    private javax.swing.JPanel TxtApellidos;
    private javax.swing.JPanel TxtApellidos10;
    private javax.swing.JPanel TxtApellidos2;
    private javax.swing.JPanel TxtApellidos6;
    private javax.swing.JPanel TxtCorreo;
    private javax.swing.JPanel TxtProducto;
    private javax.swing.JPanel TxtTelefono;
    private javax.swing.JLabel btnCancelarVenta;
    private javax.swing.JLabel btnGeneraVenta;
    private javax.swing.JLabel btn_AgregarProducto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcomboSearchCliente;
    private javax.swing.JComboBox<String> jcomboSearchProducto;
    private javax.swing.JComboBox<String> jcomboTypeSearch;
    private javax.swing.JPanel txtCantidad;
    private javax.swing.JTextField txtCantidadCompra;
    private javax.swing.JTextField txtDOC;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEfective;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMoney;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameProducto;
    private javax.swing.JTextField txtNumberPhone;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    class FondoPanelCliente extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/BackgroundVentaCliente.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelBoleta extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/BackgroundVentaBoleta.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelTextCliente extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/BackgroundTextVenta.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
