package playground;
// write to excel file
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Play2 {

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
				
		String em = "fskjetorkiuf@sdf.df";
		
		for (int i=1; i<10; i++)
		
		{
		sheet1.createRow(i).createCell(0).setCellValue(i+em);
	
		FileOutputStream fout = new FileOutputStream (src);
		wb.write(fout);
		}
		
		
		
		wb.close();
		}
		
		
		
		
		
		
		
	}


