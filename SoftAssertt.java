package softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertt {

	

	@Test (priority=1)
	public void testSoft(){
		
SoftAssert ass = new SoftAssert();
		System.out.println("test 1");
		ass.assertEquals(13, 14);
		System.out.println("test 2");
		ass.assertAll();
	}
	
	@Test (priority=2)
	
	public void testHard(){
		System.out.println("test 3");
		Assert.assertEquals(13, 14);
		System.out.println("test 4");
		
	}
	}
	
	
	
	
	
	
	
	
	

