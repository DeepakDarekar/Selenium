package com.udemySeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {
    public static void main(String[] args) throws Exception{
        //Date and Time to be set in textbox
        String dateTime ="12/07/2014 2:00 PM";
         
        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.findElement(By.id("datetimepicker")).sendKeys(dateTime);
 
    }
}


