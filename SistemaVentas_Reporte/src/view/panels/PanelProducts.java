/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels;

import Model.ModelCellProduct;
import Table.TableProduct.TableActionEventProduct;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author yatac
 */
public class PanelProducts extends javax.swing.JPanel {

    public PanelProducts() {
        initComponents();
        TableProductos.fixTable(jScrollPane1);
        TableProductos.setIconsColumns(6, 5,6,0);
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

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ContentButtonsSearch = new javax.swing.JPanel();
        TitleProveedores = new javax.swing.JLabel();
        btn_ExportarExcel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_AgregarProveedores = new javax.swing.JLabel();
        ContextSearch = new javax.swing.JPanel();
        TextSearch = new javax.swing.JPanel();
        txtSearchProveedores = new javax.swing.JTextField();
        IconSearch = new javax.swing.JLabel();
        typeName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new Table.TableProduct.TableProduct();

        ContentButtonsSearch.setBackground(new java.awt.Color(255, 255, 255));

        TitleProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proveedores.png"))); // NOI18N

        btn_ExportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ExportarExcel.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ImportarExcel.png"))); // NOI18N

        btn_AgregarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_NewProveedor.png"))); // NOI18N
        btn_AgregarProveedores.setToolTipText("");

        ContextSearch.setBackground(new java.awt.Color(250, 250, 250));

        TextSearch.setBackground(new java.awt.Color(255, 255, 255));
        TextSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtSearchProveedores.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchProveedores.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        txtSearchProveedores.setForeground(new java.awt.Color(16, 21, 64));
        txtSearchProveedores.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchProveedores.setText(" ");
        txtSearchProveedores.setBorder(null);

        IconSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N

        javax.swing.GroupLayout TextSearchLayout = new javax.swing.GroupLayout(TextSearch);
        TextSearch.setLayout(TextSearchLayout);
        TextSearchLayout.setHorizontalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextSearchLayout.createSequentialGroup()
                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSearchProveedores))
        );
        TextSearchLayout.setVerticalGroup(
            TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextSearchLayout.createSequentialGroup()
                .addGroup(TextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IconSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtSearchProveedores))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        typeName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/typeNombre.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/typeTelefono.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/typeRuc.png"))); // NOI18N

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 17)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(16, 21, 64));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Consumibles", "Libros" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);

        javax.swing.GroupLayout ContextSearchLayout = new javax.swing.GroupLayout(ContextSearch);
        ContextSearch.setLayout(ContextSearchLayout);
        ContextSearchLayout.setHorizontalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94)
                .addComponent(typeName)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        ContextSearchLayout.setVerticalGroup(
            ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContextSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContextSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btn_ExportarExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(9, 9, 9)
                .addGroup(ContentButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ExportarExcel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_AgregarProveedores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitleProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContextSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContentButtonsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/*EVENTO DE BOTONES*/
    TableActionEventProduct event = new TableActionEventProduct() {

        @Override
        public void onEdit(ModelCellProduct producto) {
            System.out.println("Product Editar" + TableProductos.getSelectedRow() );
        }

        @Override
        public void onDelete(ModelCellProduct producto) {
            System.out.println("Product Eliminar" + TableProductos.getSelectedRow() );
        }
        
    };
    
    

    /*INIT DATA*/
    private void initData(){
        DefaultTableModel modelo = new DefaultTableModel();
        String columns[] = {"Codigo", "Nombre","Tipo", "Cantidad", "Precio U.", "Editar", "Eliminar"};
        TableProductos.setModel(modelo);
        modelo.setColumnIdentifiers(columns);
          for(int i=0; i<30; i++){
            TableProductos.addRow(new ModelCellProduct("13123sd", "galleta soda V",
             "golosina",12, 12.5f).toRowTable(event));
        }   
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentButtonsSearch;
    private javax.swing.JPanel ContextSearch;
    private javax.swing.JLabel IconSearch;
    private Table.TableProduct.TableProduct TableProductos;
    private javax.swing.JPanel TextSearch;
    private javax.swing.JLabel TitleProveedores;
    private javax.swing.JLabel btn_AgregarProveedores;
    private javax.swing.JLabel btn_ExportarExcel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtSearchProveedores;
    private javax.swing.JLabel typeName;
    // End of variables declaration//GEN-END:variables

}
