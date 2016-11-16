
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;


public class Logg {
   public static void main(String[] args) {

    // Here we need to create logger instance so we need to pass Class name for 
    //which  we want to create log file in my case Google is classname
	   Logger logger=Logger.getLogger("Logg");

      // configure log4j properties file
       PropertyConfigurator.configure("log4j.properties");
         // Open browser
        WebDriver driver = new FirefoxDriver();
        logger.info("Browser Opened");

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");

        // Load application
     driver.get("https://www.google.com/");
     logger.info("Url opened");


       // type Selenium
       driver.findElement(By.name("q")).sendKeys("Selenium");
        logger.info("keyword type");           
    }
}