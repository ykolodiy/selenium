package onlinesamples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindSignin {

	WebDriver driver;
	@Test
public void TeststatePages () throws Exception, IOException
	{
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PS1zJo");
	
		  signin();
		
		
		
		List<String> hrefs = new ArrayList<String>();
		List<WebElement> disciplines=driver.findElements(By.tagName("a"));
				
		
		for(int i=0;i<disciplines.size();i++)
				
	{ 
		try { 
				WebElement ele= disciplines.get(i);
	   String href=ele.getAttribute("href");
	   			  if (href.contains("PMDbCategoryID") && !href.contains("logout")) 
	   		 
	   			  {
	   				if (  !hrefs.contains(href) )  {
	   				  	   				  
	   				hrefs.add(href);
	   				System.out.println(ele.getText());
	   			
	   												} 
	   				}
	   			  else {}   			  
		     }
	
		catch (Exception e) {e.getMessage();}
	}
		
		
		
			for ( String hre : hrefs ) {
	   				   try { 
	   					   
	   					   driver.get(hre); 
	   				 System.out.println();
	   				 System.out.println(driver.getCurrentUrl());
	   				 PrintEmpty();
	   				 
	   				
	   				 
	   				 
		   				String j = driver.findElement(By.linkText("2")).getAttribute("href");
		   				    if (j != null && !j.isEmpty()) {
		   				     driver.get(j);
		   				       System.out.println(driver.getCurrentUrl());
		  	   				 PrintEmpty();
		   				    	
		   				    }
		   		    
	   				} catch (Exception t){}

	   				    
	   				}	
			System.out.println(Arrays.toString(hrefs.toArray()));	
	}

	public void PrintEmpty () throws Exception{
		System.out.println("method-------------------------------------------------------------------------------------------");
		List<String> hrefs2 = new ArrayList<String>();
		List<WebElement> disciplines2=driver.findElements(By.tagName("a"));
	
		for(int i=0;i<disciplines2.size();i++)
			
		{ 
			try { 
					WebElement ele2= disciplines2.get(i);
		   String href2=ele2.getAttribute("href");
		   			  if (href2.contains("ProgramId")) 
		   		 
		   			  {  
		   				if (  !hrefs2.contains(href2) )  {
		   				  	   				  
		   				hrefs2.add(href2);
		   				System.out.println(ele2.getText());
		   			
		   				} 
		   				}
		   			  else {}   			  
			     }
		
			catch (Exception e) {e.getMessage();}
		
			
			
		
		
		}
		
		System.out.println(Arrays.toString(hrefs2.toArray()));
		for ( String hre2 : hrefs2 ) { driver.get(hre2); 
		clickall();		}
	
	}
	
	
	
	public void clickall () throws Exception{
		List<String> hrefs3 = new ArrayList<String>();
		List<WebElement> disciplines3=driver.findElements(By.tagName("a"));
	
		for(int i=0;i<disciplines3.size();i++)
			
		{ 
			try { 
					WebElement ele3= disciplines3.get(i);
		   String href3=ele3.getAttribute("href");
		   			  if (href3.contains("ProgramId") && !href3.contains("logout") && !href3.contains("my_account")) 
		   		 
		   			  {  
		   				if (  !hrefs3.contains(href3) && !href3.contains("#access") && !href3.contains("AccessibleRepLocatorAction"))  {
		   				  	   				  
		   				hrefs3.add(href3);
		   				System.out.println(ele3.getText());
		   				System.out.println(href3);
		   				
	
		   				} 
		   				}
		   			  else {}   			  
			     }
		
			catch (Exception e) {e.getMessage();
			}
		
			
			
		
		
		}
		
		for (String j : hrefs3) {driver.get(j);
Thread.sleep(5000);

}
	
		
		
		
	}
	
	
	
	
	
	
	public void signin () {
		
		driver.findElement(By.id("inlineLogin")).click();
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("passwd")).sendKeys("");
		driver.findElement(By.xpath(".//*[@value='Log In']")).click();
		driver.findElement(By.xpath(".//*[@value='Return to the site']")).click();
		
		
	}
	
	
//	public void embedded () {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement d = wait.until(
//		        ExpectedConditions.visibilityOfElementLocated(By.tagName("embed")));
//		if (d.getText().contains("pdf")) {
//				System.out.println(d.getAttribute("src"));
//				}
//		}
		
		
	
	
	



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
