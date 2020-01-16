package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07LocatorsPractice {
	public static void main(String[] args) {
		//Load the Driver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		//Launch the browser and create object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com/");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("Appiumselenium2019@gmail.com");
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement radioMr = driver.findElement(By.id("id_gender1"));
		System.out.println("is Male is Selected : "+radioMr.isSelected());
		driver.findElement(By.id("id_gender1")).click();
		System.out.println("is Male is Selected : "+radioMr.isSelected());
	}
}
