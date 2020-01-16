package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaOtherLang {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		driver.manage().window().maximize(); // maximize the browser window
		driver.get("https://www.wikipedia.org/");
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

}