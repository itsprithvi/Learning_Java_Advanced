package fileReadWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FileIOExcel {
    public static void main(String[] args) {
        try {
            // Writing data to an Excel file
            Workbook writeWorkbook = new XSSFWorkbook();
            FileOutputStream fileOut = new FileOutputStream("output.xlsx");
            Sheet writeSheet = writeWorkbook.createSheet("Sheet1");

            // Create a row and write data to it
            Row writeRow = writeSheet.createRow(0);
            Cell writeCell = writeRow.createCell(0);
            writeCell.setCellValue("Hello");
            writeCell = writeRow.createCell(1);
            writeCell.setCellValue("World");

            // Create another row with different data
            writeRow = writeSheet.createRow(1);
            writeCell = writeRow.createCell(0);
            writeCell.setCellValue("Java");
            writeCell = writeRow.createCell(1);
            writeCell.setCellValue("Excel");

            writeWorkbook.write(fileOut); // Write the workbook to the output file
            fileOut.close(); // Close the output stream

            // Reading data from the Excel file
            FileInputStream file = new FileInputStream("output.xlsx");
            Workbook readWorkbook = new XSSFWorkbook(file);
            DataFormatter dataFormatter = new DataFormatter();

            Iterator<Sheet> sheets = readWorkbook.sheetIterator();
            while (sheets.hasNext()) {
                Sheet readSheet = sheets.next();
                System.out.println("Sheet Name: " + readSheet.getSheetName());

                Iterator<Row> rows = readSheet.iterator();
                while (rows.hasNext()) {
                    Row readRow = rows.next();

                    // Iterate over cells in the row
                    Iterator<Cell> cells = readRow.iterator();
                    while (cells.hasNext()) {
                        Cell cell = cells.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
                        System.out.print(cellValue + "\t");
                    }
                    System.out.println(); // Move to the next line for the next row
                }
            }

            file.close(); // Close the input stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
