package keyword3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {

	
	
	public static String navigate_to (WebDriver driver, String url)
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get(url);

		driver.manage().window().maximize();
		return null;
		
	}
	
	
	
public static String sendKeys (WebDriver driver, String strLocType, String strLocValue) {
		
		switch (strLocType){
		
		case "id":
			driver.findElement(By.id(strLocValue)).sendKeys(Param1);
			break;
		case "xpath":
			driver.findElement(By.xpath(strLocValue)).sendKeys(Param1);
			break;
		case "linkText":
			driver.findElement(By.id(strLocValue)).sendKeys(Param1);
			break;
		
		}
		Thread.sleep(5000);
		return null;
		
	}
	
	
	
	
	
public static String click_element (WebDriver driver, String strLocType, String strLocValue) throws InterruptedException {
		
		switch (strLocType){
		
		case "id":
			driver.findElement(By.id(strLocValue)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(strLocValue)).click();
			break;
		case "linkText":
			driver.findElement(By.id(strLocValue)).click();
			break;
		
		}
	Thread.sleep(5000);
	return null;}




public static void quit_driver (WebDriver driver) {driver.quit();}




	
}
