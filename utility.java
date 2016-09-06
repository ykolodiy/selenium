package screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static void capture (WebDriver driver, String sname) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			//take screenshot to buffer
			File source = ts.getScreenshotAs(OutputType.FILE);
			//save file
			 FileUtils.copyFile(source, new File("./screenshots/" +sname + ".png"));
			 System.out.println("screen done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("fucked" +e.getMessage());
		} 
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
