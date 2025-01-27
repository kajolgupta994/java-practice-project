package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMethodsParallelExecution {

	@Test(enabled=false)
	public void runOnChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Test is running on Thread: " + Thread.currentThread().getId());
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println("Title on Chrome: " + driver.getTitle());
		driver.close();
	}

	@Test
	public void runOnFirefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("Firefox Test is running on Thread: " + Thread.currentThread().getId());
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println("Title on Firefox: " + driver.getTitle());
		driver.close();
	}

}
