package office;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEmails {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tneu.edu.ua");
		List<WebElement> links2=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links in main page are "+links2.size());
		
		
		/*
		for(int i=4;i<links2.size();i++)
		{
			WebElement ele2= links2.get(i);
			String url2=ele2.getAttribute("href");
			System.out.println(url2);
			driver.get(url2);
	
		}
		
		*/
	   
		 //Create File In D: Driver.  
		  String TestFile = "C:\\tmp\\temp3.txt";
		  File FC = new File(TestFile);//Created object of java File class.
		  FC.createNewFile();//Create file.
		  
		  //Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		  FileWriter FW = new FileWriter(TestFile);
		  BufferedWriter BW = new BufferedWriter(FW);
		  
		  
		  for(int i=0;i<links2.size();i++)
			{
			  String text = links2.get(i).getAttribute("href");
					//System.out.println(text);
					try{
		  BW.write(text); //Writing In To File.
		  BW.newLine();//To write next string on new line.   
					}catch (Exception e){}
			}
		  BW.close();
			
		  try (BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\temp3.txt"))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			    	PrintEmails(line);
			    }
			}
		//PrintEmails(links2.get(i).getAttribute("href"));
		
		
		
	
	
		driver.close();	
	}
	
	public static void PrintEmails (String linkurl) {
try {
		driver.get(linkurl);
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.cssSelector("a[href*='mailto']"));
		//System.out.println("Total emails are "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			if (url.contains("@")) {
				
			System.out.println(url.substring(7));
			
			} else {}
			}} catch (Exception e) {}
	
		
	}

}
