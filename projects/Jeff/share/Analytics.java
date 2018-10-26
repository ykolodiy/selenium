package sharepoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Analytics {

	public static void main(String[] args) {
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
	else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
//get a SITE
	driver.get("https://playbook.pearsonschool.com/");
	  Cookie name = new Cookie("LS_DEV", "1");
		driver.manage().addCookie(name);
		driver.get("https://playbook.pearsonschool.com/");
	}

}
