package com.udemySeleniumClass;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		System.out.println("URL is Laumched Successfully");
		driver.getTitle();
	}

	@Test
	public void MultipleWindows() {
		// How Many Frames are on Page
		List<WebElement> ListOfFrames = driver.findElements(By.tagName("frame"));
		int NumberofTags = ListOfFrames.size();
		System.out.println("No Of Frames available on Page are " + NumberofTags);
		// How to handle the frame and Click inside the Frame/Container elemnet
		driver.switchTo().frame("iframe1");// (index/name/id)
		String pageTitle = driver.getCurrentUrl();
		System.out.println("Print =" + pageTitle);
		// assertEquals(pageTitle, "");
		// driver.switchTo().frame(ListOfFrames.get(0));
		driver.switchTo().parentFrame();

	}
}
