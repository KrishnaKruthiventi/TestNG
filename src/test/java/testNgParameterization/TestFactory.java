package testNgParameterization;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactory {
	
	@Factory
	@Test
	public Object[] createInstances() {
		return new Object[] {
				new FactoryTest("Chrome"),
				new FactoryTest("Firefox"),
				new FactoryTest("Edge")
		};
	}
}
