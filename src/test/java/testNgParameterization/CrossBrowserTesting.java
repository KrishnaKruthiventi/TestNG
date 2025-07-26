package testNgParameterization;

import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	@DataProvider(name = "browsers")
	public Object[][] provideBrowsers(){
		return new Object[][] {
			{"chrome", "latest", "Windows 10"},
			{"firefox", "latest", "macOS 11"},
			{"edge", "latest", "Windows 10"}
		};
	}
	
	@Test(dataProvider = "browsers")
	public void crossBrowserTest(String browser, String version, String os) {
		MutableCapabilities capabilities = new MutableCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("browserVersion", version);
		capabilities.setCapability("platformName", os);
		
		WebDriver driver = new RemoteWebDriver(
				new URL("https://hub.browserstack.com/wd/hub"), capabilities);
		
		try {
			driver.get("https://example.com");
			Assert.assertEquals(driver.getTitle(), "Example Domain");
		} finally {
			driver.quit();
		}
	}
}
