package inventory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://www.pearsonschool.com/index.cfm?locator=PS1j3t";
		driver.get(url);
		
		List <WebElement> li = driver.findElements(By.xpath("//div[contains(@class,'floatRight w155')]/h4"));
		System.out.println("Number of h4 links: "+li.size());
		for(WebElement we : li){
		System.out.println(we.getText());
		
		
		
		
	}

}}
