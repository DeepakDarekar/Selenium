package com.udemySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://spicejet.com/");
		//driver.findElement(By.xpath("//input[@value = 'OneWay']")).click();
		//system.out.println("driver.findElements(By.xpath("//input[@name = 'ctl00$mainContent$rbtnl_Trip']")).size(")
		int Count = driver.findElements(By.xpath("//input[@name = 'ctl00$mainContent$rbtnl_Trip']")).size();
		for(int i=0;i<Count;i++)
		{
		//To Click on all Radio buttons one by one available	
		//driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
		//To print the Attribute Value in Console
		//System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value"));
		//To select the only one radio button
		
		String text=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
		if(text.equals("OneWay"))
		{
		driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();		}
	    
		}
	}
  } 

		
  
			
  
   


	


