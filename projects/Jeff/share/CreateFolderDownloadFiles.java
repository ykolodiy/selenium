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

public class CreateFolderDownloadFiles {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// base where home folder will be :    C:\Users\vkoloyu\GIT\ls-team\yuriy_kolodiy\automation_scripts\PearsonProjects

		 {
			  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\13923.txt")); 
			  String st; 
			  int x=0;
  
			  while ((st = br.readLine()) != null) 
			  {

			 x=x+1;
			 //get file url from list
			 String fileIN2 = st;
			 
			 //encode the url to use it in buffer
			 String fileIN = UrlEscapers.urlFragmentEscaper().escape(fileIN2);

			 
			 //get folder path
			 String getfolderStructure = FilenameUtils.getPath(fileIN2).replaceAll("http://teams.inside.pearson.com/", "");
			 
			 //get file name
			 String getFilename = FilenameUtils.getName(fileIN2);
			
			 //get file path
			 String fileOut = getfolderStructure+ getFilename;
			 
			 //creating a folder structure here. if it exist will not do nothing
			  try{
			  File dir = new File(getfolderStructure);
			  dir.mkdirs();}
			  catch (Exception e){
			  //System.err.println("Error Folder: " + e.getMessage());
			  System.out.println(fileOut+" > Folder Problem");
			  }
			  
			  
			  
			  //reading the file to buffer, writing file to the folder and saving it
			  try (
					  BufferedInputStream in = new BufferedInputStream(new URL(fileIN).openStream());
					  FileOutputStream fileOutputStream = new FileOutputStream(fileOut)) 
			  {
					    byte dataBuffer[] = new byte[1024];
					    int bytesRead;
					    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
					        fileOutputStream.write(dataBuffer, 0, bytesRead);
					    }
					
					    //print file path
			 System.out.println(fileOut);	    
					    
			  	} 
			  
			  
			  catch (IOException e) {
						System.err.println("Error File: " + e.getMessage());
						//System.out.println(fileOut+" > Problem");
					}

			  }
			  
				br.close();
				System.out.println(x);

			  }
			}
}