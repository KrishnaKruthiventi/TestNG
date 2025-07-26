package testNgParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {
	
	@DataProvider(name = "loginCredentials")
	public Object[][] provideCredentials(){
		return new Object[][] {
			{"user1", "password1"},
			{"user2", "password2"},
			{"user3", "password3"}
		};
	}
	
	@Test(dataProvider = "loginCredentials")
	public void testLogin(String username, String password) {
		System.out.println("Testing login with:");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
}
