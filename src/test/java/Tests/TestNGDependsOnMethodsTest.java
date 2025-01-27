package Tests;

import org.testng.annotations.Test;

public class TestNGDependsOnMethodsTest {

	@Test(dependsOnMethods = { "testTwo" })
	public void testOne() {
		System.out.println("TestOne Method");
	}

	@Test
	public void testTwo() {
		System.out.println("TestTwo Method");
	}

}
