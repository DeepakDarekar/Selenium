package com.myLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day09MultipleWebElementsFlipcartAutomation {

	@Test
	public void testSearch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
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
		Assert.assertEquals(searchResultTextElement.getText(), "Showing 1 – 24 of 175 results for \"iphone\"");
		// Assert.assertEquals(searchResultTextElement.getText().matches("Showing 1 – 24
		// of 17 results for \"iphone\"")"Invalid Format");
		List<WebElement> allProductElemets = driver.findElements(By.className("_3wU53n"));
		System.out.println("Total; Product Count:" + allProductElemets.size());
		SoftAssert sAssert = new SoftAssert();
		for (int i = 0; i < allProductElemets.size(); i++) {
			System.out.println("Title " + allProductElemets.get(i).getText());
			String title = allProductElemets.get(i).getText();
			sAssert.assertTrue(title.contains("iphone"), "Search result not containing the iPhone Word");
		}
		sAssert.assertAll();//If any one of the above Product search is failed then test would be failed and Stoped Execution
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
}