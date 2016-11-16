package playground;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phone3 {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int r =d.nextInt();d.nextLine();
		
		for(int i=0; i<r; i++ )
			
		{
		String u = d.nextLine();
		Pattern p = Pattern.compile("^hackerrank");
		Pattern pj = Pattern.compile("hackerrank$");
		Pattern po = Pattern.compile("^hackerrank$");
        Matcher m1 = p.matcher(u);
        Matcher m2 = pj.matcher(u);
        Matcher m3 = po.matcher(u);
							
        if(m1.find() && !m2.find() && !m3.find())
            System.out.println("1");

        else if(m2.find() && !m1.find() && !m3.find())
            System.out.println("2");

        else if(m3.find() && !m1.find() && !m2.find())
            System.out.println("0");

        else  if(!m1.find() && !m2.find() && !m3.find())
            System.out.println("-1");
			
			
			
						}
					
		}					
		
		
		
		
		
	}

