package Tests;

import org.testng.annotations.Test;

public class TestNGException {

	@Test(expectedExceptions = ArithmeticException.class, priority=0)
	public void testException() {
		System.out.println("TestNG exception");
		int i = 1 / 0;
	}
	
	@Test(priority=1)
	public void testB() {
		System.out.println("TestB");
	}
	@Test(priority=2)
	public void testA() {
		System.out.println("TestA");
	}

}
