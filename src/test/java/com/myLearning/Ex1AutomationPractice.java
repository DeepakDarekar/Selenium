package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class Ex1AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		driver.get("http://www.automationpractice.com/");
		By locator = new ByIdOrName("search_query_top");
		WebElement searchBox = driver.findElement(locator);
		searchBox.sendKeys("Dress");
	}
}
