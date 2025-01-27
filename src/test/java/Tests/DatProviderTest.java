package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProviderTest {
	@DataProvider(name = "loginData")
	public Object[][] getData() {
		return new Object[][] { { "user", "pass" } };

	}

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

		driver.get(url);

		System.out.println("Test executed with username: " + username + " and password: " + password);

		driver.quit();

	}
}
