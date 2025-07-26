package assertionsPractise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void testSoftAssertions() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(5, 5, "First check");
		softAssert.assertTrue("hello".contains("ell"), "Second check");
		softAssert.assertNull(null, "Third check");
		
		
		softAssert.assertEquals(5,  6, "Fourth check - will fail");
		
		softAssert.assertTrue(true, "Fifth check");
		softAssert.assertAll();
	}
}
