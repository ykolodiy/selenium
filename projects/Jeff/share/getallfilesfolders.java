package sharepoint;

import java.io.File;

public class getallfilesfolders {
static int files = 0;
static int folders = 0;
	
	
	public static void main (String args[]) {

		displayIt(new File("C:\\Users\\vkoloyu\\edmonton"));
		
		System.out.println("files: "+(files-folders));
		System.out.println("folders: "+folders);
	}
	
	public static void displayIt(File node){
		
		System.out.println(node.getAbsoluteFile());
		files = files+1;
		
		if(node.isDirectory()){
			folders = folders+1;
			
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
		}
		
	}
}