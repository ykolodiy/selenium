package sharepoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class displayallDirectories {

	public static void main(String[] args) throws Exception {
		 
		
	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\dirsurls.txt")); 
		  
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
            String str = st; 
	        String[] arrOfStr = str.split("\\\\", 20); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a);
			}
			
			
			
			
		
		
	}

}
