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

public class Tab1Jeff {

	public static void main(String[] args) throws IOException {
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
	else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

WebDriver driver = new ChromeDriver();
	


BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\tab1.txt")); 
String st; 



while ((st = br.readLine()) != null) 
{


	String u = st;
	try {
	driver.get(u);
	System.out.print(u+"*");
	
	
	
	
	List<WebElement> bd=driver.findElements(By.xpath("//*[@id='WebPartWPQ1']/table[2]/tbody/tr[2]/td/table/tbody/tr/td"));
if (bd.size() > 0)
{
	System.out.println(1);
	}

else {System.out.println(0);};

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
