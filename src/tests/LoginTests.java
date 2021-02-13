package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/");
		Thread.sleep(1000);
	}
	
	
	
	
	//@Test
	public void successfulLogin() throws InterruptedException {
		login();
		
	}
	//@Test
	public void wrongUserName() throws InterruptedException {
		String email = reader.getData("TC3-Login", 2 , 11);
		String pass = reader.getData("TC3-Login", 2, 12);
		
		loginBase(email, pass);
		System.out.println(loginPage.getErrorMsg().getText());
		Assert.assertEquals(loginPage.getErrorWindow().isDisplayed(), true);
	}
	//@Test(priority = 5)
	public void wrongPassword() throws InterruptedException {
		String email = reader.getData("TC3-Login", 2 , 18);
		String pass = reader.getData("TC3-Login", 2, 19);
		
		loginBase(email, pass);

		Assert.assertEquals(loginPage.getErrorWindow().isDisplayed(), true);
	}
	//@Test(priority = 10)
	public void noCredentialLogin() throws InterruptedException {
		String email = reader.getData("TC3-Login", 2 , 25);
		String pass = reader.getData("TC3-Login", 2, 26);
		
		loginBase(email, pass);

		Assert.assertEquals(loginPage.getErrorWindow().isDisplayed(), true);
	}
	
	
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
