package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuoteObjects {
	WebDriver driver;
	public SendQuoteObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement Email;	
	public WebElement Email() {
		return Email;
	}
	
	@FindBy(xpath="//input[@id='phone']") WebElement PhoneNo;	
	public WebElement PhoneNo() {
		return PhoneNo;
	}
	
	@FindBy(xpath="//input[@id='username']") WebElement UserName;	
	public WebElement UserName() {
		return UserName;
	}
	
	@FindBy(xpath="//input[@id='password']") WebElement Password;	
	public WebElement Password() {
		return Password;
	}	

	@FindBy(xpath="//input[@id='confirmpassword']") WebElement ConfirmPassword;	
	public WebElement ConfirmPassword() {
		return ConfirmPassword;
	}
	
	@FindBy(xpath="//button[@id='prevselectpriceoption']") WebElement PrevSelectPriceoptionBtn;	
	public WebElement PrevSelectPriceoptionBtn() {
		return PrevSelectPriceoptionBtn;
	}
	
	@FindBy(xpath="//button[@id='sendemail']") WebElement SendEmailBtn;	
	public WebElement SendEmailBtn() {
		return SendEmailBtn;
	} 
	
	@FindBy(css="body > div.sweet-alert.showSweetAlert.visible > h2") WebElement SuccessMsg;	
	public WebElement SuccessMsg() {
		return SuccessMsg;
	}
	
	@FindBy(css="body > div.sweet-alert.showSweetAlert.visible > fieldset") WebElement Fieldset;	
	public WebElement Fieldset() {
		return Fieldset;
	}
	///html/body/div[4]/h2
	//body > div.sweet-alert.showSweetAlert.visible > fieldset
	//body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button
	//body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button.confirm
	@FindBy(xpath="//html/body/div[4]/div[7]/div/button") WebElement PopupConfirmBtn;	
	public WebElement PopupConfirmBtn() {
		return PopupConfirmBtn;
	}
	///html/body/div[4]/div[7]/div/button

}
