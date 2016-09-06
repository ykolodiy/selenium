package writeExcel;
// tut chytajem excel wse by loop
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apachepoi2 {

	// read playing with for loop
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// apache POI
		//locate file
		File src = new File ("C:\\Users\\vkoloyu\\test.xlsx");
		//input stream class
		FileInputStream fis = new FileInputStream (src);
		//load full workbook XSSF by xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//focus on sheet1 index0
		XSSFSheet sheet1 = wb.getSheetAt(0);
	//row1 col1
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0; i<rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.print (data0);
			
			System.out.println (" data from row " +i+ "is " +data0);
			
			
			
			
			
		}
		
		
		wb.close();
	}


}