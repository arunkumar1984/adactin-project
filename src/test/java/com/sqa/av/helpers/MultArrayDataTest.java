package com.sqa.av.helpers;

import org.testng.*;
import org.testng.annotations.*;

public class MultArrayDataTest {

	@DataProvider
	public Object[][] dp() {
		return MultArray.getData();
	}

	@Test(dataProvider = "dp")
	public void multArrayTest(String title, int num1, int num2, int num3, int expectedResult) {
		System.out.println(title);
		System.out.println("--------------------------------");
		System.out.println("Adding:" + num1 + " + " + num2 + " + " + num3 + " = " + expectedResult + "?");
		int actualResult = addNumbers(num1, num2, num3);
		System.out.println("--------------------------------\n");
		Assert.assertEquals(expectedResult, actualResult);
	}

	private int addNumbers(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
}