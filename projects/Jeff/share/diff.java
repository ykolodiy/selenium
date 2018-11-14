package sharepoint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class diff {

	public static void main(String[] args) {
		
		// x new report y old report
		
		String x = "http://teams.inside.pearson.com/sch2/sim/p/pd/Professional Development Documents/Programs/ELL, SIOP, ARISE/ELL Pro Development (ID94661_ID95261)/Elementary (ID94661)/Professional Development/SIOP Offerings and Materials 10-1-11.pdf";
		
		
		String y = "http://teams.inside.pearson.com/sch2/sim/p/pd/pd/Programs/ELL, SIOP, ARISE/ELL Pro Development (ID94661_ID95261)/Elementary (ID94661)/Professional Development/SIOP Offerings and Materials 10-1-11.pdf";
	

		
		
		
		String[] X = x.split("/");
		String[] Y = y.split("/");

		
		  if (Arrays.equals(X, Y))
		  		{
	           // System.out.println("Same"); 
	            }
	        else
	        	{
	    		System.out.println(Arrays.toString(X));
	    		System.out.println(Arrays.toString(Y));
	        	}
		
		  
		  
		  for (int i = 0 ; i < X.length ; i++) {
			 // if (!Arrays.stream(Y).anyMatch(X[i]::equals)) {
				  if (!X[i].equals(Y[i])) {
				  System.out.println(X[i]+">"+Y[i]);
			  } 
			
			  
			  
			  
		  }
			

		  System.out.println();
		  
		  
		  
		  
		  
		  
	}
}


