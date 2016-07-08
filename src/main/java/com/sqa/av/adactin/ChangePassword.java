/**
 *   File Name: ChangePassword.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jul 6, 2016
 *   
 */

package com.sqa.av.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.av.core.*;

/**
 * ChangePassword //ADDD (description of class)
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
public class ChangePassword extends BasicPage {

	@FindBy(id = "current_pass")
	private static WebElement currentPassword;

	@FindBy(id = "new_password")
	private static WebElement newPassword;

	@FindBy(id = "re_password")
	private static WebElement confirmPassword;

	public ChangePassword(WebDriver driver) {
		super(driver);
	}

}
