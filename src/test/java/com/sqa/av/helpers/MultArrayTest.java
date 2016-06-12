/**
 *   File Name: MultArrayTest.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 1, 2016
 *   
 */

package com.sqa.av.helpers;

import org.junit.*;

import snippet.*;

/**
 * MultArrayTest //ADDD (description of class)
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
public class MultArrayTest {

	@Test
	public void test() {
		Object[][] data = MultArray.getData();

		// System.out.println(Arrays.deepToString((data)));

		DisplayHelper.multArray(data);
	}
}
