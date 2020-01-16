package com.myLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day27CaptureSnapOnFailure {
	WebDriver driver;

	@BeforeMethod

	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online2pdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("This will execute third (Log Out)");
		System.out.println("This will execute first (Open Browser)");

	}
	@Test
	public void logintest() {
		System.out.println("This Test is Executed Successfully");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			SnapUtils.captureSnap(driver, result.getMethod().getMethodName());
		}
		driver.close();// Closing the opened browser Session
		System.out.println("Driver is Closed Successfully");
	}
}
