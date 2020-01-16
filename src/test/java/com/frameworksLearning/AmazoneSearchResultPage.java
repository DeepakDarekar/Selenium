package com.frameworksLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkCore.BasePage;

public class AmazoneSearchResultPage extends BasePage {

	public AmazoneSearchResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "mwebSparkleHeadline")
	WebElement divShowingResultText;

	public String getSearchResultText() {
		return divShowingResultText.getText();
	}

}
