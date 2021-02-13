package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {
	WebDriver driver; 
	
	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddAddressBtn() {
		return driver.findElement(By.xpath("//a[@title='Add an address']"));
	}
	public void clickAddAddressBtn() {
		getAddAddressBtn().click();
	}
	
	public List<WebElement> getDeleteBtnList() {
		return driver.findElements(By.xpath("//a[@title='Delete']"));
	}
	public WebElement getSingleDeleteBtn(int index) {
		return getDeleteBtnList().get(index);
	}
	public void clickDeleteBtn(int index) {
		getSingleDeleteBtn(index).click();
	}
	
	public List<WebElement> getUpdateBtnList() {
		return driver.findElements(By.xpath("//a[@title='Update']"));
	}
	public WebElement getSingleUpdateBtn(int index) {
		return getUpdateBtnList().get(index);
	}
	public void clickUpdateBtn(int index) {
		getSingleUpdateBtn(index).click();
	}
	
	public List<WebElement> getAddressAssertList() {
		return driver.findElements(By.className("page-subheading"));
	}
	public WebElement getSingleAddressAssert(int index) {
		return getAddressAssertList().get(index);
	}
	
}
