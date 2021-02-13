package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPages {
	WebDriver driver;
	WebElement pinkShirt;
	
	public ItemPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getListOfShirts() {
		return driver.findElements(By.className("product-container"));
	}
	public WebElement getSingleShirt(int index) {
		return getListOfShirts().get(index);
	}
	public WebElement addToCartBtn() {
		return driver.findElement(By.className("ajax_add_to_cart_button"));
	}
	public void clickAddToCartBtn() {
		addToCartBtn().click();
	}
	public WebElement getContinueShoppingBtn() {
		return driver.findElement(By.xpath("//span[@title='Continue shopping']"));
	}
	public void clickContinueShoppingBtn() {
		getContinueShoppingBtn().click();
	}
	
}
