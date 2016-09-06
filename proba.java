package tutorialpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class proba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("fff");
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver d = new ChromeDriver();

/*try {
d.get("http://www.google.com");
String t = d.getTitle();
System.out.println(t);
}catch (Exception e){System.out.println("fucked google. lets go to yahoo");

d.get("http://www.yahoo.com");
String s = d.getTitle();
System.out.println(s);
}*/

d.quit();
	}

}
