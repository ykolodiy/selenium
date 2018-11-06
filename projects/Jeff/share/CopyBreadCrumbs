package sharepoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;

public class CopyFiles {
	static int files = 0;
	static int folders = 0;
			static ArrayList<String> url=new ArrayList<String>();
		static ArrayList<String> bread=new ArrayList<String>();
	
	public static void main(String[] args) throws Exception {
		
		
// 1 read map information and put to arrays
		// create 2 arrays       


			// fill arrays
	  	  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\11url.txt")); 
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
			  url.add(st);
		  }
		  br.close();
		  
		  
	  	  BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\5\\11bread.txt")); 
		  String st2; 
		  while ((st2 = br2.readLine()) != null) 
		  {
			  bread.add(st2);
		  }		
		  br2.close();
		
			System.out.println("main method started");
// loop thru each file and folder
			displayIt(new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\sch2"));
			

		System.out.println("main method ended");

	}

	
	
	
	
	
	
	
	
	public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		try {
	    Files.copy(source.toPath(), dest.toPath());}
		catch(Exception e) {System.out.println("Copy: "+e.getMessage());}
	}
	
	
	
	public static void displayIt(File node){
	
		if (node.isFile())
		{
			String folder = FilenameUtils.getFullPath(node.toString()).replace("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\sch2\\sim", "");
			String file = FilenameUtils.getName(node.toString());
			
	
			
			  try {
			  String newfolder = bread.get(url.indexOf(folder));
			
								 //creating a folder structure here. if it exist will not do nothing
							  try{
							  File dir = new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\schALFRES\\sim\\"+newfolder);
							  dir.mkdirs();
							  
							  
					  			}
					  catch (Exception e){
					  //System.err.println("Error Folder: " + e.getMessage());
					  System.out.println(newfolder+" > Folder Problem");
					  }
							  
							  
							  
							  
								File source = new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\sch2\\sim\\"+folder+file);
						        File dest = new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\schALFRES\\sim\\"+newfolder+file);
							
							try {

						        copyFileUsingJava7Files(source, dest);
						      
							}
							
							catch(Exception e) {
								System.out.println(source+e.getMessage());
								
							}
							  
							  
							  
							  
						


		
			
						
						
			  }
			  catch(Exception e) {System.out.println("displayIt: "+e.getMessage());}
		
	}
		
		if(node.isDirectory()){
			//System.out.println(node.getAbsoluteFile());
		
			
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
		}
	
	}
}
