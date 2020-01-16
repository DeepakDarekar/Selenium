package com.myLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day17UploadFileDemo {
	@Test
	public static void testCase1() {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://online2pdf.com/doc-to-pdf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("input_file0")).sendKeys("C:\\Users\\darekdee\\Desktop\\Upload File.docx");
		System.out.println("File is Uploaded successfully");
	}
}

