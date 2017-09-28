package brokenlink;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loopthruhomeschoolstates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//get a SITE
			driver.get("http://www.pearsonhomeschool.com/index.cfm?locator=PS28Qo");

			
			WebElement mySelectElement = driver.findElement(By.name("myDestination"));
			Select dropdown= new Select(mySelectElement);
			
			List<WebElement> options = dropdown.getOptions();
			Iterator<WebElement> itr = options.iterator();
			List<String> u = new ArrayList<String>();
			
			while(itr.hasNext()) {
			   // System.out.println(itr.next().getAttribute("value"));
			    u.add(itr.next().getAttribute("value"));
			    }
			
			try {
				for (int i = 1; i < u.size(); i++) {
					System.out.println(u.get(i));
					driver.get(u.get(i));
				}
			
			}
			catch (Exception e){}
			driver.close();
			
	}

}
