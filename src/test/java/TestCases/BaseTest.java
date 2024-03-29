package TestCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import testReports.ExtentReportNG;

@Listeners(testReports.Listeners.class)
public class BaseTest {
	 public static ExtentReports extentReport = ExtentReportNG.getReportObject();
	 public static  ExtentTest test;
	 public static WebDriver driver;
	 //public static ExtentReports extentReport;
	 String SuccessMsg;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("ie")) {	
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge")) {	
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		//Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
         
	}
	
	@Test
	public void baseTest() throws Exception {
		
		//test = extentReport.createTest("Automobile Report");
		HomePageObjects homeObj = new HomePageObjects(driver);
		AutomobileTest automobileTest = new AutomobileTest(driver);
		TruckTest truckTest = new TruckTest(driver);
		CamperTest camperTest = new CamperTest(driver);
		MotorCycleTest motorcycleTest = new MotorCycleTest(driver);		
		
		homeObj.AutomobileLink().click();
		SuccessMsg = automobileTest.automobileTest();
		test.log(Status.INFO, "Automobile Quote send Successfully");
		test.log(Status.PASS,SuccessMsg);	
		
		homeObj.TruckLink().click();
		SuccessMsg = truckTest.truckTest();
		test.log(Status.INFO, "Automobile Quote send Successfully");
		test.log(Status.PASS,SuccessMsg);	
		
		homeObj.CamperLink().click();
		SuccessMsg = camperTest.camperTest();
		test.log(Status.INFO, "Automobile Quote send Successfully");
		test.log(Status.PASS,SuccessMsg);	
		
		homeObj.MotorcycleLink().click();
		SuccessMsg = motorcycleTest.motorCycleTest();
		System.out.println(SuccessMsg);
		test.log(Status.INFO, "Automobile Quote send Successfully");
		test.log(Status.PASS,SuccessMsg);	
		
	}
	@Test
	public void sample() {
		System.out.println("********************Sample Test *************************");
		test.log(Status.PASS,SuccessMsg);
	}
	
	//@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
