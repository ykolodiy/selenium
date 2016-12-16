package playground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConractUs {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PSZ13f");
		driver.findElement(By.xpath("//a[@class='contactIcon']")).click();
		driver.findElement(By.id("rf_contactSalesRep")).click();
	
		
		
		WebDriverWait wait = new WebDriverWait(driver, 9);
		WebElement contactrep = wait.until(ExpectedConditions.elementToBeClickable(By.id("rf_usRepFinder")));
				contactrep.click();
		
		WebElement zipcode = wait.until(ExpectedConditions.elementToBeClickable(By.name("cityOrZip")));
		zipcode.sendKeys("60622");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rf_usRepInstitutes")));
		Select dropdown = new Select(driver.findElement(By.id("rf_usRepInstitutes")));
		List<WebElement> i = dropdown.getOptions();
		
		System.out.println("number of schools: " +i.size());
		System.out.println("*********************************************");
		int u=0;
		for (WebElement option : i) {System.out.println (u+" " +option.getText());  u++; }
		
		System.out.println("*********************************************");
		
		
		
		for (int z=2; z<i.size(); z++) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rf_usRepInstitutes")));
		dropdown.selectByIndex(z);	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='rf_usRepDataPanel']/div")));
		System.out.println(driver.findElement(By.xpath("//div[@id='rf_usRepDataPanel']/div")).getText() + "  ");	
		System.out.println("__________________________________");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@id='rf_usRepInstitutesPanel']"));
		js.executeScript("arguments[0].setAttribute('style', 'display:show')",element);
		}
		
		
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("rf_usRepReset")));
//		driver.findElement(By.id("rf_usRepReset")).click();
	
		
	}
}
