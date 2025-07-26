package testNgParameterization;

import org.testng.annotations.DataProvider;

public class ExternalDataProviders {
	
	@DataProvider(name = "externalUserData")
	public static Object[][] provideUserData(){
		return new Object[][] {
			{"external1", "extpass1", "admin"},
			{"external2", "extpass2", "user"},
			{"external3", "extpass3", "guest"}
		};
	}
}
