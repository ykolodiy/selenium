package hybrid.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class invalidLogin extends BaseClass{

	
	
	@Test (description="this test with valid login")
	public void loginToApplication() throws Exception{
		

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
			
		Thread.sleep(3000);
	}
	
	@Test (description="this test with INvalid login")
	public void loginToApplication2(){
		

		driver.findElement(By.name("txtUsername")).sendKeys("Admien");
		driver.findElement(By.id("txtPassword")).sendKeys("admien");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}
	
	
	
}
