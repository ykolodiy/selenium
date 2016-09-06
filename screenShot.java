package screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {

	@Test
	public void screenshot() throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PSZu64");
		
		utility.capture(driver, "literacy");
		
		
		//taking screen shot
		
	
		
		driver.quit();
	}

}
