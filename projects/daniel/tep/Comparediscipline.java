package tepCommergent;

//compare grade levels

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Comparediscipline {
	WebDriver driver;
	
	  @BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver  = new ChromeDriver();}
	
	  @AfterClass
	  public void afterClass() {
		  driver.close();}
	  
	  
	  
	  @Test
		public void Literacy () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu68");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
		
			
			System.out.println("Literacy");
			for (int i = 0; i< links.size(); i++) 
			{
			
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	   
	  
	  @Test
		public void Math () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu6e");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));

			System.out.println("Math");
			for (int i = 0; i< links.size(); i++) 
			{
				
				System.out.println(links.get(i).getText());
				
				
			}
	   }


	  
	  
	  @Test
		public void Science () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu6g&PMDbSiteId=2781&PMDbSolutionId=6724&PMDbSubSolutionId=&PMDbCategoryId=814");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));

			
			System.out.println("Science");
			for (int i = 0; i< links.size(); i++) 
			{
			
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	  

	  
	  @Test
			public void Social () throws Exception 
		  {
			    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu4y");
				List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
			
				
				System.out.println("Social");
				for (int i = 0; i< links.size(); i++) 
				{
				
					System.out.println(links.get(i).getText());
					
					
				}
		   }
	  

	  
	  @Test
		public void WorldLanguages  () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu6r");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
	
			
			System.out.println("WorldLanguages");
			for (int i = 0; i< links.size(); i++) 
			{
		
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	  
	
	  
	  
	  @Test
		public void Honors  () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu6t&PMDbSiteid=2781&PMDbSolutionid=6724&PMDbSubSolutionid=&PMDbCategoryid=811&&");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
	
			
			System.out.println("Honors");
			for (int i = 0; i< links.size(); i++) 
			{
		
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	  
	  
	  
	  
	  @Test
		public void ELL  () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu72&PMDbSiteId=2781&PMDbSolutionId=6724&PMDbSubSolutionId=&PMDbCategoryId=1662");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
	
			
			System.out.println("ELL");
			for (int i = 0; i< links.size(); i++) 
			{
		
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	  
	  
	  @Test
		public void Career   () throws Exception 
	  {
		    driver.get("https://www.pearsonschool.com/index.cfm?locator=PSZu7z&PMDbSiteId=2781&PMDbSolutionId=6724&PMDbCategoryId=812");
			List<WebElement> links=driver.findElements(By.xpath("//*[@class='framedContentAreaTitleContent']/h3"));
	
			
			System.out.println("Career ");
			for (int i = 0; i< links.size(); i++) 
			{
		
				System.out.println(links.get(i).getText());
				
				
			}
	   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
			

	}


