/**
 *   File Name: BookHotel.java<br>
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
 * BookHotel //ADDD (description of class)
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
public class BookHotel extends BasicPage {

	@FindBy(id = "hotel_name_dis")
	private static WebElement hotelNameDisplay;

	@FindBy(id = "location_dis")
	private static WebElement locationNameDisplay;

	@FindBy(id = "room_num_dis")
	private static WebElement numberOfRoomsDisplay;

	@FindBy(id = "total_days_dis")
	private static WebElement totalDaysDisplay;

	@FindBy(id = "price_night_dis")
	private static WebElement pricePerNightDisplay;

	@FindBy(id = "total_price_dis")
	private static WebElement totalPriceDisplay;

	@FindBy(id = "gst_dis")
	private static WebElement gst_Display;

	@FindBy(id = "final_price_dis")
	private static WebElement finalPriceDisplay;

	@FindBy(id = "first_name")
	private static WebElement firstName;

	@FindBy(id = "last_name")
	private static WebElement lastName;

	@FindBy(id = "address")
	private static WebElement address;

	@FindBy(id = "cc_num")
	private static WebElement creditCardNumber;

	@FindBy(id = "cc_type")
	private static WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private static WebElement creditCardExpiryMonth;

	@FindBy(id = "cc_exp_year")
	private static WebElement creditCardExpiryYear;

	@FindBy(id = "cc_cvv")
	private static WebElement creditCardCVV;

	@FindBy(id = "book_now")
	private static WebElement bookNowBtn;

	@FindBy(id = "cancel")
	private static WebElement cancelBtn;

	@FindBy(id = "process_span")
	private static WebElement processingText;

	public BookHotel(WebDriver driver) {
		super(driver);
	}

}
