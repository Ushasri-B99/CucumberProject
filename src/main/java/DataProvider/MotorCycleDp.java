package DataProvider;

import org.openqa.selenium.WebDriver;

public class MotorCycleDp {
	WebDriver driver;
	public MotorCycleDp(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// MotorCycle Data
	
	public String getselectMake() {
		return ExcelUtils.getCellData("MotorCycle",0,1); 
	}
	
	public String getSelectModel() {
		return ExcelUtils.getCellData("MotorCycle",1,1); 
	}
	
	public String getCylinderCapacity() {
		return ExcelUtils.getCellData("MotorCycle",2,1); 
	}
	
	public String getEnginePerformance() {
		return ExcelUtils.getCellData("MotorCycle",3,1); 
	}
	
	public String getDateofManufacture() {
		return ExcelUtils.getCellData("MotorCycle",4,1); 
	}
	
	public String getselectNoSeats() {
		return ExcelUtils.getCellData("MotorCycle",5,1); 
	}
	
	public String getListPrice() {
		return ExcelUtils.getCellData("MotorCycle",6,1); 
	}

	public String getAnnualMileage() {
		return ExcelUtils.getCellData("MotorCycle",7,1); 
	}
	
	public String getStartDate() {
		return ExcelUtils.getCellData("MotorCycle",8,1); 
	}
	
	public String getselectInsuranceSum() {
		return ExcelUtils.getCellData("MotorCycle",9,1); 
	}
	
	public String getselectDamageInsurance() {
		return ExcelUtils.getCellData("MotorCycle",10,1); 
	}
	
}
