package sharepoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.io.FilenameUtils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.net.UrlEscapers;

public class IterateTXT4Ping {
	
	public static void main(String[] args) throws Exception {

		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vkoloyu\\Projects\\JEFF\\sharepoint\\3attemps\\alf.txt")); 
		  
		  String st; 
		  int x=1;
		  
		  while ((st = br.readLine()) != null) 
		  {
         
			//String s = "http://"+st;
			
	        String ss = UrlEscapers.urlFragmentEscaper().escape(st);

	        try {
			System.out.println(x+" "+st+">"+IterateTXT4Ping.exists(ss));
	        }
	        catch(Exception e) {
	        	System.out.println(x+" "+st+">ERROR");
	        	
	        }


		x=x+1;

		  }
		br.close();
	}
	
	
	public static int exists(String URLName){
	try {
	 HttpURLConnection.setFollowRedirects(false);
	  // note : you may also need
	  //HttpURLConnection.setInstanceFollowRedirects(false)
	  HttpURLConnection con =
	     (HttpURLConnection) new URL(URLName).openConnection();
	  
	  
	  con.setRequestMethod("HEAD");
	  
	  // WHEN CHECK ALFRESCO LINKS CHANGE METHOD TO GET BECAUSE HEAD IS NOT ALLOWED
	  
	  
	  con.setConnectTimeout(4000);
	  con.setReadTimeout(4000);
	 // return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
	  return (con.getResponseCode());
	}
	catch (Exception e) {
		System.out.print(URLName);
	   //e.printStackTrace();
	   return 0;
	}

	}
}
