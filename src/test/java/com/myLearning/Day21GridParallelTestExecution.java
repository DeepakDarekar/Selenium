package com.myLearning;

//To Create the Hub
//java -jar selenium-server-standalone-3.141.59.jar -role hub 
//To Create the Grid Node Server 
//java  -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub  http://192.168.0.112:4444/grid/register 

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Day21GridParallelTestExecution {

	@Test
	public void gridTest(String browserName, String URL) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL url = new URL("HTTP://192.168.0.106:4444/wd/hub");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);
		caps.setPlatform(Platform.WIN10);
		caps.setVersion("58");
		WebDriver driver = new RemoteWebDriver(url, caps);
		driver.get("http://automationpractice.com");
		System.out.println(driver.getTitle());
		driver.quit();// Close all the Open browsers
	}


	@Test
	public void gridTest1(String browserName, String URL) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL url = new URL("HTTP://192.168.0.106:4444/wd/hub");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(url, caps);
		driver.get("http://automationpractice.com");
		System.out.println(driver.getTitle());
		driver.quit();// Close all the Open browsers
	}
}
