package assertionsPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedAssertions {
	
	@Test
	public void testObjectReferences() {
		String s1 = new String("Test");
		String s2 = new String("Test");
		String s3 = s1;
		
		Assert.assertEquals(s1, s2);
		Assert.assertNotSame(s1, s2, "Different objects");
		Assert.assertSame(s1, s3, "Same object reference");
		
	}
	
	@Test
	public void testExceptionthrowing() {
		Assert.assertThrows(ArithmeticException.class, () ->{
			int result = 10 / 0;
		});
		
		Exception exception = Assert.expectThrows(IllegalArgumentException.class, () ->{
			throw new IllegalArgumentException("Invalid argument");
		});
		Assert.assertEquals(exception.getMessage(), "Invalid argument");
	}
	
	
}
