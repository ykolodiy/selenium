package file_hierarchy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllfolders {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	
			getAllfolders h = new getAllfolders();
													
		List<String> urls =	h.myURLs(driver, "http://teams.inside.pearson.com/sch2/sim/p/human/default.aspx");
					 // loop thru pages
		for (String j:urls){
			System.out.println(j);
h.myFolders(driver, j);   
			}
		   driver.close();
					}

	
	
	public List<String> myURLs(WebDriver driver, String urll)    {
		
		driver.get(urll);
		Set<String> urls = new HashSet<String>();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{	
			WebElement ele= links.get(i);	String url=ele.getAttribute("href");
		if(url != null && url.contains("AllItem") )
		{	urls.add(url); }
		}
		//convert set to list
		List<String> urls2 = new ArrayList<String>(urls);  
		return(urls2);
	 }
	

	
	public void myFolders(WebDriver driver, String urll)    {
	
		
			driver.get(urll);
			Set<String> urls = new HashSet<String>();
		    List<WebElement> links=driver.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++)
			{	
				WebElement ele= links.get(i);	
				String url=ele.getAttribute("href");
					if(url != null && url.contains("RootFolder") )
						{	urls.add(url); }
			}
			//convert set to list
			List<String> urls2 = new ArrayList<String>(urls);  
			
			
			for (String f:urls2){
				System.out.println(f); 
				
				
			myFolders(driver, f);
			
				}
			}

	 }