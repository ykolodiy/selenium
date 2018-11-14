package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

public class _7ExtractFileswithspecialChars {

	public static void main(String[] args) throws Exception {
		 BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\3attemps\\18000fixed.txt")); 
		  String st3; 
		  
		  String [] Special = {
								  "—",
								  "®",
								  "©",
								  "é",
								  "’",
								  "–",
								  "ñ",
								  "ń",
								  "™",
								  "¡",
								  "á",
								  "í",
								  "ó",
								  "=",
								  ""
								  };
		  
		  while ((st3 = br3.readLine()) != null) 
		  {

			  for (String s: Special) {           
			       if (st3.contains(s)) {
			        System.out.println(st3+">"+s); }
			    }
	
		  }
br3.close();

	}

}
