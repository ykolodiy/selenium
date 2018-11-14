package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;

public class _6agetfilenames2 {

	public static void main(String[] args) throws IOException {
	
		
		int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\6\\6files.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
			  y=y+1;
			  String name = FilenameUtils.getName(st);
		        //System.out.println(st.replace(name,""));
		       System.out.println(name);

		  }
		br.close();
		
		
		
		
		System.out.println(y);
		
		
		
		
	
		
		

		

	}

}
