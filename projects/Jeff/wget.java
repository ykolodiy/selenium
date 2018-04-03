package file_hierarchy;
// download files to local folder
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class wget {
    public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        String baseUrl = "http://teams.inside.pearson.com/sch2/sim/instructional/hsm/Data%20Collection/Forms/AllItems.aspx";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        /*
        WebElement downloadButton = driver.findElement(By
        .id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        */
        String test = "http://teams.inside.pearson.com/sch2/sim/instructional/hsm/Data%20Collection/HSM_SM6%20_SM7_TOT_Data_Collection_Guide_NewProcess_2_25_15.pdf";
        String wget_command = "cmd /c C:\\wget.exe --user vkoloyu --password Comrade77$ -P C:\\Users\\vkoloyu\\ang --no-check-certificate " + test;

        try {
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        System.out.println(ex.toString());
        }
        driver.close();
        }
        
}
