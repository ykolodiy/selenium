package slider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.airbnb.com/s/Rome--Lazio?source=ds&page=1&s_tag=dyoJQyR-&allow_override%5B%5D=");
   driver.manage().window().maximize();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		
		
		Actions a = new Actions (driver)
				.dragAndDropBy(driver.findElement(By.xpath("//*[@id='site-content']/div/div[1]/div[1]/div/div/div/div[4]/div/div[2]/div/div/div[2]/button[1]")), 200, 0)
				.dragAndDropBy(driver.findElement(By.xpath("//*[@id='site-content']/div/div[1]/div[1]/div/div/div/div[4]/div/div[2]/div/div/div[2]/button[2]")), -100, 0)	
				
				;
		a.build().perform();
		
		
		
		
	}

}
