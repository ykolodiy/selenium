package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Run {
	
	WebDriver driver = new ChromeDriver();
	
	public void run(String email2, String pass2) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		String email = email2;
		String pass = pass2;
		
		
		
		//driver.get("http://www.pearsonschool.com/index.cfm?locator=PS1zJo");
		//driver.findElement(By.id("inlineRegister")).click();
		driver.get("https://www.pearsonschool.com/profile.cfm?pageref=register&csURL=http%3A%2F%2Fwww%2Epearsonschool%2Ecom%2Findex%2Ecfm&csURLVars=csu%5Flocator%3DPS1zJo&group_id=1&app_id=7");
		driver.findElement(By.id("fname")).sendKeys("jfksfdbskdh");
		driver.findElement(By.id("lname")).sendKeys("akdjfksfdb");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("city_or_zip")).sendKeys("60622");
		driver.findElement(By.xpath("//a[contains(.,'search')]")).click();
		Thread.sleep(1500);
		Select school = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/form/p[6]/select")));
		Thread.sleep(1500);
		school.selectByIndex(2);
		Thread.sleep(1500);
		driver.findElement(By.id("agree")).click();
		
		driver.findElement(By.id("passwd")).sendKeys(pass);
		driver.findElement(By.id("passwd_confirm")).sendKeys(pass);
		
		driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
		
		String done = driver.findElement(By.xpath("//h3[contains(.,'Thank you for registering')]")).getText();
		
		
		System.out.println (done);
		System.out.println ("Your email: " +email);
		System.out.println ("Your pass: " +pass);
		
		driver.findElement(By.xpath("//input[@value='Return to the site']")).click();
		
	
		
		
		
		
		
		
	}
}
