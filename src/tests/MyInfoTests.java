package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfoTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		login();
	}
	
	//@Test
	public void myInfoTest1() throws InterruptedException {
		myAccountPage.clickMyInfoBtn();
		if(myInfoPage.getGenderBtn(0).getAttribute("checked") != null) {
			myInfoPage.clickGenderBtn(0);
		} else {
			myInfoPage.clickGenderBtn(1);
		}
		myInfoPage.insertFirstName("Strahinja");
		myInfoPage.insertLastName("Jelic");
		myInfoPage.insertEmail("strahinjajelicqa@gmail.com");
		myInfoPage.clickDay("26");
		myInfoPage.clickMonth("5");
		myInfoPage.clickYear("1995");
		myInfoPage.insertOldPass("Ivana1.");
		myInfoPage.insertNewPass("Strahinja1.");
		myInfoPage.insertConfirmPass("Strahinja1.");
		
		Thread.sleep(2000);
		
		myInfoPage.clickSave();
		
		Thread.sleep(10000);
		
		
	}
}
