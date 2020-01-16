package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day25TestNGSuiteParallelExecution1 {
	@Test
	public void testLoginAdmin() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("Admin");
		driver.findElement(By.id("passw")).sendKeys("Admin"+Keys.ENTER);
		// driver.findElement(By.name("btnSubmit")).click();
		//driver.findElement(By.name("btnSubmit")).submit();

		String welComeMessage = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(welComeMessage, "Hello Admin User", "Greeting message failed");
		driver.quit();
	}
	@Test
	public void testLoginUser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.testfire.net");
		driver.findElement(By.linkText("ONLINE BANKING LOGIN")).click();
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"+Keys.ENTER);
		// driver.findElement(By.name("btnSubmit")).click();
		//driver.findElement(By.name("btnSubmit")).submit();

		String welComeMessage = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(welComeMessage, "Hello John Smith", "Greeting message failed");
		driver.quit();
	}
}
