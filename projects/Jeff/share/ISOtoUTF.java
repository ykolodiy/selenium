package sharepoint;
//CP iso-8859-1 to url valid utf-8
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.io.FilenameUtils;

import com.google.common.net.UrlEscapers;

public class ISOtoUTF {

	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
		//CONVERT ISO TO UTF
		String encodedWithISO88591 = "teams.inside.pearson.com/sch2/sim/p/read/myView Literacy/Story Documents/Handwriting_mVÂ©2020_8.14.17.pdf";
		
		//String encodedWithISO88591 = "teams.inside.pearson.com/sch2/sim/p/human/apss/US_Gov/Edwards, 17th Edition AP ©2018/Preface and Select Chapters/A02_EDWA6571_17_AP_FM.pdf";
		
		String decodedToUTF8 = new String(encodedWithISO88591.getBytes("ISO-8859-1"), "UTF-8");
		
		System.out.println("Converted ISO to UTF: "+decodedToUTF8);
		
		
		
		
		
				// ENCODE URL
	
		System.out.println("Encoded: "+UrlEscapers.urlFragmentEscaper().escape(decodedToUTF8));
		
		
	
		
		
		// DECODE URL    convert CP encoded url to plain text
		
		
		URL ENCODEDurl = new URL("http://teams.inside.pearson.com/"+ UrlEscapers.urlFragmentEscaper().escape(decodedToUTF8));
		
		System.out.println(("Decoded: "+ENCODEDurl.toURI().getPath()));
		
		
		
		
		URL ENCODEDurl2 = new URL("http://teams.inside.pearson.com/sch2/sim/p/pd/pd/Programs/ELL,%20SIOP,%20ARISE/A+RISE%20(ID80121_ID80141)/Secondary%20(ID80141)/Agenda/ELL_ARISE_TrainingTeachersK-12.pdf");
		System.out.println(("Decoded: "+ENCODEDurl2.toURI().getPath()));
	
		
	}

}
