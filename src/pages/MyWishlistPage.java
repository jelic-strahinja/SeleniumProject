package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {
	
	WebDriver driver;
	WebElement inputWishlistName;
	WebElement saveBtn;
	WebElement deleteBtn;
	
	public MyWishlistPage(WebDriver driver)	 {
		this.driver = driver;
	}
	
	public WebElement getInputWishlistName() {
		return driver.findElement(By.id("name"));
	}
	public void insertWishlistName(String name) {
		getInputWishlistName().clear();
		getInputWishlistName().sendKeys(name);
	}
	
	public WebElement getSaveWishlistBtn() {
		return driver.findElement(By.id("submitWishlist"));
	}
	public void clickSaveWishlistBtn() {
		getSaveWishlistBtn().click();
	}
	
	public List<WebElement> getListDeleteBtn() {
		return driver.findElements(By.xpath("//tr[starts-with(@id,'wishlist')]"));
	}
	public WebElement getSingleDeleteBtn(int index) {
		return getListDeleteBtn().get(index).findElement(By.xpath("//a[@class='icon']"));
	}
	public void clickDeleteBtn(int index) {
		getSingleDeleteBtn(index).click();
	}
	
	
}
