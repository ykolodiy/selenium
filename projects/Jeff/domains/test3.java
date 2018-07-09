package JeffDomainAnalysis;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class test3 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		// Declaring and initialize  HtmlUnitWebDriver
		driver = new HtmlUnitDriver();
		
		String entryurl = "http://98.ampreading.pearsontc.net";
		
		URI uri0 = new URI(entryurl);
		String domain0 = uri0.getHost();
		if (domain0.startsWith("www.")) { domain0 =  domain0.substring(4);}
		String path0 = uri0.getPath();
		
		
		driver.get(entryurl);
		
		String lasturl = driver.getCurrentUrl();
		
		URI uri = new URI(lasturl);
		String domain = uri.getHost();
		if (domain.startsWith("www.")) { domain =  domain.substring(4);}
		String path = uri.getPath();
		String q = uri.getQuery();
		if (path.endsWith("/")){path = path.substring(0, path.length() - 1);}
		
		String a =domain0+path0;
		String b = domain+path;
		System.out.println(domain0+path0);
		System.out.println(domain+path);
		System.out.println(path);
		System.out.println(q);
		
		if (a.equals(b) && q == null){System.out.println(entryurl+",site,");}

		else if (!path.equals("") && q != null) {System.out.println(entryurl+" ,specific redirect,"+driver.getCurrentUrl());}
		else if (!path.equals("") && q == null) {System.out.println(entryurl+" ,specific redirect,"+driver.getCurrentUrl());}
		else if (path.equals("")  && q != null) {System.out.println(entryurl+" ,general redirect,"+driver.getCurrentUrl());}
		else if (path.equals("")  && q == null ){System.out.println(entryurl+" ,general redirect,"+driver.getCurrentUrl());}
		
		
		
		else {System.out.println(entryurl+" checkme");}
		}



	}

