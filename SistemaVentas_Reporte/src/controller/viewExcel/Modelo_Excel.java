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
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Daniel
 */
public class Modelo_Excel {

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
