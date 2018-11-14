package sharepoint;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;

public class _2aGetfolderNames {

	public static void main(String[] args) throws Exception {
		  BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\13923.txt")); 
		  String st3; 
		  
		  
		  
		  while ((st3 = br3.readLine()) != null) 
		  {

			// get path name
			
					String path = FilenameUtils.getPath(st3);
					System.out.println(path);
					
					
					// get file name
					
			        //String name = FilenameUtils.getName(st3);
			        //System.out.println(name);
					
					
					
					
					
					
					
		  }

		
		  
		  
br3.close();
	}

}
