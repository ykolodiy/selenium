package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CompareKeywordAndResults {
	WebDriver driver;
	
	  @BeforeClass
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); driver  = new ChromeDriver();}
	
	  @AfterClass
	  public void afterMethod() {
		  driver.close();}

	@Test(dataProvider="multi-param")
	public void mytest (String a, int resultOLD) throws Exception {

			driver.get("https://www.pearsonschool.com/index.cfm?locator=PS2vW2");
	
			driver.findElement(By.id("prog_input")).sendKeys(a);
			
			driver.findElement(By.id("prog_submit")).click();
	
			int intnumber = Integer.parseInt(driver.findElement(By.xpath("//*[@id='site-content']/div/div/div[5]/div[1]/ul/li[2]")).getText().replaceAll("[^0-9]", ""));
		
			int persentage = (intnumber-resultOLD)/resultOLD;
					
			System.out.println(intnumber+">>>"+resultOLD);
			
			Assert.assertTrue(!(persentage > 0.05));
}

	// thos numbers were recorded on DEC 20 2017
    @DataProvider(name="multi-param")
    public Object[][] dpMultiParam() {
        return new Object[][]{
                {"Literacy", 312},
                {"Math", 16},
                {"Mathematics", 311},
                {"Science", 254},
                {"Social Studies", 169},
                {"World Languages", 102},
                {"AP Honors", 369},
                {"Intervention", 149},
                {"ELL", 211},
                {"Career", 320},
                {"Elementary", 243},
                {"Middle School", 195},
                {"High School", 983},
                {"Common Core", 1218},
                {"digital", 707},
                {"History", 82}
			};
    }

}

