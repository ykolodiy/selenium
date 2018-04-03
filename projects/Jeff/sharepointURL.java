package file_hierarchy;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sharepointURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	
						
						driver.get("http://teams.inside.pearson.com/sch2/sim/p/ell/default.aspx");
						
						List<WebElement> links=driver.findElements(By.tagName("a"));

						for(int i=0;i<links.size();i++)
							{	WebElement ele= links.get(i);	String url=ele.getAttribute("href");
							
							if(url != null && url.startsWith("htt") )
							{
							if(url.endsWith("doc") || url.endsWith("pdf") || url.endsWith("docx") || url.endsWith("zip")|| url.endsWith("ppt")|| url.endsWith("xls")|| url.endsWith("pptx")|| url.endsWith("xlsx")|| url.endsWith("png")|| url.endsWith("wmv")) {
							System.out.println(url); }
							}
							}
						
						// here end of run
													
					driver.close();
					}

				}

			
