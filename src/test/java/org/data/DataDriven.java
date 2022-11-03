package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven  {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\91936\\eclipse-workspace\\Maven_Sample\\src\\test\\resources\\Excel\\Adactin Testdata.xlsx");
FileInputStream st=new FileInputStream(f);
Workbook W=new XSSFWorkbook(st);
Sheet s=W.getSheet("Sheet1");
Row r = s.getRow(1);
org.apache.poi.ss.usermodel.Cell c = r.getCell(1);
System.out.println(c);
}
}
