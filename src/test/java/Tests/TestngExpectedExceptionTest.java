package Tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngExpectedExceptionTest {
	
	@Test
	public void testSkipException() {
		throw new SkipException("Throw skip exception");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testExpectedException() {
		System.out.println("This will throw ArithmeticExcpetion from testng");
		int a = 10 /0;
	}

}
