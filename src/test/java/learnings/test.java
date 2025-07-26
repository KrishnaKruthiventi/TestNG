package learnings;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	
	@Test
	public void add() {
		 System.out.println(2 + 5);
		 
	 }
	
	@Test(enabled = false)
	public void subtract() {
		System.out.println(5 - 2);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class");
	}
	
}
