package Tests;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(groups= {"SmokeTest", "FunctionalTest"})
	public void loginTest() {
		System.out.println("Login test");
	}


}
