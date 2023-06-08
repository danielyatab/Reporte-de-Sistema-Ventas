/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.viewExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Daniel
 */
public class Modelo_Excel {

    Workbook wb;
    boolean importacion = false;
    boolean exportacion = false;

    public boolean importar(File archivo, JTable tabla) {
        DefaultTableModel modelo_met = new DefaultTableModel();
        tabla.setModel(modelo_met);
        try {
            wb = WorkbookFactory.create(new FileInputStream(archivo));//Ingresamos el archivo para verificar que sea el excel
            Sheet hoja = wb.getSheetAt(0); //Escaneo del excel 
            Iterator iterator = hoja.rowIterator();// almacen de filas del excel
            int indice_fila = -1;
            while (iterator.hasNext()) { // cada fila entrara aqui
                indice_fila++;
                Row fila = (Row) iterator.next();//alamacen de la fila numero indice
                Iterator columna_iterator = fila.cellIterator();// guardado de columna
                Object[] listaColumna = new Object[5];
                int indice_columna = -1;
                while (columna_iterator.hasNext()) { //Cada columna de la fila entrara aqui
                    indice_columna++;
                    Cell celda = (Cell) columna_iterator.next(); //almacen
                    if (indice_fila == 0) {
                        modelo_met.addColumn(celda.getStringCellValue()); //LLenado de los titulos osea la fila 1 
                    } else {
                        //Verificacion del tipo de dato a almacenar
                        if (celda != null) {
                            switch (celda.getCellType()) {
                                case NUMERIC:
                                    listaColumna[indice_columna] = (int) Math.round(celda.getNumericCellValue());
                                    break;
                                case STRING:
                                    listaColumna[indice_columna] = celda.getStringCellValue();
                                    break;
                                case BOOLEAN:
                                    listaColumna[indice_columna] = celda.getBooleanCellValue();
                                    break;
                                default:
                                    listaColumna[indice_columna] = celda.getDateCellValue();
                            }
                        }

                    }
                }
                //Agregado de todo la fila de elementos a la tabla        
                if (indice_fila != 0) {
                    modelo_met.addRow(listaColumna);
                }
            }
            importacion = true;
            System.out.println("Importacion exitosa");
        } catch (Exception e) {
            System.out.println("ERROR AL IMPORTAR" + e.getMessage());
        }
        return importacion;
    }

    /*public boolean exportacion(File archivo, JTable tabla, int numColumna) {

        int numFila = tabla.getRowCount();
        int numColum = numColumna;

        if (archivo.getName().endsWith("xlsx")) {
            wb = new XSSFWorkbook(); // Excel moderno
        } else {
            wb = new HSSFWorkbook(); // Excel antiguo
        }

        Sheet hoja = wb.createSheet("Pruebita");

        // Estilo para los bordes
        CellStyle estiloBordes = wb.createCellStyle();
        estiloBordes.setBorderTop(BorderStyle.THIN);
        estiloBordes.setBorderBottom(BorderStyle.THIN);
        estiloBordes.setBorderLeft(BorderStyle.THIN);
        estiloBordes.setBorderRight(BorderStyle.THIN);

        // Estilo para la cabecera
        CellStyle estiloCabecera = wb.createCellStyle();
        estiloCabecera.setBorderTop(BorderStyle.THIN);
        estiloCabecera.setBorderBottom(BorderStyle.THIN);
        estiloCabecera.setBorderLeft(BorderStyle.THIN);
        estiloCabecera.setBorderRight(BorderStyle.THIN);

        // Colores para la cabecera
        IndexedColors[] coloresCabecera = {IndexedColors.LIGHT_BLUE, IndexedColors.LIGHT_CORNFLOWER_BLUE};
        int indiceColor = 0;

        try {
            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i + 1);
                for (int j = 0; j < numColum; j++) {
                    Cell celda = fila.createCell(j);
                    if (i == -1) {
                        celda.setCellValue(String.valueOf(tabla.getColumnName(j)));
                        estiloCabecera.setFillForegroundColor(coloresCabecera[indiceColor].getIndex());
                        estiloCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        celda.setCellStyle(estiloCabecera);
                        indiceColor = (indiceColor + 1) % coloresCabecera.length;
                    } else {
                        celda.setCellValue(String.valueOf(tabla.getValueAt(i, j)));
                    }
                    celda.setCellStyle(estiloBordes);
                }
            }

            wb.write(new FileOutputStream(archivo));
            exportacion = true;
        } catch (Exception e) {
            System.out.println("Error al exportar: " + e);
        }
        return exportacion;
    }*/
    
    public boolean exportacion(File archivo, JTable tabla, int numColumna) {
        boolean exportacionExitosa = false;

        try (FileOutputStream fos = new FileOutputStream(archivo)) {
            int numFila = tabla.getRowCount();
            int numColum = numColumna;

            Workbook wb;
            if (archivo.getName().endsWith("xlsx")) {
                wb = new XSSFWorkbook(); // Excel moderno
            } else {
                wb = new HSSFWorkbook(); // Excel antiguo
            }

            Sheet hoja = wb.createSheet("Pruebita");

            // Estilo para los bordes
            CellStyle estiloBordes = wb.createCellStyle();
            estiloBordes.setBorderTop(BorderStyle.THIN);
            estiloBordes.setBorderBottom(BorderStyle.THIN);
            estiloBordes.setBorderLeft(BorderStyle.THIN);
            estiloBordes.setBorderRight(BorderStyle.THIN);

            // Estilo para la cabecera
            CellStyle estiloCabecera = wb.createCellStyle();
            estiloCabecera.setBorderTop(BorderStyle.THIN);
            estiloCabecera.setBorderBottom(BorderStyle.THIN);
            estiloCabecera.setBorderLeft(BorderStyle.THIN);
            estiloCabecera.setBorderRight(BorderStyle.THIN);

            // Colores para la cabecera
            IndexedColors[] coloresCabecera = {IndexedColors.LIGHT_BLUE, IndexedColors.LIGHT_CORNFLOWER_BLUE};
            int indiceColor = 0;

            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i + 1);
                for (int j = 0; j < numColum; j++) {
                    Cell celda = fila.createCell(j);
                    if (i == -1) {
                        celda.setCellValue(String.valueOf(tabla.getColumnName(j)));
                        estiloCabecera.setFillForegroundColor(coloresCabecera[indiceColor].getIndex());
                        estiloCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        celda.setCellStyle(estiloCabecera);
                        indiceColor = (indiceColor + 1) % coloresCabecera.length;
                    } else {
                        celda.setCellValue(String.valueOf(tabla.getValueAt(i, j)));
                    }
                    celda.setCellStyle(estiloBordes);
                }
            }

            wb.write(fos);
            exportacionExitosa = true;
        } catch (IOException e) {
            System.out.println("Error al exportar: " + e);
        }

        return exportacionExitosa;
    }

}
