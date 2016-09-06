package writeExcel;
// tut chytajem excel
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

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
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data0);
		// row 1 col 2
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data1);
		
		wb.close();
	}

}
