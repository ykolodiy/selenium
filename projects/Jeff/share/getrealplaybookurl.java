package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrealplaybookurl {

	public static void main(String[] args) throws Exception {
/*
		int y=0;
	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\playbookcrawl\\listofurls.txt")); 
	  String st; 
	  
	  
	  
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
	else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

WebDriver driver = new ChromeDriver();

	  
	  
	  
	  
	  while ((st = br.readLine()) != null) 
	  {
     y=y+1;
		  driver.get(st);
		  if(!driver.getTitle().contains("Error")) {
		  System.out.println(driver.getCurrentUrl());
		  }
		  else {
			  System.out.println("ERROR > "+driver.getCurrentUrl());
			  
		  }

	  }
	br.close();
	driver.close();
	System.out.println(y);
*/
		
		
		
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
		else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

		WebDriver driver = new ChromeDriver();

		driver.get("https://playbook.pearsonschool.com/index.cfm?locator=PS1uE9&PMDbSiteId=2781&PMDbSolutionId=6724&PMDbSubSolutionId=&PMDbCategoryId=3289&PMDbSubCategoryId=28139&PMDbSubjectAreaId=&PMDbProgramId=15601");
		
		
		List <WebElement> l = driver.findElements(By.xpath("//*[@id=\"menu\"]/div/div[4]/h3/following-sibling::ul[1]/li/a"));
		
		for (WebElement ll : l) {
			
			System.out.println(ll.getAttribute("href"));
			
		}
		
		//driver.close();
}

}
