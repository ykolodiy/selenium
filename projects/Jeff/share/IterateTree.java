package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

public class IterateTree {


	
	public static void main(String[] args) throws Exception {
	
		  
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\FileReportUnclean.txt")); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
			
		    System.out.println(st.replaceAll("[├└─│]","")); 
		  }
		br.close();
	}

}
