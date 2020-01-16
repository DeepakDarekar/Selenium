package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLoginByTestNG {
	WebDriver driver;

	@Test
	public void preRequisite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dependsOnMethods = "preRequisite")
	public void lunchURL() {
		driver.get("https://www.google.com/gmail/");
	}

	@Test(dependsOnMethods = "lunchURL")
	public void enterUserId() {
		driver.findElement(By.id("identifierId")).sendKeys("TestingSelenium@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
	}

	@Test(dependsOnMethods = "enterUserId")
	public void enterPassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password' and @class='whsOnd zHQkBf']")).sendKeys("Testing");
		driver.findElement(By.className("CwaK9")).click();
	}

	@Test(dependsOnMethods = "enterPassword")
	public void validate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='gb_cb gbii']")).click();
		String actualValue = driver.findElement(By.xpath("//div[contains(text(),'achal')]")).getText();

		if (actualValue.equals("achal darekar")) {
			System.out.println("Test Case is Pass!!!");
		} else {
			System.out.println("Test Case is Failed!!!!");
		}
	}
}

