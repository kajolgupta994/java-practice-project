package Tests;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();;
	protected static Properties prop;

	@BeforeSuite
	public void loadConfig() {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		try (FileInputStream fis = new FileInputStream(filePath)) {
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static WebDriver getDriver() {
		return driver.get();// Return the current thread's WebDriver
	}

	@BeforeClass
	public void browserInitilization() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver.set(new SafariDriver());
			throw new IllegalArgumentException("Browser is not supported: " + browser);
		}
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get().get(prop.getProperty("url"));
	}

	@AfterClass
	public void closeBrowser() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
