package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BendAidFixDanielle {

	WebDriver driver;
	
	  @BeforeClass
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver  = new ChromeDriver();}
	
	  @AfterClass
	  public void afterMethod() {
		  driver.close();}

	@Test(dataProvider="multi-param")
	public void mytest (String a) throws Exception {

			driver.get("https://www.pearsonschool.com/index.cfm?locator=PS2vW2");
	
			driver.findElement(By.id("prog_input")).sendKeys(a);
			
			driver.findElement(By.id("prog_submit")).click();
	
			int Programs = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/div[5]/div[1]/ul/li[2]")).getText().replaceAll("[^0-9]", ""));
			int Products = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/ul/li[2]/a/span")).getText().replaceAll("[^0-9]", ""));
			int ServicesOffering = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/ul/li[3]/a/span")).getText().replaceAll("[^0-9]", ""));
			int ServicesISBN = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/ul/li[4]/a/span")).getText().replaceAll("[^0-9]", ""));
			int Pages = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/ul/li[5]/a/span")).getText().replaceAll("[^0-9]", ""));
			
		
			System.out.println(a);	
			System.out.println("Programs:" +Programs);
			System.out.println("Products:" +Products);
			System.out.println("ServicesOffering:" +ServicesOffering);
			System.out.println("ServicesISBN:" +ServicesISBN);
			System.out.println("Pages:" +Pages);
			
			
}

	// 
  @DataProvider(name="multi-param")
  public Object[][] dpMultiParam() {
      return new Object[][]{
              {"Literacy"},
              {"Math"}
       
			};
  }

}
