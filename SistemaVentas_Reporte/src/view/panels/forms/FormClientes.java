package view.panels.forms;

import Model.ModelCellClientes;
import Model.conexion.CrudMysql;
import controller.JsonClienteCRUD;
import controller.ValidateRegular;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.panels.PanelCliente;
import view.panels.PanelVentas;

/**
 *
 * @author yatac
 */
public class FormClientes extends javax.swing.JPanel {

    public int cifDoc;
    ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
    public boolean add = true;

    public FormClientes() {
        initComponents();
        setOpaque(false);
        cifDoc = 8;
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContent = new FondoPanel();
        PanelColor = new FondoPanelColor();
        PanelWhite = new FondoPanelWhite();
        btnAceptar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        TextName = new FondoPanelTotal();
        txtNumDoc = new javax.swing.JTextField();
        TextLastName = new FondoPanelTotal();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextLastName1 = new FondoPanelTotal();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPhone1 = new FondoPanelTotal();
        txtCorreo = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<>();
        TextLastName2 = new FondoPanelTotal();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

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

        txtNumDoc.setBackground(new java.awt.Color(245, 244, 244));
        txtNumDoc.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtNumDoc.setForeground(new java.awt.Color(0, 0, 102));
        txtNumDoc.setBorder(null);
        txtNumDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextNameLayout = new javax.swing.GroupLayout(TextName);
        TextName.setLayout(TextNameLayout);
        TextNameLayout.setHorizontalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextNameLayout.setVerticalGroup(
            TextNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumDoc)
                .addContainerGap())
        );

        TextLastName.setOpaque(false);

        txtNombres.setBackground(new java.awt.Color(245, 244, 244));
        txtNombres.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 102));
        txtNombres.setBorder(null);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

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
        jLabel3.setText("Nº Documento");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tipo de Documento");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Telefono");

        TextLastName1.setOpaque(false);

        txtTelefono.setBackground(new java.awt.Color(245, 244, 244));
        txtTelefono.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 102));
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextLastName1Layout = new javax.swing.GroupLayout(TextLastName1);
        TextLastName1.setLayout(TextLastName1Layout);
        TextLastName1Layout.setHorizontalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastName1Layout.setVerticalGroup(
            TextLastName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Correo");

        TextPhone1.setOpaque(false);

        txtCorreo.setBackground(new java.awt.Color(245, 244, 244));
        txtCorreo.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 102));
        txtCorreo.setBorder(null);

        javax.swing.GroupLayout TextPhone1Layout = new javax.swing.GroupLayout(TextPhone1);
        TextPhone1.setLayout(TextPhone1Layout);
        TextPhone1Layout.setHorizontalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextPhone1Layout.setVerticalGroup(
            TextPhone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPhone1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("AGREGAR CLIENTE");

        comboBoxTipo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        comboBoxTipo.setForeground(new java.awt.Color(16, 21, 64));
        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        comboBoxTipo.setBorder(null);
        comboBoxTipo.setFocusable(false);
        comboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxTipoItemStateChanged(evt);
            }
        });

        TextLastName2.setOpaque(false);

        txtApellidos.setBackground(new java.awt.Color(245, 244, 244));
        txtApellidos.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 102));
        txtApellidos.setBorder(null);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TextLastName2Layout = new javax.swing.GroupLayout(TextLastName2);
        TextLastName2.setLayout(TextLastName2Layout);
        TextLastName2Layout.setHorizontalGroup(
            TextLastName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        TextLastName2Layout.setVerticalGroup(
            TextLastName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextLastName2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApellidos)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Apellidos");

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
                            .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TextLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56))))
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
                .addGap(16, 16, 16)
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
                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            ModelCellClientes newCl = new ModelCellClientes();
            if (add) {
                newCl = newClient();
                /*LLENADO JSON*/
                JsonClienteCRUD.addCliente(newCl);
                if (ValidateRegular.setCreateCliente) {
                    /*LLENADO MYSQL*/
                    setMysql();
                    // setDisignNimbus();
                }
            } else {
                newCl = newClient();
                newCl.setIdCliente(ValidateRegular.updateCliente.getIdCliente());
                JsonClienteCRUD.updateCliente(newCl);

                if (ValidateRegular.setUpdateCliente) {
                    setMysql();
                    //setDisignNimbus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Termina de llenar los campos", "", 0, icono);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        //setDesignWindows();
        String[] opciones = {"Si", "No"};
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
        int opcion = JOptionPane.showOptionDialog(this, "¿Desea salir sin agregar al cliente?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            //setDisignNimbus();
            if (ValidateRegular.passCliente) {
                ValidateRegular.passCliente = false;
                addContainer(new PanelVentas(), getWidth(), getHeight(), PanelContent);
            } else {
                addContainer(new PanelCliente(), getWidth(), getHeight(), PanelContent);
            }
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtNumDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocKeyTyped
        char c = evt.getKeyChar();
        // Verificar si el carácter no es un número o si ya hay 9 cifras
        if (!Character.isDigit(c) || txtNumDoc.getText().length() >= cifDoc) {
            evt.consume(); // Cancelar el evento para evitar la entrada
        }
    }//GEN-LAST:event_txtNumDocKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter no es una letra
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume(); // Cancelar el evento para evitar la entrada
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void comboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxTipoItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            txtNumDoc.setText("");
            String itemSeleccionado = (String) comboBoxTipo.getSelectedItem();
            System.out.println("Elemento seleccionado: " + itemSeleccionado);
            if (itemSeleccionado.equals("RUC")) {
                cifDoc = 11;
            } else if (itemSeleccionado.equals("DNI")) {
                cifDoc = 8;
            } else {
                cifDoc = 20;
            }
        }
    }//GEN-LAST:event_comboBoxTipoItemStateChanged

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
       char c = evt.getKeyChar();
        // Verificar si el carácter no es un número o si ya hay 9 cifras
       if (!Character.isDigit(c)) {
           evt.consume(); // Cancelar el evento para evitar la entrada
       }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter no es una letra
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume(); // Cancelar el evento para evitar la entrada
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    /*INIT DATA*/
    private void initData() {
        if (Maximize.updateCrud) {
            btnAceptar.setIcon(new ImageIcon(getClass().getResource("/img/btn_Actualizar.png")));
            add = false;
            title.setText("ACTUALIZAR CLIENTE");
            Maximize.updateCrud = false;
            getElements();
        } else {
            btnAceptar.setIcon(new ImageIcon(getClass().getResource("/img/btn_Agregar.png")));
            add = true;
            title.setText("AGREGAR CLIENTE");
        }
    }

    public void setMysql() {
        ImageIcon icononew = new ImageIcon(getClass().getResource("/img/message/comprobado.png"));
        JOptionPane.showMessageDialog(null, "Regitro exitoso del Cliente", "", 0, icononew);
        /*LLENADO MYSQL*/
        if (ValidateRegular.conexion) {
            System.out.println(":::::::::::::::::::::::Entre a agregar un nuevo cliente yahuuuuuuuu");
            try {
                CrudMysql.crudMysqlClientes();
                CrudMysql.crudMysqlHistorialClientes();
            } catch (Exception e) {
                System.out.println("Sin conexion a internet HISTORIALCliente");
            }
        }

        if (ValidateRegular.passCliente) {
            ValidateRegular.passCliente = false;
            addContainer(new PanelVentas(), getWidth(), getHeight(), PanelContent);
        } else {
            addContainer(new PanelCliente(), getWidth(), getHeight(), PanelContent);
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

    public void setDisignNimbus() {
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
    }

    public void setDesignWindows() {
        /*
        *   Desactivar modo Nibus por Windows
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public boolean nullTxt() {
        if (txtApellidos.getText().equals("") || txtNombres.getText().equals("") || txtNumDoc.equals("") || txtCorreo.equals("") || txtTelefono.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private void getElements() {
        txtNumDoc.setText(ValidateRegular.updateCliente.getNumDocumento());
        txtNombres.setText(ValidateRegular.updateCliente.getNombre());
        txtApellidos.setText(ValidateRegular.updateCliente.getApellido());
        txtTelefono.setText(ValidateRegular.updateCliente.getTelefono());
        txtCorreo.setText(ValidateRegular.updateCliente.getCorreo());
        comboBoxTipo.setSelectedItem(ValidateRegular.updateCliente.getTipoDocumento());
    }

    public ModelCellClientes newClient() {
        ModelCellClientes newCl = new ModelCellClientes();
        newCl.setNombre(txtNombres.getText());
        newCl.setApellido(txtApellidos.getText());
        newCl.setNumDocumento(txtNumDoc.getText());
        newCl.setTelefono(txtTelefono.getText());
        newCl.setCorreo(txtCorreo.getText());
        newCl.setTipoDocumento((String) comboBoxTipo.getSelectedItem());
        return newCl;
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
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDoc;
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
