package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class HomePage {
	//as long as the browser is at home page we do all the actions here 
	//for each new url we open a new class
	protected WebDriver driver;

	public HomePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	/* object repository
	 Instead of storing all the objects in the same class we save the object in the corresponding class
	 * using findby annotation from PageFectory class
	 * we're initializing all the object using initElements method
	 * @findBy annotation (from page factory class)is used to declare global variables 
	 */
	@FindBy(xpath = "//span[text() = 'Categories']")WebElement catagoryMenu;
	@FindBy(xpath = "//div[text() = 'Men']")WebElement menMenu;
	@FindBy(xpath = "//li[@id = '5xu2f']/a")WebElement menClothing;
	@FindBy(xpath = "//li[@id = '5xu28']/a")WebElement shirt;
	@FindBy(xpath = "//li[@id = '55cxg']/a")WebElement poloShirt;
	
	// all functionality and all object from homePage
	public void clickCatagory() {
		Helper.click(catagoryMenu);
	}

	public void clickMen() {
		Helper.click(menMenu);
	}

	public void clickMenClothing() {
		Helper.click(menClothing);
	}

	public void clickShirt() {
		Helper.click(shirt);
	}

	public PoloShirtPage clickPoloShirt() {
		Helper.click(poloShirt);
		return new PoloShirtPage(driver);
	}

	public JeansPage clickJeans() {

		return new JeansPage(driver);
	}

}
