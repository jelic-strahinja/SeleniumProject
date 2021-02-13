package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignUpBtn() {
		return driver.findElement(By.className("login"));
	}
	public void clickSignUpBtn() {
		getSignUpBtn().click();
	}
	
	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}
	public void insertEmail(String email) {
		getEmailField().sendKeys(email);
	}
	
	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}
	public void insertPassword(String password) {
		getPasswordField().sendKeys(password);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	public void clickLoginBtn() {
		getLoginBtn().click();
	}
	
	public WebElement getErrorMsg() {
		return driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));
	}
	
	public WebElement getErrorWindow() {
		return driver.findElement(By.className("alert-danger"));
	}
	
	
}
