package testNgParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParameterTests {
	
	@Test
	@Parameters({"username", "password"})
	public void loginTest(String username, String password) {
		System.out.println("Login with: ");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	@Test
	@Parameters({"url", "timeout"})
	public void connectionTest(String url, int timeout) {
		System.out.println("Connecting to:");
		System.out.println("URL: " + url);
		System.out.println("Timeout: " + timeout + " seconds");
	}
}
