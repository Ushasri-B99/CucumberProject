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
import DataProvider.TruckDp;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterProductDataObjects;
import pageObjects.EnterVehicleDataObjects;
import pageObjects.HomePageObjects;

public class TruckTest {
	 public static ExtentReports extentReport;
	 protected static  ExtentTest test;
	 public static WebDriver driver;	
	public TruckTest(WebDriver driver) {
		TruckTest.driver = driver;
	}
	//@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\TruckReport.html");
		sparkReport.config().setEncoding("utf-8");
        sparkReport.config().setDocumentTitle("Truck Report");
        sparkReport.config().setReportName("Automation Test Results");
        sparkReport.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReport);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
	
		
	}		
	//@Test(priority = 2)
	public String truckTest() throws Exception {
		System.out.println("-------------TruckTest--------------");
		//test = extentReport.createTest("Camper Report");
		
		HomePageObjects homeObj = new HomePageObjects(driver);
		EnterVehicleDataObjects vehicleDataObj = new EnterVehicleDataObjects(driver);
		TruckDp truckdpObj = new TruckDp(driver);
		
		homeObj.TruckLink().click();
		homeObj.EnterVehicleData().click();
		
		Select selectMake = new Select(vehicleDataObj.SelectMake());  
		selectMake.selectByValue(truckdpObj.getselectMake());		
		vehicleDataObj.EnginePerformance().sendKeys(truckdpObj.getEnginePerformance());
		vehicleDataObj.DateofManufacture().sendKeys(truckdpObj.getDateofManufacture());		
		Select selectNoSeats = new Select(vehicleDataObj.SelectNumberofSeats());  
		selectNoSeats.selectByValue(truckdpObj.getselectNoSeats());		
		Select selectFuelType = new Select(vehicleDataObj.SelectFuel());  
		selectFuelType.selectByValue(truckdpObj.getselectFuelType());		
		vehicleDataObj.Payload().sendKeys(truckdpObj.getPayload());
		vehicleDataObj.TotalWeight().sendKeys(truckdpObj.getTotalWeight());		
		vehicleDataObj.ListPrice().sendKeys(truckdpObj.getListPrice());
		vehicleDataObj.LicensePlatenumber().sendKeys(truckdpObj.getLicensePlatenumber());
		vehicleDataObj.AnnualMileage().sendKeys(truckdpObj.getAnnualMileage());		
		vehicleDataObj.Nextenterinsurantdata().click();
		
		//test.log(Status.PASS, "Vehicle Data Entered Successfully");

		//Enter Insurance Data
		EnterInsuranceDataTest insuObj = new EnterInsuranceDataTest(driver);
		insuObj.enterInsuranceData();
		//test.log(Status.PASS, "Insurance Data Entered Successfully");
		// Enter Product Data
		EnterProductDataObjects enterProductDataObj = new EnterProductDataObjects(driver);
		enterProductDataObj.StartDate().sendKeys(truckdpObj.getStartDate());
		Select selectInsuranceSum = new Select(enterProductDataObj.SelectInsuranceSum());  
		selectInsuranceSum.selectByValue(truckdpObj.getselectInsuranceSum());		
		Select selectDamageInsurance = new Select(enterProductDataObj.SelectDamageInsurance());  
		selectDamageInsurance.selectByValue(truckdpObj.getselectDamageInsurance());		
		System.out.println("selectDamageInsurance  Clicked");
		enterProductDataObj.EuroProtection().click();
		enterProductDataObj.LegalDefenseInsurance().click();
		enterProductDataObj.NextSelectPriceoptionBtn().click();
		//test.log(Status.PASS, "Product Data Entered Successfully");
		
		// Select Price
		SelectPriceOptionTest priceObj = new SelectPriceOptionTest(driver);
		priceObj.selectPriceOption();
		//test.log(Status.PASS, "Priceoption Selected");
		// Send Quote
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
		File Dest = new File(System.getProperty("user.dir")+"//Screenshots//Truck " + System.currentTimeMillis()
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
