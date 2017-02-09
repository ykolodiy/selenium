package E2E;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofProgramsALL {


	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			String progid = "biology";
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
Thread.sleep(1000);
//print total programs
String total = driver.findElement(By.xpath("//*[@id='site-content']/div/div/div[5]/div[1]/ul/li[2]")).getText();
String h = total.substring(3, 6);
int hi = Integer.parseInt(h);
System.out.println(h);
//get all the tags
List<WebElement> lis=driver.findElements(By.xpath("//ul[@class='showAmount']/li/a"));

System.out.println("Total pagers are "+lis.size()/2);
Thread.sleep(1000);
driver.findElement(By.xpath("//ul[@class='showAmount']/li[1]/a")).click();
String url = driver.getCurrentUrl();
String url2 = url.substring(0, url.length()-1);
System.out.println(url2);

for (int i=0; i<hi; i=i+50) {
	System.out.println(i);
	driver.get(url2+i);
	
	//print all disciplines
	List<WebElement> links=driver.findElements(By.xpath("//li[starts-with(@id, 'srchProds')]/a"));
	System.out.println("Total links are "+links.size());
	for(int u=0;u<links.size();u++)	{
		WebElement ele= links.get(u);
		String pro=ele.getText();
		System.out.println(u+1 + "  " +pro);		
									}
	
	
	
	
}




driver.close();
}

}

