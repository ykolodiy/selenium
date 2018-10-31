package sharepoint;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseHtml {

	public static void main(String[] args) {
		
		
		// 1 SELECT post_content FROM `wp_posts` WHERE `post_content` like '%image.ibb.co%'
		
		// 2 java extract all links from text/html
		String html = "<p class=\"Text\" style=\"text-align: justify;\"><span style=\"color: #000000;\">Одним з напрямків діяльності \"Оселі\" є майстерня з оббивки та ремонту меблів. Майстерня служить осередком працетерапії, навчання, а також є одним з джерел доходів спільноти. Тут мешканці Спільноти отримують навички праці з ремонту меблів, обтягування мякої частини меблів, шиття.</span></p>\n" + 
				"<span style=\"color: #000000;\">Залучення людей, що є представниками маргінальної групи суспільства до реставраційної діяльності несе у собі не лише можливість здобуття навичок навчання та праці, але має і психотерапевтичний ефект:  відновлюючи старі речі, особа поруч з цим відбудовує власні пошкоджені психологічні конструкти.</span>\n" + 
				"<p class=\"Text\" style=\"text-align: justify;\"><span style=\"color: #000000;\">Знаючи про нашу діяльність, мешканці міста Львова звертаються до нас із замовленнями ремонту та обтяжки м'яких меблів, даючи нам пожертву за виконану роботу. Багато людей не можуть дозволити собі придбати нові меблі, тому заміна оббивки та дрібний ремонт є добрим виходом з ситуації.</span></p>\n" + 
				"<p class=\"Text\" style=\"text-align: justify;\"><span style=\"color: #000000;\">Мешканці \"Оселі\", що здобули професійні навички під керівництвом інструктора, виконують роботу якісно, тому послуги майстерні користуються попитом.</span></p>\n" + 
				"<p class=\"Text\" style=\"text-align: justify;\"><span style=\"color: #000000;\">Дехто просто віддає вживані меблі та предмети побуту, які ми приводимо до ладу та реалізуємо у благодійній крамничці. Також ми надаємо низку супутніх послуг, такі як доставка меблів, виїзд майстра до клієнта, консультації стосовно вибору тканин.</span></p>\n" + 
				"<span style=\"color: #000000;\">Ідеєю майстерні є гасло «Непотрібних речей, як і непотрібних людей не буває».</span>\n" + 
				"\n" + 
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" + 
				"<div class=\"container\">\n" + 
				"<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n" + 
				"\n" + 
				"<!-- Indicators --><!-- Wrapper for slides -->\n" + 
				"<div class=\"carousel-inner\">\n" + 
				"<div class=\"item active\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/m1fGE6/workshop_1.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/m0uySR/workshop_2.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/h2KMgm/workshop_3.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/ix6Ou6/workshop_4.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/modsnR/workshop_5.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/ikmdSR/workshop_6.jpg\" /></div>\n" + 
				"<div class=\"item\"><img style=\"width: 100%;\" src=\"https://image.ibb.co/iP7k7R/workshop_7.jpg\" /></div>\n" + 
				"</div>\n" + 
				"<!-- Left and right controls -->\n" + 
				"\n" + 
				"<span class=\"sr-only\">Previous</span>\n" + 
				"<span class=\"sr-only\">Next</span>\n" + 
				"\n" + 
				"</div>\n" + 
				"</div>";
		
		
		// extract all href
		Pattern linkPattern = Pattern.compile("(?<=href=\").*?(?=\")",  Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		
		/*
		 * 
		 * or all src 		Pattern linkPattern = Pattern.compile("(?<=src=\").*?(?=\")",  Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
		 */
		
		Matcher pageMatcher = linkPattern.matcher(html);
		ArrayList<String> links = new ArrayList<String>();
		while(pageMatcher.find()){
		    links.add(pageMatcher.group());
		}
		
		
		for (String k:links) {System.out.println(k);}
		
		
	}

}
