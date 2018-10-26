package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;

public class DecodeAcorn {

	public static void main(String[] args) throws Exception {

		  int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\3attemps\\acorn.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
         
				URL ENCODEDurl2 = new URL("http://"+st);
				System.out.println(("http://teams.inside.pearson.com"+ENCODEDurl2.toURI().getPath()));

		  }
		  
		br.close();
		
		System.out.println(y);

	}

}
