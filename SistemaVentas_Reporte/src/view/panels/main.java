/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.panels;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yatac
 */
public class main {

    public static void mostrarDialogo() {
        JPanel panel = new JPanel();
        JLabel etiquetaDato = new JLabel("Producto:");
        JLabel etiquetaCantidad = new JLabel("Cantidad:");
        JTextField campoTextoDato = new JTextField(10);
        JTextField campoTextoCantidad = new JTextField(5);
        campoTextoCantidad.setText("1");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Codigo", "Nombre", "Marca"});

        panel.add(etiquetaDato);
        panel.add(campoTextoDato);
        panel.add(etiquetaCantidad);
        panel.add(campoTextoCantidad);
        panel.add(comboBox);

        int opcion = JOptionPane.showConfirmDialog(null, panel, "Agregar Producto:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            if(!campoTextoDato.getText().equals("") || !campoTextoCantidad.getText().equals("")){
                /*Verificar si el producto a sido encontrado realmente*/
                
                /*Agregar el producto a la lista estatico de detalle ventas*/
            }else {
                JOptionPane.showMessageDialog(null, "No termino de llenar los campos","Error",JOptionPane.ERROR_MESSAGE);
            }
            String dato = campoTextoDato.getText();
            String cantidad = campoTextoCantidad.getText();
            String tipoDato = comboBox.getSelectedItem().toString();

            System.out.println("Dato ingresado: " + dato);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Tipo de dato seleccionado: " + tipoDato);
        }
    }

    public static void main(String[] args) {
        mostrarDialogo();
    }
}
