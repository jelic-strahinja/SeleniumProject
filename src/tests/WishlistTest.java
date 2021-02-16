package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishlistTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		login();
	}
	
	@Test (priority = 5)
	public void createWishlist() {
		String wishListName = reader.getData("TC5-MyWishList", 2, 1);
		myAccountPage.clickMyWishlistBtn();
		myWishlistPage.insertWishlistName(wishListName);
		myWishlistPage.clickSaveWishlistBtn();
	}
	
	@Test (priority = 10)
	public void deleteWishlist() {
		myAccountPage.clickMyWishlistBtn();
		if(myWishlistPage.getListDeleteBtn().size() <= 0) {
			
		} else {
			myWishlistPage.clickDeleteBtn(0);
		}
		alertAcc();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
                              
}
