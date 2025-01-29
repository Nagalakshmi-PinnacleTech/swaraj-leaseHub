package com.swaraj.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelOperationDDT {
	
	private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;
 
    public static Object[][] getTestData(String excelPath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        Iterator<Row> rowIterator = sheet.iterator();
        
        // Skip header row
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }

        List<Object[]> data = new ArrayList<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String username = getCellValue(row.getCell(0));
            String password = getCellValue(row.getCell(1));
            String expectedResult = getCellValue(row.getCell(2));
            
            data.add(new Object[]{username, password, expectedResult});
        }
        
        workbook.close();
        file.close();
        
        return data.toArray(new Object[0][]);
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((int) cell.getNumericCellValue());
            default:
                return "";
        }
    }
}


