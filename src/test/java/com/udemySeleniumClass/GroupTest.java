package com.udemySeleniumClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GroupTest {
	public static WebDriver driver;

	@BeforeMethod

	public static void beforeMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver(); // create object of ChromeDriver
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(4000);
	}

	/*
	 * @Test
	 * 
	 * public void wikipidiyaEnglish() {
	 * 
	 * driver.findElement(By.id("js-link-box-en")).click();
	 * driver.findElement(By.id("searchInput")).sendKeys("Selenium");
	 * driver.findElement(By.id("searchButton")).click(); String actualValue =
	 * driver.findElement(By.id("firstHeading")).getText(); if
	 * (actualValue.equals("Selenium")) {
	 * System.out.println("Test case is passed Successfully"); } else {
	 * System.out.println("Test Case is failed"); }
	 * 
	 * }
	 */

	@Test

	public static void wikipidiyaOtherLang() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("driver:"+driver);
		String title = driver.getTitle();
		System.out.println("Title of the Page:" + title);

		driver.findElement(By.id("js-link-box-it")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();

		String actualValue = driver.findElement(By.id("firstHeading")).getText();
		if (actualValue.equals("Selenio nativo")) {
			System.out.println("Test case is passed Successfully");
		} else {
			System.out.println("Test Case is failed");
		}
		driver.close();

	}

	@AfterMethod

	public static void afterMethod() {
		driver.quit();

	}

}
