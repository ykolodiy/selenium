package keyword3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDEtoWebdriver extends CommonFunctions
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		navigate_to(driver, "https://blablacar.in");
		
		
		sendKeys(driver, "id", "search_from_name", "thane");
		sendKeys(driver, "id", "search_to_name", "pune");
		
		click_element (driver, "xpath", "//form[@id='search-form']/div[3]/label");
		click_element (driver, "linkText", "21");
		
		click_element (driver, "xpath", "//button[@type='submit']");
		
		click_element (driver, "//input[start-with(@id)]", "dp1466");
		click_element (driver, "linkText", "22");
		
		quit_driver (driver);
		
		
		
	}

}
