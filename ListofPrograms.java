package E2E;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofPrograms {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			String progid = "Literacy";
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://pearsonschool.com");
			//click search button
			driver.findElement(By.xpath("//*[@class='icon-search']")).click();
			//enter the word to search
			driver.findElement(By.xpath("//*[@id='prog_input_header']")).sendKeys(progid);
			//press enter
			driver.findElement(By.xpath("//*[@id='prog_input_header']")).sendKeys(Keys.RETURN);
		
            //click on Product page
			driver.findElement(By.xpath("//*[@id='site-content']/div/div/ul/li[2]/a")).click();
Thread.sleep(1500);


//make pagers list visible
driver.findElement(By.xpath("//li[@class='currentlyShowing']")).click();
//get all the tags
List<WebElement> lis=driver.findElements(By.xpath("//ul[@class='showAmount']/li/a"));

System.out.println("Total pagers are "+lis.size()/2);

//clicking on all links
for(int i=1;i<lis.size()/2;i++){
	
	driver.findElement(By.xpath("//li[@class='currentlyShowing']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='showAmount']/li["+i+"]/a")).click();
	Thread.sleep(2000);
	
	//print all disciplines
	List<WebElement> links=driver.findElements(By.xpath("//li[starts-with(@id, 'srchProds')]/a"));
	System.out.println("Total links are "+links.size());
	for(int u=0;u<links.size();u++){
		WebElement ele= links.get(u);
		String url=ele.getText();
		System.out.println(u+1 + "  " +url);		
	}
	
			
}

	}

}
