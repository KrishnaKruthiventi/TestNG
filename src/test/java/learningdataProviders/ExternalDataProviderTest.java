package learningdataProviders;

import org.testng.annotations.Test;

public class ExternalDataProviderTest {
	
	@Test(dataProvider = "userRoles", dataProviderClass = ExternalDataProvider.class)
	public void testUserRoles(String role, String permissions) {
		System.out.println("Role: " + role + " has " + permissions);
	}
}
