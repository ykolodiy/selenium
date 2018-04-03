package file_hierarchy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickalljavascript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
        driver.get("http://teams.inside.pearson.com/sch2/sim/instructional/product/default.aspx");
        Thread.sleep(1200);
      //  WebElement w = driver.findElement(By.xpath("//*[@id='titl15-1_']/tr/td/a[2]"));
     
    // System.out.println(w.isDisplayed());
    
 
   //  System.out.println(w.isDisplayed());
       // driver.findElement(By.xpath("//*[@id='titl5-1_']/tr/td/a[2]")).click();
        
        
    	List<WebElement> links=driver.findElements(By.tagName("a"));

		for(int i=0;i<links.size();i++)
			{WebElement ele= links.get(i);	
			String url=ele.getAttribute("href");
			
			if(url != null && url.equals("javascript:") && ele.isDisplayed() && !ele.getAttribute("target").equals("_self") && !ele.getText().equals("Type")&& !ele.getText().equals("Name")&& !ele.getText().equals("Notes"))
			{
			    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			     Thread.sleep(1000); 
			     
			     ele.click();
				
			}
			}

		
	}

}
