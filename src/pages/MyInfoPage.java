package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage {
	WebDriver driver;
	WebElement genderCheckBox, firstName, LastName, 
	email, dropDownDay, dropDownMonth, dropDownYear,
	oldPass, newPass, confirmPass;
	 
	
	public MyInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getBtnsGender() {
		return driver.findElements(By.className("top"));
	}
	public WebElement getGenderBtn(int index) {
		return getBtnsGender().get(index);
	}
	public void clickGenderBtn(int index) {
		getGenderBtn(index).click();
	}
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}
	public void insertFirstName(String firstName)	 {
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
	
	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}
	public void insertEmail(String email)	 {
		getEmail().clear();
		getEmail().sendKeys(email);
	}
	
	public WebElement getDay() {
		return driver.findElement(By.id("days"));
	}
	public void clickDay(String index) {
		getDay().click();
		Select day = new Select(getDay()); 
		day.selectByValue(index);
		getDay().click();
	}
	public WebElement getMonth() {
		return driver.findElement(By.id("months"));
	}
	public void clickMonth(String index) {
		getMonth().click();
		Select month = new Select(getMonth()); 
		month.selectByValue(index);
		getMonth().click();
	}
	public WebElement getYear() {
		return driver.findElement(By.id("years"));
	}
	public void clickYear(String index) {
		getYear().click();
		Select year = new Select(getYear()); 
		year.selectByValue(index);
		getYear().click();
	}
	
	public WebElement getOldPass() {
		return driver.findElement(By.id("old_passwd"));
	}
	public void insertOldPass(String oldPass) {
		getOldPass().clear();
		getOldPass().sendKeys(oldPass);
	}
	
	public WebElement getNewPass() {
		return driver.findElement(By.id("passwd"));
	}
	public void insertNewPass(String newPass) {
		getNewPass().clear();
		getNewPass().sendKeys(newPass);
	}
	
	public WebElement getConfirmPass() {
		return driver.findElement(By.id("confirmation"));
	}
	public void insertConfirmPass(String confPass) {
		getConfirmPass().clear();
		getConfirmPass().sendKeys(confPass);
	}
	
	public WebElement getSaveBtn() {
		return driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']"));
	}
	public void clickSave() {
		getSaveBtn().click();
	}
	
}
