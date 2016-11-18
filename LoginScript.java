package hybrid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginScript {

	WebDriver driver;
	
	@BeforeMethod
	public void setupApplication (){
		Reporter.log("===browser session started===", true);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://enterprice.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		Reporter.log("===application session started===", true);
	}
	
	
	
	
	
	@Test
	public void LoginToApplication (){
	
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("===click on login===", true);
		
	}
	
	@AfterMethod
	public void closeApplication (){
		
		driver.quit();
		Reporter.log("===browser session end===", true);
	}
	
	
	
	
}
