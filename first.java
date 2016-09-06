//script finds ammount of programs in rollup and main pages
package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// PS.COM > MATHEMATIC > ELEMENTARY : checking numbers of disciplines in roll up and main window
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pearsonschool.com");
		driver.findElement(By.linkText("Mathematics")).click();
		driver.findElement(By.linkText("Browse All Mathematics Programs")).click();
		
		String elementary = driver.findElement(By.partialLinkText("Elementary")).getText();
		String number = elementary.replaceAll("[^\\d.]", "");
		int i = Integer.parseInt(number);
		
		
		System.out.println("elementary rollup number = " +i);
		String programpage = driver.findElement(By.xpath("/html[@class=' js no-touch csstransforms csstransitions']/body/div[@id='page-wrapper']/div[@id='page']/div[@id='site-content']/div[@class='row']/div[@class='c9 end']/div[@class='c12']/div[@class='colIDS']/div[@class='framedContentAreaTitle colIDS'][2]/div[@class='framedContentAreaTitleContent']/h3")).getText();
		
		String prog = programpage.replaceAll("[^\\d.]", "");
		int t = Integer.parseInt(prog);
		System.out.println("elementary page number = " +t);
	if (i == t)	{System.out.println("PASSED");}
	else {System.out.println("FAILED");};
	
		driver.quit();
		
		System.out.println("finish5");
	}

}



/*by tag
driver.findElement(By.cssSelector("h2")).getText();

by Link text
driver.findElement(By.linkText("MOBILE")).click();

text from span
<span class="regular-price" id="product-price-1">
<span class="price">$100.00</span></span>
driver.findElement(By.cssSelector("#product-price-1 > span.price")).getText();
driver.findElement(By.cssSelector("span.price")).getText();

driver.findElement(By.cssSelector("td.product-cart-actions > button[name=update_cart_action]")).click();


driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).clear();
driver.findElement(By.xpath("//button[@title='Compare']")).click();	
driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText(); 
driver.findElement(By.xpath("//a[@href='http://emaus-oselya.org/eng']")).getText();
driver.findElement(By.xpath(".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")).getText();
driver.findElement(By.xpath("//button[@title='Proceed to Checkout']")).click();

 // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}

In the list of all mobile , select SORT BY dropdown as name		
	    new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");
	    
	<div title="title">
    <ul class="token-list">
        <li class="input-token"
            <p>Some Text 1</p>
            <span class="remove-token">x</span>
        </li>
        <li class="input-token"
            <p>Some Text 2</p>
            <span class="remove-token">x</span>
        </li>
    </ul>
</div>  
//div[contains(@title,'title')]//p[text()="Some Text 1"]/following-sibling::span
the p element is not a direct child of the div, so you must search all descendants






	
	    */