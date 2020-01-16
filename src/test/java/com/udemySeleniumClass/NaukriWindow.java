package com.udemySeleniumClass;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NaukriWindow {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		System.out.println("URL is Launched Successfully");
		driver.getTitle();
	}

	@Test
	public void OpneWindows() {
//		String tabbedClassName = "analystic";
//		WebElement tabbedWindowButton = driver.findElement(By.className(tabbedClassName));
//		tabbedWindowButton.click();

		String parent = driver.getWindowHandle();
		System.out.println("Parrentwindow id is " + parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(windows.get(1));
		System.out.println("Url of the Current Window" +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(windows.get(2));
		System.out.println("Url of the Current Window" +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		System.out.println("Title of parent window is " +driver.getTitle());
		driver.close();
	}

}
