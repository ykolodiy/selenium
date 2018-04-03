package file_hierarchy;

// dont work yet
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
			
	
			getAllfolders r = new getAllfolders();
													
		List<String> urls =	r.myURLs(driver, "http://teams.inside.pearson.com/sch2/sim/p/human/default.aspx");
					 // loop thru pages
	

		
		Set<String> b = new HashSet<String>();
		Set<String> c = new HashSet<String>();
		Set<String> d = new HashSet<String>();

		for (String j:urls){
			System.out.println(j);
  
			
	
		try {
		b = r.getfolders(driver, j);

		if (!b.isEmpty()) {
		for (String z:b) {
		System.out.println(z);
		c.addAll(r.getfolders(driver, z));
		}
		}
		if (!c.isEmpty()) {
		for (String g:c) {
			System.out.println(g);
			d.addAll(r.getfolders(driver, g));
		}
		}
		if (!d.isEmpty()) {
			for (String h:d) {
				System.out.println(h);
			}
			}
		
		}
		catch (Exception e) {System.out.println(e.getMessage());}
		
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
	

	public Set<String> getfolders (WebDriver driver, String url){
		
		driver.get(url);
		Set<String> a = new HashSet<String>();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<links.size();i++)
		{	
			WebElement ele= links.get(i);	
			String url2=ele.getAttribute("href");
				if(url2 != null && url2.contains("RootFolder") )
					{	a.add(url2); }
		}
				
		return a;
	}
	

	 }
