package Tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipExceptionTest {

	@Test
	public void skipTest() {
		String str = "Skip Test";
		if (str.equals("Skip Test")) {
			throw new SkipException("Skipping the test...");
		} else {
			System.out.println("Else Statement");
		}
	}

	@Test
	public void nonSkipTest() {
		System.out.println("Not skipping test...");
	}

}
