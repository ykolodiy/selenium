package alfresco;
//prints list of isbn in this folder
import java.io.File;

public class Howmanyfiles {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\vkoloyu\\alfrescoPDF\\rest60\\PNG");
		File[] listOfFiles = folder.listFiles();
		
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	 
		        System.out.println(listOfFiles[i].getName().substring(0, 10));
		       
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }

	}

}
