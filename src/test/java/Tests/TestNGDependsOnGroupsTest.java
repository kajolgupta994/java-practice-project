package Tests;

import org.testng.annotations.Test;

public class TestNGDependsOnGroupsTest {

	@Test(groups = { "FirstGroup" })
	public void testOne() {
		System.out.println("Test case 1");
	}

	@Test(groups = { "SecondGroup" })
	public void testTwo() {
		System.out.println("Test case 2");
	}

}
