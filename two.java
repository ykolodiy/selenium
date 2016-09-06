package redesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two{ 
	
	  
		   public static void main(String[] args) throws Exception {
			     
			   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.pearsonschool.com");   
			   
			   
				String g = driver.findElement(By.xpath("html/body/div[10]/div[1]/div[1]/div/div[5]/div/div/ul/li[2]/following-sibling::li/a  ")).getText();

				String h = driver.findElement(By.xpath("html/body/div[10]/div[1]/div[1]/div/div[5]/div/div/ul/li[2]/a  ")).getText();
			   
			  System.out.println(g);
			  System.out.println(h);
			   
	
	
		   }
}
