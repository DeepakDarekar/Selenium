package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenWindowsInMultipleBrowsers {
	WebDriver driver;

	@BeforeClass
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		System.out.println("URL is Laumched Successfully");
		System.out.println("The Title of the window is " + driver.getTitle());
	}
	@Test
	public void OpneWindows() {
		WebElement openTabs = driver.findElement(By.xpath("//*[@id='navFooter']/div[1]/div/div[5]"));
		System.out.println(openTabs.findElements(By.tagName("a")).size());

		for (int i = 1; i < openTabs.findElements(By.tagName("a")).size(); i++) {
			String opentabsagain = Keys.chord(Keys.CONTROL,Keys.ENTER);
			openTabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);

		}

	}

}