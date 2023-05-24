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

/**
 *
 * @author yatac
 */
public class main {
    public static void main(String[] args) {
       try {
            FileOutputStream archivo;
            File file = new File("src/pdf/venta1.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc,archivo);
            doc.open();
            
            /*Para que no coliciones con la clase IMG de java*/
            com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("src/img/LogoIsraelFull.png");

            Paragraph fecha = new Paragraph();
            
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            Font negritaTable = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.WHITE);
            
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("\n\nBoleta: 1"+"\nFecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n\n");
          
            
            /*Tabla CLIENTE*/
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado =  new float[]{50f,30f,70f,40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            img.scaleToFit(500, 500); 
            Encabezado.addCell(img);
            
            String ruc ="313123";
            String nom = "Liobreria y Bazar Israel";
            String tel = "47930780478";
            String dir = "Lma";
            String ra =" Vida vida cvida";
            
            Encabezado.addCell("");
            Encabezado.addCell("\n\n\nRuc: "+ ruc + "\nNombre: "+ nom + "\nTelefono: "+ tel + "\nDireccion: " + dir+"\nRazon" +ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            
            /*Tabla CLIENTE*/
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del cliente");
            doc.add(cli);
            
            PdfPTable tablacli = new PdfPTable(4);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{20f,50f,30f,40f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("DNI",negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Nombres",negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("Telefono",negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("Correo",negrita));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
  
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl4);
            
            tablacli.addCell("72842942");
            tablacli.addCell("Ramirez Julio Toralva");
            tablacli.addCell("898989");
            tablacli.addCell("Av ubnion 103 2");
            
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
            float[] Columnaprod = new float[]{35f,35f,35f,20f,20f,20f};
            tablaprod.setWidths(Columnaprod);
            tablaprod.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell pro1 = new PdfPCell(new Phrase("Producto",negritaTable));
            PdfPCell pro2 = new PdfPCell(new Phrase("Marca",negritaTable));
            PdfPCell pro3 = new PdfPCell(new Phrase("Descr.",negritaTable));
            PdfPCell pro4 = new PdfPCell(new Phrase("Precio",negritaTable));
            PdfPCell pro5 = new PdfPCell(new Phrase("Cantidad",negritaTable));
            PdfPCell pro6 = new PdfPCell(new Phrase("Importe",negritaTable));
            
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
            
            for (int i = 0; i < 5; i++) {
                tablaprod.addCell("Leche");
                tablaprod.addCell("Gloria");
                tablaprod.addCell("100mml");
                tablaprod.addCell("12.8");
                tablaprod.addCell("3");
                tablaprod.addCell("56.0");
            }
            
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Efectivo: 12.56");
            info.add("Vuelto: 12.56");
            info.add("Total a pagar: 12.56");
            info.setAlignment(Element.ALIGN_RIGHT);
            
            /*Total a pagar*/
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su compra");
            
            
            
            doc.add(tablacli);
            doc.add(espaciado2);
            doc.add(tablaprod);
            doc.add(info);
            doc.add(mensaje);
            
            
            doc.close();
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear pdf "+ e);
        }
    }
    
     private void pdf(){
        try {
            FileOutputStream archivo;
            File file = new File("src/pdf/venta1.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc,archivo);
            doc.open();
            
            /*Para que no coliciones con la clase IMG de java*/
            com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("src/img/LogoIsrael.png");

            Paragraph fecha = new Paragraph();
            
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura: 1"+"\nFecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n\n");
          
            PdfPTable Encabezado = new PdfPTable(5);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado =  new float[]{20f,30f,70f,40f,40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Encabezado.addCell(img);
            
            String ruc ="313123";
            String nom = "Liobreria y Bazar Israel";
            String tel = "47930780478";
            String dir = "Lma";
            String ra =" Vida vida cvida";
            
            Encabezado.addCell("");
            Encabezado.addCell("Ruc: "+ ruc + "\nNombre: "+ nom + "\nTelefono: "+ tel + "\nDireccion: " + dir+"\nRazon" +ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            doc.close();
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear pdf "+ e.getMessage());
        }
    }
}
