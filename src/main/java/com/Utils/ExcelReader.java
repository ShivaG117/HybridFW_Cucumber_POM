package com.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	
	public List<Map<String, String>> getAllData(String file, String sheet) {
		List<Map<String, String>> excelData = new ArrayList<>();
		DataFormatter formatter = new DataFormatter();
		
		try {
			FileInputStream ip = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(ip);
			Sheet sh = wb.getSheet(sheet);
			
			Row header = sh.getRow(0);
			int rows = sh.getLastRowNum();
			int columns = sh.getRow(0).getLastCellNum();
			
			for(int i=1; i<rows; i++) {
				Map<String, String> rowData = new HashMap<>();
				Row row = sh.getRow(i);
				for(int j=0; j<columns; j++) {
					Cell cell = row.getCell(j);
					String value = formatter.formatCellValue(cell);
					rowData.put(header.getCell(j).toString(), value);
				}
				excelData.add(rowData);
			}
			wb.close();
			ip.close();
			
		} catch (IOException | EncryptedDocumentException e) {
			e.printStackTrace();
		}
		return excelData;
	}

}
