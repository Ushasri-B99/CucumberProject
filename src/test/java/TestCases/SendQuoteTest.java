package TestCases;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import DataProvider.SendQuoteDp;
import pageObjects.SendQuoteObjects;

public class SendQuoteTest {
WebDriver driver;
public SendQuoteTest(WebDriver driver) {
	this.driver = driver;
	
}
	public String sendQuote() throws Exception {
		SendQuoteObjects sendQuoteObj = new SendQuoteObjects(driver);
		SendQuoteDp quoteData = new SendQuoteDp(driver);
		sendQuoteObj.Email().sendKeys(quoteData.getEmail());
		sendQuoteObj.PhoneNo().sendKeys(quoteData.getPhoneNo());
		sendQuoteObj.UserName().sendKeys(quoteData.getUserName());
		sendQuoteObj.Password().sendKeys(quoteData.getPassword());
		sendQuoteObj.ConfirmPassword().sendKeys(quoteData.getPassword());
		sendQuoteObj.SendEmailBtn().click();
		/*
		//Alert alert = driver.switchTo().alert();		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        // Capturing alert message.
         *     
         */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String alertMessage= sendQuoteObj.SuccessMsg().getText();
        System.out.println(alertMessage);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", sendQuoteObj.ConfirmPassword());
       //sendQuoteObj.Fieldset().click();
       sendQuoteObj.PopupConfirmBtn().click();
       
        return alertMessage;
        
		/*
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement successMsg = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2")));
		System.out.println(successMsg.getText());
		*/
		
	}
}
