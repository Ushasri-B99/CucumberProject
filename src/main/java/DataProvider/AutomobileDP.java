package DataProvider;

import org.openqa.selenium.WebDriver;
public class AutomobileDP {
	WebDriver driver;
	public AutomobileDP(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// Automation Data

	public String getselectMake() {
		System.out.println(ExcelUtils.getCellData("AutomobileInsurance",1,1));
		return ExcelUtils.getCellData("AutomobileInsurance",1,1); 
	}
	
	public String getEnginePerformance() {
		System.out.println(ExcelUtils.getCellData("AutomobileInsurance",2,1));
		return ExcelUtils.getCellData("AutomobileInsurance",2,1); 
	}
	
	public String getDateofManufacture() {
		return ExcelUtils.getCellData("AutomobileInsurance",3,1); 
	}
	
	public String getselectNoSeats() {
		return ExcelUtils.getCellData("AutomobileInsurance",4,1); 
	}
	
	public String getselectFuelType() {
		return ExcelUtils.getCellData("AutomobileInsurance",5,1); 
	}
	
	public String getListPrice() {
		return ExcelUtils.getCellData("AutomobileInsurance",6,1); 
	}
	
	public String getLicensePlatenumber() {
		return ExcelUtils.getCellData("AutomobileInsurance",7,1); 
	}
	
	public String getAnnualMileage() {
		return ExcelUtils.getCellData("AutomobileInsurance",8,1); 
	}
	
	public String getStartDate() {
		return ExcelUtils.getCellData("AutomobileInsurance",11,1); 
	}
	
	public String getselectInsuranceSum() {
		return ExcelUtils.getCellData("AutomobileInsurance",12,1); 
	}
	
	public String getselectMeritRating() {
		return ExcelUtils.getCellData("AutomobileInsurance",13,1); 
	}
	
	public String getselectDamageInsurance() {
		return ExcelUtils.getCellData("AutomobileInsurance",14,1); 
	}
	
	public String getselectCourtesyCar() {
		return ExcelUtils.getCellData("AutomobileInsurance",15,1); 
	}
	
	public String get() {
		return ExcelUtils.getCellData("AutomobileInsurance",2,1); 
	}
	
}
