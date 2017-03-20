package alfresco;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowmanyfilesExcel {

	public static void main(String[] args) throws Exception{
		File folder = new File("C://Users//vkoloyu//alfrescoPDF//02_24_2017//100//PNG");
		File[] listOfFiles = folder.listFiles();
		 ArrayList <String> al = new ArrayList<String>();
		 
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	  al.add(listOfFiles[i].getName().substring(0, 10));
		        
		        System.out.println(al.get(i));
		      
		      
		    }
		    File src = new File ("C:\\Users\\vkoloyu\\t2.xlsx");
						FileInputStream fis = new FileInputStream (src);
						XSSFWorkbook wb = new XSSFWorkbook(fis);
						XSSFSheet sheet1 = wb.getSheetAt(0);
						
					
			
			for (int row=1; row<60; row++) {
				final DataFormatter df = new DataFormatter();
				final XSSFCell cell = sheet1.getRow(row).getCell(4);
				String isbn = df.formatCellValue(cell);
				
		
				//String isbn = sheet1.getRow(4).getCell(row).getStringCellValue();
				//System.out.println(isbn);
				
				
				
	if (al.get(i).equals(isbn)) {

		System.out.println("f");
			sheet1.getRow(row).createCell(3).setCellValue("3/21/17");
				FileOutputStream fout = new FileOutputStream (src);
					wb.write(fout);
		
	}
			} wb.close();
			
											}
	
	
	}}
