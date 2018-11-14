package sharepoint;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFolderNameFromUrl {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		if(System.getProperty("os.name").toLowerCase().contains("win"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkoloyu\\chromedriver.exe");
		}
	else {System.setProperty("webdriver.chrome.driver", "/Users/vkoloyu/chromedriver");}

WebDriver driver = new ChromeDriver();
String folderurl = "http://teams.inside.pearson.com/sch2/sim/p/sci/STEM";
String folder = folderurl.substring(folderurl.lastIndexOf("/") + 1);

driver.get(folderurl);

    URL k = new URL(driver.getCurrentUrl());

    
   // System.out.println(k.toURI().getPath());
    driver.close();
   
    if (k.toURI().getPath().contains("/"+folder+"/"))
    {System.out.println(folder);}
    else {
    	
    	System.out.println(folder+" *notaFOLDER");
    }
    
	}

}
