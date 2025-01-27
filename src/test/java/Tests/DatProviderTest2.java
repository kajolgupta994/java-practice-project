package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProviderTest2 {
	@DataProvider(name = "loginExcelData")
	public Object[][] getExcelData() {
		String filePath = System.getProperty("user.dir") + "\\test-data\\LoginTestData.xlsx";
		System.out.println(filePath);
		String sheetName = "Sheet1";
		return ExcelUtils.getExcelData(filePath, sheetName);

	}

	@Test(dataProvider = "loginExcelData")
	public void loginTest(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kajol\\chromedriver\\win64-131.0.6778.265\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("")).sendKeys(username);
		driver.findElement(By.id("")).sendKeys(password);
		driver.findElement(By.id("")).click();
		// Add assertions here to validate login success
		System.out.println("Test executed with username: " + username + " and password: " + password);

		driver.quit();

	}
}
