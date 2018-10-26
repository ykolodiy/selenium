package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.io.FilenameUtils;

public class CompareTXT {

	public static void main(String[] args) throws Exception {
 
		  BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\1.txt")); 
		  BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\2.txt")); 
  
		  String st1;
		  String st2; 
		 List<String> l1 = new ArrayList<String>();
		 List<String> l2 = new ArrayList<String>();
		  
		  
		  while ((st1 = br1.readLine()) != null) 
		  {     
			l1.add(st1);
		  }
		  while ((st2 = br2.readLine()) != null) 
		  {     
			l2.add(st2);
		  }
		  
		  
		  for (String ll1:l1) {
			  
			  if (!l2.contains(ll1)) {
				    System.out.println(ll1);
				}
			  
		  }
	  
		br1.close();
		br2.close();
		
	}

}
