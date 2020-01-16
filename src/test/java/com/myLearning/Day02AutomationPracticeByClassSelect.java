package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day02AutomationPracticeByClassSelect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object(Instance) of ChromeDriver
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		//By locator = By.className("login");
		//WebElement element = driver.findElement(locator);
		//element.click();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("deepak.darekar15@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//TODO:wait for next page to load 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Page Heading:"+pageHeading);
		
		WebElement elementState = driver.findElement(By.name("id_state"));
		Select selectState = new Select(elementState);
		//selectState.selectByIndex(1);
		//selectState.selectByValue("5");
		selectState.selectByVisibleText("Arizona");
		
		driver.close();		
		
	}
}
