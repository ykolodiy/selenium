package playground;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phone {

	public static void main(String[] args) {
		
	        Scanner sc=new Scanner(System.in);
	        try{
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            int z=x/y;
	            System.out.println(z);
	        }
	        
   catch(InputMismatchException d){
	   System.out.println (d.getClass());
	        	
	        }
	        
	        
	        catch(Exception i){
	            System.out.println(i.getClass()+" " +i.getMessage());

	        }
	        
	     
	    }
				
				
				
				
						
					
		}					
		
		
		
		
		
	

