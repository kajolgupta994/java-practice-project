package Tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class ScreenshotUtils {

	public static String takeScreenshot(String testName, WebDriver driver) {
		try {
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String destFile = System.getProperty("user.dir") + "\\test-output\\FailedTestCaseScreenshots\\" + testName
					+ "_" + timeStamp + ".png";

			FileUtils.copyFile(sourceFile, new File(destFile));
			System.out.println("Screenshot saved at: " + destFile);
			return destFile;
		} catch (IOException e) {
			System.out.println("Failed to take screenshot: " + e.getMessage());
		}
		return null;
	}

}
