package com.myLearning;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Day13ActionsAPI1<V> {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("URL is Laumched Successfully");
		System.out.println("The Title of the window is " + driver.getTitle());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void MultipleWindows() {
		WebElement frameElement = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameElement);
		WebElement element = driver.findElement(By.cssSelector("body > div"));
		//How to get the Color of the Values or button 
		String color = element.getCssValue("background-color");
		System.out.println("Before Double Click :"+color);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		Actions builder = new Actions(driver);
		
		wait.until((Function<? super WebDriver, V>) ExpectedConditions.elementToBeClickable(element));
		builder.doubleClick(element).build().perform();
		
		element = driver.findElement(By.cssSelector("body > div"));
		//How to get the Color of the Values or button 
		color = element.getCssValue("background-color");
		System.out.println("After Double Click :"+color);
		

		
	}

}