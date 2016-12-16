package playground;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConractUs2 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eeetest.co.nf/2.html");
		
		
		// ((JavascriptExecutor)driver).executeScript("driver.findElement(By.xpath('//div[@id='rf_usRepInstitutesPanel']')).style.display = 'show'");
		((JavascriptExecutor)driver).executeScript("document.getElementById('e').style.color = 'yellow'");
		
	
	
		
	}
	
	
	
	
	
	

}
