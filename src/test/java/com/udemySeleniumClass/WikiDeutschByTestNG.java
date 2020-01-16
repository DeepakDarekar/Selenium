package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiDeutschByTestNG {
	WebDriver driver;

	@Test
	public void preRequisite() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dependsOnMethods = "preRequisite")
	public void lunchURL() {
		driver.get("https://www.wikipedia.org/");
	}

	@Test(dependsOnMethods = "lunchURL")
	public void clickOnDeutsch() {
		driver.findElement(By.id("js-link-box-de")).click();
	}

	@Test(dependsOnMethods = "clickOnDeutsch")
	public void searchSelenium() {
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
	}

	@Test(dependsOnMethods = "searchSelenium")
	public void validate() {
		String actualValue = driver.findElement(By.id("firstHeading")).getText();
		if (actualValue.equals("Selenium")) {
			System.out.println("Test case is Passed!!!!");
		} else {
			System.out.println("Test case is Failed");
		}

	}
}