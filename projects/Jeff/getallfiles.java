package file_hierarchy;
// get list of files in PC dir
import java.io.File;

public class getallfiles {

	 public static void main (String args[]) {

			displayIt(new File("C:\\tmp\\sharepointdownload\\teams.inside.pearson.com"));
		}
		
		public static void displayIt(File node){
			
			System.out.println(node.getAbsoluteFile());
			
			if(node.isDirectory()){
				String[] subNote = node.list();
				for(String filename : subNote){
					displayIt(new File(node, filename));
				}
			}
			
		}
	}