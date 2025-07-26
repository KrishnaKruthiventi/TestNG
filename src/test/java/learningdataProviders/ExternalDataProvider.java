package learningdataProviders;

import org.testng.annotations.DataProvider;

public class ExternalDataProvider {
	
	@DataProvider(name = "userRoles")
	public static Object[][] provideUserRoles(){
		return new Object[][] {
			{"admin", "full access"},
			{"editor", "edit access"},
			{"viewer", "read-only access"}
		};
	}
}
