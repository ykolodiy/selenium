package domains;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;



public class checkdomains {
	
public static void main (String[] args) throws Exception

	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//specify location
				File src = new File ("C:/temp/domain.xls");
				//load excel file
				Workbook wb = Workbook.getWorkbook(src);
				//get cell
		
				
				
				for (int pz=0; pz<3267; pz++) {
				
				
			
				String data00 = wb.getSheet(0).getCell(0,pz).getContents();
				
				driver.get(data00);
				
				System.out.print(data00 + " ");
		
				verifyLinkActive(data00);
			Thread.sleep(100);
		}
				System.out.println("-----------------------------");
	
		driver.close();
				}
	
	
	
	public static void verifyLinkActive(String linkUrl)
	{ 
		
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(1000);
           httpURLConnect.setReadTimeout(2000);
           httpURLConnect.connect();
           
           
           
        	   System.out.print(httpURLConnect.getResponseCode());
        	   
        	  
        	   
        	   
         
           
//           if(httpURLConnect.getResponseCode()==200)
//           {
//               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
//               
//               ok=ok+1;
//            }
//          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
//           {
//               System.out.println(ok+" " +linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
//           z=z+1; 
//           }
//          
          
          
          
        } catch (Exception e) {
           
        }
        System.out.println("");
    } 
	
	
}
