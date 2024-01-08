package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenshotWithMethod;

public class ListenersInTestNG extends TestNGListernsWithSelenium  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String nameOfTestCase = result.getName();
		
		System.out.println(nameOfTestCase+" Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String nameOfTestCase = result.getName();
		
		System.out.println(nameOfTestCase+" Test case failed");
		
		ScreenshotWithMethod sc = new ScreenshotWithMethod();
		
		try {
			sc.captureScreenshot(driver, result.getName());
		} catch (IOException e) {
			System.out.println("Exception arrived while taking the screenshot");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String nameofTestcase = result.getName(); 
		System.out.println(nameofTestcase+" Test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished");
	}

}
