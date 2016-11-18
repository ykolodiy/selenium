package certificate;
// accept certificate in https
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class chromee {

	
	
	@Test
	public void handleCertificate(){
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (cap);
		
		
		driver.get("https://www.cacert.org/");
		
		
	}
	
	
	
	
}
