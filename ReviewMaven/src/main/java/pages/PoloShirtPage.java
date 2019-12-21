package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class PoloShirtPage {
	protected WebDriver driver;
	public PoloShirtPage(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'s Standard Fit Short Sleeve Loring Polo T - Shirt - Goodfellow & Co™')]")WebElement oneProduct;
	public void verifyAllProductClickable() {
		
	}
	public PoloProductDetailPage clickOneProduct() {
		Helper.click(oneProduct);
		return new PoloProductDetailPage(driver);
	}
	
	

}
