package com.udemySeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsInSelenium<V> {

	@SuppressWarnings("unchecked")
	@Test
	public void Wait() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait will appl to Whole Script
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		//driver.findElement(By.id("H-destination")).sendKeys("nyc");
		//driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		// Explicit Wait will apply to only specific Locators
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until((Function<? super WebDriver, V>) ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='16115']/div[2]/div/a)")));

		// Thread.sleep(5000L);

		driver.findElement(By.xpath(".//*[@id='16115']/div[2]/div/a)")).click();

	}

}
