package brokenlink;
// check broken links in all menu links
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.read.biff.BiffException;



public class BrokenLink4 {
	private static int ok=0;
	private static int z=0;
public static void main (String[] args) throws Exception

	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//specify location
				File src = new File ("C:/TestData2.xls");
				//load excel file
				Workbook wb = Workbook.getWorkbook(src);
				//get cell
				System.out.println("Those links were tested:");
				
				
				for (int pz=0; pz<50; pz++) {
				
				String data00 = wb.getSheet(0).getCell(0,pz).getContents();
				
				driver.get(data00);
				
				System.out.println((pz+1)+ " " + driver.getTitle());
				
				
		
		
		
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			//System.out.print(i +" ");
			verifyLinkActive(url);
			
		}
		int p = links.size()-ok;
		System.out.println("Total links are "+links.size());
		System.out.println("OK: " +ok);
		System.out.println("Repeated: " +p);
		System.out.println("Broken: " +z);
		System.out.println("-----------------------------");
				}
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
               //System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
               
               ok=ok+1;
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(ok+" " +linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
           z=z+1; 
           }
        } catch (Exception e) {
           
        }
    } 
	
	
}
