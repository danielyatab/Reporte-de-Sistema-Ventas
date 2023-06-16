/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.panels.forms;

import Model.ModelCellClientes;
import Model.ModelCellProductos;
import Model.ModelCellVenta;
import controller.JsonClienteCRUD;
import controller.JsonProductoCRUD;
import controller.ValidateRegular;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author yatac
 */
public class FormAddProducto {

    public static ModelCellVenta newProductVenta = new ModelCellVenta();
    public static boolean productEncontrado = false;
    public static double importe=0;
    public static void mostrarDialogo() {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(245,245,245));
        
        JLabel etiquetaDato = new JLabel("INGRESO PRODUCTO");
        JLabel etiquetaCantidad = new JLabel("INGRESO CANTIDAD");
        JTextField campoTextoDato = new JTextField(10);

        JTextField campoTextoCantidad = new JTextField(5);
        campoTextoCantidad.setHorizontalAlignment(SwingConstants.CENTER);

        campoTextoCantidad.setText("1");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Codigo"});

        JLabel etiquetaTitle = new JLabel("PRODUCTO");
        etiquetaTitle.setFont(etiquetaTitle.getFont().deriveFont(Font.BOLD));
        etiquetaTitle.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel etiquetaProducto = new JLabel("producto");
        etiquetaProducto.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel etiquetaMarca = new JLabel("marca");
        etiquetaMarca.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel etiquetaDescripcion = new JLabel("descripcion");
        etiquetaDescripcion.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel etiquetaPrecioU = new JLabel("Precio Unitario: S/. 0.00");
        etiquetaDescripcion.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel etiquetaImporte = new JLabel("Importe: S/. 0.00");
        etiquetaDescripcion.setHorizontalAlignment(SwingConstants.CENTER);

        campoTextoDato.addKeyListener(new KeyListener() {
            public void keyReleased(KeyEvent e) {
                int cantidad = 1;

                System.out.println("Texto ingresado: " + campoTextoDato.getText());
                if (JsonProductoCRUD.buscarProductoCodigo(campoTextoDato.getText().trim()) != null) {
                    cantidad = Integer.parseInt(valueOf(campoTextoCantidad.getText().trim()));

                    /*Captura datos de producto*/
                    ModelCellProductos productReturn = JsonProductoCRUD.buscarProductoCodigo(campoTextoDato.getText().trim());

                    ModelCellVenta newProducto = new ModelCellVenta();
                    newProducto.setCodigo(productReturn.getCodigo());
                    newProducto.setProducto(productReturn.getProducto());
                    newProducto.setMarca(productReturn.getMarca());
                    newProducto.setDescripcion(productReturn.getDescripcion());
                    newProducto.setCantidad(cantidad);
                    newProducto.setPrecioU(productReturn.getPrecioU());

                    newProductVenta = newProducto;
                    productEncontrado = true;

                    /*LLenado de Jlabel*/
                    etiquetaProducto.setText(productReturn.getProducto());
                    etiquetaMarca.setText(productReturn.getMarca());
                    etiquetaDescripcion.setText(productReturn.getDescripcion());
                    etiquetaPrecioU.setText("Precio Unitario: S/." + productReturn.getPrecioU());

                    /*LLenar importe*/
                    try {
                        importe = newProductVenta.getPrecioU() * Double.parseDouble(campoTextoCantidad.getText());
                    } catch (NumberFormatException ex) {
                        System.out.println("Error al cpoturar testo vacio" + ex.getMessage());
                    }
                    etiquetaImporte.setText("Importe: S/." + importe);
                }
            }

            @Override

            public void keyTyped(KeyEvent e) {
                //Not support
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Not support
            }
        }
        );

        campoTextoCantidad.addKeyListener(new KeyListener() {
            public void keyReleased(KeyEvent e) {
                try {
                    if (newProductVenta != null) {
                        importe = newProductVenta.getPrecioU() * Double.parseDouble(campoTextoCantidad.getText());
                    }
                    etiquetaImporte.setText("Importe: S/." + importe);
                } catch (Exception ex) {
                    System.out.println("Error al parsear texto vacio" + ex.getMessage());
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                //Not support
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Not support
            }
        });

        panel.add(etiquetaDato);
        panel.add(campoTextoDato);
        panel.add(comboBox);
        panel.add(etiquetaProducto);
        panel.add(etiquetaMarca);
        panel.add(etiquetaDescripcion);
        // Salto de línea
        panel.add(Box.createVerticalStrut(15));

        panel.add(etiquetaCantidad);
        panel.add(campoTextoCantidad);

        // Salto de línea
        panel.add(Box.createVerticalGlue());

        panel.add(etiquetaPrecioU);
        panel.add(etiquetaImporte);

        int opcion = JOptionPane.showOptionDialog(
                null,
                panel,
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"Cancelar", "Aceptar"},
                null
        );

        if (opcion == 1) {
            if (!campoTextoDato.getText().equals("")) {
                /*Verificar si el producto a sido encontrado realmente*/
                if (!etiquetaProducto.getText().equals("") && productEncontrado) {
                    if (Integer.parseInt(campoTextoCantidad.getText()) > 0) {
                        newProductVenta.setTotal(importe);
                        newProductVenta.setCantidad(Integer.parseInt(campoTextoCantidad.getText()));
                        
                        if (JsonProductoCRUD.extraerStock(newProductVenta.getCodigo(), newProductVenta.getCantidad(), false)) {
                            
                            /*Agregar el producto a la lista estatico de detalle ventas*/
                            ValidateRegular.listVentasExtrac = new ArrayList<ModelCellVenta>();
                            ValidateRegular.listVentasExtrac.add(newProductVenta);
                            ValidateRegular.listDetalleSelect.add(newProductVenta);
                            System.out.println("LLegue a llenarolo XD");
                        } else {
                            mostrarDialogo();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0 o menor", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun producto encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                    mostrarDialogo();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No termino de llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
                mostrarDialogo();
            }
            String dato = campoTextoDato.getText();
            String cantidad = campoTextoCantidad.getText();
            String tipoDato = comboBox.getSelectedItem().toString();

            System.out.println("Dato ingresado: " + dato);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Tipo de dato seleccionado: " + tipoDato);
        }

        /**
         * *********************************************METODO BUSCAR
         * PRODUCTO*****************************************************
         */
    }

    public static void main(String[] args) {
        mostrarDialogo();
    }
}
