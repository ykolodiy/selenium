package exceltry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test5DataDriven {

	
	
	@Test(dataProvider="Data")
	public void access (String url){
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);	
		String h = driver.getTitle();
		System.out.println(h);
		
		driver.quit();
		}
	
	
	
	
	
	
	
	
	@DataProvider(name="Data")
	public Object [][] passData()
	{
	Object [][] data = new Object[3][1];
	data[0][0] = "http://www.pearsonschool.com/index.cfm?locator=PS22D9";
	data[1][0] = "http://www.pearsonschool.com/index.cfm?locator=PS22Dd";
	data[2][0] = "http://www.pearsonschool.com/index.cfm?locator=PS22Dd";

	return data;
	}
	
	
//	 @DataProvider(name="SearchProvider")
//	    public Object[][] getDataFromDataprovider(){
//	        return new Object[][] {
//	                { "Guru99", "India" },
//	                { "Krishna", "UK" },
//	                { "Bhupesh", "USA" }
//	            };
//	    }
//	----- @Test(dataProvider="SearchProvider")
   // public void testMethod(String author,String searchKey) throws InterruptedException{
   //     {
	
	
	
}
