package com.myLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day24TestNG {
	@Test(expectedExceptions = NullPointerException.class)
	public void testCase1() {
		Assert.fail("I dont want to pass");// Intentialling failing the Test Case

	}

	@Test(invocationCount = 10) // This method is run the 10 Time
	public void testCase2() {
		Assert.fail("I dont want to pass");// Intentialling failing the Test Case

	}

	@Test(description = "This is my Sample Test Case")
	public void testCase4() {
		try {
			@SuppressWarnings("unused")
			int num = 3 / 0;

		} catch (ArithmeticException e) {
			// TODO: handle exception
			Assert.fail("Invalid Operation, we can not devide by 0", e);
		}
	}

	@Test(enabled = false) // disable the Test Case
	public void testCase5() {

	}

	@Test(priority = 1) // Priority of Test Execution and Default prioprity is 0 and that Test Case is
						// Executed First and if both test Case has same Priority then it is Executed on Alphabetical Order
	public void testCase6() {

	}

	@Test(dependsOnMethods = {"testCase1","testCase2"})//Test Case 7 is Depends on TestCase1 and testCase2
	public void testCase7() {

	}

}
