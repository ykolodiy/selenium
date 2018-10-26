package sharepoint;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;

public class DecodeURL {

	public static void main(String[] args) throws Exception {
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\sencodedurl.txt")); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
			try { 
				
				//System.out.println(java.net.URLDecoder.decode(st, "UTF-8"));
			
			URL url = new URL(java.net.URLDecoder.decode("http://www."+st, "UTF-8"));
		
			System.out.println(FilenameUtils.getName(url.getPath()));
				}
			catch (java.lang.IllegalArgumentException e) {}
					
					
		  }
		br.close();

	}

}
