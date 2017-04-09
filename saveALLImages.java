package SAVEALLIMAGES;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saveALLImages {

	public static void main(String[] args) {
	
		
		/*
		 * idea
		 * 1. Get the SRC attribute of the image.
2. Use ImageIO.read to read the image onto a BufferedImage
3. Save the BufferedImage using ImageIO.write function
		 * 
		 * 
		 * */
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://piccsy.com/");
			
			
			List<WebElement> links=driver.findElements(By.tagName("IMG"));
			
			System.out.println("Total IMAGES are: "+links.size());
		
			for(int i=0;i<links.size();i++)
			{  WebElement ele= links.get(i);
			   String url=ele.getAttribute("SRC");
			   System.out.println(url);    
			   JavaImageIO (url);}
		
		
		
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
	      ImageIO.write(image, "png", new File("C:\\temp\\imgs\\"+ k +".png"));
	      
	    } 
	    catch (Exception e)
	    {
	    	System.out.println("Exception occured :" + e.getMessage());
	    }
	    System.out.println("Images:   " +url2+ " were written succesfully.");
	  }
	
	/* 
	 *  URL url = new URL("http://www.example.com/some/path/to/a/file.xml?foo=bar#test");

        System.out.println(FilenameUtils.getBaseName(url.getPath())); // -> file
        System.out.println(FilenameUtils.getExtension(url.getPath())); // -> xml
        System.out.println(FilenameUtils.getName(url.getPath())); // -> file.xml
	 * 
	 * */
	
	
	
	
	
}
