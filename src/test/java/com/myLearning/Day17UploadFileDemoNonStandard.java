package com.myLearning;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.appium.java_client.android.nativekey.KeyEvent;

public class Day17UploadFileDemoNonStandard {

	@Test
	public static void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElement(By.className("input_file0")).sendKeys("C:\\Users\\darekdee\\Desktop\\Upload
		// File.docx");
		System.out.println("File is Uploaded successfully");
		// Robot class -->it is coming from Advance Java there is AWT
		// libraries refered as window tools kit libraries which allows us to
		// devlop windows application

		driver.findElement(By.className("smpdf_NABjI2p56Zm1Jd ")).click();
		// Will open upload file dialog -->can't automate with Selenium
		// Robot Class is used to Stimulate the Keyboard and Mouse action
		// Robot Class is not part of Selenium Webdriver its part of Java

		try {
			Thread.sleep(5000);
			Robot robot = new Robot();
			RobotUtils.typeKeys("C:\\Users\\darekdee\\Desktop\\Upload File.docx", robot);
			System.out.println("File is Uploaded Successfully");
			// Hit Enter keyword to upload the File
			//robot.keyPress(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
