package file_hierarchy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FilenameUtils;

public class getfilenamefromlist {

	public static void main(String[] args) throws Exception {
		
		URL url;
		try (BufferedReader br = new BufferedReader(new FileReader("C://tmp//files.txt"))) {
		     			String line;
			while ((line = br.readLine()) != null) {
				url = new URL(line);
				String k = java.net.URLDecoder.decode(FilenameUtils.getName(url.getPath()), "UTF-8");
				System.out.println(k);
			}

			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
