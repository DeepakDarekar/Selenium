package com.udemySeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeBrowserChromeGmail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object of ChromeDriver

		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.24.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); // maximize the browser window
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("AutomationTesting@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		/*WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		*/
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("Selenium@12");
		driver.findElement(By.id("passwordNext")).click();
		
		String title = "Gmail";
		if (driver.getTitle().contains(title)){
		System.out.println("Logged in sucessfully !!!"+driver.getTitle());
		}
		else {
		System.out.println("Unable to loggin :-( "+driver.getTitle());
		}
			
	}
}
