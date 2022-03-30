package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	WebDriver driver;
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//div[@class='main-navigation']//ul[@class='menu']//li[@class='menu-item']//a[@id='nav_automobile']") WebElement AutomobileLink;	
	public WebElement AutomobileLink() {
		return AutomobileLink;
	}
	
	@FindBy(xpath="//div[@class='main-navigation']//ul[@class='menu']//li[@class='menu-item']//a[@id='nav_truck']") WebElement TruckLink;	
	public WebElement TruckLink() {
		return TruckLink;
	}
	
	@FindBy(xpath="//div[@class='main-navigation']//ul[@class='menu']//li[@class='menu-item']//a[@id='nav_motorcycle']") WebElement MotorcycleLink;	
	public WebElement MotorcycleLink() {
		return MotorcycleLink;
	}
	
	@FindBy(xpath="//div[@class='main-navigation']//ul[@class='menu']//li[@class='menu-item']//a[@id='nav_camper']") WebElement CamperLink;	
	public WebElement CamperLink() {
		return CamperLink;
	}
	
	@FindBy(xpath="//a[@id=\"entervehicledata\"]") WebElement EnterVehicleData;	
	public WebElement EnterVehicleData() {
		return EnterVehicleData;
	}

	@FindBy(xpath="//a[@id='enterinsurantdata']") WebElement EnterInsuranceData;	
	public WebElement EnterInsuranceData() {
		return EnterInsuranceData;
	}
	
	@FindBy(xpath="//a[@id='enterproductdata']") WebElement EnterProductData;	
	public WebElement EnterProductData() {
		return EnterProductData;
	}	

	@FindBy(xpath="//a[@id='selectpriceoption']") WebElement SelectPriceOption;	
	public WebElement SelectPriceOption() {
		return SelectPriceOption;
	}
	
	@FindBy(xpath="//a[@id='sendquote']") WebElement SendQuote;	
	public WebElement SendQuote() {
		return SendQuote;
	}
	
	
	
	
	

}
