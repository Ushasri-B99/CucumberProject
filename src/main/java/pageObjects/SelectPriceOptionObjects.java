package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOptionObjects {

	WebDriver driver;
	public SelectPriceOptionObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	//*[@id="priceTable"]/tfoot/tr/th[2]/label[1]/span
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span") WebElement SelectSilver;	//input[@id='selectsilver']
	public WebElement SelectSilver() {
		return SelectSilver;
	}
	
	//*[@id="priceTable"]/tfoot/tr/th[2]/label[2]/span
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span") WebElement SelectGold;	//input[@id='selectgold']
	public WebElement SelectGold() {
		return SelectGold;
	}
	
	//*[@id="priceTable"]/tfoot/tr/th[2]/label[3]/span
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span") WebElement SelectPlatinum;	//input[@id='selectplatinum']
	public WebElement SelectPlatinum() {
		return SelectPlatinum;
	}
	
	//*[@id="priceTable"]/tfoot/tr/th[2]/label[4]/span
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span") WebElement SelectUltimate;	//input[@id='selectultimate']
	public WebElement SelectUltimate() {
		return SelectUltimate;
	}
	
	//*[@id="viewquote"]/span/i
	@FindBy(xpath="//*[@id=\"viewquote\"]/span/i") WebElement ViewQuote;	//a[@id='viewquote']
	public WebElement ViewQuote() {
		return ViewQuote;
	}
	
	//*[@id="downloadquote"]/span/i
	@FindBy(xpath="//*[@id=\"downloadquote\"]/span/i") WebElement DownloadQuote;	//a[@id='downloadquote']
	public WebElement DownloadQuote() {
		return DownloadQuote;
	}
	
	//*[@id="preventerproductdata"]
	@FindBy(xpath="//button[@id='preventerproductdata']") WebElement PrevEnterproductdata;	
	public WebElement PrevEnterproductdata() {
		return PrevEnterproductdata;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]") WebElement NextSendquote;	//#nextsendquote
	public WebElement NextSendquote() {
		return NextSendquote;
	}
}
