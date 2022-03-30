package testReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG {
	static public ExtentReports extentReport;
    public static ExtentReports getReportObject() {
        String path = System.getProperty("user.dir")+"/Reports/Report.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setEncoding("utf-8");
        extentSparkReporter.config().setDocumentTitle("Automation Report (Task-2)");
        extentSparkReporter.config().setReportName("Automation Test Results");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(extentSparkReporter);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
        return extentReport;
    }
}
