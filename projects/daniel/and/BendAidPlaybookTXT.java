package Search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BendAidPlaybookTXT {

	WebDriver driver;
	
	  @BeforeClass
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver  = new ChromeDriver();}
	
	  @AfterClass
	  public void afterMethod() {
		  driver.close();}

	@Test
	public void mytest () throws Exception {

			
	
			
			try (BufferedReader br = new BufferedReader(new FileReader("C://tmp//playb.txt"))) {
			   
					String line;
					while ((line = br.readLine()) != null) {
			            driver.get("https://playbook.pearsonschool.com/index.cfm?locator=PS2s2c");
						driver.findElement(By.id("prog_input")).sendKeys(line);
						
						driver.findElement(By.id("prog_submit")).click();
				
						int Programs = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page']/div[1]/div/div[5]/div[1]/ul/li[2]")).getText().replaceAll("[^0-9]", ""));
						int Products = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page']/div[1]/div/ul/li[2]/a/span")).getText().replaceAll("[^0-9]", ""));
						int ServicesOffering = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page']/div[1]/div/ul/li[3]/a/span")).getText().replaceAll("[^0-9]", ""));
						int ServicesISBN = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page']/div[1]/div/ul/li[4]/a/span")).getText().replaceAll("[^0-9]", ""));
						int Pages = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page']/div[1]/div/ul/li[5]/a/span")).getText().replaceAll("[^0-9]", ""));
						
					
						System.out.print(line);	
						System.out.println(" >>Programs:" +Programs);
						//System.out.println("Products:" +Products);
						//System.out.println("ServicesOffering:" +ServicesOffering);
						//System.out.println("ServicesISBN:" +ServicesISBN);
						//System.out.println("Pages:" +Pages);
						//System.out.println();
						
						
					
					
					}

				
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			
		
		
			
			
}



}
