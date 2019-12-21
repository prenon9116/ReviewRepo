package com.bit.test;

import org.junit.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.JeansPage;
import pages.JeansProductDetailsPage;
import pages.PoloProductDetailPage;
import pages.PoloShirtPage;

public class SmokeTest extends BaseTest{
	
	//execute testcase1
	HomePage homePage;
	PoloShirtPage poloShirtPage;
	PoloProductDetailPage poloProductDetailPage;
	CheckoutPage checkoutPage;
	JeansPage jeansPage;
	JeansProductDetailsPage jp;
	@Test
	public void buyPoloShirtWithSameBillingAndShippindAndPaypal() {
		homePage=new HomePage(driver);
		homePage.clickCatagory();
		homePage.clickMen();
		homePage.clickMenClothing();
		homePage.clickShirt();
		poloShirtPage=homePage.clickPoloShirt();
		//poloShirtPage.verifyAllProductClickable();
		poloProductDetailPage=poloShirtPage.clickOneProduct();
		poloProductDetailPage.selectQuantity();
		/*
		poloProductDetailPage.selectColor();
		poloProductDetailPage.selectSize();
		poloProductDetailPage.clickShipItButton();
		checkoutPage=poloProductDetailPage.clickviewCartAndcheckout();
		checkoutPage.clickReadyToCheckout();
		*/
	}
	
	
	
	
	//execute testcase2
	
	//@Test
	public void buyJeansWithDifferentBillingAndShippindAndPaypal() {
		
		homePage=new HomePage(driver);
		homePage.clickCatagory();
		homePage.clickMen();
		homePage.clickMenClothing();
		jeansPage=homePage.clickJeans();
		jp=jeansPage.clickOneJeansProd();
	}
	
	//execute testcase3
	//@Test
	public void buyPoloShirtWithSameBillingAndShippindAndCreditCard() {
		
	}
	
	
}
