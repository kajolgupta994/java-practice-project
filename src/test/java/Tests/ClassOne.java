package Tests;

import org.testng.annotations.Test;

public class ClassOne {
	@Test
	public void testClassOne() {
		System.out.println("ClassOne - " + Thread.currentThread().getId());
	}

	@Test
	public void excludeMethod() {
		System.out.println("ExcludeMethod - " + Thread.currentThread().getId());
	}

	@Test(dependsOnMethods = "testCase2")
	public void testCase1() {
		System.out.println("testCase1");
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2");
	}
	
	@Test(invocationCount =2)
	public void testCase3(){
		System.out.println("Running..");
	}
	
}
