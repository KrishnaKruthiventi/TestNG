package testNgParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class APITesting {
	
	@DataProvider(name = "apiEndpoints")
	public Object[][] provideApiEndpoints(){
		return new Object[][] {
			{"/users", 200},
			{"/products", 200},
			{"/orders", 401},
			{"/nonexistent", 404}
		};
	}
	
	@Test(dataProvider = "apiEndpoints")
	public void testApiEndpoints(String endpoint, int expectedStatus) {
		given()
			.baseUri("https://api.example.com")
		.when()
			.get(endpoint)
		.then()
			.statusCode(expectedStatus);
	}
}
