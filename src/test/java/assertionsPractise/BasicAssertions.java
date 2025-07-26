package assertionsPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAssertions {
	
	@Test
	public void testStringEquality() {
		String actual = "Hello";
		String expected = "Hello";
		
		Assert.assertEquals(actual, expected, "Strings should be equal");
	}
	
	@Test
	public void testNumberEquality() {
		int actual = 5;
		int expected = 5;
		
		Assert.assertEquals(actual, expected, "Numbers should be equal");
	}
	
	@Test
	public void testArrayEquality() {
		int[] actual = {1, 2, 3};
		int[] expected = {1, 2, 3};
		
		Assert.assertEquals(actual, expected, "Arrays should be equal");
				
	}
	
	@Test
	public void testNotEquals() {
		String actual = "Hello";
		String unexpected = "World";
		
		Assert.assertNotEquals(actual, unexpected, "Strings should not be equal");
	}
	
	@Test
	public void testBooleanConditions() {
		boolean isAvailable = true;
		Assert.assertTrue(isAvailable, "Value should be true");
		
		boolean isDeleted = false;
		Assert.assertFalse(isDeleted, "Value should be false");
	}
	
	@Test
	public void testNullConditions() {
		Object nullObject = null;
		Assert.assertNull(nullObject, "Object should be null");
		
		String notNullString = "Test";
		Assert.assertNotNull(notNullString, "String should not be null");
	}
	
}
