package com.frameworksLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkCore.BasePage;

public class GoogleHomePage extends BasePage {
	// Data Member(Fields)
	// Methods

	public GoogleHomePage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "q")
	WebElement txtQueryBox;

	@FindBy(name = "btnk")
	WebElement btnGoogleSearch;

	public void performSearch(String string) {
		txtQueryBox.sendKeys("Deepak Darekar");
		txtQueryBox.submit();
		// btnGoogleSearch.click();
	}

}
