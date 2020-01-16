package com.myLearning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day22ScrollingWebPageToElement {
	@Test
	public void downloadFile() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipcart.com");
		Thread.sleep(5000);
		driver.findElement(By.className("_29YdH8")).click();
		
		Thread.sleep(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        //jsExecutor.executeScript("document.getElementsByTagName('footer')[0].ScrollIntoView()");
	     
        WebElement element = driver.findElement(By.cssSelector("[data-reactid='1204']"));
        jsExecutor.executeScript("arguments[0].scrollIntoView()",element);
        
	}
}

