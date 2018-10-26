package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

public class CPISOtoUTF {

	public static void main(String[] args) throws Exception {
		
		
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\3attemps\\cpiso.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
			  System.out.println(new String(st.getBytes("ISO-8859-1"), "UTF-8"));

		  }
		br.close();
		

	}

}
