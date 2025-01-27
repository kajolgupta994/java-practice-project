package Tests;

import org.testng.annotations.Test;

public class TestNGInvocationCountTest {

	@Test(invocationCount = 2, threadPoolSize = 2, timeOut=10000)
	public void runTestSetTimesInInvocation() {
		System.out.println("This method is going to be run n number of times set in the invocationCount parameter.");
	}

}
