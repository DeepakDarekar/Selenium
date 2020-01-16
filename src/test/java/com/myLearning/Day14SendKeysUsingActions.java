package com.myLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day14SendKeysUsingActions {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://flipcart.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("_29YdH8")).click();
		System.out.println("URL is Laumched Successfully");
		System.out.println("The Title of the window is " + driver.getTitle());
	}

	@Test
	public void testsubnavMenuMen() throws InterruptedException {
		WebElement bodyElement = driver.findElement(By.id("entry"));
		Thread.sleep(5000);

		Actions builder = new Actions(driver);
		Object txt = null;
		bodyElement.sendKeys(Keys.ENTER);
		builder.moveToElement((WebElement) txt).sendKeys("Deepak").perform();
		builder.keyDown(Keys.SHIFT).keyUp(Keys.SHIFT).perform();

	}
}