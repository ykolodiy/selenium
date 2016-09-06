package playground;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class play {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.yahoo.com");
		String g = driver.getPageSource();
		
		
		driver.quit();
		
		/* first method
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter("text3.txt"));
		    writer.write(g);
		  
		}
		catch ( IOException e)
		{
		}
	
		*/
		
		File destination = new File("file2.txt");
		// This line isn't needed, but is really useful 
		// if you're a beginner and don't know where your file is going to end up.
		System.out.println(destination.getAbsolutePath());
		try {
		    Files.write(g, destination, Charset.forName("UTF-8"));
		} catch (IOException e) {
		    // Useful error handling here
		}
		
		
		
		
		
	}
	
	

}
		
		
		
	
	
	
	
	


