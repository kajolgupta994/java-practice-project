package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TesngDataProviderTest {
	@DataProvider(name = "userData")
	public Object[][] setData() {

		return new Object[][] { { "username1", "password1" }, { "username2", "password2" } };
	}

	@Test(dataProvider = "userData")
	public void getData(String username, String password) {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);

	}

}
