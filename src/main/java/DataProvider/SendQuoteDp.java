package DataProvider;

import org.openqa.selenium.WebDriver;

public class SendQuoteDp {
	WebDriver driver;
	public SendQuoteDp(WebDriver driver) {
		this.driver = driver;
		
	}
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\Data.xlsx");
	
	// Send Quote Data
		
	public String getEmail() {
		return ExcelUtils.getCellData("SendQuote",0,1); 
	}

	public String getPhoneNo() {
		return ExcelUtils.getCellData("SendQuote",1,1); 
	}
	
	public String getUserName() {
		return ExcelUtils.getCellData("SendQuote",2,1); 
	}

	public String getPassword() {
		return ExcelUtils.getCellData("SendQuote",3,1); 
	}
	
}
