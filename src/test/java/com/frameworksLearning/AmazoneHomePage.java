package com.frameworksLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkCore.BasePage;

public class AmazoneHomePage extends BasePage {

	public AmazoneHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement txtSearchBox;

	@FindBy(css = ".nav-input[type='submit']")
	WebElement btnSearch;

	public AmazoneSearchResultPage searchProduct(String productName) {
		txtSearchBox.sendKeys(productName);
		btnSearch.click();
		return PageFactory.initElements(driver(), AmazoneSearchResultPage.class);
	}

}
