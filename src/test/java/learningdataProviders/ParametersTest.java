package learningdataProviders;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Test
	@Parameters({"browser", "version"})
	public void testBrowser(String browser, String version) {
		System.out.println("Running test on " + browser + " version " + version);
	}
}
