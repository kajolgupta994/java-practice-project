package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotExample3 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void TestExample1() {
		driver.get("https://www.chromium.org/getting-involved/download-chromium/");
		driver.manage().window().maximize();
		// Intentionally fail the test (for demonstration)
		Assert.assertEquals(driver.getTitle(), "Expecte title here");
	}

	@Test
	public void testExample2() {
		driver.get("https://www.chromium.org/getting-involved/download-chromium/");
		driver.manage().window().maximize();
		// Pass the test
		Assert.assertEquals(driver.getTitle(), "Download Chromium");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
