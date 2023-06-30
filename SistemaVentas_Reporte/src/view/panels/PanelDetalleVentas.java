/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.conexion.CrudMysql;
import controller.JsonClienteCRUD;
import controller.JsonDetalleProducto;
import controller.JsonUserValidation;
import controller.JsonVentaCRUD;
import controller.ValidateRegular;
import controller.viewExcel.Modelo_Excel;
import java.awt.BorderLayout;
import java.io.File;
import static java.lang.String.valueOf;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import table.TableDetalles.TableActionEventDetalles;
import view.panels.forms.FormDetalleProductos;

/**
 *
 * @author yatac
 */
public class PanelDetalleVentas extends javax.swing.JPanel {

    public static List<ModelCellDetalles> listaVentas = new ArrayList<ModelCellDetalles>();
    private String banderaSearch = "numVenta";

    public PanelDetalleVentas() {
        initComponents();
        TableDetalles.fixTable(jScrollPane2);
        TableDetalles.setIconsColumns(7, 10, 5, 4);
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        PanelContent = new javax.swing.JPanel();
        ContentButtonsSearch = new javax.swing.JPanel();
        TitleProveedores = new javax.swing.JLabel();
        btn_ExportarExcel = new javax.swing.JLabel();
        ContextSearch = new javax.swing.JPanel();
        TextSearch = new javax.swing.JPanel();
        txtSearchVentas = new javax.swing.JTextField();
        IconSearch = new javax.swing.JLabel();
        jcomboTipoSearch = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        btnSearchFecha = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ContentPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDetalles = new table.TableDetalles.TableDetalles();

        ContentButtonsSearch.setBackground(new java.awt.Color(250, 250, 250));

        TitleProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TitleDetalleVentas.png"))); // NOI18N

        btn_ExportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ExportarExcel.png"))); // NOI18N
        btn_ExportarExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExportarExcelMouseClicked(evt);
            }
        });

        ContextSearch.setBackground(new java.awt.Color(250, 250, 250));

        TextSearch.setBackground(new java.awt.Color(255, 255, 255));
        TextSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearchVentas.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchVentas.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        txtSearchVentas.setForeground(new java.awt.Color(16, 21, 64));
        txtSearchVentas.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchVentas.setText(" ");
        txtSearchVentas.setBorder(null);
        txtSearchVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchVentasKeyReleased(evt);
            }
        });

        IconSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N

        javax.swing.GroupLayout TextSearchLayout = new javax.swing.GroupLayout(TextSearch);
        TextSearch.setLayout(TextSearchLayout);
        TextSearchLayout.setHorizontalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextSearchLayout.createSequentialGroup()
                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSearchVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );
        TextSearchLayout.setVerticalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextSearchLayout.createSequentialGroup()
                .addGroup(TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IconSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtSearchVentas))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jcomboTipoSearch.setBackground(new java.awt.Color(255, 255, 255));
        jcomboTipoSearch.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        jcomboTipoSearch.setForeground(new java.awt.Color(16, 21, 64));
        jcomboTipoSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cliente", "Nº Venta", "Total Venta" }));
        jcomboTipoSearch.setBorder(null);
        jcomboTipoSearch.setFocusable(false);
        jcomboTipoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboTipoSearchActionPerformed(evt);
            }
        });

        btnSearchFecha.setText("Buscar Fecha");
        btnSearchFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContextSearchLayout = new javax.swing.GroupLayout(ContextSearch);
        ContextSearch.setLayout(ContextSearchLayout);
        ContextSearchLayout.setHorizontalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboTipoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        ContextSearchLayout.setVerticalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContextSearchLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcomboTipoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearchFecha)
                .addGap(24, 24, 24))
        );

        jSeparator1.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator1.setForeground(new java.awt.Color(224, 225, 234));

        jSeparator4.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator4.setForeground(new java.awt.Color(224, 225, 234));

        javax.swing.GroupLayout ContentButtonsSearchLayout = new javax.swing.GroupLayout(ContentButtonsSearch);
        ContentButtonsSearch.setLayout(ContentButtonsSearchLayout);
        ContentButtonsSearchLayout.setHorizontalGroup(
            ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContextSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addComponent(TitleProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ExportarExcel))
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(3, 3, 3))
                    .addComponent(jSeparator4))
                .addGap(34, 34, 34))
        );
        ContentButtonsSearchLayout.setVerticalGroup(
            ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ExportarExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        TableDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableDetalles);

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2)
                .addGap(26, 26, 26))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout PanelContentLayout = new javax.swing.GroupLayout(PanelContent);
        PanelContent.setLayout(PanelContentLayout);
        PanelContentLayout.setHorizontalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelContentLayout.setVerticalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContentLayout.createSequentialGroup()
                .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSearchFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFechaActionPerformed
        String dateFormat = "yyyy-MM-dd";
        Date selectedDate = jDateChooser.getDate();
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Seleccione alguna fecha", "", JOptionPane.ERROR_MESSAGE);
        } else {
            jcomboTipoSearch.setSelectedItem("Seleccionar");
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            String formattedDate = sdf.format(selectedDate);
            listarFechas(formattedDate);
        }
    }//GEN-LAST:event_btnSearchFechaActionPerformed

    private void jcomboTipoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboTipoSearchActionPerformed
        String search = valueOf(jcomboTipoSearch.getSelectedItem());
        switch (search) {
            case "Nº Venta":
                banderaSearch = "numVenta";
                listarNumVenta();
                break;
            case "Cliente":
                banderaSearch = "cliente";
                listarClientes();
                break;
            case "Total Venta":
                banderaSearch = "total";
                listarTotalVenta();
                break;
            default:
                System.out.println("Error");
        }

    }//GEN-LAST:event_jcomboTipoSearchActionPerformed

    private void txtSearchVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchVentasKeyReleased
        if (txtSearchVentas.getText().trim().isEmpty()) {
            listarDetalles();
        } else {
            switch (banderaSearch) {
                case "numVenta":
                    listarNumVenta();
                    break;
                case "cliente":
                    listarClientes();
                    break;
                case "total":
                    listarTotalVenta();
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }//GEN-LAST:event_txtSearchVentasKeyReleased

    private void btn_ExportarExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportarExcelMouseClicked
        JFileChooser archivo_selec = new JFileChooser();
        File archivo;
        Modelo_Excel model_ex = new Modelo_Excel();

        if (archivo_selec.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = archivo_selec.getSelectedFile();

            String nombreArchivo = archivo.getName();
            if (!nombreArchivo.toLowerCase().endsWith(".xls") && !nombreArchivo.toLowerCase().endsWith(".xlsx")) {
                // Agregar extensión .xlsx si no está presente en el nombre del archivo
                nombreArchivo += ".xlsx";
                archivo = new File(archivo.getParentFile(), nombreArchivo);
            }

            // Continuar con el código para guardar el archivo
            if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                model_ex.exportacion(archivo, TableDetalles, 4);
                /*MENSAJE DE EXITO*/
                ImageIcon icononew = new ImageIcon(JsonUserValidation.class.getResource("/img/message/comprobado.png"));
                JOptionPane.showMessageDialog(null, "Archivo creado", "", 0, icononew);
            } else {
                JOptionPane.showMessageDialog(null, "Elija un formato válido");
            }
        }
    }//GEN-LAST:event_btn_ExportarExcelMouseClicked

    /*EVENTO DE BOTONES*/
    TableActionEventDetalles event = new TableActionEventDetalles() {
        @Override
        public void onEdit(ModelCellDetalles detalles) {
            //addContainer(new FormDetalle(), getWidth(), getHeight(), PanelContent);
        }

        @Override
        public void onDelete(ModelCellDetalles detalles) {
            String codventa = listaVentas.get(TableDetalles.getSelectedRow()).getCodVenta();
            String numventa = listaVentas.get(TableDetalles.getSelectedRow()).getnVenta();
            
            String[] opciones = {"Si", "No"};
            ImageIcon icono = new ImageIcon(getClass().getResource("/img/message/advertencia.png")); // Ruta al archivo de imagen del ícono
            int opcion = JOptionPane.showOptionDialog(null, "¿Desea eliminar la venta Nº" + numventa + " ?", "Confirmación", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
            if (opcion == JOptionPane.YES_OPTION) {
                JsonVentaCRUD.deleteVenta(codventa.trim());
                JsonDetalleProducto.deleteList(numventa.trim());
                listarDetalles();
                if (ValidateRegular.conexion) {
                    CrudMysql.crudMysqlVentas();
                    CrudMysql.crudMysqlDetalleProducto();
                }
            }

        }

        @Override
        public void onView(ModelCellDetalles detalles) {
            /*Designacion de codigos de busqueda*/
            String codVenta = listaVentas.get(TableDetalles.getSelectedRow()).getCodVenta();
            String numVenta = listaVentas.get(TableDetalles.getSelectedRow()).getnVenta();
            String codCliente = listaVentas.get(TableDetalles.getSelectedRow()).getCliente();

            /*Lleando de datos para detalle de ventas*/
            ValidateRegular.ventaSelect = JsonVentaCRUD.searchVentaCode(codVenta);

            ValidateRegular.listDetalleSelect = JsonDetalleProducto.returnListProducts(numVenta);
            ValidateRegular.clienteSelect = JsonClienteCRUD.searchClienteHistorialCodigo(codCliente);

            ValidateRegular.formDetalleProducto = true;
            /*View*/

            addContainer(new FormDetalleProductos(), getWidth(), getHeight(), PanelContent);
        }

    };

    /*INIT DATA*/
    private void initData() {
        listarDetalles();
    }

    private void listarDetalles() {
        listaVentas = JsonVentaCRUD.returnVentas();
        DefaultTableModel modelo = new DefaultTableModel();
        String columns[] = {"Nº Venta", "Cliente", "Total Venta", "Fecha", "Productos", "Eliminar"};
        modelo.setColumnIdentifiers(columns);
        TableDetalles.setModel(modelo);
        for (ModelCellDetalles m : listaVentas) {
            JsonClienteCRUD clbew = new JsonClienteCRUD();
            ModelCellClientes cl = clbew.searchClienteHistorialCodigo(m.getCliente());
            TableDetalles.addRow(new ModelCellDetalles(m.getnVenta(), cl.getNombre(), m.getTotalVenta(), m.getFecha()).toRowTable(event));
        }
    }

    private void listarVentasType(List<ModelCellDetalles> typeVenta) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableDetalles.setModel(modelo);
        String columns[] = {"Nº Venta", "Cliente", "Total Venta", "Fecha", "Productos", "Eliminar"};
        modelo.setColumnIdentifiers(columns);
        for (ModelCellDetalles m : typeVenta) {
            ModelCellClientes cl = JsonClienteCRUD.searchClienteHistorialCodigo(m.getCliente());
            TableDetalles.addRow(new ModelCellDetalles(m.getnVenta(), cl.getNombre(), m.getTotalVenta(), m.getFecha()).toRowTable(event));
        }
    }

    private void listarClientes() {
        List<ModelCellDetalles> newCellProducto = JsonVentaCRUD.searchListVentaCliente(txtSearchVentas.getText());
        listarVentasType(newCellProducto);
    }

    private void listarNumVenta() {
        List<ModelCellDetalles> newCellProducto = JsonVentaCRUD.searchListVentaNum(txtSearchVentas.getText());
        listarVentasType(newCellProducto);
    }

    private void listarTotalVenta() {
        List<ModelCellDetalles> newCellProducto = JsonVentaCRUD.searchListVentaTotal(txtSearchVentas.getText());
        listarVentasType(newCellProducto);
    }

    private void listarFechas(String fecha) {
        List<ModelCellDetalles> newCellProducto = JsonVentaCRUD.searchListVentaFecha(fecha);
        listarVentasType(newCellProducto);
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
    private javax.swing.JPanel ContentButtonsSearch;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContextSearch;
    private javax.swing.JLabel IconSearch;
    private javax.swing.JPanel PanelContent;
    private table.TableDetalles.TableDetalles TableDetalles;
    private javax.swing.JPanel TextSearch;
    private javax.swing.JLabel TitleProveedores;
    private javax.swing.JButton btnSearchFecha;
    private javax.swing.JLabel btn_ExportarExcel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcomboTipoSearch;
    private javax.swing.JTextField txtSearchVentas;
    // End of variables declaration//GEN-END:variables

}
