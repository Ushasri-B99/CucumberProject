package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.SelectPriceOptionObjects;

public class SelectPriceOptionTest {
WebDriver driver;
public SelectPriceOptionTest(WebDriver driver) {
	this.driver = driver;
	
}	
	
	//@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}		
	//@Test
	public void selectPriceOption() {
		/*
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		HomePageObjects homeObj = new HomePageObjects(driver);
		*/
		SelectPriceOptionObjects PriceOptionObj = new SelectPriceOptionObjects(driver);
		
		//homeObj.AutomobileLink().click();
		//homeObj.SelectPriceOption().click();
		
		PriceOptionObj.SelectGold().click();
		System.out.println("Gold Selected");
		
		PriceOptionObj.SelectPlatinum().click();
		System.out.println("SelectPlatinum Selected");
		
		PriceOptionObj.SelectSilver().click();
		System.out.println("SelectSilver Selected");
		
		PriceOptionObj.SelectUltimate().click();
		System.out.println("SelectUltimate Selected");
		
		/*
		PriceOptionObj.ViewQuote().click();
		System.out.println("ViewQuote Selected");
		
		PriceOptionObj.DownloadQuote().click();
		System.out.println("DownloadQuote Selected");
		
		
		PriceOptionObj.PrevEnterproductdata().click();
		System.out.println("PrevEnterproductdata Selected");
		*/
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//PriceOptionObj.NextSendquote().click();
		
	}
	
	//@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
