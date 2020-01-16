package com.myLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03MavenCSSSelectors {
	// New-->Maven Project-->Check the Chk Box Create a Sample Project
	// -->Next-->Enter the Group id(com.deepak.training)
	// -->ArtifactID-->Simillar to Project Name(Day03-Maven-WebDriver)
	// Add the Maven dependancy in pom.xml file
	// If u get the Error Write Click on Project-->Update Project and Force Update

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object(Instance) of ChromeDriver
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}
}
