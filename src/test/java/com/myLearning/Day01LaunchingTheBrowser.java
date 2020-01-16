package com.myLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class Day01LaunchingTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		driver.get("http://automationpractice.com");
		By locator = new ByIdOrName("search_query_top");//Create Object of ByClass We can not create the object of 
	    //By because By is Abstract Class and it is Extends into differant classes
		WebElement searchBox = driver.findElement(locator);
		//WebElement is Interface and Find Element is Object of WebElement
		searchBox.click();
		searchBox.sendKeys("Dress");//Enter the Value in the TextBox
	}
}
