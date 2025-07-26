package learnings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlyForGroupsExample {
	
	@BeforeMethod(onlyForGroups = {"smoke"})
	public void beforeSmokeTests() {
		System.out.println("Before Smoke Test ONLY");
	}
	
	@Test(groups = {"smoke"})
	public void smokeTest() {
		System.out.println("Running smoke test");
	}
	
	@Test(groups = {"regression"})
	public void regressionTest() {
		System.out.println("Running regression test");
	}
}
