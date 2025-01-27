package Tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindBrokenLinks {
	public static void main(String args[]) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {

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
		} finally {
			driver.quit();
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
