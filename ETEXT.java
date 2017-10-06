package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ETEXT {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File src = new File ("C:\\Users\\vkoloyu\\c.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);


		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		
		driver.get("https://www.pearsonschool.com/profile.cfm?pageref=login&csURL=http%3A%2F%2Fwww%2Epearsonschool%2Ecom%2Findex%2Ecfm&csURLVars=csu_locator%3DPS1zJo%26csu_PMDbProgramId%3D56481&group_id=1&app_id=7");
		driver.findElement(By.id("email")).sendKeys("web.test@pearson.com");
		driver.findElement(By.id("passwd")).sendKeys("welcome");
		driver.findElement(By.xpath("//*[@id='profileForm']/p[4]/input")).click();
		
		for (int i=391; i<=rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			//System.out.println (data0);
			
			driver.get(data0);
			
			Thread.sleep(9000);
			try {
			driver.switchTo().frame(0);
			Thread.sleep(3000);
			
				if (driver.findElements(By.xpath("//*[@id='_loginName']")).size() != 0) {
					
					sheet1.getRow(i).createCell(4).setCellValue("sign in");
					FileOutputStream fout = new FileOutputStream (src);
					wb.write(fout);	
					System.out.println(" sign in");
					
				} else {
					sheet1.getRow(i).createCell(4).setCellValue("passed");
					FileOutputStream fout = new FileOutputStream (src);
					wb.write(fout);	
					
					
					
				}
		
       
			
			}
			catch (Exception e ){}
			

		}

		wb.close();
		driver.close();



	}

}

/*
 * http://www.pearsonschool.com/index.cfm?locator=PS2xOw&isFrame=1&action=&testId=tpiSamples&sampleId=6861


http://www.pearsonschool.com/index.cfm?locator=PS1zJo&PMDbProgramId=56481
 * 
 * 
 * */
