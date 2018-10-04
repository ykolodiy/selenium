package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.io.FilenameUtils;

public class IterateTXT {


	
	public static void main(String[] args) throws Exception {
	
		
		String [] x = {
				
				"com",
				"aspx",
				"doc",
				"xlsx",
				"pdf",
				"xls",
				"tif",
				"ppt",
				"txt",
				"vsd",
				"html",
				"gif",
				"vdx",
				"docx",
				"msg",
				"jpg",
				"png",
				"pptx",
				"mpp",
				"mht",
				"6662",
				"zip",
				"htm",
				"swf",
				"js",
				"exe",
				"pub",
				"dot",
				"csv",
				"wmv",
				"mp4",
				"mp3",
				"m4v",
				"mov",
				"psd",
				"key",
				"arf",
				"0",
				"tiff",
				"kmz",
				"2017",
				"eps",
				"mpg",
				"dotx",
				"pptm",
				"org",
				"ppsx",
				"webm",
				"jpeg"

		};
		
		
		
		
		
		
		for (int u=0;u<x.length;u++)
		{
		  int y=0;
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\clean.txt")); 
		  
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
