package com.frameworksLearning;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import frameworkCore.BaseTest;

public class AmazoneTest extends BaseTest {
	@BeforeMethod
	public void OpenUrl() {
		driver().get("https://www.amazon.in");

	}

	@Test
	public void testProductSearch() {
		AmazoneHomePage homePage = PageFactory.initElements(driver(), AmazoneHomePage.class);
		// How to use the page chaining is as below
		AmazoneSearchResultPage resultPage = homePage.searchProduct("pixel");
		String actualText = resultPage.getSearchResultText();
		driver().quit();
		Assert.assertEquals(actualText, "Showing results for \"pixel\"in Electronics.", "Search result Text Failed");

	}

	@Test
	public void testProductSearch1() {
		AmazoneHomePage homePage = PageFactory.initElements(driver(), AmazoneHomePage.class);
		// How to use the page chaining is as below
		AmazoneSearchResultPage resultPage = homePage.searchProduct("iPhone");
		String actualText = resultPage.getSearchResultText();
		driver().quit();
		Assert.assertEquals(actualText, "Showing results for \"pixel\"in Electronics.", "Search result Text Failed");

	}
}
