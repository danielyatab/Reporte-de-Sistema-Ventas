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
import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class main {

    public static void main(String[] args) {
        main m = new main();
        int i = m.generarNumBoleta();
        System.out.println("NUMERO:" + i);
    }

    public int generarNumBoleta() {
        String[] opciones = {"Crear nuevo numero de boletario", "Crear desde la boleta nº 1"};
        ImageIcon icono = new ImageIcon("src/img/message/lapiz.png"); // Ruta al archivo de imagen del ícono

        int opcion = JOptionPane.showOptionDialog(null, "¿Desea registrar un nuevo incio de boletas?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        String numero = "";
        if (opcion == JOptionPane.YES_OPTION) {
            boolean isInteger = true;
            while (isInteger) {
                numero = JOptionPane.showInputDialog(null, "Ingresa desde que numero iniciar");
                if (esEntero(numero)) {
                    isInteger = false;
                } else {
                    isInteger = true;
                }
            }
            return Integer.parseInt(numero);
        } else if (opcion == JOptionPane.NO_OPTION) {
            return 1;
        }

        return 1;
    }

    public static boolean esEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void pdf() {
        try {
            FileOutputStream archivo;
            File file = new File("src/pdf/venta1.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            /*Para que no coliciones con la clase IMG de java*/
            com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("src/img/LogoIsrael.png");

            Paragraph fecha = new Paragraph();

            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura: 1" + "\nFecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");

            PdfPTable Encabezado = new PdfPTable(5);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(img);

            String ruc = "313123";
            String nom = "Liobreria y Bazar Israel";
            String tel = "47930780478";
            String dir = "Lma";
            String ra = " Vida vida cvida";

            Encabezado.addCell("");
            Encabezado.addCell("Ruc: " + ruc + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDireccion: " + dir + "\nRazon" + ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            doc.close();
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear pdf " + e.getMessage());
        }
    }
}
