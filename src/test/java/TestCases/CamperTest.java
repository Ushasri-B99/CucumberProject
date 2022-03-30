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
import DataProvider.CamperDp;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterProductDataObjects;
import pageObjects.EnterVehicleDataObjects;
import pageObjects.HomePageObjects;

public class CamperTest {
	public static ExtentReports extentReport;
	 protected static  ExtentTest test;
	 public static WebDriver driver;
	 public CamperTest(WebDriver driver) {
			CamperTest.driver = driver;
		}
	//ExtentSparkReporter sparkReport = new ExtentSparkReporter("D:\\Selenium Examples\\VehicleInsuranceApplication\\Reports\\CamperReport.html");
	//@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/CamperReport.html");
		sparkReport.config().setEncoding("utf-8");
        sparkReport.config().setDocumentTitle("CamperTest");
        sparkReport.config().setReportName("Automation Test Results");
        sparkReport.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReport);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
	}		
	//@Test(priority = 4)
	public String camperTest() throws Exception {
		System.out.println("-----------------CamperTest--------------");
		
		//test = extentReport.createTest("Camper Report");

		HomePageObjects homeObj = new HomePageObjects(driver);
		EnterVehicleDataObjects vehicleDataObj = new EnterVehicleDataObjects(driver);
		CamperDp camperDataObj = new CamperDp(driver);

		homeObj.CamperLink().click();
		homeObj.EnterVehicleData().click();

		Select selectMake = new Select(vehicleDataObj.SelectMake());  
		selectMake.selectByValue(camperDataObj.getselectMake());		
		vehicleDataObj.EnginePerformance().sendKeys(camperDataObj.getEnginePerformance());
		vehicleDataObj.DateofManufacture().sendKeys(camperDataObj.getDateofManufacture());		
		Select selectNoSeats = new Select(vehicleDataObj.SelectNumberofSeats());  
		selectNoSeats.selectByValue(camperDataObj.getselectNoSeats());		
		vehicleDataObj.RightHandDriveYes().click();		
		Select selectFuelType = new Select(vehicleDataObj.SelectFuel());  
		selectFuelType.selectByValue(camperDataObj.getselectFuelType());		
		vehicleDataObj.Payload().sendKeys(camperDataObj.getPayload());
		vehicleDataObj.TotalWeight().sendKeys(camperDataObj.getTotalWeight());		
		vehicleDataObj.ListPrice().sendKeys(camperDataObj.getListPrice());
		vehicleDataObj.LicensePlatenumber().sendKeys(camperDataObj.getLicensePlatenumber());
		vehicleDataObj.AnnualMileage().sendKeys(camperDataObj.getAnnualMileage());		
		vehicleDataObj.Nextenterinsurantdata().click();
		//test.log(Status.PASS, "Vehicle Data Entered Successfully");

		// Insuarnce Data
		EnterInsuranceDataTest insuObj = new EnterInsuranceDataTest(driver);
		insuObj.enterInsuranceData();
		//test.log(Status.PASS, "Insurance Data Entered Successfully");
		
		// Product Data
		EnterProductDataObjects enterProductDataObj = new EnterProductDataObjects(driver);
		enterProductDataObj.StartDate().sendKeys(camperDataObj.getStartDate());
		Select selectInsuranceSum = new Select(enterProductDataObj.SelectInsuranceSum());  
		selectInsuranceSum.selectByValue(camperDataObj.getselectInsuranceSum());		
		Select selectDamageInsurance = new Select(enterProductDataObj.SelectDamageInsurance());  
		selectDamageInsurance.selectByValue(camperDataObj.getselectDamageInsurance());		
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
		File Dest = new File(System.getProperty("user.dir")+"//Screenshots//Camper " + System.currentTimeMillis()
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
