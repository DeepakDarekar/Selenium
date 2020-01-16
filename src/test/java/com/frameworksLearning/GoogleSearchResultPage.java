package com.frameworksLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkCore.BasePage;

public class GoogleSearchResultPage extends BasePage {

	public GoogleSearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "resultStats")
	WebElement divResultsStats;

	@FindBy(name = "q")
	WebElement txtSearchBox;

	public String getSearchedText() {
	   return txtSearchBox.getAttribute("value");
   }
	
	

}
