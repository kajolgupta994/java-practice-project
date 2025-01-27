package Tests;

import org.testng.annotations.Test;

public class ClassTwo {
	@Test
	public void testClassTwo() {
		System.out.println("ClassTwo - " + Thread.currentThread().getId());
	}
}
