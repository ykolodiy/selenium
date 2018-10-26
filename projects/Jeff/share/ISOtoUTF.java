package sharepoint;
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

public class ISOtoUTF {

	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
		//CONVERT ISO TO UTF
		String encodedWithISO88591 = "teams.inside.pearson.com/sch2/sim/p/read/myView Literacy/Story Documents/Handwriting_mVÂ©2020_8.14.17.pdf";
		
		//String encodedWithISO88591 = "teams.inside.pearson.com/sch2/sim/p/human/apss/US_Gov/Edwards, 17th Edition AP ©2018/Preface and Select Chapters/A02_EDWA6571_17_AP_FM.pdf";
		
		String decodedToUTF8 = new String(encodedWithISO88591.getBytes("ISO-8859-1"), "UTF-8");
		
		System.out.println("Converted ISO to UTF: "+decodedToUTF8);
		
		
		
		
		
				// ENCODE URL
	
		System.out.println("Encoded: "+UrlEscapers.urlFragmentEscaper().escape(decodedToUTF8));
		
		System.out.println("Encoded2: "+UrlEscapers.urlFragmentEscaper().escape("http://teams.inside.pearson.com/sch2/sim/p/pd/pd/Programs/Literacy/Words Their Way™/Agendas/Lit_WTW_TrainingTeachers_3Day.pdf"));
	
		System.out.println("Encoded3: "+UrlEscapers.urlFragmentEscaper().escape("https://uswip.pearsoncms.com/alfresco/s/api/path/content;cm:content/workspace/SpacesStore/company_home/sites/ls-webops-testing/documentLibrary/YKBulkUploadFilesWithCharacters/uploadviaWEB/sch2/sim/p/salesshared/proposal/Math Proposals/Investigations en español 2008.xlsx"));
		
	
//System.out.println("ASCII "+ URLEncoder.encode("teams.inside.pearson.com/sch2/sim/p/read/rst13/Story Documents/©2013LessonVocabStory_REV.doc", "UTF-8"));
		
		System.out.println("escapeHtml4 "+StringEscapeUtils.escapeHtml4("teams.inside.pearson.com/sch2/sim/p/read/rst13/Story Documents/©2013LessonVocabStory_REV.doc"));
		
		System.out.println("UNescapeHtml4 "+StringEscapeUtils.unescapeHtml4("teams.inside.pearson.com/sch2/sim/p/read/rst13/Story Documents/&copy;2013LessonVocabStory_REV.doc"));
		
		//PUT CP DECODED VERSION HERE returns encoded url
		System.out.println("UNescapeHtml4capture "+UrlEscapers.urlFragmentEscaper().escape(StringEscapeUtils.unescapeHtml4("teams.inside.pearson.com/sch2/sim/p/read/rst13/Story Documents/&copy;2013LessonVocabStory_REV.doc")));
		
		
		
		
		// DECODE URL    convert CP encoded url to plain text

		URL ENCODEDurl = new URL("http://teams.inside.pearson.com/"+ UrlEscapers.urlFragmentEscaper().escape(decodedToUTF8));
		
		System.out.println(("Decoded: "+ENCODEDurl.toURI().getPath()));
		
		
		
		
		URL ENCODEDurl2 = new URL("http://teams.inside.pearson.com/sch2/sim/p/math/ph12/Algebra%201%20%20Pacing%20Guide.pdf");
		System.out.println(("Decoded2: "+ENCODEDurl2.toURI().getPath()));
	
		
		// capturepoint transfer from theit coding to valid url
		String CP = "http://teams.inside.pearson.com/sch2/sim/p/read/rst13/Story%20Documents/&copy;2013LessonVocabStory_REV.doc";
		
		URL cp2 = new URL(CP);
		// here we decoding back to normal
		System.out.println(("Decodedcp2: "+cp2.toURI().getPath()));
		// here we unescape html removeing copy; to real copyright symbol
		System.out.println("UNescapeCP "+StringEscapeUtils.unescapeHtml4(cp2.toURI().getPath()));
		// here we encoding again
		System.out.println("http://teams.inside.pearson.com"+UrlEscapers.urlFragmentEscaper().escape(StringEscapeUtils.unescapeHtml4(cp2.toURI().getPath())));
		
		
		
		// dont use this 
		//not always work 
		String decoded = java.net.URLDecoder.decode(CP, "UTF-8");
		
	}

}
