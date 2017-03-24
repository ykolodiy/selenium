package alfresco;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PuttoPMDB {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://k12cms./login.cfm");
			
			driver.findElement(By.name("login")).sendKeys("");
			driver.findElement(By.name("password")).sendKeys("");
			driver.findElement(By.xpath("//*[@type='image']")).submit();
			
			Thread.sleep(1200);
			
					
					File src = new File ("C:\\Users\\vkoloyu\\pmdb.xlsx");
					FileInputStream fis = new FileInputStream (src);
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet1 = wb.getSheetAt(0);
					
					for (int i=0; i<50; i++) {
					String data = sheet1.getRow(i).getCell(0).getStringCellValue(); 
			//search isbn
						driver.findElement(By.id("keyword")).sendKeys(data);
			//click what found
						driver.findElement(By.xpath("//ul[@role='listbox']/li/a")).click();
						Thread.sleep(800);
			//assets
						driver.findElement(By.linkText("Assets")).click();
						Thread.sleep(800);
						if (!driver.findElement(By.linkText("Remove")).isDisplayed()){ 
						
						
						//select file
						driver.findElement(By.xpath("//input[@name='new_file_3']")).click();
						Thread.sleep(800);
						
						String t = "C:\\Users\\vkoloyu\\alfrescoPDF\\03_10_2017\\50\\PNG\\";
						//start autoit to insert url
						
						//Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt.exe");
						
						Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt2.exe"+" "+t+data+".png");
						Thread.sleep(800);
						//submit
						//driver.findElement(By.xpath("//input[@name='submit_upload_file_3']")).click();
						Thread.sleep(800);
						} else {System.out.println("manually this isbn " +data);}
						
					
						
					}
						
				wb.close();		
						
	}

}
