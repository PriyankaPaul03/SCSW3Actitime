package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
			Properties p= new Properties();
			p.load(fis);
			String value=p.getProperty(key);
			return value;
		}
		
	public String getExcelValue(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			return data;
		}
		


}
