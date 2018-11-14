package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.io.FilenameUtils;

public class IterateTXTjeffmapISOtoutf {

	public static void main(String[] args) throws Exception {

			int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\7\\iso.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {

				String decodedToUTF8 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
				
				System.out.println(decodedToUTF8);

		  }
		br.close();
		
		//System.out.println(y);

	}

}
