package learnings;

import org.testng.annotations.Test;

public class InheritGroupsExample extends BaseTest{
	
	@Test
	public void childMethod() {
		System.out.println("Child method also in base-group due to inheritGroups=true");
	}
}
