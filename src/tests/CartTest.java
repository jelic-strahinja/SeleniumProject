package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		login();
	}
	
	@Test
	public void addItemToCart() throws InterruptedException {
		action.moveToElement(myAccountPage.getWomanCardBtn()).build().perform();
		myAccountPage.clickTShirtBtn();
		js.executeScript("arguments[0].scrollIntoView(true);", itemPage.getSingleShirt(0));
		action.moveToElement(itemPage.getSingleShirt(0)).build().perform();
		itemPage.clickAddToCartBtn();
		itemPage.clickContinueShoppingBtn();
	}
	
	//@Test
	public void deleteItemFromCart() throws InterruptedException {
		cartPage.clickCartBtn();
		int forAssert = cartPage.getCartItemList().size();
		if(cartPage.getCartItemList().size() > 0) {
			cartPage.clickDeleteItemFromCart(0);
			Assert.assertEquals(cartPage.getCartItemList().size(), forAssert - 1);  
		} else {
			System.out.println("There was no products in cart");
			Thread.sleep(1000);
			Assert.assertEquals(cartPage.getCartItemList().size(), 0);
		}
	}
}
