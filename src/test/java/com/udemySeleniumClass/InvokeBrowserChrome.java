package com.udemySeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowserChrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://lithium.ppms.prm.tieto.com/VSTSSPRINT_SALES_ORACLE_PUNE_SALES2/");
		//driver.findElement(By.cssSelector("Sales Application")).click();
	     //driver.findElement(By.).click();
	     System.out.println(driver.getTitle()); ;
	}

}
