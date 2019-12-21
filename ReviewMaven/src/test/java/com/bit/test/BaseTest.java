package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.ReadFile;

public class BaseTest {
	static WebDriver driver;
	static Properties prop;
	//configure file to open browser
	@BeforeClass
	public static void configureFile() throws IOException {
		//call read property method
		prop = ReadFile.readPropertyFile("config.properties"); // readPropertyFile("config.properties") returns prop = new Properties()
		
	}
	//open browser
	@Before
	public void goToUrl() {
		//open browser in cross browsing way
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	
	
	
	//close browser
	@After
	public void closeBrowser() {
		//close browser
		driver.close();//only closes current window. and quit() closes the whole instance
	}
	//close configuration
	@AfterClass
	public static void closeFile() {
		//close property file
	}

}
