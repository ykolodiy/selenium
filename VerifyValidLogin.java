package pagaFactory;
// test here
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyValidLogin {

	@Test
	public void checkvalidUser () {
	
		//launch browser and urkl
		WebDriver driver = Factory.startBrowser("chrome", "http://blog.pearsonschool.com/wp-login.php?redirect_to=http%3A%2F%2Fblog.pearsonschool.com%2Fwp-admin%2F&reauth=1"); 
		
		//start built class PageFactory
		// it return page object of the same class LoginPage ///.class create binary fersion of object
		
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		
		//call method
		login_page.login_wordpress("admin", "demo123");
	}
	
	
	
	
}
