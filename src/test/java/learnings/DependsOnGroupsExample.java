package learnings;

import org.testng.annotations.Test;

public class DependsOnGroupsExample {
	
	@Test(groups = {"init"})
	public void setupEnvironment() {
		System.out.println("Setting up environment....");
	}
	
	@Test(groups = {"init"})
	public void setupDatabase() {
		System.out.println("Setting up database...");
	}
	
	@Test(dependsOnGroups = {"init"})
	public void runMainTests() {
		System.out.println("Running main tests after init group...");
	}
}
