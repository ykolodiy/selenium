package sharepoint;

import java.io.File;

public class getallfilesfolders {
static int files = 0;
static int folders = 0;

	
	public static void main (String args[]) {

		displayIt(new File("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\4\\schALFRES\\sim"));
		//displayIt(new File("C:\\Users\\vkoloyu\\Downloads\\1sdsdsd"));
		//displayIt(new File("C:\\Products, Programs and Services"));
		System.out.println("files: "+files);
		System.out.println("folders: "+folders);
	
	}
	
	public static void displayIt(File node){

		
		//System.out.println(node.getAbsoluteFile());
		
		
		if (node.isFile())
		{
		files = files+1;
		//System.out.println(node.getName());
		System.out.println(node.getAbsoluteFile());
		
		}
		if (node.isDirectory())
		{
			folders = folders+1;
			//System.out.println(node.getAbsoluteFile());
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