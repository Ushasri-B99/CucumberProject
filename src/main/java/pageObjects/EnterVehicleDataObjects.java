package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicleDataObjects {
	WebDriver driver;
	public EnterVehicleDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//select[@id='make']") WebElement SelectMake;	
	public WebElement SelectMake() {
		return SelectMake;
	}
	
	@FindBy(xpath="//input[@id='engineperformance']") WebElement EnginePerformance;	
	public WebElement EnginePerformance() {
		return EnginePerformance;
	}
	
	@FindBy(xpath="//input[@id='dateofmanufacture']") WebElement DateofManufacture;	
	public WebElement DateofManufacture() {
		return DateofManufacture;
	}
	
	@FindBy(xpath="//button[@id='opendateofmanufacturecalender']") WebElement DateofManufactureBtn;	
	public WebElement DateofManufactureBtn() {
		return DateofManufactureBtn;
	}
	
	@FindBy(xpath="//select[@id='numberofseats']") WebElement SelectNumberofSeats;	
	public WebElement SelectNumberofSeats() {
		return SelectNumberofSeats;
	}
	
	@FindBy(xpath="//select[@id='numberofseatsmotorcycle']") WebElement SelectNumberofSeatsMotor;	
	public WebElement SelectNumberofSeatsMotor() {
		return SelectNumberofSeatsMotor;
	}
	
	@FindBy(xpath="//select[@id='fuel']") WebElement SelectFuel;	
	public WebElement SelectFuel() {
		return SelectFuel;
	}
	
	@FindBy(xpath="//input[@id='listprice']") WebElement ListPrice;	
	public WebElement ListPrice() {
		return ListPrice;
	}
	
	@FindBy(xpath="//input[@id='licenseplatenumber']") WebElement LicensePlatenumber;	
	public WebElement LicensePlatenumber() {
		return LicensePlatenumber;
	}
	
	@FindBy(xpath="//input[@id='annualmileage']") WebElement AnnualMileage;	
	public WebElement AnnualMileage() {
		return AnnualMileage;
	}
	
	@FindBy(xpath="//button[@id='nextenterinsurantdata']") WebElement Nextenterinsurantdata;	
	public WebElement Nextenterinsurantdata() {
		return Nextenterinsurantdata;
	}
	
	@FindBy(xpath="//input[@id='payload']") WebElement Payload;	
	public WebElement Payload() {
		return Payload;
	}
	
	@FindBy(xpath="//input[@id='totalweight']") WebElement TotalWeight;	
	public WebElement TotalWeight() {
		return TotalWeight;
	}
	
	@FindBy(xpath="//select[@id='model']") WebElement SelectModel;	
	public WebElement SelectModel() {
		return SelectModel;
	}
	
	//*[@id="cylindercapacity"]
	@FindBy(xpath="//input[@id='cylindercapacity']") WebElement CylinderCapacity;	
	public WebElement CylinderCapacity() {
		return CylinderCapacity;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span") WebElement RightHandDriveYes;	
	public WebElement RightHandDriveYes() {
		return RightHandDriveYes;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[2]/span") WebElement RightHandDriveNo;	
	public WebElement RightHandDriveNo() {
		return RightHandDriveNo;
	}
}
