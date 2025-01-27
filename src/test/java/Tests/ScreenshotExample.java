package Tests;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chromium.org/getting-involved/download-chromium/");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshots1/" + "ScreenshotExample_failure.png");
		FileUtils.copyFile(source, destination);
		driver.quit();
		System.out.println("Screenshot saved successfully!");

	}

}
