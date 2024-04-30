package Com.Inkprog.WinvestAppTest.winvest.components;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listners  implements ITestListener {

	ExtentSparkReporter reports = new ExtentSparkReporter("C:\\Users\\sanke\\OneDrive\\Desktop\\bug1.html");

	ExtentReports report = new ExtentReports();

	ExtentTest test;

	public void onTestStart(ITestResult result) {

		report.attachReporter(reports);

		report.setSystemInfo("Regression Testing", "Fiance Module");

		test = report.createTest("Testing Start:" + result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "The test case:" + result.getMethod().getMethodName() + " is passed");

	}

	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, "The test case:" + result.getMethod().getMethodName() + " is fail");

	}

	public void onTestSkipped(ITestResult result) {

		// not implemented

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		// not implemented

	}

	public void onTestFailedWithTimeout(ITestResult result) {

		onTestFailure(result);

	}

	public void onStart(ITestContext context) {

		// not implemented

	}

	public void onFinish(ITestContext context) {

		report.flush();

	}

}



