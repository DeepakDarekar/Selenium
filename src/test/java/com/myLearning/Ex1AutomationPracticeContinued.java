package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1AutomationPracticeContinued {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		driver.get("http://www.automationpractice.com/");
//		By locator = By.className("login");
//		WebElement login = driver.findElement(locator);
//		login.click();
		
		//All above actions are done in one Line 
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("Appiumselenium2019@gmail.com");
	    driver.findElement(By.id("SubmitCreate")).click();
	    //ToDo:Wait for next page to load 
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Its an java Method will wait the program to execute
	    String pageHeading = driver.findElement(By.className("page-heading")).getText();
	    System.out.println("Page Heading"+pageHeading);
	    WebElement elementState = driver.findElement(By.name("id_state"));
	    Select selectState = new Select(elementState);
	    selectState.selectByVisibleText("Georgia");
	    selectState.selectByValue("5");
	    selectState.selectByValue("2");
	  
	    
	}
	
}
