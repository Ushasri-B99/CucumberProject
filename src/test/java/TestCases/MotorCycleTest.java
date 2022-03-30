package TestCases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import DataProvider.MotorCycleDp;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterProductDataObjects;
import pageObjects.EnterVehicleDataObjects;
import pageObjects.HomePageObjects;

public class MotorCycleTest {
	public static ExtentReports extentReport;
	 protected static  ExtentTest test;
	 public static WebDriver driver;		
	
	public MotorCycleTest(WebDriver driver) {
		MotorCycleTest.driver = driver;
	}
	//@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\MotorcycleReport.html");
		sparkReport.config().setEncoding("utf-8");
        sparkReport.config().setDocumentTitle("MotorCycleTest");
        sparkReport.config().setReportName("Automation Test Results");
        sparkReport.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReport);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
	
	}		
	//@Test(priority = 3)
	public String motorCycleTest() throws Exception {
		System.out.println("-----------------------MotorCycle Test------------------");
		
		//test = extentReport.createTest("MotorCycle Report");
		
		HomePageObjects homeObj = new HomePageObjects(driver);
		EnterVehicleDataObjects vehicleDataObj = new EnterVehicleDataObjects(driver);
		MotorCycleDp motordataObj =  new MotorCycleDp(driver);
		
		homeObj.MotorcycleLink().click();
		homeObj.EnterVehicleData().click();
		
		Select selectMake = new Select(vehicleDataObj.SelectMake());  
		selectMake.selectByValue(motordataObj.getselectMake());		
		Select selectModel = new Select(vehicleDataObj.SelectModel());  
		selectModel.selectByValue(motordataObj.getSelectModel());		
		vehicleDataObj.CylinderCapacity().sendKeys(motordataObj.getCylinderCapacity());		
		vehicleDataObj.EnginePerformance().sendKeys(motordataObj.getEnginePerformance());
		vehicleDataObj.DateofManufacture().sendKeys(motordataObj.getDateofManufacture());		
		Select selectNoSeats = new Select(vehicleDataObj.SelectNumberofSeatsMotor());  
		selectNoSeats.selectByValue(motordataObj.getselectNoSeats());		
		vehicleDataObj.ListPrice().sendKeys(motordataObj.getListPrice());
		vehicleDataObj.AnnualMileage().sendKeys(motordataObj.getAnnualMileage());
		vehicleDataObj.Nextenterinsurantdata().click();
		//test.log(Status.PASS, "Vehicle Data Entered Successfully");

		
		// Enter Insuarnce Data
		EnterInsuranceDataTest insuObj = new EnterInsuranceDataTest(driver);
		insuObj.enterInsuranceData();
		//test.log(Status.PASS, "Insurance Data Entered Successfully");
		// Enter Product Data
		EnterProductDataObjects enterProductDataObj = new EnterProductDataObjects(driver);
		enterProductDataObj.StartDate().sendKeys(motordataObj.getStartDate());
		Select selectInsuranceSum = new Select(enterProductDataObj.SelectInsuranceSum());  
		selectInsuranceSum.selectByValue(motordataObj.getselectInsuranceSum());		
		Select selectDamageInsurance = new Select(enterProductDataObj.SelectDamageInsurance());  
		selectDamageInsurance.selectByValue(motordataObj.getselectDamageInsurance());		
		enterProductDataObj.LegalDefenseInsurance().click();
		enterProductDataObj.NextSelectPriceoptionBtn().click();
		//test.log(Status.PASS, "Product Data Entered Successfully");
		SelectPriceOptionTest priceObj = new SelectPriceOptionTest(driver);
		priceObj.selectPriceOption();
		//test.log(Status.PASS, "Priceoption Selected");
		homeObj.SendQuote().click();
		SendQuoteTest sendObj = new SendQuoteTest(driver);
		
		String successMsg = sendObj.sendQuote();
		//test.log(Status.PASS, successMsg);
		//test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ successMsg);
		//extentReport.flush();
		return successMsg;
	}
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(System.getProperty("user.dir")+"//Screenshots//MotorCycle" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
	//@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
