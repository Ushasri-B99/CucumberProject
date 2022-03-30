package DataProvider;

import org.openqa.selenium.WebDriver;

public class InsuranceDp {
	WebDriver driver;
	public InsuranceDp(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// Insurance Data
	
	public String getFirstName() {
		return ExcelUtils.getCellData("InsuranceData",0,1); 
	}

	public String getLastName() {
		return ExcelUtils.getCellData("InsuranceData",1,1); 
	}
	
	public String getDOB() {
		return ExcelUtils.getCellData("InsuranceData",2,1); 
	}

	public String getStreetAddress() {
		return ExcelUtils.getCellData("InsuranceData",3,1); 
	}
	
	public String getselectCountry() {
		return ExcelUtils.getCellData("InsuranceData",4,1); 
	}

	public String getZipcode() {
		return ExcelUtils.getCellData("InsuranceData",5,1); 
	}
	
	public String getCity() {
		return ExcelUtils.getCellData("InsuranceData",6,1); 
	}

	public String getselectOccupation() {
		return ExcelUtils.getCellData("InsuranceData",7,1); 
	}
	
	public String getEmail() {
		return ExcelUtils.getCellData("InsuranceData",9,1); 
	}

	public String getPhoneNo() {
		return ExcelUtils.getCellData("InsuranceData",10,1); 
	}
	
	public String getUserName() {
		return ExcelUtils.getCellData("InsuranceData",11,1); 
	}

	public String getPassword() {
		return ExcelUtils.getCellData("InsuranceData",12,1); 
	}
	
}
