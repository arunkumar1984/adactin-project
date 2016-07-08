/**
 *   File Name: Itinerary.java<br>
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
 * Itinerary //ADDD (description of class)
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
public class Itinerary extends BasicPage {

	@FindBy(id = "hotel_name")
	private static WebElement hotelName;

	@FindBy(id = "location")
	private static WebElement location;

	@FindBy(id = "rooms_type")
	private static WebElement roomType;

	@FindBy(id = "arrival_date")
	private static WebElement arrivalDate;

	@FindBy(id = "departure_text")
	private static WebElement departureDate;

	@FindBy(id = "total_rooms")
	private static WebElement totalRooms;

	@FindBy(id = "adults_room")
	private static WebElement adultRoom;

	@FindBy(id = "children_room")
	private static WebElement childrenRoom;

	@FindBy(id = "price_night")
	private static WebElement priceNight;

	@FindBy(id = "total_price")
	private static WebElement totalPrice;

	@FindBy(id = "gst")
	private static WebElement gst;

	@FindBy(id = "final_price")
	private static WebElement finalPrice;

	@FindBy(id = "first_name")
	private static WebElement firstName;

	@FindBy(id = "last_name")
	private static WebElement lastName;

	@FindBy(id = "address")
	private static WebElement address;

	@FindBy(id = "order_no")
	private static WebElement orderNumber;

	@FindBy(id = "search_hotel")
	private static WebElement searchHotelBtn;

	@FindBy(id = "my_itinerary")
	private static WebElement myItineraryBtn;

	@FindBy(id = "logout")
	private static WebElement logoutBtn;

	public Itinerary(WebDriver driver) {
		super(driver);
	}

}
