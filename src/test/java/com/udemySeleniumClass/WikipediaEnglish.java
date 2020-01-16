package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaEnglish {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); // maximize the browser window
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
		String actualValue = driver.findElement(By.id("firstHeading")).getText();
		if (actualValue.equals("Selenium")) {
			System.out.println("Test case is passed Successfully");
		} else {
			System.out.println("Test Case is failed");
		}
		//driver.close();
	}
}
