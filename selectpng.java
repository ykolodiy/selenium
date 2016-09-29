package selectpng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectpng {

	public static void main(String[] args)   throws InterruptedException   {
		// TODO Auto-generated method stub

		String url = "http://www.pearsonschool.com/index.cfm?locator=PS2uOu";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> links=driver.findElements(By.tagName("img"));
    // this will display list of all images exist on page
        for(WebElement ele:links){
        	
        if ( ele.getAttribute("src").endsWith( "png" )){
        	
            System.out.println(ele.getAttribute("src"));
        }
            
        }

            //Wait for 5 Sec
            Thread.sleep(2);

            // Close the driver
            driver.quit();
		
		
		
		
		
		
		
	}

}
