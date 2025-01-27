package Tests;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class ScreenshotListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			WebDriver driver = ((ScreenshotExample3) result.getInstance()).getDriver();
			String testName = result.getMethod().getMethodName();
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("Screenshots3/" + testName + "_failure.png");
			try {
				FileUtils.copyFile(source, destination);
				System.out.println("Screenshot saved for failed test: " + testName);
			} catch (IOException e) {
				System.out.println("Failed to take screenshot: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
