package com.myLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day18TestBrokenLinks {

	@Test
	public static void testCase1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      
		java.util.List<WebElement> allHyperlinks = driver.findElements(By.tagName("a"));
		Reporter.log("Total <a> tags :" + allHyperlinks.size(), true);
		
		for (int i = 0; i < allHyperlinks.size(); i++) {
			WebElement link = allHyperlinks.get(i);
			Reporter.log("Hyperlink :" + link.getText(), true);
			Reporter.log("Hyperlink :" + link.getAttribute("href"), true);
			
			URL url = new URL(link.getAttribute("href"));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			Assert.assertTrue(code < 400, "Status Code is greater than 400");
		    SnapUtils.captureSnap(driver, "snap1");
		 
		}

	}
}
