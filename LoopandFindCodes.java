package formid;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopandFindCodes {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\tmp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File src = new File ("C:\\Users\\vkoloyu\\workspace\\MainProject\\src\\writeExcel\\XLS\\jeff.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);


		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0; i<=rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(2).getStringCellValue();
			
			
			driver.get(data0);
			try {
			String k = driver.findElement(By.xpath("//input[@name='form_id']")).getAttribute("value");
			String l = driver.findElement(By.xpath("//input[@name='key_code']")).getAttribute("value");
			System.out.print("form_id: " + k + " ");
			System.out.println("key_code: " + l);
			}
			
			catch (Exception e){System.out.println("#no code#");}
			
		}

		wb.close();
		driver.close();



	}
}
