package testNgParameterization;

import org.testng.annotations.Test;

public class FactoryTest {
	private String browser;
	
	public FactoryTest(String browser) {
		this.browser = browser;
	}
	
	@Test
	public void testBrowser() {
		System.out.println("Testing on browser: " + browser);
	}
	
	@Test
	public void testBrowserSpecificFeature() {
		System.out.println("Testing browser-specific feature on: " + browser);
	}
}
