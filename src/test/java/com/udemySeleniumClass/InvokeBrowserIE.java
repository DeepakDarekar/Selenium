package com.udemySeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeBrowserIE {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver","C:/IEDriverServer_Win32_3.8.0/IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
	    driver.get("http://qaclickacademy.com");//Hit the URL
	    System.out.println(driver.getTitle()); //To get the Title of the page 
	    System.out.println(driver.getPageSource()); //Few of the Sequred site not allow the right click
	    System.out.println(driver.getCurrentUrl());  //To know the Page is correct hit the URL 
		driver.close();
	}
}



