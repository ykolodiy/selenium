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

public class BendAirCanadaLittleBooks {

	WebDriver driver;
	
	  @BeforeClass
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver  = new ChromeDriver();}
	
	  @AfterClass
	  public void afterMethod() {
		  driver.close();}

	@Test
	public void mytest () throws Exception {

			
			try (BufferedReader br = new BufferedReader(new FileReader("C://tmp//lb.txt"))) {
			   
					String line;
					while ((line = br.readLine()) != null) {
			            driver.get("https://www.pearsoncanadaschool.com/index.cfm?locator=PS2yTk&srchCId=littlebookProducts&q="+line);
					
				
						int Products = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/div[2]/div[1]/ul/li[2]")).getText().replaceAll("[^0-9]", ""));
					
					
						System.out.print(line);	
						System.out.println(" >>Products:" +Products);

					}

				
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			
		
		
			
			
}



}
