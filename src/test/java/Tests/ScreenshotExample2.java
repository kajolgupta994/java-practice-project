package Tests;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class ScreenshotExample2 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void Test1() {
		driver.get("https://www.chromium.org/getting-involved/download-chromium/");
		driver.manage().window().maximize();
		// Intentionally fail the test (for demonstration)
		Assert.assertEquals(driver.getTitle(), "Expecte title here");
	}

	@Test
	public void test2() {
		driver.get("https://www.chromium.org/getting-involved/download-chromium/");
		driver.manage().window().maximize();
		// Pass the test
		Assert.assertEquals(driver.getTitle(), "Download Chromium");
	}

	@AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			String testName = result.getMethod().getMethodName();
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("Screenshots2/" + testName + "_failed.png");
			FileUtils.copyFile(source, destination);

			System.out.println("Screenshot saved for failed test: " + testName);
		}
		driver.quit();
	}

}
