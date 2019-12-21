package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class PoloProductDetailPage {

	protected WebDriver driver;

	public PoloProductDetailPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='h-padding-b-tight'][1]//button")WebElement quantity;
	@FindBy(xpath = "//ul[@id= 'options']/li[3]/a")WebElement quantity3;
	public void selectQuantity() {
		Helper.click(quantity);
		Helper.click(quantity3);

	}

	public void selectColor() {

	}

	public void selectSize() {

	}

	public void clickShipItButton() {

	}

	public void clickContinueShoppingButton() {

	}

	public CheckoutPage clickviewCartAndcheckout() {
		return new CheckoutPage(driver);
	}
}
