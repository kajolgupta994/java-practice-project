package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ITestListenerClass implements ITestListener {
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		ExtentTestUtils.getReportInstance();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = ExtentTestUtils.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, "Test Started: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
		test.fail(result.getThrowable());
		try {
			WebDriver driver = BaseClass.getDriver(); // Ensure correct WebDriver instance
			if (driver != null) {
				String screenshotPath = ScreenshotUtils.takeScreenshot(result.getName(), driver);
				test.addScreenCaptureFromPath(screenshotPath);
				System.out.println("Screenshot taken for failed test: " + result.getName());
			} else {
				System.out.println("WebDriver instance is null. Cannot take screenshot.");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong while taking screenshot: " + e.getMessage());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentTestUtils.getReportInstance().flush();
	}

}
