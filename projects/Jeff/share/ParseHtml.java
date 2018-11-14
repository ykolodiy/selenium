package sharepoint;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseHtml {

	public static void main(String[] args) {
		
		
		// 1 SELECT post_content FROM `wp_posts` WHERE `post_content` like '%image.ibb.co%'
		
		// 2 java extract all links from text/html
		String html = "<tr>\n" + 
				"				<td style=\"white-space:nowrap;\"><a class=\"zz1_TopNavigationMenu_1 ms-topnav zz1_TopNavigationMenu_3\" href=\"/sch2/sim/default.aspx\" accesskey=\"1\" style=\"border-style:none;font-size:1em;\">School Home</a></td>\n" + 
				"			</tr>\n" + 
				"		</table></td><td style=\"width:0px;\"></td><td style=\"width:0px;\"></td><td onmouseover=\"Menu_HoverRoot(this)\" onmouseout=\"Menu_Unhover(this)\" onkeyup=\"Menu_Key(event)\" id=\"zz1_TopNavigationMenun1\"><table class=\"ms-topnav zz1_TopNavigationMenu_4\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n" + 
				"			<tr>\n" + 
				"				<td style=\"white-space:nowrap;\"><a class=\"zz1_TopNavigationMenu_1 ms-topnav zz1_TopNavigationMenu_3\" href=\"/sch2/sim/p/default.aspx\" style=\"border-style:none;font-size:1em;\">Products, Programs and Services</a></td>\n" + 
				"			</tr>\n" + 
				"		</table></td><td style=\"width:0px;\"></td><td style=\"width:0px;\"></td><td onmouseover=\"Menu_HoverRoot(this)\" onmouseout=\"Menu_Unhover(this)\" onkeyup=\"Menu_Key(event)\" id=\"zz1_TopNavigationMenun2\"><table class=\"ms-topnav zz1_TopNavigationMenu_4\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n" + 
				"			<tr>\n" + 
				"				<td style=\"white-space:nowrap;\"><a class=\"zz1_TopNavigationMenu_1 ms-topnav zz1_TopNavigationMenu_3\" href=\"/sch2/sim/bu/default.aspx\" style=\"border-style:none;font-size:1em;\">BU&#39;s, Departments, and Initiatives</a></td>\n" + 
				"			</tr>\n" + 
				"";
		
		
		// extract all href
		Pattern linkPattern = Pattern.compile("(?<=href=\").*?(?=\")",  Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		
		/*
		 or all src 		Pattern linkPattern = Pattern.compile("(?<=src=\").*?(?=\")",  Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		 */
		
		Matcher pageMatcher = linkPattern.matcher(html);
		ArrayList<String> links = new ArrayList<String>();
		while(pageMatcher.find()){
		    links.add(pageMatcher.group());
		}
		
		
		for (String k:links) {System.out.println(k);}
		
		
	}

}
