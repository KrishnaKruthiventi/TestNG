package assertionsPractise;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.*;

import org.testng.annotations.Test;

public class HamcrestPractise {
	
	@Test
	public void testHamcrestMatchers() {
		assertThat("Hello World", containsString("Hello"));
		assertThat(5, greaterThan(3));
		assertThat(5, lessThanOrEqualTo(5));
//		assertThat(new int[]{1, 2, 3}, hasItem(2));
		assertThat("", emptyString());
		assertThat(new ArrayList<>(), empty());
		assertThat("test", allOf(
				startsWith("te"),
				endsWith("st"),
				notNullValue()
				));
		
	}
}
