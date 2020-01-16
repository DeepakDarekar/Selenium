package com.myLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day15ActionAPI3 {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void dragAndDrop() {
//		String sourceLocator = "//*[@id='treebox1']//*[text()='Books']";
//		String targetLocator = "//*[@id='treebox1']//*[text()='Magazines']";

//		WebElement source = driver.findElement(By.xpath(sourceLocator));
//		WebElement target = driver.findElement(By.xpath(targetLocator));

	    //@SuppressWarnings("deprecation")
		//Actions a = new Actions(null, null);
		//a.dragAndDrop(source, target).build().perform();
		// a.dragAndDrop(source,-100,20).perform();

	}
	@Test
	public void testDoubleClick() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dbclick/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Switch the Frame 
		WebElement frameElement = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameElement);
		
		//Before Double Click 
		WebElement element = driver.findElement(By.cssSelector("body > div"));
		
		//Get the Color of Background or Button
		String color = element.getCssValue("background");
//		System.out.println("Before Double click"+color);
//		Actions builder = new Actions(driver);
//		builder.doubleClick(element).perform().build();
		
		//After doubleClick
		element = driver.findElement(By.cssSelector("body > div"));
		color = element.getCssValue("background");
		System.out.println("After Double click" +color);
		Assert.assertEquals(color, "rgba(255,255,0,1)","Yellow Color Not found");
		
	}

}