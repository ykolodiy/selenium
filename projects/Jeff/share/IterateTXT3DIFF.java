package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;

public class IterateTXT3DIFF {


	
	public static void main(String[] args) throws Exception {
		
		  BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\fnnew.txt")); 
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\fnold.txt")); 
		  
		  String st; 
		  String st2;
			 List<String> l1 = new ArrayList<String>();
			 List<String> l2 = new ArrayList<String>();
		  
		  while ((st = br.readLine()) != null) 
		  {
				l1.add(st);
		  }
		  
		  
		  
		  
		  while ((st2 = br2.readLine()) != null) 
		  {
				l2.add(st2);
		  }
			
		
		  
	  for (String ll1:l1) {
			  
		  for (String ll2:l2)
		  {
			 
			  if (FilenameUtils.getName(ll2).equals(FilenameUtils.getName(ll1))) {
				
		  
					String x = ll1;
					String y = ll2;
				
					
					
				//	System.out.print(ll1+">");System.out.println(ll2);
					
					
					 
					String[] X = x.split("/");
					String[] Y = y.split("/");

					
					  if (Arrays.equals(X, Y))
					  		{
						  break;
				            }
				    
					
			    else {
			    	
			    	if ((X.length)==Y.length)
			    	{
						  for (int i = 0 ; i < X.length ; i++) {
							  
							  
							  
							
							  if (!X[i].equals(Y[i])) {
								  System.out.println(X[i]+">"+Y[i]);
							  } 
							  
							  
							  
							   }

						  System.out.println();
						
			    	}
						  
						  
					  }

				  
			  }
			  
			  
			  
			  
		  }
			  
		  }
  
		  
		br.close();
		br2.close();
	

	}

}
