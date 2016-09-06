package redesign;






import java.io.*; 




public class filereader {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\1\\abc2.txt"); 
		BufferedReader br = new BufferedReader(fr);
		

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			br.close();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}