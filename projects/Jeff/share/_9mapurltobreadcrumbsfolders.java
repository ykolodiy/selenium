package sharepoint;
// folders
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FilenameUtils;

public class _9mapurltobreadcrumbsfolders {

	public static void main(String[] args) throws Exception {
	

		        
		 // create 2 arrays       
		        ArrayList<String> url=new ArrayList<String>();
		        ArrayList<String> bread=new ArrayList<String>();

		// fill arrays
		  	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\6url.txt")); 
			  String st; 
			  while ((st = br.readLine()) != null) 
			  {
				  url.add(st);
			  }
			  br.close();
			  
			  
		  	  BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\6bread.txt")); 
			  String st2; 
			  while ((st2 = br2.readLine()) != null) 
			  {
				  bread.add(st2);
			  }		
			  br2.close();

			  
			  
			  //crawl here
			  BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\6\\6folders.txt")); 
			  String st3; 
			  
			  
			  
			  while ((st3 = br3.readLine()) != null) 
			  {

				// get path name
				
						//String path = FilenameUtils.getPath(st3).replace("http://teams.inside.pearson.com/sch2/sim", "");
						
				  String path = st3+"/";
						
						//System.out.println(path);
				
						
		
			  

			  
              // search path in array and find index
			  
			 // System.out.println(url.indexOf(path));
						  try {
						  String y = bread.get(url.indexOf(path));
						  
						  //System.out.println(y);
						
						  
						// print old vs new file url
						  System.out.print(path+"*");
						 // System.out.println("/"+y+"/"+name);
						  System.out.println(y);
						  }
						  catch(Exception e) {
							  System.out.println(path+"*ERROR"); 
							  
						  }
			  
			  
			  }
			  
			
			
			  br3.close();
	}

}
