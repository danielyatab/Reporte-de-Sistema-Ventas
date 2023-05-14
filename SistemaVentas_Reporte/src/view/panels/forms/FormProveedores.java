/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels.forms;

import Model.ModelCellProveedores;
import Model.conexion.CrudMysql;
import controller.JsonProveedoresCRUD;
import controller.ValidateRegular;
import design.Maximize;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.panels.PanelProveedores;

/**
 *
 * @author yatac
 */
public class FormProveedores extends javax.swing.JPanel {

    public int cifDoc;
    ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
    public boolean add = true;

    /**
     * Creates new form FromDetalleProductos
     */
    public FormProveedores() {
        initComponents();
        setOpaque(false);
        cifDoc = 8;
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
        txtRuc = new javax.swing.JTextField();
        TextLastName = new FondoPanelTotal();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextLastName1 = new FondoPanelTotal();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPhone1 = new FondoPanelTotal();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        TextPhone2 = new FondoPanelTotal();
        txtProductos = new javax.swing.JTextField();

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

        txtRuc.setBackground(new java.awt.Color(245, 244, 244));
        txtRuc.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtRuc.setForeground(new java.awt.Color(0, 0, 102));
        txtRuc.setBorder(null);
        txtRuc.setOpaque(false);

        javax.swing.GroupLayout TextNameLayout = new javax.swing.GroupLayout(TextName);
        TextName.setLayout(TextNameLayout);
        TextNameLayout.setHorizontalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextNameLayout.setVerticalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRuc)
                .addContainerGap())
        );

        TextLastName.setOpaque(false);

        txtNombres.setBackground(new java.awt.Color(245, 244, 244));
        txtNombres.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 102));
        txtNombres.setBorder(null);
        txtNombres.setOpaque(false);

        javax.swing.GroupLayout TextLastNameLayout = new javax.swing.GroupLayout(TextLastName);
        TextLastName.setLayout(TextLastNameLayout);
        TextLastNameLayout.setHorizontalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastNameLayout.setVerticalGroup(
            TextLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombres)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("R.U.C.");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre o Razon Social");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tipo de Proveedor");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Correo");

        TextLastName1.setOpaque(false);

        txtCorreo.setBackground(new java.awt.Color(245, 244, 244));
        txtCorreo.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 102));
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(false);

        javax.swing.GroupLayout TextLastName1Layout = new javax.swing.GroupLayout(TextLastName1);
        TextLastName1.setLayout(TextLastName1Layout);
        TextLastName1Layout.setHorizontalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastName1Layout.setVerticalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Telefono");

        TextPhone1.setOpaque(false);

        txtTelefono.setBackground(new java.awt.Color(245, 244, 244));
        txtTelefono.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 102));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);

        javax.swing.GroupLayout TextPhone1Layout = new javax.swing.GroupLayout(TextPhone1);
        TextPhone1.setLayout(TextPhone1Layout);
        TextPhone1Layout.setHorizontalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhone1Layout.setVerticalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono)
                .addContainerGap())
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAddTipo.png"))); // NOI18N

        title.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("AGREGAR PROVEEDOR");

        comboTipo.setBackground(new java.awt.Color(255, 255, 255));
        comboTipo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(16, 21, 64));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Natural", "Juridica" }));
        comboTipo.setBorder(null);
        comboTipo.setFocusable(false);

        jLabel12.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Productos");

        TextPhone2.setOpaque(false);

        txtProductos.setBackground(new java.awt.Color(245, 244, 244));
        txtProductos.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtProductos.setForeground(new java.awt.Color(0, 0, 102));
        txtProductos.setBorder(null);
        txtProductos.setOpaque(false);

        javax.swing.GroupLayout TextPhone2Layout = new javax.swing.GroupLayout(TextPhone2);
        TextPhone2.setLayout(TextPhone2Layout);
        TextPhone2Layout.setHorizontalGroup(
            TextPhone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhone2Layout.setVerticalGroup(
            TextPhone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProductos)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelWhiteLayout = new javax.swing.GroupLayout(PanelWhite);
        PanelWhite.setLayout(PanelWhiteLayout);
        PanelWhiteLayout.setHorizontalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(TextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(TextLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(TextPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelWhiteLayout.createSequentialGroup()
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(TextPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelWhiteLayout.setVerticalGroup(
            PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWhiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelWhiteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(comboTipo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(PanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
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
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(PanelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
            ModelCellProveedores newCl = new ModelCellProveedores();
            if (add) {
                newCl = newProveedor();
                /*LLENADO JSON*/
                JsonProveedoresCRUD.addProveedor(newCl);
                if (ValidateRegular.setCreateCliente) {
                    /*LLENADO MYSQL*/
                    pushMysql();
                }
            } else {
                newCl = newProveedor();
                newCl.setIdProveedor(ValidateRegular.updateProveedor.getIdProveedor());
                JsonProveedoresCRUD.updateProveedor(newCl);
                if (ValidateRegular.setUpdateProveedor) {
                    /*LLENADO MYSQL*/
                    pushMysql();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Termina de llenar los campos", "", 0, icono);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        //setDesignWindows();
        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(this, "¿Desea salir sin agregar al cliente?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            //setDisignNimbus();
            addContainer(new PanelProveedores(), getWidth(), getHeight(), PanelContent);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    /*INIT DATA*/
    private void initData() {
        if (Maximize.updateCrud) {
            btnAceptar.setIcon(new ImageIcon("src/img/btn_Actualizar.png"));
            add = false;
            title.setText("ACTUALIZAR PROVEEDOR");
            Maximize.updateCrud = false;
            getElements();
        } else {
            btnAceptar.setIcon(new ImageIcon("src/img/btn_Agregar.png"));
            add = true;
            title.setText("AGREGAR PROVEEDOR");
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

    public ModelCellProveedores newProveedor() {
        ModelCellProveedores newPv = new ModelCellProveedores();
        newPv.setRuc(txtRuc.getText());
        newPv.setNombres(txtNombres.getText());
        newPv.setTipo(comboTipo.getSelectedItem().toString());
        newPv.setProductos(txtProductos.getText());
        newPv.setCorreo(txtCorreo.getText());
        newPv.setTelefono(txtTelefono.getText());
        System.out.println("Nre opv: + " + newPv.getNombres());
        return newPv;
    }

    private void getElements() {
        txtRuc.setText(ValidateRegular.updateProveedor.getRuc());
        txtNombres.setText(ValidateRegular.updateProveedor.getNombres());
        txtProductos.setText(ValidateRegular.updateProveedor.getProductos());
        txtTelefono.setText(ValidateRegular.updateProveedor.getTelefono());
        txtCorreo.setText(ValidateRegular.updateProveedor.getCorreo());
        comboTipo.setSelectedItem(ValidateRegular.updateProveedor.getTipo());
    }

    public boolean nullTxt() {
        if (txtRuc.getText().equals("") || txtNombres.getText().equals("") || txtProductos.equals("") || txtCorreo.equals("") || txtTelefono.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void pushMysql() {
        ImageIcon icononew = new ImageIcon("src/img/message/comprobado.png");
        JOptionPane.showMessageDialog(null, "Regitro exitoso del Proveedor", "", 0, icononew);
        if (ValidateRegular.conexion) {
            try {
                CrudMysql.crudMysqlProveedores();
                CrudMysql.crudMysqlProveedoresHistorial();
            } catch (Exception e) {
                System.out.println("Sin conexion a internet HISTORIALCliente");
            }
        }
        addContainer(new PanelProveedores(), getWidth(), getHeight(), PanelContent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelColor;
    private javax.swing.JPanel PanelContent;
    private javax.swing.JPanel PanelWhite;
    private javax.swing.JPanel TextLastName;
    private javax.swing.JPanel TextLastName1;
    private javax.swing.JPanel TextName;
    private javax.swing.JPanel TextPhone1;
    private javax.swing.JPanel TextPhone2;
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtProductos;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
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
