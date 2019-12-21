package pages;

import org.openqa.selenium.WebDriver;

public class JeansPage {
	protected WebDriver driver;
	public JeansPage(WebDriver dr) {
		driver=dr;
	}
	public JeansProductDetailsPage clickOneJeansProd() {
		return new JeansProductDetailsPage(driver);
	}
}
