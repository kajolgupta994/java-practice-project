package Tests;

import org.testng.annotations.Test;

public class TestngParallelTest {
	@Test
	public void testMethodOne() {
		System.out.println("Test One - " + Thread.currentThread().getId());
	}

	@Test
	public void testMethodTwo() {
		System.out.println("Test Two - " + Thread.currentThread().getId());
	}

}
