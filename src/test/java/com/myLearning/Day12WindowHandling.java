package com.myLearning;
import static org.testng.Assert.assertEquals;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day12WindowHandling {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows");
		System.out.println("URL is Laumched Successfully");
		System.out.println("The Title of the window is "+driver.getTitle());
	}

	@SuppressWarnings("unused")
	@Test
	public void MultipleWindows() {
		driver.findElement(By.id("button1")).click();
		// Give the Name of window that you are Curantly on
		String parrentWindowName = driver.getWindowHandle();
		// Open Windows will get all Properties of Window and it will give in Set
		Set<String> windowNames = driver.getWindowHandles();
		// Convert to List
		List<String> listWindowNames = new ArrayList<String>(windowNames);
		// How Many Windows are Open
		windowNames.size();
		// Navigate to the Child Window Context Switch
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String childWindowName = listWindowNames.get(1);
		driver.switchTo().window(childWindowName);
		// Validation of Child Window Title
		String pageTitle = driver.getTitle();
		System.out.println("Print =" + pageTitle);
		assertEquals(pageTitle, "QA Automation Tools Tutorial");

		// Validate with URL
		String actualURL = driver.getCurrentUrl();
		assertEquals(actualURL, "https://www.toolsqa.com/");

		// Page Heading
		// assertEquals(driver.findElement(By.xpath("//*[@id='page']/div[1]/header/div/a/img")).getText(),"https://www.toolsqa.com/wp-content/uploads/2014/08/Toolsqa.jpg");

		// Print all URLS of open window

		for (String name : windowNames) {
			System.out.println(name);
			System.out.println(driver.switchTo().window(name).getCurrentUrl());
			// System.out.println(driver.switchTo().window(name).getTitle());
			// Returning to parent Window
			driver.switchTo().window(listWindowNames.get(0));// OR
			// driver.switchTo().window(parrentWindowName);
			String parrentPageTitle = driver.getTitle();
			System.out.println("Print the Parrent Window Title =" + parrentPageTitle);

		}
		// Close the Window-->It is Going to close the Current URL Which is Open
		driver.close();
		// Quits the Driver and all its Associate Windows Quiting the Webdriver Object
		// driver.quit();
	}

}