//read data by JXL. check all state pages
package exceltry;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import jxl.Workbook;


public class TestScript4html {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new HtmlUnitDriver();
		//specify location
		File src = new File ("C:/Test5.xls");
		//load excel file
		Workbook wb = Workbook.getWorkbook(src);
		//get cell
		System.out.println("Those states were tested:");
		for (int i=0; i<186; i++) {
		
		String data00 = wb.getSheet(0).getCell(0,i).getContents();
		
		driver.get(data00);
		
		System.out.println((i+1)+ " " + driver.getTitle());
		
		
		}		
		
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}