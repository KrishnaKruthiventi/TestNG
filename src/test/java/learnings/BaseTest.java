package learnings;

import org.testng.annotations.Test;

@Test(groups = {"base-group"})
public class BaseTest {
	
	@Test
	public void baseMethod() {
		System.out.println("Base method runs in base-group");
	}
}
