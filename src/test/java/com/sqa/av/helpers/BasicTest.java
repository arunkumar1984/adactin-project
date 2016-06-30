package com.sqa.av.helpers;

import java.util.*;
import java.util.concurrent.*;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BasicTest {
	// ArayList to hold test data
	public static ArrayList<Object> tests = new ArrayList<Object>();
	private static Logger log = Logger.getLogger(BasicTest.class);

	// StringBuilder class in place of String class so that less objects are
	// created, more efficient when dealing with String concatenation
	public static StringBuilder testString = new StringBuilder();

	private static String baseURL; // Set to mtv to show the

	// Super sets the value
	// in Craigslist
	private static WebDriver driver;

	/**
	 * @return the baseURL
	 */
	public static String getBaseURL() {
		return baseURL;
	}

	/**
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the log
	 */
	public static Logger getLog() {
		return log;
	}

	@BeforeClass(enabled = false)
	public static void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@BeforeClass(enabled = true)
	public static void setupFirefox() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	private boolean acceptNextAlert = true;

	/**
	 *
	 */
	public BasicTest(String baseURL) {
		super();
		BasicTest.baseURL = baseURL;
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	public String closeAlertAndGetItsText() {
		try {
			Alert alert = this.driver.switchTo().alert();
			String alertText = alert.getText();
			if (this.acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			this.acceptNextAlert = true;
		}
	}

	@SuppressWarnings("unused")
	public boolean isAlertPresent() {
		try {
			this.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@SuppressWarnings("unused")
	public boolean isElementPresent(By by) {
		try {
			this.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	@BeforeMethod
	public void setupTest() {
		// Delete all saved cookies
		getDriver().manage().deleteAllCookies();
		// Go to base URL
		getDriver().get(getBaseURL());
	}
}
