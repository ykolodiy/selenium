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

public class FindNoImagesSamples2 {

	WebDriver driver;
	@Test
public void TeststatePages () throws Exception, IOException
	{
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PS1zJo");
		List<String> hrefs = new ArrayList<String>();
		List<WebElement> disciplines=driver.findElements(By.tagName("a"));
				
		
		for(int i=0;i<disciplines.size();i++)
				
	{ 
		try { 
				WebElement ele= disciplines.get(i);
	   String href=ele.getAttribute("href");
	   			  if (href.contains("PMDbCategoryID") && !href.contains("logout")) {
	   				hrefs.add(href);
	   				System.out.println(ele.getText());
	   						  				  }
	   			  else {}   			  
		}
	
		catch (Exception e) {e.getMessage();}
	}
		
		
		
			for ( String hre : hrefs ) {
	   				    driver.get(hre); 
	   				       System.out.println(driver.getCurrentUrl());
	   				 PrintEmpty();
	   				 
	   				try {
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
			
	
	
	
	public void PrintEmpty (){
		
		//Start this will find empty urls	
	List<WebElement> links=driver.findElements(By.tagName("IMG"));
				for(int i=0;i<links.size();i++)
			{  WebElement ele= links.get(i);
			   String src=ele.getAttribute("SRC");
			   			  if (src.equals("http://assets.pearsonschool.com/prodImages/")) {
				  System.out.println(driver.getCurrentUrl() + " FUCKED");
						  }
			   			  else {System.out.println(".");}   			  
			
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
