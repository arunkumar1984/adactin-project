/**
 *   File Name: AdactinHomePage.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 27, 2016
 *   
 */

package com.sqa.av.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.av.core.*;

/**
 * AdactinHomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AdactinHome extends BasicPage {

	private static String password = "iamarun";
	private static String username = "arun17kumar";

	@FindBy(id = "login")
	private static WebElement loginButton;

	@FindBy(id = "password")
	private static WebElement passwordField;

	@FindBy(id = "username")
	private static WebElement usernameField;

	public AdactinHome(WebDriver driver) {
		super(driver);
	}

	public void loginToWebsite() {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

}
