package webdrivermain;
//save all images from site
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Piccsy {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C://Users//yuriy//selenium//jars//chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://piccsy.com");
			
			
			
			
			while (driver.manage().window().getSize().height > 0) {
				JavascriptExecutor jsx = (JavascriptExecutor)driver;
				jsx.executeScript("window.scrollBy(0,window.innerHeight)", "");
			
			List<WebElement> links=driver.findElements(By.tagName("IMG"));
			System.out.println("Total IMAGES are: "+links.size());
			for(int i=0;i<links.size();i++)
			{  WebElement ele= links.get(i);
			   String url=ele.getAttribute("SRC");
			   //System.out.println(url);    
			   JavaImageIO (url);}
			}
		
		
driver.close();
	}

	
	
	public static void JavaImageIO(String url2)
	  {
	    try
	    { 
	      // the line that reads the image file
	    
	    	
	    	 URL url3 = new URL(url2);
	    String k = FilenameUtils.getBaseName(url3.getPath());
	      BufferedImage image = ImageIO.read(url3);
	      if(!new File("C:\\temp2\\"+ k +".png").exists()){
	      ImageIO.write(image, "png", new File("C:\\temp2\\"+ k +".png"));
	      System.out.println("Images:   " +url2+ " were written succesfully.");
	      }
	    } 
	    catch (Exception e)
	    {
	    	System.out.println("Exception occured :" + e.getMessage());
	    }
	    //System.out.println("Images:   " +url2+ " were written succesfully.");
	  }
	
	/* 
	 *  URL url = new URL("http://www.example.com/some/path/to/a/file.xml?foo=bar#test");
        System.out.println(FilenameUtils.getBaseName(url.getPath())); // -> file
        System.out.println(FilenameUtils.getExtension(url.getPath())); // -> xml
        System.out.println(FilenameUtils.getName(url.getPath())); // -> file.xml
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
}