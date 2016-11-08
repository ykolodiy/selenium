package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class brokenlink3 {
	private static int ok=0;
	private static int z=0;
public static void main (String[] args)

	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.pearsonschool.com/index.cfm?locator=PS2tJ7");
		
		List<WebElement> links=driver.findElements(By.tagName("IMG"));
		
		System.out.println("Total links are "+links.size());
		
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("SRC");
			
			System.out.print(i +" ");
			verifyLinkActive(url);
			
		}
		int p = links.size()-ok;
		System.out.println("Total links are "+links.size());
		System.out.println("OK: " +ok);
		System.out.println("Repeated: " +p);
		System.out.println("Broken: " +z);
		
	}
	
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           
          
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
               
               ok=ok+1;
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
           z=z+1; 
           }
        } catch (Exception e) {
           
        }
    } 
	
	
}

