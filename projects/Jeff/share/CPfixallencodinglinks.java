package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.net.UrlEscapers;

public class CPfixallencodinglinks {

	public static void main(String[] args) throws Exception {

		int y=0;
	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\CPENLIST.txt")); 
	  String st; 
	  
	  
	  
	  while ((st = br.readLine()) != null) 
	  {
			String CP = "http://"+st;
			
			//URL cp2 = new URL(CP);
			// here we decoding back to normal
			//System.out.println(("Decodedcp2: "+cp2.toURI().getPath()));
			try {
			//decoded
			String decoded = java.net.URLDecoder.decode(CP, "UTF-8");
			
			
			
			// here we unescape html removeing copy; to real copyright symbol
			//System.out.println("UNescapeCP "+StringEscapeUtils.unescapeHtml4(cp2.toURI().getPath()));
			
			// here we encoding again
			//System.out.println("http://teams.inside.pearson.com"+UrlEscapers.urlFragmentEscaper().escape(StringEscapeUtils.unescapeHtml4(cp2.toURI().getPath())));
			System.out.println(UrlEscapers.urlFragmentEscaper().escape(StringEscapeUtils.unescapeHtml4(decoded)));
			}
			catch(Exception e) {System.out.println(CP);}

	  }
	br.close();
	
	System.out.println(y);

}

}
