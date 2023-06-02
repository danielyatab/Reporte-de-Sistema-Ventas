/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.panels.forms;

import controller.FileJson;
import controller.JsonTipoProducto;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yatac
 */
public class FormAddTipoProducto {
    
    private static List<String> tiposProductos = new ArrayList<>();
    private static DefaultTableModel tableModel;

    public static void mostrarDialogo() {
        FileJson.rutaTiposProductos ="json/TipoProducto.json";
        
        // Ejemplo de tipos de productos preexistentes
        tiposProductos = JsonTipoProducto.returnTiposProductos();

        // Crear la tabla y el modelo de datos
        JTable table = new JTable();
        tableModel = new DefaultTableModel(new Object[]{"Tipo de Producto"}, 0);
        table.setModel(tableModel);
        actualizarTabla(table);

        // Crear los botones
        JButton btnAgregar = new JButton("Agregar");
        JButton btnModificar = new JButton("Modificar");
        JButton btnEliminar = new JButton("Eliminar");

        // Crear el panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnModificar);
        panelBotones.add(btnEliminar);

       
        
        
        // Acción del botón Agregar
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoTipoProducto = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de producto:", "", JOptionPane.INFORMATION_MESSAGE);
                if (nuevoTipoProducto != null && !nuevoTipoProducto.isEmpty()) {
                    JsonTipoProducto.addTipoProductos(nuevoTipoProducto);
                    tiposProductos = JsonTipoProducto.returnTiposProductos();
                    actualizarTabla(table);
                }
            }
        });

        // Acción del botón Modificar
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    String tipoProductoActual = tiposProductos.get(filaSeleccionada);
                    String nuevoTipoProducto = JOptionPane.showInputDialog(null, "Modificar tipo de producto:", tipoProductoActual, JOptionPane.INFORMATION_MESSAGE);
                    if (nuevoTipoProducto != null && !nuevoTipoProducto.isEmpty()) {
                        JsonTipoProducto.updateTipoProductos(tiposProductos.get(filaSeleccionada), nuevoTipoProducto);
                        tiposProductos = JsonTipoProducto.returnTiposProductos();
                        actualizarTabla(table);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de producto para modificar.", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Acción del botón Eliminar
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el tipo de producto seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, 0);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        JsonTipoProducto.deleteTipoProductos(tiposProductos.get(filaSeleccionada));
                        tiposProductos = JsonTipoProducto.returnTiposProductos();
                        actualizarTabla(table);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un tipo de producto para eliminar.", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
         // Crear el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(new JScrollPane(table), BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        // Mostrar el panel principal como diálogo JOptionPane
        int option = JOptionPane.showOptionDialog(null, panelPrincipal, "CRUD de Tipos de Productos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{}, null);

        if (option == JOptionPane.OK_OPTION) {
            // Código para realizar alguna acción después de cerrar el diálogo
        }
        
    }

    public static void main(String[] args) {
        mostrarDialogo();
    }

    
    
     // Actualizar la tabla con los datos actualizados de la lista de tipos de productos 
    private static void actualizarTabla(JTable table) {
        tableModel.setRowCount(0); // Limpiar la tabla antes de actualizarla
        for (String tipoProducto : tiposProductos) {
            tableModel.addRow(new Object[]{tipoProducto});
        }
    }
    // Resto del código de la clase...
    // ...
}
