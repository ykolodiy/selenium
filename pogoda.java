package redesign;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pogoda {

	public static void main(String[] args) {
		
	

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sinoptik.ua/погода-чикаго");
		
				
	String g = driver.findElement(By.xpath("//p[@class='today-temp']")).getText();	
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.print(dateFormat.format(date));
	System.out.println(" Temperature in Chicago is: "+ g);
	
	driver.quit();

}}