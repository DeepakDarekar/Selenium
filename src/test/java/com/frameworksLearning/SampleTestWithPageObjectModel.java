package com.frameworksLearning;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameworkCore.BaseTest;

public class SampleTestWithPageObjectModel extends BaseTest {
	/* With Page object Model */
	@Test
	public void testCase1() {
		driver().get("http://www.google.com");
		// Now browser is having google home page opened
		// Create object of google home page

		GoogleHomePage homepage = new GoogleHomePage();
		// Even object is created the Elements are not initialized yet
		// Initialize the object --PageFactory it is a class that help us to create the
		// object of WebPages it is like the factory of pages

		// GoogleHomePage homepage = PageFactory.initElements(driver(),GoogleHomePage.class);
		PageFactory.initElements(driver(), homepage);
		
		homepage.performSearch("Deepak Darekar");
		
		//Now browser cotains Google Search  result page 
		GoogleSearchResultPage resultPage = PageFactory.initElements(driver(), GoogleSearchResultPage.class);
		String expectedStartURL = "https://www.google.com/search";
		Assert.assertTrue(homepage.getUrl().startsWith(expectedStartURL),
				"Page url :" + driver().getCurrentUrl() + "Was not starting with http://www.google.com/search");
		Assert.assertEquals(resultPage.getSearchedText(), "Deepak Darekar","Search Text did not matached");
		System.out.println("Deepak Darekar is Searched Successfully");
	}
}
