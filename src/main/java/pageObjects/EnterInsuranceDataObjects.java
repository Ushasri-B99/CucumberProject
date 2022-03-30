package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterInsuranceDataObjects {
	WebDriver driver;
	public EnterInsuranceDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//input[@id='firstname']") WebElement FirstName;	
	public WebElement FirstName() {
		return FirstName;
	}
	
	@FindBy(xpath="//input[@id='lastname']") WebElement LastName;	
	public WebElement LastName() {
		return LastName;
	}
	
	@FindBy(xpath="//input[@id='birthdate']") WebElement DOB ;	
	public WebElement DOB() {
		return DOB;
	}
	///html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]
	@FindBy(xpath="//form/div/section[2]/div[4]/p/label[2]") WebElement GenFemale;	//input[@id='genderfemale']
	public WebElement GenFemale() {
		return GenFemale;
	}
	
	@FindBy(xpath="//form/div/section[2]/div[4]/p/label[1]") WebElement GenMale;	
	public WebElement GenMale() {
		return GenMale;
	}
	
	@FindBy(xpath="//input[@id='streetaddress']") WebElement StreetAddress;	
	public WebElement StreetAddress() {
		return StreetAddress;
	}
	
	@FindBy(xpath="//select[@id='country']") WebElement CountryDropdown;	
	public WebElement CountryDropdown() {
		return CountryDropdown;
	}
	
	@FindAll({@FindBy(tagName="option")}) List<WebElement> Countries;	//Dropdown
	public List<WebElement> Countries() {
		return Countries;
	}
	
	@FindBy(xpath="//input[@id='zipcode']") WebElement Zipcode;	
	public WebElement Zipcode() {
		return Zipcode;
	}
	
	@FindBy(xpath="//input[@id='city']") WebElement City;	
	public WebElement City() {
		return City;
	}
	
	@FindBy(xpath="//select[@id='occupation']") WebElement OccupationDropdown;	
	public WebElement OccupationDropdown() {
		return OccupationDropdown;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span") WebElement SpeedingHob;	
	public WebElement SpeedingHob() {
		return SpeedingHob;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span") WebElement BungeeJumpingHob;	
	public WebElement BungeeJumpingHob() {
		return BungeeJumpingHob;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span") WebElement CliffDivingHob;	
	public WebElement CliffDivingHob() {
		return CliffDivingHob;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span") WebElement SkyDivingHob;	
	public WebElement SkyDivingHob() {
		return SkyDivingHob;
	}
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span") WebElement OtherHob;	
	public WebElement OtherHob() {
		return OtherHob;
	}
	
	@FindBy(xpath="//input[@id='website']") WebElement Website;	
	public WebElement Website() {
		return Website;
	}
	
	@FindBy(xpath="//input[@id='picture']") WebElement PictureText;	
	public WebElement PictureText() {
		return PictureText;
	}
	
	@FindBy(xpath="//button[@id='open']") WebElement PictureBtn;	
	public WebElement PictureBtn() {
		return PictureBtn;
	}
	
	@FindBy(xpath="//button[@id='preventervehicledata']") WebElement PrevEnterVehicledata;	
	public WebElement PrevEnterVehicledata() {
		return PrevEnterVehicledata;
	}
	
	@FindBy(xpath="//button[@id='nextenterproductdata']") WebElement NextEnterProductdata;	
	public WebElement NextEnterProductdata() {
		return NextEnterProductdata;
	}
	/*
	@FindBy(xpath="") WebElement ;	
	public WebElement () {
		return ;
	}
	*/
	
	
}
