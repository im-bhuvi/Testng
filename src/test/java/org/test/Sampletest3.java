package org.test;



import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.XMLBeanXSTCHarness;
import org.bass.Bassclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sampletest3 extends Bassclass {
	@BeforeClass
	private void beforeclass() {
	//	browserlaunch("chrome");
	//	timesout(5);
		System.out.println("beforeclassC");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclassC");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethodC");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethodC");
	}
	
	@Test
	private void test1() throws IOException, AWTException, InterruptedException {
	//	url("https://www.facebook.com/");
	
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Guied\\XLsheet\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(fi);
		
		Sheet sheet = w.getSheet("names");
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
	
		
		int cellType = cell.getCellType();
		System.out.println(cellType);
		
		if (cellType==1) {
			RichTextString CellValue = cell.getRichStringCellValue();
			System.out.println(CellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			
			long num=(long)numericCellValue;
			String valueOf = String.valueOf(num);
			System.out.println(valueOf);
			
			}
		}
			
		}

	
	


