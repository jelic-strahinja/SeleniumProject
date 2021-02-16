package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddressTests extends BaseTest{
	
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		login();
	}
	
	
	
		
	
	//@Test (priority = 10)
	public void updateAddress() throws InterruptedException {
		String firstName, lastName, company, address1, address2, city, state, 
		zipCode, homePhone, mobile, additionalText, alias;
		
		firstName = reader.getData("TC2-Address", 3, 5);
		lastName = reader.getData("TC2-Address", 3, 6);
		company = reader.getData("TC2-Address", 3, 7);
		address1 = reader.getData("TC2-Address", 3, 8);
		address2 = reader.getData("TC2-Address", 3, 9);
		city = reader.getData("TC2-Address", 3, 10);
		state = reader.getData("TC2-Address", 3, 11);
		zipCode = reader.getData("TC2-Address", 3, 12);
		homePhone = reader.getData("TC2-Address", 3, 13);
		mobile = reader.getData("TC2-Address", 3, 14);
		additionalText = reader.getData("TC2-Address", 3, 15);
		alias = reader.getData("TC2-Address", 3, 16);
		
		myAccountPage.clickMyAddressesButton();
		addressPage.clickUpdateBtn(1);
		addAddressPage.insertFirstName(firstName);
		addAddressPage.insertLastName(lastName);
		addAddressPage.insertCompany(company);
		addAddressPage.insertAddress(address1);
		addAddressPage.insertAddress2(address2);
		addAddressPage.insertCity(city);
		addAddressPage.clickState(state);
		scrollIntoView(addAddressPage.getZipCodeField());
		addAddressPage.insertZipCode(zipCode);
		scrollIntoView(addAddressPage.getSaveAddressBtn());
		addAddressPage.insertPhone(homePhone);
		addAddressPage.insertMobilePhone(mobile);
		addAddressPage.insertAdditionalInfo(additionalText);
		addAddressPage.insertAlias(alias);
		addAddressPage.clickSaveAddressBtn();
		
		Assert.assertEquals(addressPage.getSingleAddressAssert(1).getText(), reader.getData("TC2-Address", 6, 17));	
	}
	
	
	
	//@Test (priority = 15)
	public void deleteAddress() throws InterruptedException {
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(2000);
		int forAssert = addressPage.getDeleteBtnList().size();
		if(forAssert > 1) {
		addressPage.clickDeleteBtn(forAssert - 1);
		Thread.sleep(500);
		alertAcc();
		
		Assert.assertEquals(addressPage.getDeleteBtnList().size(), (forAssert - 1));
	
		}
	}
	
	
	//@Test (priority = 5)
	public void addAddress() throws InterruptedException {
		
		
		String firstName, lastName, company, address1, address2, city, state, 
		zipCode, homePhone, mobile, additionalText, alias;
		
		firstName = reader.getData("TC2-Address", 3, 23);
		lastName = reader.getData("TC2-Address", 3, 24);
		company = reader.getData("TC2-Address", 3, 25);
		address1 = reader.getData("TC2-Address", 3, 26);
		address2 = reader.getData("TC2-Address", 3, 27);
		city = reader.getData("TC2-Address", 3, 28);
		state = reader.getData("TC2-Address", 3, 29);
		zipCode = reader.getData("TC2-Address", 3, 30);
		homePhone = reader.getData("TC2-Address", 3, 31);
		mobile = reader.getData("TC2-Address", 3, 32);
		additionalText = reader.getData("TC2-Address", 3, 33);
		alias = reader.getData("TC2-Address", 3, 34);
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(1000);
		int forAssert = addressPage.getDeleteBtnList().size();
		addressPage.clickAddAddressBtn();
		addAddressPage.insertFirstName(firstName);
		addAddressPage.insertLastName(lastName);
		addAddressPage.insertCompany(company);
		addAddressPage.insertAddress(address1);
		addAddressPage.insertAddress2(address2);
		addAddressPage.insertCity(city);
		addAddressPage.clickState(state);
		scrollIntoView(addAddressPage.getZipCodeField());
		addAddressPage.insertZipCode(zipCode);
		scrollIntoView(addAddressPage.getSaveAddressBtn());
		addAddressPage.insertPhone(homePhone);
		addAddressPage.insertMobilePhone(mobile);
		addAddressPage.insertAdditionalInfo(additionalText);
		addAddressPage.insertAlias(alias);
		addAddressPage.clickSaveAddressBtn();
		Thread.sleep(1000);
		
		Assert.assertEquals(addressPage.getDeleteBtnList().size(), (forAssert+1));	
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
}
