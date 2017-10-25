package HeadlessALL;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PNP {
	WebDriver driver;
	String u = "https://www.pearsonschool.com/index.cfm?locator=PS1t3p";
	
	
	  @Test (priority=1)
	  public void acorn1() {
		  Cookie name = new Cookie("LB", "acorn1");
			driver.manage().addCookie(name);
			driver.get(u);
			Assert.assertEquals(driver.getTitle(), "Private and Parochial");
			 
		  
	  }
	  
	  @Test (priority=2)
	  public void acorn2() {
		  Cookie name = new Cookie("LB", "acorn2");
			driver.manage().addCookie(name);
			driver.get(u);
			Assert.assertEquals(driver.getTitle(), "Private and Parochial");
			 
		    
	  }
	  
	  
	  @Test (priority=3)
	  public void acorn3() {
		  Cookie name = new Cookie("LB", "acorn3");
			driver.manage().addCookie(name);
			driver.get(u);
			Assert.assertEquals(driver.getTitle(), "Private and Parochial");
			 
		  
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		// Declaring and initialize  HtmlUnitWebDriver
			driver = new HtmlUnitDriver();
			driver.get(u);
			
	  }

	  @AfterMethod
	  public void afterMethod(ITestResult result) {
		  
		   
		  
		  Set<Cookie> cookiesList =  driver.manage().getCookies();
			for(Cookie getcookies :cookiesList) {
				
				if (getcookies.getName().contains("LB")) {
			    System.out.print(getcookies.getName() +"  "+ getcookies.getValue() + " PNP");
				}else {}
			}
			
			
			if (result.getStatus() == ITestResult.SUCCESS) {
				System.out.println("");
			   } 
			
			if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println(" >>> failed ");
			   } 
			
			if (result.getStatus() == ITestResult.SKIP) {
				System.out.println(" >>> skipped ");
			   } 
		  driver.close();
	  }

	}