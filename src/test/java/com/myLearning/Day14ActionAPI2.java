package com.myLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Day14ActionAPI2 {
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
	public void testsubnavMenuMen() {
				
		WebElement mainNavManuMen = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mainNavManuMen);//Mouse will move to the center of the element
		builder.moveToElement(mainNavManuMen,10,10);//If want the move in specific region
		builder.moveToElement(mainNavManuMen).click().perform();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement subNavMenu = driver.findElement(By.cssSelector("[title='Footwear']"));
		Assert.assertTrue(subNavMenu.isDisplayed(),"Sub nav was not opened after hovering mouse on Menu Men");
		
				
	}

}