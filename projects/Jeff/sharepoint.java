package file_hierarchy;
// continue from http://teams.inside.pearson.com/sch2/sim/p/pdl/SuccessMaker/Forms/AllItems.aspx?View=%7b1242033F-A440-47FE-AE82-2DE63E564CA2%7d    > SM9 Math Alignments
//https://docs.google.com/spreadsheets/d/1ex-D5CiJxYwZhPH9F034NWi1DGE8lPIy7k0xeLCDPg4/edit#gid=0

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sharepoint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			try (BufferedReader br = new BufferedReader(new FileReader("C://tmp//sharelinks.txt"))) {
			     
					String line;
					while ((line = br.readLine()) != null) {
					
						// here run
						
						driver.get(line);
						
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
													
				
					}

						driver.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}}
}
			
