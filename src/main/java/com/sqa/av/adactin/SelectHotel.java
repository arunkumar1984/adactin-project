/**
 *   File Name: SelectHotel.java<br>
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
 * SelectHotel //ADDD (description of class)
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
public class SelectHotel extends BasicPage {

	@FindBy(id = "radiobutton_0")
	private static WebElement radioBtn_0;

	@FindBy(id = "hotel_name_0")
	private static WebElement hotelName_0;

	@FindBy(id = "location_0")
	private static WebElement location_0;

	@FindBy(id = "rooms_0")
	private static WebElement numberOfRooms_0;

	@FindBy(id = "arr_date_0")
	private static WebElement checkInDate_0;

	@FindBy(id = "dep_date_0")
	private static WebElement checkOutDate_0;

	@FindBy(id = "no_of_days_0")
	private static WebElement numberOfDays_0;

	@FindBy(id = "room_type_0")
	private static WebElement roomType_0;

	@FindBy(id = "price_night_0")
	private static WebElement pricePerNight_0;

	@FindBy(id = "total_price_0")
	private static WebElement totalPrice;

	public SelectHotel(WebDriver driver) {
		super(driver);
	}

}
