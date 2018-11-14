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
import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import com.google.common.net.UrlEscapers;

public class CreateFolderDownloadFiles4justFoldersbread {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// base where home folder will be :    C:\Users\vkoloyu\GIT\ls-team\yuriy_kolodiy\automation_scripts\PearsonProjects

		 
		 // create 2 arrays       
        ArrayList<String> url=new ArrayList<String>();
        ArrayList<String> bread=new ArrayList<String>();

// fill arrays
  	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\9furl.txt")); 
	  String st; 
	  while ((st = br.readLine()) != null) 
	  {
		  url.add(st);
	  }
	  br.close();
	  
	  
  	  BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\9fbread.txt")); 
	  String st2; 
	  while ((st2 = br2.readLine()) != null) 
	  {
		  bread.add(st2);
	  }		
	  br2.close();

		
		
		
		
		
		
		
			  BufferedReader br4 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\folders.txt")); 
			  String st4; 
			  int x=0;
  
			  while ((st4 = br4.readLine()) != null) 
			  {

			 x=x+1;
	
			 
			 //get folder path
			 String fileOut = st4.replaceAll("http://teams.inside.pearson.com/sch2/sim", "");
			// System.out.println(fileOut);
			 
			 
			 
			 //System.out.println(url.indexOf(path));
			  try {
			  String y = bread.get(url.indexOf(fileOut+"/"));
			  System.out.println(y);
								 //creating a folder structure here. if it exist will not do nothing
							  try{
							  File dir = new File(y);
							  dir.mkdirs();
							  System.out.println(y);	}
							  catch (Exception e){
							  //System.err.println("Error Folder: " + e.getMessage());
							  System.out.println(y+" > Folder Problem");
							  }
							
			  
	
			  System.out.println(y);
			  }
			  catch(Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println(fileOut+">ERROR"); 
				  
			  }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		
			  
			  


			  }
			  
				br.close();
				System.out.println(x);

			  
			}
}