package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterProductDataObjects {
	WebDriver driver;
	public EnterProductDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//input[@id='startdate']") WebElement StartDate;	
	public WebElement StartDate() {
		return StartDate;
	}
	
	@FindBy(xpath="//button[@id='openstartdatecalender']") WebElement StartDateBtn;	
	public WebElement StartDateBtn() {
		return StartDateBtn;
	}
	
	@FindBy(xpath="//select[@id='insurancesum']") WebElement SelectInsuranceSum;	
	public WebElement SelectInsuranceSum() {
		return SelectInsuranceSum;
	}
	
	@FindBy(xpath="//select[@id='meritrating']") WebElement SelectMeritRating;	
	public WebElement SelectMeritRating() {
		return SelectMeritRating;
	}
	
	@FindBy(xpath="//select[@id='damageinsurance']") WebElement SelectDamageInsurance;	
	public WebElement SelectDamageInsurance() {
		return SelectDamageInsurance;
	}
	
	//OptionalProducts/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/input
	@FindBy(css="#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span") WebElement EuroProtection; //*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/input
	
	public WebElement EuroProtection() {
		return EuroProtection;
	}
	//#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span
	@FindBy(css="#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span") WebElement LegalDefenseInsurance;	//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]/span
	public WebElement LegalDefenseInsurance() {
		return LegalDefenseInsurance;
	}
	
	@FindBy(xpath="//select[@id='courtesycar']") WebElement SelectCourtesyCar;	
	public WebElement SelectCourtesyCar() {
		return SelectCourtesyCar;
	}
	
	@FindBy(xpath="//button[@id='preventerinsurancedata']") WebElement PrevEnterInsurancedataBtn;	
	public WebElement PrevEnterInsurancedataBtn() {
		return PrevEnterInsurancedataBtn;
	}
	
	@FindBy(xpath="//button[@id='nextselectpriceoption']") WebElement NextSelectPriceoptionBtn;	
	public WebElement NextSelectPriceoptionBtn() {
		return NextSelectPriceoptionBtn;
	}
	

}
