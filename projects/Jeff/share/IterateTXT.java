package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.io.FilenameUtils;

public class IterateTXT {


	
	public static void main(String[] args) throws Exception {
	
		
		String [] x = {
				
				"png",
				"master",
				"xls",
				"docx",
				"jpg",
				"doc",
				"pdf",
				"ppt",
				"xlsx",
				"exe",
				"zip",
				"csv",
				"xlsm",
				"avi",
				"pptm",
				"pptx",
				"pub",
				"dot",
				"htm",
				"smc",
				"xlt",
				"wmv",
				"mp4",
				"html",
				"mp3",
				"m4v",
				"mov",
				"psd",
				"key",
				"arf",
				"ai",
				"tiff",
				"swf",
				"kmz",
				"eps",
				"crdownload",
				"dotx",
				"gif",
				"msg",
				"mpg",
				"ppsx",
				"jpeg",
				"webm",
				"tif",
				"txt"

};
		
		
		
		
		
		
		for (int u=0;u<x.length;u++)
		{
		  int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\sharepoint2.txt")); 
		  
		  String st; 
		  
		  
		  
		  while ((st = br.readLine()) != null) 
		  {
             String l = "."+x[u];
			if (st.endsWith(l)) {
				y = y+1;
		    //System.out.println(FilenameUtils.getExtension(st)); 
			}

		  }
		br.close();
		
		System.out.println(x[u]+" "+y);
		}
		
		
		
		
		
	}

}
