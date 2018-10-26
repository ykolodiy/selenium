package sharepoint;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class BrokenFile {

	public static void main(String[] args) {
		// INSERT URL ENCODED STRINGS ONLY
			System.out.println(BrokenFile.exists("https://uswip.pearsoncms.com/alfresco/s/api/path/content;cm:content/workspace/SpacesStore/company_home/sites/ls-webops-testing/documentLibrary/Folder%20Type%20Test%20Data/interactive_science_overview_sm_4.mov?alf_ticket=TICKET_c68cd0375fb334f5d5d037a944be0ac5e5b2538e"));

			/*
			  output :
			    true
			    false
			*/    
			}

			public static boolean exists(String URLName){
			try {
			  HttpURLConnection.setFollowRedirects(false);
			  // note : you may also need
			  //        HttpURLConnection.setInstanceFollowRedirects(false)
			  HttpURLConnection con =
			     (HttpURLConnection) new URL(URLName).openConnection();
			  con.setRequestMethod("HEAD");
			  return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
			}
			catch (Exception e) {
			   e.printStackTrace();
			   return false;
			}
			
			
			
			
			}
			}
