package playground;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickanyA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PSZ13f");
		
		while (true) {	
		List <WebElement> s = driver.findElements(By.tagName("a"));
		System.out.println("we got: " +s.size() +" links from " +driver.getCurrentUrl());
		
		//if (s.size() == 0) break;
		
		
		
		String l = s.get((new Random()).nextInt(s.size())).getAttribute("href");
		
		if (l == null) continue;
		
		if (!l.startsWith("http://") && !l.startsWith("https://")) continue;
		
		if (s.size() < 6) {driver.navigate().back();} else {
		
		driver.get(l);
															}
		
		}
		
		
		
		
		

	}

}
