package testNgParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithDifferentDataTypes {
	
	@DataProvider(name = "mixedData")
	public Object[][] provideMixedData(){
		return new Object[][] {
			{"John", 25, true},
			{"Alice", 30, false},
			{"Bob", 22, true}
		};
	}
	
	@Test(dataProvider = "mixedData")
	public void testMixedData(String name, int age, boolean isActive) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Active: " + isActive);
	}
}
