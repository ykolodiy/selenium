package sharepoint;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import com.google.common.net.UrlEscapers;

public class CreateFolderDownloadFiles3justFolders {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// base where home folder will be :    C:\Users\vkoloyu\GIT\ls-team\yuriy_kolodiy\automation_scripts\PearsonProjects

		 {
			  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\folders2.txt")); 
			  String st; 
			  int x=0;
			  int y=0;
  
			  while ((st = br.readLine()) != null) 
			  {

			 //x=x+1;
	
			 
			 //get folder path
			// String fileOut = FilenameUtils.getPath(st).replaceAll("http://teams.inside.pearson.com/", "");
			 
	
			 
			 //creating a folder structure here. if it exist will not do nothing
			  try{
			  File dir = new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\Pfolders\\"+st);
			  dir.mkdirs();
			  x=x+1;
			  //System.out.println(fileOut);	
			  }
			  catch (Exception e){
				  y=y+1;
			  //System.err.println("Error Folder: " + e.getMessage());
			  System.out.println(st+" > Folder Problem");
			  }
			  
			  


			  }
			  
				br.close();
				System.out.println(x);
				System.out.println(y);
				System.out.println(x+y);

			  }
			}
}