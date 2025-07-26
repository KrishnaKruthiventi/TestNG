package learnings;

import org.testng.annotations.Test;

public class GroupsExample {
	
	@Test(groups = {"smoke"})
	public void testLogin() {
		System.out.println("Smoke test: Login");
	}
	
	@Test(groups = {"regression"})
	public void testAddProduct() {
		System.out.println("Regression Test: Add Product");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void testLogout() {
		System.out.println("Both Smoke and Regression: Logout");
	}

}
