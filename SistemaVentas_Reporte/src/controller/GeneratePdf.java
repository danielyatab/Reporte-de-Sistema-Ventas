/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ModelCellClientes;
import Model.ModelCellDetalles;
import Model.ModelCellVenta;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yatac
 */
public class GeneratePdf {

    public static void pdf(List<ModelCellVenta> listVenta, ModelCellClientes cliente, ModelCellDetalles detalleVenta,
            double efectivo, double vuelto) throws DocumentException {
        try {
            FileOutputStream archivo;
            FileOutputStream archivo2;

            File file = new File("boleta/" + detalleVenta.getRutaBoleta());
            File file2 = new File("boleta-historial/" + detalleVenta.getRutaBoleta());

            archivo = new FileOutputStream(file);
            archivo2 = new FileOutputStream(file2);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            PdfWriter.getInstance(doc, archivo2);

            doc.open();

            /*Para que no coliciones con la clase IMG de java*/
            com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance(GeneratePdf.class.getResource("/img/LogoIsraelFull.png"));

            Paragraph fecha = new Paragraph();

            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            Font negritaTable = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);

            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("\n\nBoleta: " + detalleVenta.getnVenta() + "\nFecha: " + detalleVenta.getFecha() + "\n\n");

            /*Tabla CLIENTE*/
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{50f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            img.scaleToFit(500, 500);
            Encabezado.addCell(img);

            String ruc = "10218124432";
            String nom = "Libreria y Bazar Israel";
            String tel = "98272341";
            String dir = "Plaza de armas Sunampe";
            LocalTime horaActual = LocalTime.now();
            int hora = horaActual.getHour();
            int minutos = horaActual.getMinute();

            Encabezado.addCell("");
            Encabezado.addCell("\n\n\nRuc: " + ruc + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDireccion: " + dir + "\nHora: " +hora+":"+minutos );
            Encabezado.addCell(detalleVenta.getFecha());
            doc.add(Encabezado);

            /*Tabla CLIENTE*/
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del cliente");
            doc.add(cli);

            PdfPTable tablacli = new PdfPTable(4);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{20f, 50f, 30f, 40f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("DNI", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Nombres", negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("Telefono", negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("Correo", negrita));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);

            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl4);

            tablacli.addCell(cliente.getNumDocumento());
            tablacli.addCell(cliente.getNombre() + " " + cliente.getApellido());
            tablacli.addCell(cliente.getTelefono());
            tablacli.addCell(cliente.getCorreo());

            Paragraph espaciado = new Paragraph();
            espaciado.add(Chunk.NEWLINE);
            espaciado.add("\n\n");

            Paragraph espaciado2 = new Paragraph();
            espaciado2.add(Chunk.NEWLINE);
            espaciado2.add("\n");

            //TABLA PRODUCTOS
            PdfPTable tablaprod = new PdfPTable(6);
            tablaprod.setWidthPercentage(100);
            tablaprod.getDefaultCell().setBorder(0);
            float[] Columnaprod = new float[]{35f, 35f, 35f, 20f, 20f, 20f};
            tablaprod.setWidths(Columnaprod);
            tablaprod.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell pro1 = new PdfPCell(new Phrase("Producto", negritaTable));
            PdfPCell pro2 = new PdfPCell(new Phrase("Marca", negritaTable));
            PdfPCell pro3 = new PdfPCell(new Phrase("Descr.", negritaTable));
            PdfPCell pro4 = new PdfPCell(new Phrase("Precio", negritaTable));
            PdfPCell pro5 = new PdfPCell(new Phrase("Cantidad", negritaTable));
            PdfPCell pro6 = new PdfPCell(new Phrase("Importe", negritaTable));

            pro1.setBorder(0);
            pro2.setBorder(0);
            pro3.setBorder(0);
            pro4.setBorder(0);
            pro5.setBorder(0);
            pro6.setBorder(0);

            pro1.setBackgroundColor(BaseColor.DARK_GRAY);
            pro2.setBackgroundColor(BaseColor.DARK_GRAY);
            pro3.setBackgroundColor(BaseColor.DARK_GRAY);
            pro4.setBackgroundColor(BaseColor.DARK_GRAY);
            pro5.setBackgroundColor(BaseColor.DARK_GRAY);
            pro6.setBackgroundColor(BaseColor.DARK_GRAY);

            tablaprod.addCell(pro1);
            tablaprod.addCell(pro2);
            tablaprod.addCell(pro3);
            tablaprod.addCell(pro4);
            tablaprod.addCell(pro5);
            tablaprod.addCell(pro6);

            for (ModelCellVenta ventas : listVenta) {
                tablaprod.addCell(ventas.getProducto());
                tablaprod.addCell(ventas.getMarca());
                tablaprod.addCell(ventas.getDescripcion());
                tablaprod.addCell(valueOf(ventas.getPrecioU()));
                tablaprod.addCell(valueOf(ventas.getCantidad()));
                tablaprod.addCell(valueOf(ventas.getTotal()));
            }

            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Efectivo: " + efectivo);
            info.add("\nVuelto: " + vuelto);
            info.add("\nTotal a pagar: " + detalleVenta.getTotalVenta());
            info.setAlignment(Element.ALIGN_RIGHT);

            /*Total a pagar*/
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.setAlignment(Element.ALIGN_CENTER);
            mensaje.add("Gracias por su compra");

            doc.add(tablacli);
            doc.add(espaciado2);
            doc.add(tablaprod);
            doc.add(info);
            doc.add(mensaje);

            doc.close();
            archivo.close();
            archivo2.close();

            Desktop.getDesktop().open(file);

        } catch (IOException e) {
            System.out.println("Error al crear pdf " + e);
        }
    }

}
