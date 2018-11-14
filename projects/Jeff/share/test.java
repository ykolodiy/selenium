package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URLDecoder;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.net.UrlEscapers;

public class test {
	public static void main(String[] args) throws Exception {

		
		String p = "http://teams.inside.pearson.com/sch2/sim/p/pd/pd/Programs/Literacy/DRA%E2%84%A22/Agendas/Lit_DRA2_DiggingInData.pdf";
		

		
		 String fileOut = FilenameUtils.getPath(p).replaceAll("http://teams.inside.pearson.com/", "");
		 
		 System.out.println(fileOut);
	}

}
