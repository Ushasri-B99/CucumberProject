package DataProvider;

import org.openqa.selenium.WebDriver;

public class CamperDp {
	WebDriver driver;
	public CamperDp(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// Camper Data
	
	public String getselectMake() {
		return ExcelUtils.getCellData("Camper",0,1); 
	}
	
	public String getEnginePerformance() {
		return ExcelUtils.getCellData("Camper",1,1); 
	}
	
	public String getDateofManufacture() {
		return ExcelUtils.getCellData("Camper",2,1); 
	}
	
	public String getselectNoSeats() {
		return ExcelUtils.getCellData("Camper",3,1); 
	}
	
	public String getselectFuelType() {
		return ExcelUtils.getCellData("Camper",4,1); 
	}
	
	public String getPayload() {
		return ExcelUtils.getCellData("Camper",5,1); 
	}
	
	public String getTotalWeight() {
		return ExcelUtils.getCellData("Camper",6,1); 
	}
	
	public String getListPrice() {
		return ExcelUtils.getCellData("Camper",7,1); 
	}
	
	public String getLicensePlatenumber() {
		return ExcelUtils.getCellData("Camper",8,1); 
	}
	
	public String getAnnualMileage() {
		return ExcelUtils.getCellData("Camper",9,1); 
	}
	
	public String getStartDate() {
		return ExcelUtils.getCellData("Camper",10,1); 
	}
	
	public String getselectInsuranceSum() {
		return ExcelUtils.getCellData("Camper",11,1); 
	}
	
	public String getselectDamageInsurance() {
		return ExcelUtils.getCellData("Camper",12,1); 
	}
	
}
