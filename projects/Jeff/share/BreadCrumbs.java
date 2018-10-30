package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BreadCrumbs {

	public static void main(String[] args) throws IOException {
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
	else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

WebDriver driver = new ChromeDriver();
	


BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\bd.txt")); 
String st; 



while ((st = br.readLine()) != null) 
{


	String u = st;
	try {
	driver.get(u);
	System.out.print(u+"*");
	
	
	
	
	List<WebElement> bd=driver.findElements(By.xpath("//span[@id='ctl00_PlaceHolderTitleBreadcrumb_ContentMap']/span"));
	for(int i=0;i<bd.size();i++)
	{
		
		WebElement ele= bd.get(i);
		String url=ele.getText();
		System.out.print(url);
	}
	System.out.println();
	}
	
	catch(Exception e) {System.out.println("NO BREADCRUNBS");
	driver.close();
	driver = new ChromeDriver();
	}
	
}
	br.close();
	
	
	driver.close();
	
	
	
	
	}

}
