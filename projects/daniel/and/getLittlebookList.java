package Search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLittlebookList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
		WebDriver driver  = new ChromeDriver();
	
		String x = "https://www.pearsoncanadaschool.com/index.cfm?q=&PMDbSiteId=6363&PMDbSolutionId=85160&locator=PS2yTk&stateCodeId=NATL&srchCId=littlebookProducts&sr=";
	int y;
	
	for (y=0; y<=1700; y=y+50)
		
	{
		
		driver.get(x+y);

	
	List <WebElement> a = driver.findElements(By.xpath("//*[@class='rollupThumb ']"));
	
	for (WebElement b : a) {
		
		b.getText();
		System.out.println(b.getText().replaceAll("\\(.*\\)", ""));
		
	}	
		
	}

	
	driver.close();
	}

}
