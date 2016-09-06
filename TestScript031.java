//read data by JXL. check all DISCIPLINES
package exceltry;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;


public class TestScript031 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//specify location
		File src = new File ("C:/TestData.xls");
		//load excel file
		Workbook wb = Workbook.getWorkbook(src);
		//get cell
		System.out.println("Those disciplines were tested:");
		for (int i=0; i<14; i++) 
		
		{     
		String data00 = wb.getSheet(0).getCell(2,i).getContents();
		driver.get(data00);
		String Currenturl = driver.getCurrentUrl();
		System.out.println((i+1)+ " " +driver.getTitle() + " " +Currenturl);   
		}
										
		
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}