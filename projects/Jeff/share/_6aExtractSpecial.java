package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;

public class _6aExtractSpecial {

	public static void main(String[] args) throws IOException {
	
		
		int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\8\\folders1.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
			  
			       	String x = st;
				
			
					Pattern z = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
					Matcher match = z.matcher(x);
					while (match.find()) {
					     //System.out.println("Special character at index "+ match.start() +" - "+ (match.end()-1));
					     System.out.println(x+"*"+x.charAt(match.start()));
						}
	

		  }
		br.close();
		
		
		
		
		
		
		
		
		
	
		
		

		

	}

}
