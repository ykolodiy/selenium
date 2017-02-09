package E2E;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			String progid = "Literacy";
			driver.manage().window().maximize();
			
		
			driver.get("http://pearsonschool.com");
			//click search button
			driver.findElement(By.xpath("//*[@class='icon-search']")).click();
			//enter the word to search
			driver.findElement(By.xpath("//*[@id='prog_input_header']")).sendKeys(progid);
			//press enter
			driver.findElement(By.xpath("//*[@id='prog_input_header']")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			//select 1st value shown
			driver.findElement(By.xpath("//*[@class='programRollupDisplay']//li[1]/div/a")).click();
			Thread.sleep(2000);
			//click overlay proceed to the page
			driver.findElement(By.xpath("//*[@class='aButton buttonArrowRight']")).click();
			Thread.sleep(1000);
			
			
			System.out.println("Program name: " +driver.findElement(By.xpath(".//*[@class='productName']/a")).getText());
			//click shop link in the program
			driver.findElement(By.linkText("Shop")).click();
			Thread.sleep(1000);
			
			
			
			
			//select firdt grade
			driver.findElement(By.xpath(".//*[@id='progHeader']/div/div/div/div/ul/li[4]/ul/li[2]/a")).click();
			
			
			
			//select amount of some product
			driver.findElement(By.xpath(".//*[@name='cart_quantity1']")).sendKeys("3");
			//click submit order
			driver.findElement(By.xpath(".//*[@name='cartSubmit']")).click();
			Thread.sleep(1000);
			//check whats inside my cart
			List <WebElement> whatinthecart = driver.findElements(By.xpath("//div[starts-with(@id,'prodItem')]/div/strong/a"));
			
			Iterator<WebElement> itr = whatinthecart.iterator();
			while(itr.hasNext()) {
				
			    System.out.println("in the cart: " +itr.next().getText());
			}
			
			//click first element
			
			driver.findElement(By.xpath("//div[starts-with(@id,'prodItem')][1]/div/strong/a")).click();
			//print what is selected
			WebElement f = driver.findElement(By.xpath(".//div[@class='prodDescriptionInner']/p[1]"));
			Thread.sleep(1000);
			System.out.println("name of program "+f.getText());
			
		
			
			//click checkout
			driver.findElement(By.linkText("Checkout")).click();
			Thread.sleep(1000);
			//confirm type of account
			driver.findElement(By.xpath("//*[@name='Register Checkout']")).click();
			
			
			System.out.println("u are here: " +driver.getCurrentUrl());
			
			
	}

}
