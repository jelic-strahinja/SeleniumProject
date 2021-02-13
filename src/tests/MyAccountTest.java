package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		login();
	}
	
	//@Test
	public void womanCard() throws InterruptedException {
		myAccountPage.clickWomanCardBtn();
		Thread.sleep(20000);
		
		
	}
}
