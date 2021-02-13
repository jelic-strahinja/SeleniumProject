package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
	
WebDriver driver;
WebElement myAddressBtn;
WebElement myAccountBtn;
WebElement myInfoBtn;
WebElement myWishlist;
WebElement womenCardBtn;
WebElement tShirtInWomanCard;

	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMyAccountButton() {
		return driver.findElement(By.className("account"));
	}
	public void clickMyAccountButton() {
		getMyAccountButton().click();
	}
	
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.xpath("//a[@title='Addresses']"));
	}
	public void clickMyAddressesButton() {
		getMyAddressesButton().click();
	}
	
	public WebElement getMyInfoBtn() {
		return driver.findElement(By.xpath("//a[@title='Information']"));
	}
	public void clickMyInfoBtn() {
		getMyInfoBtn().click();
	}
	
	public WebElement getMyWishlistBtn() {
		return driver.findElement(By.xpath("//a[@title='My wishlists']"));
	}
	public void clickMyWishlistBtn() {
		getMyWishlistBtn().click();
	}
	
	public WebElement getWomanCardBtn() {
		return driver.findElement(By.xpath("//a[@title='Women']"));	
	}
	public void clickWomanCardBtn() {
		getWomanCardBtn().click();
	}
	
	public WebElement getTShirtBtn() {
		return driver.findElement(By.xpath("//a[@title='T-shirts']"));
	}
	public void clickTShirtBtn() {
		getTShirtBtn().click();
	}
}
