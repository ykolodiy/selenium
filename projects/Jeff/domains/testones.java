package JeffDomainAnalysis;

import java.net.HttpURLConnection;
import java.net.URL;

public class testones {

	public static void main(String[] args) throws Exception{
			
		String urlString = "http://admin.devjobs.lin.pearsonschool.com/";
		

		
		try {
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			System.out.println(code);
		
			}
		catch (Exception e){
			System.out.println(urlString+">broken");
		}
		
		
		
		
		
		
	
		
		
	}

}
