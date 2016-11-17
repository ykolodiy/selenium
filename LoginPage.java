package pagaFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// stored locators here
public class LoginPage {
   
	
	WebDriver driver;
	
	public LoginPage (WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy (id="user_login") WebElement username;
	
	@FindBy (id="user_pass") WebElement password;
	
	@FindBy (how=How.ID, using="wp-submit") WebElement submit;
	
	
	public void login_wordpress (String uid, String pas) {
		
		username.sendKeys(uid);
		password.sendKeys(pas);
        submit.click();
		
	}
	
	
}
