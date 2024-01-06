package testngdiscussion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersInTestNG  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
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
