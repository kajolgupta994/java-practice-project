package Tests;

import org.testng.annotations.Test;

public class TestGroups {

	@Test(groups = "smokeTest")
	public void testSmoke() {
		System.out.println("Smoke Test executed");
	}

	@Test(groups = "sanity")
	public void testSanity() {
		System.out.println("Sanity Test executed");
	}

	@Test(groups = "regression")
	public void testRegression() {
		System.out.println("Regression Test executed");
	}

	@Test(groups = { "smokeTest", "regression" })
	public void testSmokeAndRegression() {
		System.out.println("Smoke and Regression Test executed");
	}
}
