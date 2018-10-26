package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.io.FilenameUtils;

public class IterateTXT3 {


	
	public static void main(String[] args) throws Exception {

		
	
		
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\ping.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
         
			
			
		    System.out.println(FilenameUtils.getExtension(st)); 
				//System.out.println(st); 
		

		  }
		br.close();
		
	

	}
	
	
	
	
	
	
	
	
	

}
