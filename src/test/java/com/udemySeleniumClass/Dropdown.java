package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		//Static Dropdown
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5 Adults");
		System.out.println("Able to select the values from dropdownbox");
		
		
		/*
		// Dynamic Dropdown
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'GOI']")).click();
		driver.findElement(By.xpath("(//a[@value = 'DEL'])[2]")).click();
		*/
		//Clicking on Checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		driver.findElement(By.id("cctl00_mainContent_chk_Unmr")).isSelected();
		//If it is Selected Output is True or Else False
		
		
	}
}
