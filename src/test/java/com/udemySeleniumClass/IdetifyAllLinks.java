package com.udemySeleniumClass;

import org.testng.annotations.Test;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IdetifyAllLinks {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		List<WebElement> Links = driver.findElements(By.xpath("//a[@href]"));
		System.out.println(Links.size());

		for (WebElement element : Links) {
			System.out.println(element.getText());
			System.out.println(element.getAttribute("href")); 
		}
	}
}
