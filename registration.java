package registration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		File src = new File ("C:\\Users\\vkoloyu\\test.xlsx");
		//input stream class
		FileInputStream fis = new FileInputStream (src);
		//load full workbook XSSF by xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//focus on sheet1 index0
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		
	Run r = new Run();
	
	
	
	
	for (int i=0; i<3; i++){
	
	String em = (i+"fskjPetorkiuf@sdf.df");
	sheet1.createRow(i+1).createCell(0).setCellValue(em);
	FileOutputStream fout = new FileOutputStream (src);
	wb.write(fout);
	r.run(em, "fghfghghjghk");
	
	
	
	}
	wb.close();
	
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
