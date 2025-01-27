package Tests;

import org.testng.annotations.Test;

public class TestNGGroups2 {
	
	@Test(groups= {"FunctionalTest"})
	public void composeMail() {
		System.out.println("Compose Mail");
	}


}
