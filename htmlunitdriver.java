package htmlunitdriver;

import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


//doesnt work :(




public class htmlunitdriver {

	
	@Test
	public void main() 

{
		 
		// Declaring and initialize  HtmlUnitWebDriver
		WebDriver driver = new HtmlUnitDriver();
		System.out.println(HttpClientBuilder.class.getProtectionDomain().getCodeSource().getLocation());
		// open facebook webpage
		driver.get("http://www.facebook.com");
		 
		// Print the title
		System.out.println("Title of the page "+ driver.getTitle());
		 
		 
		}}
