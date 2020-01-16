package com.myLearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day17DownloadFileDemo {
	@Test
	public void downloadFile() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online2pdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("input_file0")).sendKeys("C:\\Users\\darekdee\\Desktop\\Upload File.docx");
		System.out.println("File is Uploaded successfully");
		
		driver.findElement(By.className("convert_button")).click();
        System.out.println("Clicked on Covert button");
        
		WebElement linkElementDownload = driver.findElement(By.linkText("Manual download"));
		String url = linkElementDownload.getAttribute("href");
		System.out.println("Download Link " + url);

		URL website = new URL(url);
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		FileOutputStream fos = new FileOutputStream("c:\\input.pdf");
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
		System.out.println("FileDownloaded Successfully");
		
	}
}
