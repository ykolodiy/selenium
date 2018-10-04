package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.io.FilenameUtils;

public class IterateTXT2 {


	
	public static void main(String[] args) throws Exception {

		
	
		  int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\clean.txt")); 
		  
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
         
			if (st.endsWith(".com")) {
				y = y+1;
		    //System.out.println(FilenameUtils.getExtension(st)); 
				System.out.println(st); 
			}

		  }
		br.close();
		
		System.out.println(+y);
	
		
		
		
		
		
	}

}
