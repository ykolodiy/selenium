package alfresco;

import java.io.File;
import java.io.IOException;

public class RenameFilestoISBN {


    public static void main(String[] argv) throws IOException {

        File folder = new File("C:\\Users\\vkoloyu\\Documentum\\322\\181");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File("C:\\Users\\vkoloyu\\Documentum\\322\\181\\"+listOfFiles[i].getName()); 
                String o = f.toString().substring(36, 46);

                f.renameTo(new File("C:\\Users\\vkoloyu\\Documentum\\322\\181\\"+o+".pdf"));
                System.out.println(o);
            }
        }

      
    }
}
