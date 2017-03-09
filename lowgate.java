package brokenlink;
// check broken links in all menu links
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;



public class lowgate {
	public static int ok;
	public static int z;
public static void main (String[] args) throws Exception

	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
				File src = new File ("C:/temp/lowgate.xls");
				Workbook wb = Workbook.getWorkbook(src);
		
for (int pz=0; pz<25; pz++) {
	ok=0;z=0;
		String data00 = wb.getSheet(0).getCell(0,pz).getContents();
		driver.get(data00);
		System.out.println((pz+1)+ " " + driver.getTitle());
				
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{	WebElement ele= links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
	
		System.out.println("Total links: "+links.size());
		System.out.println("OK: " +ok);
		System.out.println("Broken: " +z);
		System.out.println("-----------------------------");
							}
				
				driver.close();
	}
		
	public static void verifyLinkActive(String linkUrl)
		{ 
	        try 
        					{
           URL url = new URL(linkUrl);
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           httpURLConnect.setConnectTimeout(2000);
           httpURLConnect.setReadTimeout(2000);
           httpURLConnect.connect();           
       
           if(httpURLConnect.getResponseCode()==200)   {ok=ok+1;}
           
           else{
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
               					z=z+1; 
           		}
        					} 
        catch (Exception e) {e.getMessage();}
		} 
}
