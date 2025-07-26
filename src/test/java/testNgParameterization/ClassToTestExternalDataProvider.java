package testNgParameterization;

import org.testng.annotations.Test;

public class ClassToTestExternalDataProvider {
	
	@Test(dataProvider = "externalUserData", dataProviderClass = ExternalDataProviders.class)
	public void testExternalData(String user, String pass, String role) {
		System.out.println("User: " + user);
		System.out.println("Pass: " + pass);
		System.out.println("Role: " + role);
	}
}
