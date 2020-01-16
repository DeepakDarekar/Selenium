package com.myLearning;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class InterviewQuestions {
	WebDriver driver;
	WebElement element;

	@Test
	public boolean alertHandle() {
		// Alert Handle(How to handle Alert in Selenium?)

		Alert alt = driver.switchTo().alert();// Alert is an interface
		alt.accept(); // Clicking on OK button
		alt.dismiss(); // Click on dismiss button
		alt.sendKeys("Deepak"); // Sending Text in the Textbox of the alert pop up window
		alt.getText(); // getting the Text of the Alert Window

		try {
			driver.switchTo().alert();
			return true;// Alert is present it will return the true or else Catch box will be executed
		} catch (Exception e) {
			return false;
		}
	}

	public void practice() {
		boolean result = alertHandle();
		if (true == result) {
			System.out.println("Alert is present");
		} else {
			System.out.println("Alert is not Present");
		}
	}

	public void frameHandle() {
		// Need to Switch to Frame(How to handle the frames in Selenium?)

		driver.switchTo().frame(1);
		driver.switchTo().frame("Testing");
		driver.switchTo().frame(element);

		TargetLocator tlocator = driver.switchTo();// Using the target Locator we are avoiding the to wrtite above code
		tlocator.frame(1);
		tlocator.frame("Testing");
		tlocator.frame(element);

		tlocator.parentFrame();
		tlocator.defaultContent();// Switch to main Frame or First iframe
	}

	public void windowHandle() {
		// How to handle the window in Selenium
		String currantWindow = driver.getWindowHandle();// Currant Window Name
		Set<String> allWindowNames = driver.getWindowHandles();// All Open Window Name
		// Set of Strings bcos Windows Names are Unique Value in List Store duplicates
		// values and Windows can not be duplicate

		// Switch to Next Window
		Iterator<String> it = allWindowNames.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			driver.switchTo().window(currantWindow);
		}
	}

	public void waitExample() {

		// Implicit Wait--if element is Visible but taking time to load(All DOM elements
		// are properly Loaded or Not)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Explicit Wait--Conditions(Button is not Click able,element is not Visible)
		// explicit wait - to wait for the compose button to be click-able

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		// click on the compose button as soon as the "compose" button is visible

	}

	public void actionsPractice() {
		// Differance betn Actions and Action
		//Actions is Class
		//Action is interface
		
		Actions builder = new Actions(driver);
		builder.moveToElement(element);
		builder.moveToElement(Source,destination);
		byuilder.doubleClick(element);//Double Click 
		builder.ContextClick(element)//Write click
		builder.KEYS.ENTER;
		
		
		//Action Interface
		Action actionInterface = builder.moveToElemet(element).build().perform():

	}

	public void dropdown() {

		// If Tag Name is Select then use Below methods
		Select s = new Select(element);
		s.selectByIndex(0);// Index Start with 0
		s.selectByValue("Testing");
		s.selectByVisibleText("Test123");
		java.util.List<WebElement> options = s.getOptions();
		Iterator<WebElement> it = options.iterator();
		while (it.hasNext()) {
			System.out.println("it.next()");
		}
	}

	public static void captureSnap(WebDriver driver, String fileName) {

		TakesScreenshot takeSnap = (TakesScreenshot) driver;
		File snap = takeSnap.getScreenshotAs(OutputType.FILE);
		System.out.println("Snap path " + snap.getAbsolutePath());

		File dest = new File("Search_result.png");
		// FileHandler.copy(src,new File(""));
		// Make it Parameterized
		// File dest = new File(fileName);
		try {
			Files.move(snap, dest);
			System.out.println("File Moved to " + dest.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getPosition() {
		// How to get the position of the element with selenium
		int xvalue = driver.manage().window().getPosition().getX();
		int yvalue = driver.manage().window().getPosition().getY();

		Point point = driver.manage().window().getPosition();
		point.getX();
		point.getY();

	}

	public void navigationPractice() {
	 driver.navigate().forward();
	 driver.navigate().back();
	 
	 Navigation nav = driver.navigate();
	 nav.forward();	
	 nav.back();
	 nav.refresh();
	 

	 //Opening current URL using driver.getCurrentUrl() with driver.get() command-
	 driver.get(driver.getCurrentUrl());

	 //Opening current URL using driver.getCurrentUrl() with driver.navigate() command-
	 driver.navigate().to(driver.getCurrentUrl());

    //Pressing F5 key on any textbox using sendKeys command-
    driver.findElement(By textboxLocator).sendKeys(Keys.F5);

    //Passing ascii value of F5 key i.e. "\uE035" using sendKeys command-
    driver.findElement(By textboxLocator1).sendKeys("\uE035");
 
 }

	public boolean basicOperations() {
		element.isSelected();
		element.isEnabled();
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException nex) {
			return false;
		}
		
	//FindElemet--return single WebElement and also there is no element present then throw element not found Exception
	//FindElements--return list of webelements and if there is no element then it will give list of webelement
	}
}
