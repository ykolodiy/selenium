package sharepoint;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//CP iso-8859-1 to url valid utf-8
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;
import org.apache.commons.lang3.StringEscapeUtils;



import org.apache.commons.io.FilenameUtils;

import com.google.common.net.UrlEscapers;

public class ISOtoUTF2 {

	public static void main(String[] args) throws URISyntaxException, Exception {
		
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\7\\joe404.txt")); 
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
		

		//String decodedToUTF8 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
		
		//System.out.println(decodedToUTF8);
		

		// here we unescape html removeing copy; to real copyright symbol
		System.out.println(StringEscapeUtils.unescapeHtml4(new String(st.getBytes("ISO-8859-1"), "UTF-8")));

		  }
		br.close();
	}

}
