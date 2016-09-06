// check all state pages by clicking
package statepages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statePages {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pearsonschool.com");
		for (int i=2; i<53; i++) {
			driver.findElement(By.xpath(".//*[@id='footer']/div[1]/div[1]/div/div[7]/div/div[2]/div[2]/form/div/input")).click();
			Thread.sleep(2000);
			
		
			
				driver.findElement(By.xpath("html/body/ul[4]/li["+i+"]/a")).click();
			
		
		Thread.sleep(1000);
		//select button go
		driver.findElement(By.xpath(".//*[@id='footer']/div[1]/div[1]/div/div[7]/div/div[2]/div[2]/form/input")).click();
		Thread.sleep(2000);
		System.out.println(i +" " +driver.getTitle());
		driver.navigate().back();
		
		}	
		Thread.sleep(1000);
		}
		}


