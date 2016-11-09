package playground;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class json {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException {
		// TODO Auto-generated method stub
		   String sURL = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=c1a427088c0cd8242ee55beafb13add2&units=metric"; //just a string

		    // Connect to the URL using java's native library
		    URL url = new URL(sURL);
		    HttpURLConnection request = (HttpURLConnection) url.openConnection();
		    request.connect();

		    // Convert to a JSON object to print data
		    JsonParser jp = new JsonParser(); //from gson
		    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		    JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		   String  zipcode = rootobj.get("id").getAsString(); //just grab the zipcode
		   System.out.println(zipcode);
	}

}
