package sharepoint;



	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.regex.PatternSyntaxException;

public class Regex {

		public static void main(String[] args) {
		
			
			
			String [] u = {
					
					"http://teams.inside.pearson.com/sch2/sim/p/a/learna/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/a/learna/DAT-CII&amp;FolderCTID=&amp;View={C67EAD5D-2473-4931-A284-FF91047FFCBE}",
					"http://teams.inside.pearson.com/sch2/sim/p/a/learna/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/a/learna/DAT-CII&amp;FolderCTID=&amp;View={C67EAD5D-2473-4931-A284-FF91047FFCBE}",
					"http://teams.inside.pearson.com/sch2/sim/p/a/learna/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/a/learna/Formative Item Bank/Alignment Coverage by State&amp;FolderCTID=&amp;View={C67EAD5D-2473-4931-A284-FF91047FFCBE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/Certiport_Flyers&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/Certiport_Presentation&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/Certiport_Presentation&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Agriscience&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Agriscience&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Business&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Business&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Family Consumer Science_Criminal Justice&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Family Consumer Science_Criminal Justice&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Health Science&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Health Science&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Health Science&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Information Technology_Computer Applications&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Information Technology_Computer Applications&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Technical Trades_Automotive&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Flyers_ Presentations/Technical Trades_Automotive&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CTE Programs Internal Sell Sheets&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/CyberSecurity&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/Engineering and Technology Education&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/NCCER Electrical (NEW as of Q4 2017)&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/Office16/eCourse&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/SalesforceProductCodes_Tips&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/Career and Technical Education/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Career and Technical Education/SalesforceProductCodes_Tips&amp;FolderCTID=&amp;View={EC182E4F-84EF-42A2-A532-D4A5AC63D1AE}",
					"http://teams.inside.pearson.com/sch2/sim/p/human/Realidades/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/human/Realidades/Realidades Â©2014 Digital Edition&amp;FolderCTID=&amp;View={2C428711-278A-4617-BCC6-D8DB5ED6A177}",
					"http://teams.inside.pearson.com/sch2/sim/p/human/Realidades/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/human/Realidades/Realidades Â©2014 Digital Edition&amp;FolderCTID=&amp;View={2C428711-278A-4617-BCC6-D8DB5ED6A177}",
					"http://teams.inside.pearson.com/sch2/sim/p/Intervention/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Intervention/2018 Play Ball AGM Sales Contest&amp;FolderCTID=&amp;View={D3E4F47F-46F4-4E2D-83AC-62E806B62015}",
					"http://teams.inside.pearson.com/sch2/sim/p/Intervention/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/Intervention/2018 Play Ball AGM Sales Contest&amp;FolderCTID=&amp;View={D3E4F47F-46F4-4E2D-83AC-62E806B62015}",
					"http://teams.inside.pearson.com/sch2/sim/p/math/inv/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/math/inv/Situation documents&amp;FolderCTID=&amp;View={0672C7F2-4F44-480A-AD16-D925E69AED6F}",
					"http://teams.inside.pearson.com/sch2/sim/p/math/ph12/Forms/AllItems.aspx?RootFolder=/sch2/sim/p/math/ph12/for Julie&amp;FolderCTID=&amp;View={87332F68-629C-4803-93E1-27FC9EF72713}",


					
					
			};
			
			
			
			
			
			for (int i=0;i<u.length;i++)
			
			{
				
				String params = u[i];

			try {
			    Pattern p = Pattern.compile("RootFolder=([^&]+)");
			    Matcher m = p.matcher(params);
			    while (m.find()) {
			    	String cartid = m.group();
			        System.out.println(cartid.substring(11,cartid.length()));
			    } 
			} catch (PatternSyntaxException ex) {
			    // error handling
			}	
				
			}
			
			
		
			
			
			
			
			
			

		}

	}