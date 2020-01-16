package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day27TestNGCaptureSnapOnTestFailure {

	@Test
	public void testSearch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver(); // create object of ChromeDriver
		driver.get("http://www.Flipcart.com/");
		Thread.sleep(5000);
		driver.findElement(By.className("_29YdH8")).click();
		driver.findElement(By.name("q")).sendKeys("iPhone" + Keys.ENTER);
		// Click on Search button
		// driver.findElement(By.className("xmlns")).click();
		// Want to check iPhone Logo is displayed or Not

		Thread.sleep(5000);
		/*
		 * boolean isIphoneLogoDisplayed = isDisplayed(driver,
		 * By.cssSelector("[alt ='Apple iPhone 6s (Space Grey, 32 GB)']"));
		 * Assert.assertTrue(isIphoneLogoDisplayed)
		 */

		WebElement searchResultTextElement = driver.findElement(By.className("_2yAnYN"));
		Assert.assertEquals(searchResultTextElement.getText(), "Showing 1 – 24 of 176 results for \"iphone\"");

		boolean contains = searchResultTextElement.getText().contains("iPhone");
		Assert.assertTrue(contains);

	}

	/*
	 * private boolean isDisplayed(WebDriver driver, By locator) { // TODO
	 * Auto-generated method stub try { WebElement ele =
	 * driver.findElement(locator); if (ele.isDisplayed()) { return true; } else {
	 * return false; } } catch (NoSuchElementException e) {
	 * 
	 * }
	 * 
	 * }
	 */
}
