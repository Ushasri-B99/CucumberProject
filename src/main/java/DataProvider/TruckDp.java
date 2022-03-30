package DataProvider;

import org.openqa.selenium.WebDriver;

public class TruckDp {
	WebDriver driver;
	public TruckDp(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// Truck Data
	
	public String getselectMake() {
		return ExcelUtils.getCellData("Truck",0,1); 
	}
	
	public String getEnginePerformance() {
		return ExcelUtils.getCellData("Truck",1,1); 
	}
	
	public String getDateofManufacture() {
		return ExcelUtils.getCellData("Truck",2,1); 
	}
	
	public String getselectNoSeats() {
		return ExcelUtils.getCellData("Truck",3,1); 
	}
	
	public String getselectFuelType() {
		return ExcelUtils.getCellData("Truck",4,1); 
	}
	
	public String getPayload() {
		return ExcelUtils.getCellData("Truck",5,1); 
	}
	
	public String getTotalWeight() {
		return ExcelUtils.getCellData("Truck",6,1); 
	}
	
	public String getListPrice() {
		return ExcelUtils.getCellData("Truck",7,1); 
	}
	
	public String getLicensePlatenumber() {
		return ExcelUtils.getCellData("Truck",8,1); 
	}
	
	public String getAnnualMileage() {
		return ExcelUtils.getCellData("Truck",9,1); 
	}
	
	public String getStartDate() {
		return ExcelUtils.getCellData("Truck",10,1); 
	}
	
	public String getselectInsuranceSum() {
		return ExcelUtils.getCellData("Truck",11,1); 
	}
	
	public String getselectDamageInsurance() {
		return ExcelUtils.getCellData("Truck",12,1); 
	}
	
}
