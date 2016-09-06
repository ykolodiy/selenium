package writeExcel;
//tut zapysujem w eksel
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

		//WRITING!!!!!!!!!!!!!!!!!!!!
		driver.get("http://www.yahoo.com");
		String title = driver.getTitle();
		sheet1.getRow(0).createCell(2).setCellValue(title);
		
		//saving file
		FileOutputStream fout = new FileOutputStream (src);
		wb.write(fout);
		
		driver.quit();
		
		
		wb.close();
	}

}
