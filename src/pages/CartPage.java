package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCartBtn() {
		return driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
	}
	public void clickCartBtn() {
		getCartBtn().click();
	}
	
	public List<WebElement> getCartItemList() {
		return driver.findElements(By.xpath("//tr[starts-with(@id, 'product_')]"));
	}
	public WebElement getCartItemDelete(int index) {
		return getCartItemList().get(index).findElement(By.xpath("//a[@title='Delete']"));
	}
	public void clickDeleteItemFromCart(int index) {
		getCartItemDelete(index).click();
	}
}
