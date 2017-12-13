/*
 * this script goes thru all process from entering ps.com, searching to buying product. the last page is oasis page
 * 
 * 
 * 
 * */


package E2E;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tmp\\chromedriver.exe");
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
			
			
			
			
			//select first K grade
			driver.findElement(By.xpath(".//*[@id='progHeader']/div/div/div/div/ul/li[4]/ul/li[2]/a")).click();
			
			
			
			//select amount of some product
			driver.findElement(By.xpath(".//*[@name='cart_quantity1']")).sendKeys("3");

			
			Thread.sleep(3000);
	
			driver.findElement(By.id("cartSubmit")).submit();
			
			// u r in the shopping cart
			
			Thread.sleep(1000);
			//check and print whats inside my cart
			List <WebElement> whatinthecart = driver.findElements(By.xpath("//div[starts-with(@id,'prodItem')]/div/strong/a"));
			whatinthecart.forEach((temp) -> System.out.println(temp.getText()));
			
			
			//click first element
			
			driver.findElement(By.xpath("//div[starts-with(@id,'prodItem')][1]/div/strong/a")).click();
			//print what is selected
			WebElement f = driver.findElement(By.xpath(".//div[@class='prodDescriptionInner']/p[1]"));
			Thread.sleep(1000);
			System.out.println("name of product "+f.getText());
	
			Thread.sleep(2000);
				//change ammount
			driver.findElement(By.id("cart_quantity1")).clear();
			driver.findElement(By.id("cart_quantity1")).sendKeys("11");
			driver.findElement(By.xpath("//button[text()='Update cart']")).click();
			// click Checkout
			driver.findElement(By.xpath("//*[@id='site-content']/div/div/div/div[2]/div[1]/div[4]/a")).click();
			
			
			Thread.sleep(1000);
			
		
			
			
			
			//confirm type of account
			driver.findElement(By.xpath("//*[@name='Register Checkout']")).click();
			
			
			System.out.println("u are here: " +driver.getCurrentUrl());
			
			driver.close();
	}

}
