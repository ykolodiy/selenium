package hybrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

WebDriver driver;
	
	@BeforeClass
	public void setupApplication (){
		Reporter.log("===browser session started===", true);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://enterprice.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		Reporter.log("===application session started===", true);
	}
	
	
	
	
	@AfterClass
	public void closeApplication (){
		
		driver.quit();
		Reporter.log("===browser session end===", true);
	}
	
	
	
	
	
	
}
