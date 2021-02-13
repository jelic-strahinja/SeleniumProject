package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AddAddressPage;
import pages.AddressPage;
import pages.CartPage;
import pages.ExcelReader;
import pages.ItemPages;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyInfoPage;
import pages.MyWishlistPage;

public class BaseTest {
	//pages
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	AddAddressPage addAddressPage;
	AddressPage addressPage;
	MyInfoPage myInfoPage;
	MyWishlistPage myWishlistPage;
	CartPage cartPage;
	ItemPages itemPage;
	//other stuff
	WebDriver driver;
	JavascriptExecutor js;
	Actions action;
	ExcelReader reader;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.loginPage = new LoginPage(driver);
		this.myAccountPage = new MyAccountPage(driver);
		this.addAddressPage = new AddAddressPage(driver);
		this.addressPage = new AddressPage(driver);
		this.myInfoPage = new MyInfoPage(driver);
		this.myWishlistPage = new MyWishlistPage(driver);
		this.cartPage = new CartPage(driver);
		this.action = new Actions(driver);
		this.itemPage = new ItemPages(driver);
		this.reader = new ExcelReader("data/testCases.xlsx");
		this.js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	public void login() throws InterruptedException {
		String email = reader.getData("TC3-Login", 2, 4);
		String pass = reader.getData("TC3-Login", 2, 5);
		loginPage.clickSignUpBtn();
		loginPage.insertEmail(email);
		loginPage.insertPassword(pass);
		loginPage.clickLoginBtn();
		Thread.sleep(1000);
		
	}
	
	public void loginBase(String email, String password) throws InterruptedException {
		loginPage.clickSignUpBtn();
		Thread.sleep(1000);
		loginPage.insertEmail(email);
		Thread.sleep(1000);
		loginPage.insertPassword(password);
		Thread.sleep(1000);
		loginPage.clickLoginBtn();
		Thread.sleep(1000);
	}
	
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void alertAcc() {
		driver.switchTo().alert().accept();
	}
	
}
