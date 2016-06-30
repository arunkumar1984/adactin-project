import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

import com.sqa.av.helpers.*;

/**
 *   File Name: ResizeTest.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 27, 2016
 *   
 */

/**
 * ResizeTest //ADDD (description of class)
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
public class ResizeTest extends BasicTest {
	public ResizeTest() {
		super("http://jqueryui.com/resizable/");
	}

	@Test
	public void resizeTest() throws InterruptedException {
		getDriver().get("https://jqueryui.com/resizable/");

		// Switch to working frame
		getDriver().switchTo().frame(0);

		// Check for element
		if (isElementPresent(By.className("ui-resizable-se"))) {
			System.out.println("Handle present");
		}

		Actions builder = new Actions(getDriver());
		builder.clickAndHold(getDriver().findElement(By.className("ui-resizable-se"))).moveByOffset(50, 50).release();

		// Generate the composite action.
		Action moveResizeHandles = builder.build();
		// Perform the compositeAction
		moveResizeHandles.perform();

	}
}