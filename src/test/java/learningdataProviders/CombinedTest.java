package learningdataProviders;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CombinedTest {
	
	@BeforeTest
	@Parameters({"environment"})
	public void setup(String env) {
		System.out.println("Running tests in environment: " + env);
	}
	
	@DataProvider(name = "userData")
	public Object[][] provideUserData(){
		return new Object[][] {
			{"user1@test.com", "User One"},
			{"user2@test.com", "User Two"}
		};
	}
	
	@Test(dataProvider = "userData")
	public void testUserProfile(String email, String name) {
		System.out.println("Testing profile for: " + name + " (" + email + ")");
	}
}
