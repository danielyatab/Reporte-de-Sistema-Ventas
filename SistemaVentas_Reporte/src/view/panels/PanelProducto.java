package view.panels;

import Model.ModelCellProductos;
import Model.conexion.CrudMysql;
import Table.TableProduct.TableActionEventProduct;
import controller.JsonProductoCRUD;
import controller.ValidateRegular;
import design.Maximize;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import view.panels.forms.FormProductos;

public class PanelProducto extends javax.swing.JPanel {

    private static List<ModelCellProductos> listProduct;
    private ArrayList<String> busquedaLista = new ArrayList<>();
    private static String searchSelect = "";
    String columns[] = {"Codigo", "Producto", "Tipo", "Descrp.", "Marca", "Stock", "Precio U.", "Editar", "Eliminar"};

    public PanelProducto() {
        try {
            listProduct = JsonProductoCRUD.returnProductos();
        } catch (Exception e) {
            System.out.println("Error de documento productos");
        }
        initComponents();
        TableProductos.fixTable(jScrollPane1);
        TableProductos.setIconsColumns(9, 7, 8);
        listarProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ContentPanel = new javax.swing.JPanel();
        ContentButtonsSearch = new javax.swing.JPanel();
        TitleProveedores = new javax.swing.JLabel();
        btn_ExportarExcel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_AgregarProveedores = new javax.swing.JLabel();
        ContextSearch = new javax.swing.JPanel();
        TextSearch = new javax.swing.JPanel();
        txtSearchCliente = new javax.swing.JTextField();
        IconSearch = new javax.swing.JLabel();
        typeName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        typeApellido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ContentTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new Table.TableProduct.TableProduct();

        ContentButtonsSearch.setBackground(new java.awt.Color(250, 250, 250));

        TitleProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TitleProductos.png"))); // NOI18N

        btn_ExportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ExportarExcel.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ImportarExcel.png"))); // NOI18N

        btn_AgregarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_newPRODUCTO.png"))); // NOI18N
        btn_AgregarProveedores.setToolTipText("");
        btn_AgregarProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarProveedoresMouseClicked(evt);
            }
        });

        ContextSearch.setBackground(new java.awt.Color(250, 250, 250));

        TextSearch.setBackground(new java.awt.Color(255, 255, 255));
        TextSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearchCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchCliente.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        txtSearchCliente.setForeground(new java.awt.Color(16, 21, 64));
        txtSearchCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchCliente.setText(" ");
        txtSearchCliente.setBorder(null);
        txtSearchCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchClienteKeyReleased(evt);
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
                .addComponent(txtSearchCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
        );
        TextSearchLayout.setVerticalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextSearchLayout.createSequentialGroup()
                .addGroup(TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IconSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtSearchCliente))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        typeName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeCodigo.png"))); // NOI18N
        typeName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeNameMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeMarca_2.png"))); // NOI18N

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(16, 21, 64));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Golosina", "Cuaderno" }));
        jComboBox2.setBorder(null);
        jComboBox2.setFocusable(false);

        typeApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeProductos.png"))); // NOI18N

        javax.swing.GroupLayout ContextSearchLayout = new javax.swing.GroupLayout(ContextSearch);
        ContextSearch.setLayout(ContextSearchLayout);
        ContextSearchLayout.setHorizontalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(typeName)
                .addGap(30, 30, 30)
                .addComponent(typeApellido)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        ContextSearchLayout.setVerticalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(typeApellido)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(typeName)))
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
            .addComponent(ContextSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addComponent(TitleProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(btn_ExportarExcel)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_AgregarProveedores)
                        .addGap(44, 44, 44))
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(3, 3, 3))
                            .addComponent(jSeparator4))
                        .addGap(34, 34, 34))))
        );
        ContentButtonsSearchLayout.setVerticalGroup(
            ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentButtonsSearchLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TitleProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentButtonsSearchLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ExportarExcel)
                            .addComponent(jLabel1)
                            .addComponent(btn_AgregarProveedores))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ContentTable.setBackground(new java.awt.Color(255, 255, 255));

        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableProductos);

        javax.swing.GroupLayout ContentTableLayout = new javax.swing.GroupLayout(ContentTable);
        ContentTable.setLayout(ContentTableLayout);
        ContentTableLayout.setHorizontalGroup(
            ContentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentTableLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        ContentTableLayout.setVerticalGroup(
            ContentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentTableLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_AgregarProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarProveedoresMouseClicked
        addContainer(new FormProductos(), getWidth(), getHeight(), ContentPanel);
    }//GEN-LAST:event_btn_AgregarProveedoresMouseClicked

    private void txtSearchClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchClienteKeyReleased
        /* if (txtSearchCliente.getText().trim().isEmpty()) {
            listarProductos();
        }
        if (searchSelect.equals("nombre")) {
            System.out.println("NOMBREEEEEE SOY NOMBREEE");
            List<ModelCellProductos> newCellCliente = JsonClienteCRUD.searchClienteNombre(txtSearchCliente.getText());
            listarProductosType(newCellCliente);
        }*/
    }//GEN-LAST:event_txtSearchClienteKeyReleased

    private void typeNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeNameMouseClicked
        /*
        try {
            if (searchSelect.equals(listClient.get(0).toString())) {
                listarProductos();
                searchSelect = listClient.get(5).toString();
            } else {
                searchSelect = listClient.get(0).toString();
                List<ModelCellProductos> newCellCliente = JsonClienteCRUD.searchClienteNombre(txtSearchCliente.getText());
                listarProductosType(newCellCliente);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar");
        }*/

    }//GEN-LAST:event_typeNameMouseClicked

    /*EVENTO DE BOTONES*/
    TableActionEventProduct event = new TableActionEventProduct() {
        @Override
        public void onEdit(ModelCellProductos productos) {
            Maximize.updateCrud = true;
            ModelCellProductos updateProductos = listProduct.get(TableProductos.getSelectedRow());
            ValidateRegular.updateProducto = updateProductos;
            FormProductos fCl = new FormProductos();
            addContainer(fCl, getWidth(), getHeight(), ContentPanel);
        }

        @Override
        public void onDelete(ModelCellProductos productos) {
            ModelCellProductos deleteProducto = listProduct.get(TableProductos.getSelectedRow());
            String[] opciones = {"Si", "No"};
            ImageIcon icono = new ImageIcon("src/img/message/advertencia.png"); // Ruta al archivo de imagen del ícono
            int opcion = JOptionPane.showOptionDialog(null, "¿Desea eliminar al producto " + deleteProducto.getProducto() + " ?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
            if (opcion == JOptionPane.YES_OPTION) {
                JsonProductoCRUD.deleteProducto(deleteProducto.getCodigo());
                if (ValidateRegular.conexion) {
                    try {
                        CrudMysql.crudMysqlProductos();
                    } catch (Exception e) {
                        System.out.println("Sin conexion a internet producto no eliminado en base de datos" + e.getMessage());
                    }
                }
            }
            listarProductos();
        }
    };

    /*INIT DATA*/
    private void listarProductos() {
        listProduct = JsonProductoCRUD.returnProductos();
        DefaultTableModel modelo = new DefaultTableModel();
        TableProductos.setModel(modelo);
        modelo.setColumnIdentifiers(columns);
        if (listProduct != null) {
            for (ModelCellProductos pd : listProduct) {
                TableProductos.addRow(new ModelCellProductos(pd.getCodigo(), pd.getProducto(), pd.getTipo(), pd.getDescripcion(), pd.getMarca(),
                        pd.getCantidad(), pd.getPrecioU()).toRowTable(event));
            }
        }
    }

    private void listarProductosType(List<ModelCellProductos> typeProducto) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableProductos.setModel(modelo);
        modelo.setColumnIdentifiers(columns);
        for (int i = 0; i < typeProducto.size(); i++) {
            TableProductos.addRow(new ModelCellProductos(typeProducto.get(i).getCodigo(), typeProducto.get(i).getProducto(), typeProducto.get(i).getTipo(), typeProducto.get(i).getDescripcion(), typeProducto.get(i).getMarca(),
                    typeProducto.get(i).getCantidad(), typeProducto.get(i).getPrecioU()).toRowTable(event));
        }
    }

    /**
     *
     * @param p Panel de Ingresogit
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

    public void llenadoBusqueda() {
        busquedaLista.add("nombre");
        busquedaLista.add("apellido");
        busquedaLista.add("telefono");
        busquedaLista.add("numDocumento");
        busquedaLista.add("tipoDocumento");
        busquedaLista.add("ultimo");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentButtonsSearch;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContentTable;
    private javax.swing.JPanel ContextSearch;
    private javax.swing.JLabel IconSearch;
    private Table.TableProduct.TableProduct TableProductos;
    private javax.swing.JPanel TextSearch;
    private javax.swing.JLabel TitleProveedores;
    private javax.swing.JLabel btn_AgregarProveedores;
    private javax.swing.JLabel btn_ExportarExcel;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtSearchCliente;
    private javax.swing.JLabel typeApellido;
    private javax.swing.JLabel typeName;
    // End of variables declaration//GEN-END:variables

}
