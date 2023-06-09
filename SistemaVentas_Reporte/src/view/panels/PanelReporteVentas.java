/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panels;

import controller.JsonDetalleProducto;
import controller.JsonVentaCRUD;
import controller.ValidateRegular;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author yatac
 */
public class PanelReporteVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelReporteVentas
     */
    public PanelReporteVentas() {
        initComponents();
        TableDiario.fixTable(jScrollPane1);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chartPie1 = new view.panels.ChartPie();
        chartLine1 = new view.panels.ChartLine();
        PanelBackroundVentaDiaria = new FondoPanelDiario();
        jLabel5 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        JlabelTotalVenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDiario = new table.ventaDiaria.TableVentaDiaria();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBackroundVentaDiaria.setBackground(new java.awt.Color(153, 255, 102));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ventas del dia");

        jLabelFecha.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFecha.setText("12-04-2023");

        JlabelTotalVenta.setBackground(new java.awt.Color(255, 255, 255));
        JlabelTotalVenta.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        JlabelTotalVenta.setForeground(new java.awt.Color(255, 255, 255));
        JlabelTotalVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelTotalVenta.setText("S/. 120,00");
        JlabelTotalVenta.setToolTipText("");

        TableDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane1.setViewportView(TableDiario);

        javax.swing.GroupLayout PanelBackroundVentaDiariaLayout = new javax.swing.GroupLayout(PanelBackroundVentaDiaria);
        PanelBackroundVentaDiaria.setLayout(PanelBackroundVentaDiariaLayout);
        PanelBackroundVentaDiariaLayout.setHorizontalGroup(
            PanelBackroundVentaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackroundVentaDiariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBackroundVentaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBackroundVentaDiariaLayout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addGroup(PanelBackroundVentaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JlabelTotalVenta)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(PanelBackroundVentaDiariaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBackroundVentaDiariaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        PanelBackroundVentaDiariaLayout.setVerticalGroup(
            PanelBackroundVentaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackroundVentaDiariaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha)
                .addGap(45, 45, 45)
                .addComponent(JlabelTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(PanelBackroundVentaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelBackroundVentaDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initData() {
        List<ModelChartPie> list1 = new ArrayList<>();
        JsonVentaCRUD.listarMesesTotalVenta();
        double[] o = ValidateRegular.totalesSemana;
        list1.add(new ModelChartPie("Lunes", o[0], new Color(4, 174, 243)));
        list1.add(new ModelChartPie("Martes", o[1], new Color(215, 39, 250)));
        list1.add(new ModelChartPie("Miercoles", o[2], new Color(44, 88, 236)));
        list1.add(new ModelChartPie("Jueves", o[3], new Color(21, 202, 87)));
        list1.add(new ModelChartPie("Viernes", o[4], new Color(127, 63, 255)));
        list1.add(new ModelChartPie("Sabado", o[5], new Color(238, 167, 35)));
        list1.add(new ModelChartPie("Domingo", o[6], new Color(245, 79, 99)));
        
        chartPie1.setModel(list1);
        
        
        //  Test data chart line
        List<ModelChartLine> list = new ArrayList<>();
        JsonVentaCRUD.listarAnualTotal();
        double[] anual = ValidateRegular.totalesMes;
        list.add(new ModelChartLine("Enero", anual[0]));
        list.add(new ModelChartLine("Febrero", anual[1]));
        list.add(new ModelChartLine("Marzo", anual[2]));
        list.add(new ModelChartLine("Abril", anual[3]));
        list.add(new ModelChartLine("Mayo", anual[4]));
        list.add(new ModelChartLine("Junio", anual[5]));
        list.add(new ModelChartLine("Julio", anual[6]));
        list.add(new ModelChartLine("Agosto", anual[7]));
        list.add(new ModelChartLine("Septiembre", anual[8]));
        list.add(new ModelChartLine("Ocutbre", anual[9]));
        list.add(new ModelChartLine("Noviembre", anual[10]));
        list.add(new ModelChartLine("Diciembre", anual[10]));
        chartLine1.setModel(list);
        
        /*Listar Productos del dia*/
        listarProductosDia();
    }
    
    
    /*LISTADO DE EVENTOS DE GGRAFICA*/
    
    void listarProductosDia(){
        JsonDetalleProducto.llenadoVentasDia();
        jLabelFecha.setText(ValidateRegular.fechaActual);
        if(ValidateRegular.TotalVentaDia < 100){
            JlabelTotalVenta.setText("S/.  "+ValidateRegular.TotalVentaDia+"   ");
        }else {
            JlabelTotalVenta.setText("S/. "+ValidateRegular.TotalVentaDia+"  ");
        }
        
        for(Object[] o : ValidateRegular.listaDiaNombre){
            TableDiario.addRow(o);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelTotalVenta;
    private javax.swing.JPanel PanelBackroundVentaDiaria;
    private table.ventaDiaria.TableVentaDiaria TableDiario;
    private view.panels.ChartLine chartLine1;
    private view.panels.ChartPie chartPie1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    class FondoPanelDiario extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/img/PanelVentasDelDia.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
