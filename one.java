package redesign;
// save to file txt

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;



public class one
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SQLite
		CREATE  TABLE "main"."second" ("id" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , "name" CHAR NOT NULL )
		
		
		
			*/
				Date d = new Date();
		Long time = d.getTime();
		String TestFile = "C:\\1\\temp_"+time+".txt";
		  File FC = new File(TestFile);//Created object of java File class.
		  FC.createNewFile();//Create file.
		  
		  //Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		  FileWriter FW = new FileWriter(TestFile);
				
		  BufferedWriter BW = new BufferedWriter(FW);
          BW.write(""+time);
		  BW.close();
		
		
		
		
		System.out.print("done");
	}

}
