package com.myLearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class SnapUtils {
	public static void captureSnap(WebDriver driver, String fileName) {

		TakesScreenshot takeSnap = (TakesScreenshot) driver;
		File snap = takeSnap.getScreenshotAs(OutputType.FILE);
		System.out.println("Snap path " + snap.getAbsolutePath());
		
		File dest = new File("Search_result.png");
		// Make it Parameterized
		// File dest = new File(fileName);
		try {
			Files.move(snap, dest);
			System.out.println("File Moved to " + dest.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
