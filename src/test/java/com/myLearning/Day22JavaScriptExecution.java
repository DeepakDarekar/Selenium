package com.myLearning;

import java.io.IOException;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day22JavaScriptExecution {
	@Test
	public void downloadFile() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String js1 = "arguments[0].value=\"Deepak Darekar\"";
        //String js2 = "document.getElemnetByName(\"btnk\")[0].click()";
		
        WebElement txtQuery = driver.findElement(By.name("q"));
        
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("arguments[0].value=\'Deepak Darekar'",txtQuery);
        jsExecutor.executeScript(js1,txtQuery);
	}
}

