package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrepOne extends BaseClass {
	WebDriver driver;

	@Test
	public void testOne() {
		driver = getDriver();
		driver.findElement(By.linkText("Basic Auth")).click();
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String url = "@the-internet.herokuapp.com/basic_auth";
		String baseAuth = "https://" + username + ":" + password + url;
		driver.get(baseAuth);
		boolean successMessage = driver.findElement(By.xpath("//p")).isDisplayed();
		Assert.assertTrue(successMessage, "Success message not displayed");
	}

}
