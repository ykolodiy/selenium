package Search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;





public class CompareKeywordAndResults {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		File src = new File ("C:\\Users\\vkoloyu\\workspace\\MainProject\\src\\writeExcel\\XLS\\search.xlsx");
		//input stream class
		FileInputStream fis = new FileInputStream (src);
		//load full workbook XSSF by xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//focus on sheet1 index0
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
	    System.out.println("__________rows: "+rowcount);
	
		

		
		for (int i=0; i<=rowcount; i++)
		{
		
		driver.get("https://www.pearsonschool.com/index.cfm?locator=PS2vW2");
		driver.findElement(By.id("prog_input")).sendKeys(sheet1.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.id("prog_submit")).click();
		String number = driver.findElement(By.xpath("//*[@id='site-content']/div/div/div[5]/div[1]/ul/li[2]")).getText().replaceAll("[^0-9]", "");
		String result = sheet1.getRow(i).getCell(1).getStringCellValue();
		
		int intnumber = Integer.parseInt(number);
		int intnumber0 = Integer.parseInt(result);
		int persentage = (intnumber-intnumber0)/intnumber0;
				
		System.out.println(intnumber+">>>"+intnumber0);
		Assert.assertTrue(!(persentage > 0.05));
		
		
		}
	
		wb.close();
		driver.close();

	}

}



/*
 * 
 *  @Test(dataProvider="multi-param")
    public void multiParameter(String a, int i, long l, boolean b) {
        System.out.println("String: " + a + ", int: " + i + ", long: " + l + ", boolean: " + b);
    }
     
    @DataProvider(name="multi-param")
    public Object[][] dpMultiParam() {
        return new Object[][]{
                {"a", 1, 10L, true},
                {"b", 2, 20L, false},
                {"c", 3, 30L, true},
                {"d", 4, 40L, false}};
    }
}
 * 
 * 
 * 
 * */
