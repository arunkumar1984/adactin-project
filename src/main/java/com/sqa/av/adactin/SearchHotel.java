/**
 *   File Name: SearchHotelPage.java<br>
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
 * SearchHotelPage //ADDD (description of class)
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
public class SearchHotel extends BasicPage {

	@FindBy(id = "location")
	private static WebElement locationFld;

	@FindBy(id = "hotels")
	private static WebElement hotelsFld;

	@FindBy(id = "room_type")
	private static WebElement roomTypeFld;

	@FindBy(id = "room_nos")
	private static WebElement roomNos;

	@FindBy(id = "datepick_in")
	private static WebElement datePickInFld;

	@FindBy(id = "datepick_out")
	private static WebElement datePickOutFld;

	@FindBy(id = "adultroom")
	private static WebElement adultRoomFld;

	@FindBy(id = "childroom")
	private static WebElement childRoomFld;

	@FindBy(id = "Submit")
	private static WebElement submitBtn;

	@FindBy(id = "Reset")
	private static WebElement resetBtn;

	/**
	 * @param driver
	 */
	public SearchHotel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
