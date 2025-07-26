package learningdataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MixedDataProviderTest {
	
	@DataProvider(name = "mixedData")
	public Object[][] provideMixedData(){
		return new Object[][] {
			{"John", 25, true},
			{"Alice", 30, false},
			{"Bob", 40, true}
		};
	}
	
	@Test(dataProvider = "mixedData")
	public void testUserData(String name, int age, boolean isActive) {
		System.out.println(name + " is " + age + " years old. Active: " + isActive);
	}
}
