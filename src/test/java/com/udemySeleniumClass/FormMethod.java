package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("http://www.makemytrip.com");
		/*
		System.out.println("before clicking on multicity radio button");
		System.out.println(driver.findElement(By.xpath(".//*[@mt-id='returnDate']")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multicity']")).click();
		System.out.println("After Clicking on Radion button multicity");
		System.out.println(driver.findElement(By.xpath(".//*[@mt-id='returnDate']")).isDisplayed());
		
		//Again click on the another radio button
		//driver.findElement(By.cssSelector("#switch__input_2")).click();
		
		int count=driver.findElements(By.xpath(".//*[@id='mulcity']")).size();
		if(count==0) {
		System.out.println("Verified");
		}
			
			*/
		//To select the calendar Date
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@id='dp1514555220096']']/div[2]/table/tbody/tr[5]/td[3]/a")).click();
		
		// To Increment/Decrement the Count by + or - Sign
		//int i= 0;
		//while(i<5);
		//{
		//driver.findElement(By.xpath("Take the xpath of + or - Button")).click();
		//i++;
		}
		
	}
	

