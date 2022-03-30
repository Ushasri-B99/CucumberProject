package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import DataProvider.InsuranceDp;
import pageObjects.EnterInsuranceDataObjects;

public class EnterInsuranceDataTest {
	WebDriver driver;
	public EnterInsuranceDataTest(WebDriver driver) {
		this.driver = driver;

	}
	public void enterInsuranceData() {

		EnterInsuranceDataObjects insurObj = new EnterInsuranceDataObjects(driver);
		InsuranceDp idpObj = new InsuranceDp(driver);
		insurObj.FirstName().sendKeys(idpObj.getFirstName());		 
		insurObj.LastName().sendKeys(idpObj.getLastName());
		insurObj.DOB().sendKeys(idpObj.getDOB());
		insurObj.GenFemale().click();
		insurObj.StreetAddress().sendKeys(idpObj.getStreetAddress());
		Select selectCountry = new Select(insurObj.CountryDropdown());  
		selectCountry.selectByVisibleText(idpObj.getselectCountry());		
		insurObj.Zipcode().sendKeys(idpObj.getZipcode());
		insurObj.City().sendKeys(idpObj.getCity());
		Select selectOccupation = new Select(insurObj.OccupationDropdown());  
		selectOccupation.selectByVisibleText(idpObj.getselectOccupation());		
		insurObj.SpeedingHob().click();
		insurObj.BungeeJumpingHob().click();
		insurObj.CliffDivingHob().click();
		insurObj.SkyDivingHob().click();				
		insurObj.OtherHob().click();
		insurObj.NextEnterProductdata().click();		
	}
}
