package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;

public class ExtractSpecialCOUNT {

	public static void main(String[] args) throws IOException {
	
		
		int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\3attemps\\p.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
			  
			       	String x = st;
				
			
					Pattern z = Pattern.compile("[™]", Pattern.CASE_INSENSITIVE);
					Matcher match = z.matcher(x);
					while (match.find()) {
					     //System.out.println("Special character at index "+ match.start() +" - "+ (match.end()-1));
					    // System.out.println(x+">"+x.charAt(match.start()));
					     y=y+1;
						}
	

		  }
		br.close();
		
		
		
		
		System.out.println(y);
		
		
		
		
	
		
		

		

	}

}
