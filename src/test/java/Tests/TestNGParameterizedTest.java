package Tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterizedTest {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void parameterizedTest(@Optional("firefox")String browser) {
		try {
			setupDriver(browser);
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for (WebElement link : links) {
				String url = link.getAttribute("href");

				if (url == null || url.isEmpty()) {
					System.out.println("Empty or null url found.");
					continue;
				}

				getBrokenLinks(url);
			}

		} catch (Exception e) {
			System.out.println("Error during test execution: " + e.getMessage());
		} finally {

			if (driver != null) {
				driver.quit();
			}
		}
	}

	public void setupDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
	}

	public static void getBrokenLinks(String url) {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int resCode = connection.getResponseCode();
			if (resCode >= 400) {
				System.out.println(url + " is a broken link. Response code: " + resCode);
			} else {
				System.out.println(url + " is a valid link. Response code: " + resCode);
			}
		} catch (Exception e) {
			System.out.println(url + " is a broken link. Error: " + e.getMessage());
		}

	}

}
