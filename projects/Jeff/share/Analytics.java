package sharepoint;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Analytics {

	public static void main(String[] args) {

		
		
		//  int n = 2; // Number of threads 
	        for (int i=0; i<9; i++) 
	        { 
	            MultithreadingDemo object = new MultithreadingDemo(); 
	            object.start(); 
	        } 
		
		
		
		
	}

}





class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
	        { 
	        // Displaying the thread that is running 
	        System.out.println ("Thread " +      Thread.currentThread().getId() +   " is running"); 
	        
	       
	        
	        WebDriver driver;
	        int num = new Random().nextInt(3);
	        System.out.println(num);
	        switch (num) { 
	        case 0: 
	        	System.setProperty("webdriver.opera.driver", "C:\\users\\vkoloyu\\operadriver.exe");
	    		OperaOptions options = new OperaOptions();
	    		options.setBinary("C:\\Users\\vkoloyu\\AppData\\Local\\Programs\\Opera\\56.0.3051.52\\opera.exe");
	    		driver = new OperaDriver(options);
	    		break; 
	        case 1: 
	        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
	    		driver = new ChromeDriver();
	            break; 
	        case 2: 
	        	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\vkoloyu\\geckodriver.exe");      
	             DesiredCapabilities caps = DesiredCapabilities.firefox();
	             LoggingPreferences logPrefs = new LoggingPreferences();
	             logPrefs.enable(LogType.BROWSER, Level.ALL);
	             caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	             driver = new FirefoxDriver(caps);
	            break; 
	        default: 
	        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
	    		driver = new ChromeDriver();
	            break;
	            
	        }
	        

	         
  
  	
	    	
	    	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	
	    // sleep btw 1-7 seconds
	    	int sleepe =ThreadLocalRandom.current().nextInt(1000, 7000 + 1);
	    	
	    //get a SITE
	    	driver.get("https://playbook.pearsonschool.com/");
		  	Cookie name = new Cookie("LS_DEV", "1");
		  	Cookie name2 = new Cookie("LS_ENABLE_ANALYTICS", "1");
			driver.manage().addCookie(name);
			driver.manage().addCookie(name2);
			
			driver.get("https://playbook.pearsonschool.com/index.cfm?locator=PS1u82");
			Thread.sleep(sleepe);
			driver.findElement(By.linkText("Product Crosswalk")).click();
			Thread.sleep(sleepe);
			driver.close();
	  
	        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println (e.getMessage()); 
        } 
    } 
} 