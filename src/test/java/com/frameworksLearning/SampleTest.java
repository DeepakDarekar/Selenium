package com.frameworksLearning;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameworkCore.BaseTest;

public class SampleTest extends BaseTest {
	/* Without Page object Model */
	@Test
	public void testCase1() {
		driver().get("http://www.google.com");
		driver().findElement(By.name("q")).sendKeys("Deepak Darekar");
		// Click on Google Search button or Just Hit the Enter
		// Submit()--Submitting the form
		driver().findElement(By.name("q")).submit();
		String pageUrl = driver().getCurrentUrl();
		Assert.assertTrue(pageUrl.startsWith("https://www.google.com/search"),
				"pageUrl :" + driver().getCurrentUrl() + " was not stating with https://www.google.com/search");
       System.out.println("Test cases is passed successfully");
	}
}
