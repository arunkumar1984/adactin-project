package com.sqa.av.helpers;

import java.net.*;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.*;
import org.testng.annotations.*;

public class BasicTest {
	private static String baseURL = "http://mtv.com"; // Set to mtv to show the
														// // Super sets the
														// value
														// in Craigslist

	private static WebDriver driver;

	// Sauce username
	public static String activeUsername = "arun17kumar";// System.getenv("SAUCE_USERNAME");

	// Sauce access key
	public static String aciveAccesskey = "24d584d3-6f5f-4dd4-a543-92c88595fc4d";// System.getenv("SAUCE_ACCESS_KEY")

	public static String finalURL = "http://" + activeUsername + ":" + aciveAccesskey
			+ "@ondemand.saucelabs.com:80/wd/hub";

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

	@BeforeClass(enabled = false)
	public static void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	// Run the test on SauceLabs on WinXP & Chrome
	@BeforeClass(enabled = true)
	public static void setupChromeSL() throws MalformedURLException {

		// set desired capabilities to launch appropriate browser on Sauce
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(CapabilityType.VERSION, "41");
		capabilities.setCapability(CapabilityType.PLATFORM, "Windows XP");
		capabilities.setCapability("name", "AdactinTest");
		capabilities.setCapability("build", "1.0");

		// driver .manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver = new RemoteWebDriver(new URL(finalURL), capabilities);
		driver.get(baseURL);
	}

	@BeforeClass(enabled = false)
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
