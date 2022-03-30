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
import DataProvider.AutomobileDP;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.EnterProductDataObjects;
import pageObjects.EnterVehicleDataObjects;
import pageObjects.HomePageObjects;

public class AutomobileTest{
	 public static ExtentReports extentReport;
	 protected static  ExtentTest test;
	 public static WebDriver driver;	
	public AutomobileTest(WebDriver driver) {
		AutomobileTest.driver = driver;
	}

	//@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\AutomobileReport.html");
		sparkReport.config().setEncoding("utf-8");
        sparkReport.config().setDocumentTitle("Automobile");
        sparkReport.config().setReportName("Automation Test Results");
        sparkReport.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReport);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
	}
		
	//@Test(priority = 1)
	public String automobileTest() throws Exception {

		//test = extentReport.createTest("Automobile Report");
		HomePageObjects homeObj = new HomePageObjects(driver);
		EnterVehicleDataObjects vehicleDataObj = new EnterVehicleDataObjects(driver);
		AutomobileDP adpObj = new AutomobileDP(driver);
		EnterInsuranceDataTest insuObj = new EnterInsuranceDataTest(driver);
		EnterProductDataObjects enterProductDataObj = new EnterProductDataObjects(driver);
		SelectPriceOptionTest priceObj = new SelectPriceOptionTest(driver);
		SendQuoteTest sendObj = new SendQuoteTest(driver);
		
		homeObj.AutomobileLink().click();
		
		//Enter Vehicle Data
		homeObj.EnterVehicleData().click();		
		Select selectMake = new Select(vehicleDataObj.SelectMake());  
		selectMake.selectByValue(adpObj.getselectMake());				
		vehicleDataObj.EnginePerformance().sendKeys(adpObj.getEnginePerformance());
		vehicleDataObj.DateofManufacture().sendKeys(adpObj.getDateofManufacture());		
		Select selectNoSeats = new Select(vehicleDataObj.SelectNumberofSeats());  
		selectNoSeats.selectByValue(adpObj.getselectNoSeats());				
		Select selectFuelType = new Select(vehicleDataObj.SelectFuel());  
		selectFuelType.selectByValue(adpObj.getselectFuelType());		
		vehicleDataObj.ListPrice().sendKeys(adpObj.getListPrice());
		vehicleDataObj.LicensePlatenumber().sendKeys(adpObj.getLicensePlatenumber());
		vehicleDataObj.AnnualMileage().sendKeys(adpObj.getAnnualMileage());		
		vehicleDataObj.Nextenterinsurantdata().click();		
		//test.log(Status.PASS, "Vehicle Data Entered Successfully");
		
		// Enter Insurance Data
		insuObj.enterInsuranceData();
		//test.log(Status.PASS, "Insurance Data Entered Successfully");
		
		//Enter Product Data
		enterProductDataObj.StartDate().sendKeys(adpObj.getStartDate());		
		Select selectInsuranceSum = new Select(enterProductDataObj.SelectInsuranceSum());  
		selectInsuranceSum.selectByValue(adpObj.getselectInsuranceSum());				
		Select selectMeritRating= new Select(enterProductDataObj.SelectMeritRating());  
		selectMeritRating.selectByValue(adpObj.getselectMeritRating());			
		Select selectDamageInsurance = new Select(enterProductDataObj.SelectDamageInsurance());  
		selectDamageInsurance.selectByValue(adpObj.getselectDamageInsurance());		
		enterProductDataObj.EuroProtection().click();	
		enterProductDataObj.LegalDefenseInsurance().click();			
		Select selectCourtesyCar = new Select(enterProductDataObj.SelectCourtesyCar());  
		selectCourtesyCar.selectByValue(adpObj.getselectCourtesyCar());			
		enterProductDataObj.NextSelectPriceoptionBtn().click();				
		//test.log(Status.PASS, "Product Data Entered Successfully");
		// Select Price Option
		priceObj.selectPriceOption();
		homeObj.SendQuote().click();	
		//test.log(Status.PASS, "Priceoption Selected");
		// Send Quote
		String successMsg = sendObj.sendQuote();
		//test.log(Status.PASS, successMsg);
		//test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ successMsg);
		return successMsg;
		//extentReport.flush();
		
	}
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(System.getProperty("user.dir")+"//Screenshots//Automobile " + System.currentTimeMillis()
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
