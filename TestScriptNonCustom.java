//read data by JXL. check all state pages
package exceltry;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;


public class TestScriptNonCustom {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//specify location
		File src = new File ("C:/1/custom8.xls");
		//load excel file
		Workbook wb = Workbook.getWorkbook(src);
		//get cell
		System.out.println("Those states were tested:");
		for (int i=0; i<50; i++) {
		
		String data00 = wb.getSheet(0).getCell(0,i).getContents();
		
		driver.get(data00);
		
		
		System.out.println((i+1)+ " " + driver.getTitle());
		
		
		}		
		
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}