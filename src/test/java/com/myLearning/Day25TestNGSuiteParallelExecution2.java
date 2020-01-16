package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day25TestNGSuiteParallelExecution2 {
	@Test
	public void testSearch() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("Admin");
		driver.findElement(By.id("passw")).sendKeys("Admin"+Keys.ENTER);
		driver.findElement(By.id("txtSearch")).sendKeys("Deepak");
		String pageTitle = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(pageTitle, "Search Results", "pageTitle Fail");
		String textSearched = driver.findElement(By.cssSelector("[id*='Content_Main_lblSearch']")).getText();
		Assert.assertEquals(textSearched, "Deepak","Search Text did not match");
		driver.quit();
	}
}
