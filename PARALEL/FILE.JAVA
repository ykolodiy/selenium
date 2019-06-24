package paralel;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	 private static final ThreadLocal<RemoteWebDriver> drivers = new ThreadLocal<>();

	 @BeforeClass
	    public void beforeClass() {
	        long id = Thread.currentThread().getId();
	        System.out.println(java.time.LocalDateTime.now());
	    }
	 
	 
	 @AfterClass
	    public void afterClass() {
	        long id = Thread.currentThread().getId();
	        System.out.println(java.time.LocalDateTime.now());
	    }
	 
	 
	 
	
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ykolodiy\\eclipse\\jars\\chromedriver.exe");
        RemoteWebDriver driver = new ChromeDriver();
        drivers.set(driver);
        System.out.println("Before method. Thread : " + id);
    }
    

    
    @Test
    public void testMethodsOne() throws InterruptedException {
        long id = Thread.currentThread().getId();
        driver().get("https://www.google.com");
        System.out.println(driver().getCurrentUrl()+"method One. Thread: " + id);
        JavascriptExecutor jse = (JavascriptExecutor)driver();
        jse.executeScript("window.open()");
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String> (driver().getWindowHandles());
        driver().switchTo().window(tabs.get(0));
        driver().get("http://eeetest.co.nf/tv.html");
        System.out.println(driver().getCurrentUrl()+"method One. Thread: " + id);
    }
 
    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        driver().get("https://chicago.craigslist.org/");
        System.out.println(driver().getCurrentUrl()+"method Two. Thread: " + id);
    }
    
    @Test
    public void testMethodsThree() {
        long id = Thread.currentThread().getId();
        driver().get("https://www.ft.com");
        System.out.println(driver().getCurrentUrl()+" method Three. Thread: " + id);
    }
 
    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
        RemoteWebDriver driver = driver();
        driver.quit();

    }
    
    
    private RemoteWebDriver driver() {
        RemoteWebDriver driver = drivers.get();
        if (driver == null) {
            throw new IllegalStateException("Driver should have not been null.");
        }
        return driver;
    }
}
