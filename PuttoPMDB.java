package alfresco;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PuttoPMDB {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("");
			
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
						Thread.sleep(1100);
			//assets
						driver.findElement(By.linkText("Assets")).click();
						Thread.sleep(2000);
						
						
						WebElement r = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/form/table[2]/tbody/tr[7]/td[2]"));
						if (r.getText().contains("No file currently loaded.")){
					
						
							
						//select file
						driver.findElement(By.xpath("//input[@name='new_file_3']")).click();
						Thread.sleep(1100);
						
						String t = "C:\\Users\\vkoloyu\\alfrescoPDF\\03_17_2017\\50\\PNG\\";
						//start autoit to insert url
					
						Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt2.exe"+" "+t+data+".png");
						Thread.sleep(1100);
						//submit
						driver.findElement(By.xpath("//input[@name='submit_upload_file_3']")).click();
						Thread.sleep(1100);
						System.out.println(data);
						}
						
						else {
							driver.findElement(By.linkText("Remove")).click();
							Thread.sleep(1100);
							driver.navigate().refresh();
							Thread.sleep(1100);
						
							driver.findElement(By.xpath("//input[@name='new_file_3']")).click();
							Thread.sleep(1100);
							
							String t = "C:\\Users\\vkoloyu\\alfrescoPDF\\03_17_2017\\50\\PNG\\";
							//start autoit to insert url
						/* autoit script
ControlFocus("Open" , "" , "Edit1")
ControlSetText ("Open", "", "Edit1", $CmdLine[1])
ControlClick ("Open", "", "Button1")
							
							
							
							
							
							*/
							Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt2.exe"+" "+t+data+".png");
							Thread.sleep(1100);
							//submit
							driver.findElement(By.xpath("//input[@name='submit_upload_file_3']")).click();
							Thread.sleep(1100);
							System.out.println(data);
						
						
						}
						
					
					
					}
						
				wb.close();		
				driver.close();		
	}

}
