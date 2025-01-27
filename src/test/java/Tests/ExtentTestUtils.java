package Tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestUtils {
	protected static ExtentReports extent;
	protected static ExtentTest test;

	public static ExtentReports getReportInstance() {
		if (extent == null) {
			String reportFilePath = System.getProperty("user.dir") + "\\test-output\\ExtentReports\\HTMLReport.html";

			ExtentSparkReporter spark = new ExtentSparkReporter(reportFilePath);
			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Test Execution Report");
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("KAJOL", "QA AUTOMATION");
			extent.setSystemInfo("Environment", "QA");
		}
		return extent;
	}

	public static ExtentTest createTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static ExtentTest getTest() {
		return test;
	}
}
