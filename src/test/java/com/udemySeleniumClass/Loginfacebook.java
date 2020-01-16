package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		driver.manage().window().maximize(); // maximize the browser window
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xxx");
		driver.findElement(By.xpath("//Input[@value = 'Log In']")).click();
		System.out.println(driver.getTitle());

	}
}
