package testReports;

import com.aventstack.extentreports.Status;
import TestCases.BaseTest;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = extentReport.createTest(result.getMethod().getMethodName());
	    
	}

	public void onTestSuccess(ITestResult result) {
		 test.log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		String fileName = System.getProperty("user.dir") + File.separator + "Screenshots/ FailedSs" + File.separator + result.getMethod().getMethodName();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(fileName + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
			test.log(Status.FAIL, test.addScreenCaptureFromPath(errflpath)+"TestFailed");
		}catch(Exception e) {
			e.printStackTrace();
		}
		test.fail(result.getThrowable());
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

   
}
