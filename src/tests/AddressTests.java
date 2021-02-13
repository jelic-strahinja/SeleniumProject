package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddressTests extends BaseTest{
	
	int forAssert = addressPage.getDeleteBtnList().size();
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		login();
	}
	
	
	
		
	
	//@Test
	public void updateAddress() throws InterruptedException {
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(2000);
		addressPage.clickUpdateBtn(1);
		addAddressPage.insertFirstName("Aleksa");
		Thread.sleep(500);
		addAddressPage.insertLastName("Obradovic");
		Thread.sleep(500);
		addAddressPage.insertCompany("Samsung");
		Thread.sleep(500);
		addAddressPage.insertAddress("Gunduliceva 1");
		Thread.sleep(500);
		addAddressPage.insertAddress2("Gunduliceva 2");
		Thread.sleep(500);
		addAddressPage.insertCity("Nis");
		Thread.sleep(500);
		addAddressPage.clickState("Florida");
		Thread.sleep(500);
		scrollIntoView(addAddressPage.getZipCodeField());
		addAddressPage.insertZipCode("25000");
		Thread.sleep(500);
		scrollIntoView(addAddressPage.getSaveAddressBtn());
		addAddressPage.insertPhone("021654321");
		Thread.sleep(500);
		addAddressPage.insertMobilePhone("063654321");
		Thread.sleep(500);
		addAddressPage.insertAdditionalInfo("This is test for update");
		Thread.sleep(500);
		addAddressPage.insertAlias("Gunduliceva");
		Thread.sleep(500);
		addAddressPage.clickSaveAddressBtn();
		Thread.sleep(2000);
		
		Assert.assertEquals(addressPage.getSingleAddressAssert(1).getText(), "GUNDULICEVA");	
	}
	
	
	
	// @Test
	public void deleteAddress() throws InterruptedException {
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(2000);
		if(forAssert < 1) {
		addressPage.clickDeleteBtn(forAssert);
		Thread.sleep(500);
		alertAcc();
		
		Assert.assertEquals(addressPage.getDeleteBtnList().size(), (forAssert - 1));
	
		}
	}
	//@Test
	public void deleteOnlyAddress() throws InterruptedException {
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(2000);
		if(forAssert == 1) {
			addressPage.clickDeleteBtn(0);
			Thread.sleep(500);
			alertAcc();
			
			Assert.assertEquals(addressPage.getDeleteBtnList().size(), (0));
		}
		
		//BUG NE BI TREBALO DA MOZE DA SE OBRISE JEDINA ADRESA PRE NEGO STO SE DODA DRUGA
	}
	
	//@Test
	public void addAddress() throws InterruptedException {
		
		myAccountPage.clickMyAddressesButton();
		Thread.sleep(2000);
		addressPage.clickAddAddressBtn();
		Thread.sleep(1000);
		addAddressPage.insertFirstName("Strahinja");
		Thread.sleep(500);
		addAddressPage.insertLastName("Jelic");
		Thread.sleep(500);
		addAddressPage.insertCompany("Apple");
		Thread.sleep(500);
		addAddressPage.insertAddress("Almaska 1");
		Thread.sleep(500);
		addAddressPage.insertAddress2("Almaska 2");
		Thread.sleep(500);
		addAddressPage.insertCity("Beograd");
		Thread.sleep(500);
		addAddressPage.clickState("Alabama");
		Thread.sleep(500);
		scrollIntoView(addAddressPage.getZipCodeField());
		addAddressPage.insertZipCode("21000");
		Thread.sleep(500);
		scrollIntoView(addAddressPage.getSaveAddressBtn());
		addAddressPage.insertPhone("021123456");
		Thread.sleep(500);
		addAddressPage.insertMobilePhone("063123456");
		Thread.sleep(500);
		addAddressPage.insertAdditionalInfo("This is test");
		Thread.sleep(500);
		addAddressPage.insertAlias("Almaska 1");
		Thread.sleep(500);
		addAddressPage.clickSaveAddressBtn();
		Thread.sleep(2000);
		
		Assert.assertEquals(addressPage.getDeleteBtnList().size(), (forAssert+1));	
	}
	
	
}
