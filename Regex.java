package office;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		 // String to be scanned to find the pattern.
	      String line = "This order was car saka  sdsdfs baka w placed wfor QT3000! OK?";
	      String pattern = "[a-z]+s";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      boolean mathch = m.matches();
	      
	      while (m.find( )) {
	    	  
	    	  System.out.println(mathch);
	    	  
	    	  System.out.println("end(): "+m);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	         
	         
	         
	         
	         
	      }

	}

}
