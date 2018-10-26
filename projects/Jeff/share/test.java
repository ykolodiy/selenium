package sharepoint;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringEscapeUtils;
import com.google.common.net.UrlEscapers;

public class test {

	public static void main(String[] args) throws Exception {
		
		String cp = "http://teams.inside.pearson.com/sch2/sim/p/math/CMP3/CMP3%20Program%20Agnostic%20Features[1].pdf";
		String result = java.net.URLDecoder.decode(cp, "UTF-8");
		System.out.println(result);
		System.out.println(UrlEscapers.urlFragmentEscaper().escape(StringEscapeUtils.unescapeHtml4(result)));
	}

}
