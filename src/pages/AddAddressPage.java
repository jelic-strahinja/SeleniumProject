package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage {
	
WebDriver driver;



	
	public AddAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}
	public void insertFirstName(String firstName) {
		getFirstName().clear();
		getFirstName().sendKeys(firstName);
	}
	
	
	public WebElement getLastName() {
		return driver.findElement(By.id("lastname"));
	}
	public void insertLastName(String lastName) {
		getLastName().clear();
		getLastName().sendKeys(lastName);
	}
	
	
	public WebElement getCompanyField() {
		return driver.findElement(By.id("company"));
	}
	public void insertCompany(String company) {
		getCompanyField().clear();
		getCompanyField().sendKeys(company);
	}
	
	
	public WebElement getAddressField() {
		return driver.findElement(By.id("address1"));
	}
	public void insertAddress(String address) {
		getAddressField().clear();
		getAddressField().sendKeys(address);
	}
	
	
	public WebElement getAddress2Field() {
		return driver.findElement(By.id("address2"));
	}
	public void insertAddress2(String address2) {
		getAddress2Field().clear();
		getAddress2Field().sendKeys(address2);
	}
	
	
	public WebElement getCity() {
		return driver.findElement(By.id("city"));
	}
	public void insertCity(String city) {
		getCity().clear();
		getCity().sendKeys(city);
	}
	
	
	public WebElement getState() {
		return driver.findElement(By.id("id_state"));
	}
	public void clickState(String state) {
		getState().click();
		Select drpCountry = new Select(driver.findElement(By.id("id_state"))); 
		drpCountry.selectByVisibleText(state);
		getState().click();
	}
	
	
	public WebElement getZipCodeField() {
		return driver.findElement(By.id("postcode"));
	}
	public void insertZipCode(String zipCode) {
		getZipCodeField().clear();
		getZipCodeField().sendKeys(zipCode);
	}
	
	
	public WebElement getPhoneNumber() {
		return driver.findElement(By.id("phone"));
	}
	public void insertPhone(String phone) {
		getPhoneNumber().clear();
		getPhoneNumber().sendKeys(phone);
	}
	
	
	public WebElement getMobilePhone() {
		return driver.findElement(By.id("phone_mobile"));
	}
	public void insertMobilePhone(String mobilePhone) {
		getMobilePhone().clear();
		getMobilePhone().sendKeys(mobilePhone);
	}
	
	
	public WebElement getAdditionalInfo() {
		return driver.findElement(By.id("other"));
	}
	public void insertAdditionalInfo(String additionalInfo) {
		getAdditionalInfo().clear();
		getAdditionalInfo().sendKeys(additionalInfo);
	}
	
	
	public WebElement getAlias() {
		return driver.findElement(By.id("alias"));
	}
	public void insertAlias(String alias) {
		getAlias().clear();
		getAlias().sendKeys(alias);
	}
	
	
	public WebElement getSaveAddressBtn() {
		return driver.findElement(By.id("submitAddress"));
	}
	public void clickSaveAddressBtn() {
		getSaveAddressBtn().click();
	}
}
