package pagaFactory;
//helper start browser
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// accept browser as parameter
public class Factory {

	static WebDriver driver;
	public static WebDriver startBrowser (String browsername, String url) {
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
			}
	
	
	
}
