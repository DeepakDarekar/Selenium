package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;


public class Day23WebDriverBrowserStackIntegration {

	   static final String USERNAME = "deepakbaludareka1";
	   static final String AUTOMATE_KEY = "vSGt3MyrHasFa97s3mxt";
	   static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	public void testCaseGoogleSearch() throws IOException, InterruptedException {
			
		/*Cloud--Is nothing but giant Selenium Grid
		 * Selenium with Java 
		 * to be able to test URLs in your internal network Understand and configure the
		 * core capabilities in your Selenium test suite Explore advanced features
		 * Prerequisites
		 * Download the Selenium Java bindings from the Selenium website Extract the ZIP
		 * file you downloaded from the URL above, and add the Selenium Java bindings (a
		 * JAR file) and all the dependent libraries (JAR files in the /libs folder) to
		 * your classpath
		 */
		   DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("browser", "Chrome");
		   caps.setCapability("browser_version", "62.0");
		   caps.setCapability("os", "Windows");
		   caps.setCapability("os_version", "10");
		   caps.setCapability("resolution", "1024x768");

		   WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		   driver.get("http://www.google.com");
		   WebElement element = driver.findElement(By.name("q"));

		   element.sendKeys("BrowserStack");
		   element.submit();

		   System.out.println(driver.getTitle());
		   driver.quit();

		  }

	
}
