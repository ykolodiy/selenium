//script finds ammount of programs in rollup and main pages
package proj;
// DATA DRIVERN TEST
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class first3 {

	@Test(dataProvider="Data")
	public void access (String url){
	
		
		// PS.COM > MATHEMATIC > ELEMENTARY : checking numbers of disciplines in roll up and main window
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pearsonschool.com");
		/*
Literacy
Mathematics
Science

World Languages
AP® Honors & Electives
ELL
Pearson Pre-K Education
Art
Music
Educator Services
		
		*/
		
		
		driver.findElement(By.linkText(url)).click();
		driver.findElement(By.partialLinkText("Browse All")).click();
		
		
		
		//Early childhood
		String EarlyChildhood = driver.findElement(By.partialLinkText("Early Childhood")).getText();
		String number1 = EarlyChildhood.replaceAll("[^\\d.]", "");
		int a = Integer.parseInt(number1);	
		System.out.println("early childhood rollup number = " +a);
		String programpage1 = driver.findElement(By.xpath("//h3[contains(text(), 'Early Childhood')]")).getText();
		String prog1 = programpage1.replaceAll("[^\\d.]", "");
		int b = Integer.parseInt(prog1);
		System.out.println("early childhood page number = " +b);
	if (a == b)	{System.out.println("PASSED");}
	else {System.out.println("FAILED");};
				
		
		// Elementary
		String elementary = driver.findElement(By.partialLinkText("Elementary")).getText();
		String number = elementary.replaceAll("[^\\d.]", "");
		int i = Integer.parseInt(number);	
		System.out.println("elementary rollup number = " +i);
		String programpage = driver.findElement(By.xpath("//h3[contains(text(), 'Elementary')]")).getText();
		String prog = programpage.replaceAll("[^\\d.]", "");
		int t = Integer.parseInt(prog);
		System.out.println("elementary page number = " +t);
	if (i == t)	{System.out.println("PASSED");}
	else {System.out.println("FAILED");};
	
	
	//Middle School
	String ms = driver.findElement(By.partialLinkText("Middle School")).getText();
	String numberms = ms.replaceAll("[^\\d.]", "");
	int ims = Integer.parseInt(numberms);	
	System.out.println("Middle School rollup number = " +ims);
	String programpagems = driver.findElement(By.xpath("//h3[contains(text(), 'Middle School')]")).getText();
	String progms = programpagems.replaceAll("[^\\d.]", "");
	int tms = Integer.parseInt(progms);
	System.out.println("Middle School page number = " +tms);
if (ims == tms)	{System.out.println("PASSED");}
else {System.out.println("FAILED");};
	
	
	
	//High School
String elementaryhs = driver.findElement(By.partialLinkText("High School")).getText();
String numberhs = elementaryhs.replaceAll("[^\\d.]", "");
int ihs = Integer.parseInt(numberhs);	
System.out.println("High School rollup number = " +ihs);
String programpagehs = driver.findElement(By.xpath("//h3[contains(text(), 'High School')]")).getText();
String proghs = programpagehs.replaceAll("[^\\d.]", "");
int ths = Integer.parseInt(proghs);
System.out.println("High School page number = " +ths);
if (ihs == ths)	{System.out.println("PASSED");}
else {System.out.println("FAILED");};

//Professional Education
String elementarype = driver.findElement(By.partialLinkText("Professional Education")).getText();
String numberpe = elementarype.replaceAll("[^\\d.]", "");
int ipe = Integer.parseInt(numberpe);	
System.out.println("Professional Education rollup number = " +ipe);
String programpagepe = driver.findElement(By.xpath("//h3[contains(text(), 'Professional Education')]")).getText();
String progpe = programpagepe.replaceAll("[^\\d.]", "");
int tpe = Integer.parseInt(progpe);
System.out.println("elementary page number = " +tpe);
if (ipe == tpe)	{System.out.println("PASSED");}
else {System.out.println("FAILED");};

	
	
		driver.quit();
		
		
	}
	@DataProvider(name="Data")
	public Object [][] passData()
	{
	Object [][] data = new Object[2][1];
	data[0][0] = "Literacy";
	data[1][0] = "Mathematics";
	
	return data;
	}

}