package onlinesamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindNoImagesSamples {

	WebDriver driver;
	@Test
public void TeststatePages () throws Exception, IOException
	{
		File src = new File ("C:\\Users\\vkoloyu\\d.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);


		int rowcount = sheet1.getLastRowNum();
	
		try {
		
		for (int i=0; i<=rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			//System.out.println (data0);
			
			driver.get(data0);
			PrintEmpty ();

}
		}
		catch (Exception e) {}
		
		wb.close();
		
	
				}
			
	
			
			
			


	
	
	
	
	
	
	public void PrintEmpty (){
		
		//Start this will find empty urls	
	List<WebElement> links=driver.findElements(By.tagName("IMG"));
				for(int i=0;i<links.size();i++)
			{  WebElement ele= links.get(i);
			   String src=ele.getAttribute("SRC");
			   			  if (src.equals("http://assets.pearsonschool.com/prodImages/")) {
				  System.out.println(driver.getCurrentUrl() + " FUCKED");
						  }
			   			  else {}   			  
			
			}
						//End this will find empty urls	
		
		
	}
	
	
	
	







@BeforeClass
public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
	
		
}

@AfterClass
public void afterMethod() {
			  driver.close();
}



}
