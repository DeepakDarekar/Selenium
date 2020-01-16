package com.udemySeleniumClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		//driver.findElement(By.xpath("html/body/div[2]/div/div[1]/p/a")).click();
		driver.findElement(By.cssSelector("#wrapper.wrapper div.signuponepage.main.content.clearfix div.clearfix div.sign-up p.why-information a")).click();
		
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(Parentid);
		System.out.println("Switching back to parent");
		driver.getTitle();
		
			
	}
}

	