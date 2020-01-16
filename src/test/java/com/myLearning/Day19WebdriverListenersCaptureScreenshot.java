package com.myLearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Day19WebdriverListenersCaptureScreenshot {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
		MyWebDriverListener listener = new MyWebDriverListener();
		driver.register(listener);

		driver.get("http://google.com");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Deepak Darekar" + Keys.ENTER);

		// SnapUtil.captureSnap(driver."snap1.png");

		// How to Capture the ScreenShot of the WebPage

		TakesScreenshot takeSnap = (TakesScreenshot) driver;
		File snap = takeSnap.getScreenshotAs(OutputType.FILE);
		System.out.println("Snap path " + snap.getAbsolutePath());
		File dest = new File("Search_result.png");
		// Make it Parameterized
		// File dest = new File(fileName);
		try {
			Files.move(snap, dest);
			System.out.println("File Moved to " + dest.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
