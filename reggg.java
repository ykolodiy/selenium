package playground;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reggg {

	public static void main(String[] args) {
	
		Scanner d = new Scanner(System.in);
				int u = d.nextInt();d.nextLine();
		String y[]=new String [u];
		int h =0;
				for (int i=0; i<u; i++) {
					y[i] = d.nextLine();
					
					
					
					Pattern p = Pattern.compile("[h|H][a|A][c|C][k|K][e|E][r|R][r|R][a|A][n|N][k|K]");
			        Matcher m = p.matcher(y[i]);
					
										if (m.find()){
						h=h+1;
											
						}
														}
				d.close();
		
				System.out.println(h);
				
				
				
		//System.out.println(Arrays.toString(y));
	}

}
