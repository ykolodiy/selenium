package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSometoExcel {

	public static void main(String[] args) throws Exception {
		File src = new File ("C:\\Users\\vkoloyu\\a.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);


		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0; i<=rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.print (data0);

			sheet1.getRow(i).createCell(2).setCellValue(data0 +"keep");
			FileOutputStream fout = new FileOutputStream (src);
			wb.write(fout);

		}

		wb.close();



	}

}
