package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day1Excel {

	public static void main(String[] args) throws IOException {
		// loc of the file
		File loc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\PracticeOnline\\Input\\TestData.xlsx");
		// Read the file
		FileInputStream fi = new FileInputStream(loc);
		// Type of workbook
		Workbook w = new XSSFWorkbook(fi);
		// sheetName
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		System.out.println(c);
		int cellType = c.getCellType();
		System.out.println(cellType);
		// cellType 1-->String,0-->Date,Number
		

	}
}