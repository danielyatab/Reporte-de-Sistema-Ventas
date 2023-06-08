package view.panels;

import Model.ModelCellProductos;
import Model.conexion.CrudMysql;
import controller.JsonProductoCRUD;
import controller.JsonTipoProducto;
import controller.JsonUserValidation;
import controller.ValidateRegular;
import controller.viewExcel.Modelo_Excel;
import java.awt.BorderLayout;
import java.io.File;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import view.panels.forms.FormProductos;
import view.panels.forms.Maximize;

public class PanelProducto extends javax.swing.JPanel {

    private static List<ModelCellProductos> listProduct = new ArrayList<ModelCellProductos>();
    private String banderaSearch = "producto";

    public PanelProducto() {
        initComponents();
        TableProductos.fixTable(jScrollPane1);
        TableProductos.setIconsColumns(9, 7, 8);
        listaTiposProductos();
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
        btn_AgregarProveedores = new javax.swing.JLabel();
        ContextSearch = new javax.swing.JPanel();
        TextSearch = new javax.swing.JPanel();
        txtSearchProducto = new javax.swing.JTextField();
        IconSearch = new javax.swing.JLabel();
        typeCode = new javax.swing.JLabel();
        typeMarca = new javax.swing.JLabel();
        jcomboTipo = new javax.swing.JComboBox<>();
        typeProductos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ContentTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new view.panels.TableProduct();

        ContentButtonsSearch.setBackground(new java.awt.Color(250, 250, 250));

        TitleProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TitleProductos.png"))); // NOI18N

        btn_ExportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ExportarExcel.png"))); // NOI18N
        btn_ExportarExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExportarExcelMouseClicked(evt);
            }
        });

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

        txtSearchProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        txtSearchProducto.setForeground(new java.awt.Color(16, 21, 64));
        txtSearchProducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchProducto.setText(" ");
        txtSearchProducto.setBorder(null);
        txtSearchProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchProductoKeyReleased(evt);
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
                .addComponent(txtSearchProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
        );
        TextSearchLayout.setVerticalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextSearchLayout.createSequentialGroup()
                .addGroup(TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IconSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtSearchProducto))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        typeCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeCodigo.png"))); // NOI18N
        typeCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeCodeMouseClicked(evt);
            }
        });

        typeMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeMarca_2.png"))); // NOI18N
        typeMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeMarcaMouseClicked(evt);
            }
        });

        jcomboTipo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        jcomboTipo.setForeground(new java.awt.Color(16, 21, 64));
        jcomboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Golosina", "Cuaderno" }));
        jcomboTipo.setBorder(null);
        jcomboTipo.setFocusable(false);
        jcomboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboTipoActionPerformed(evt);
            }
        });

        typeProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/types/typeProductos.png"))); // NOI18N
        typeProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContextSearchLayout = new javax.swing.GroupLayout(ContextSearch);
        ContextSearch.setLayout(ContextSearchLayout);
        ContextSearchLayout.setHorizontalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(typeCode)
                .addGap(30, 30, 30)
                .addComponent(typeProductos)
                .addGap(25, 25, 25)
                .addComponent(typeMarca)
                .addGap(18, 18, 18)
                .addComponent(jcomboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        ContextSearchLayout.setVerticalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(typeProductos)
                        .addComponent(jcomboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeMarca)
                        .addComponent(typeCode)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ExportarExcel)
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(41, 41, 41))
        );
        ContentTableLayout.setVerticalGroup(
            ContentTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(31, 31, 31))
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

    private void txtSearchProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchProductoKeyReleased
        if (txtSearchProducto.getText().trim().isEmpty()) {
            listarProductos();
        } else {
            switch (banderaSearch) {
                case "codigo":
                    listarCodigos();
                    break;
                case "producto":
                    listarNombres();
                    break;
                case "marca":
                    listarMarca();
                    break;
                case "tipo":
                    listarTipo();
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }//GEN-LAST:event_txtSearchProductoKeyReleased

    private void typeCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeCodeMouseClicked
        banderaSearch = "codigo";
        listarCodigos();
    }//GEN-LAST:event_typeCodeMouseClicked

    private void typeProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeProductosMouseClicked
        banderaSearch = "producto";
        listarProductos();
    }//GEN-LAST:event_typeProductosMouseClicked

    private void typeMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMarcaMouseClicked
        banderaSearch = "marca";
        listarMarca();
    }//GEN-LAST:event_typeMarcaMouseClicked

    private void jcomboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboTipoActionPerformed
        banderaSearch = "tipo";
        if (valueOf(jcomboTipo.getSelectedItem()).equals("Tipo")) {
            listarProductos();
        } else {
            listarTipo();
        }
    }//GEN-LAST:event_jcomboTipoActionPerformed

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
                model_ex.exportacion(archivo, TableProductos, 7);
                /*MENSAJE DE EXITO*/
                ImageIcon icononew = new ImageIcon(JsonUserValidation.class.getResource("/img/message/comprobado.png"));
                JOptionPane.showMessageDialog(null, "Archivo creado", "", 0, icononew);
            } else {
                JOptionPane.showMessageDialog(null, "Elija un formato válido");
            }
        }
        
    }//GEN-LAST:event_btn_ExportarExcelMouseClicked

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
        banderaSearch = "producto";
        listProduct = JsonProductoCRUD.returnProductos();
        DefaultTableModel modelo = new DefaultTableModel();
        TableProductos.setModel(modelo);
        String columns[] = {"Codigo", "Producto", "Tipo", "Descrp.", "Marca", "Stock", "Precio U.", "Editar", "Eliminar"};
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
        String columns[] = {"Codigo", "Producto", "Tipo", "Descrp.", "Marca", "Stock", "Precio U.", "Editar", "Eliminar"};
        modelo.setColumnIdentifiers(columns);
        for (int i = 0; i < typeProducto.size(); i++) {
            TableProductos.addRow(new ModelCellProductos(typeProducto.get(i).getCodigo(), typeProducto.get(i).getProducto(), typeProducto.get(i).getTipo(), typeProducto.get(i).getDescripcion(), typeProducto.get(i).getMarca(),
                    typeProducto.get(i).getCantidad(), typeProducto.get(i).getPrecioU()).toRowTable(event));
        }
    }

    
    
    private void listarCodigos() {
        List<ModelCellProductos> newCellProducto = JsonProductoCRUD.searchListProductoCodigo(txtSearchProducto.getText());
        listarProductosType(newCellProducto);
    }

    private void listarNombres() {
        List<ModelCellProductos> newCellProducto = JsonProductoCRUD.searchListProductoNombre(txtSearchProducto.getText());
        listarProductosType(newCellProducto);
    }

    private void listarMarca() {
        List<ModelCellProductos> newCellProducto = JsonProductoCRUD.searchListProductoMarca(txtSearchProducto.getText());
        listarProductosType(newCellProducto);
    }

    private void listarTipo() {
        List<ModelCellProductos> newCellProducto = JsonProductoCRUD.searchListProductoTipo(valueOf(jcomboTipo.getSelectedItem()));
        listarProductosType(newCellProducto);
    }

    public void listaTiposProductos() {
        jcomboTipo.removeAllItems();
        // Agregar los elementos del ArrayList al JComboBox
        jcomboTipo.addItem("Tipo");
        for (String elemento : JsonTipoProducto.returnTiposProductos()) {
            jcomboTipo.addItem(elemento);
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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentButtonsSearch;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContentTable;
    private javax.swing.JPanel ContextSearch;
    private javax.swing.JLabel IconSearch;
    private view.panels.TableProduct TableProductos;
    private javax.swing.JPanel TextSearch;
    private javax.swing.JLabel TitleProveedores;
    private javax.swing.JLabel btn_AgregarProveedores;
    private javax.swing.JLabel btn_ExportarExcel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcomboTipo;
    private javax.swing.JTextField txtSearchProducto;
    private javax.swing.JLabel typeCode;
    private javax.swing.JLabel typeMarca;
    private javax.swing.JLabel typeProductos;
    // End of variables declaration//GEN-END:variables

}
