package com.udemySeleniumClass;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.toolsqa.com/automation -practice-form/");
		WebElement linkText = driver.findElement(By.linkText("Link Test"));
		// System.out.println(driver.findElement(By.id("content")).getText());
		linkText.click();
		System.out.println("title of page is: " + driver.getTitle());
		driver.navigate().back();
		WebElement Partiallink = driver.findElement(By.partialLinkText("Partial"));
		Partiallink.click();
		driver.navigate().back();

		WebElement firstname = driver.findElement(By.xpath("//input[@type='text'and @name = 'firstname']"));
		firstname.click();
		firstname.sendKeys("Deepak");
		WebElement lastname = driver.findElement(By.xpath("//input[@type='text'and @name = 'lastname']"));
		lastname.sendKeys("Darekar");

		/*
		 * List<?> element = driver.findElements(By.name("sex")); int btncount =
		 * element.size(); System.out.println("The Number of Buttons are= " + btncount);
		 * 
		 * WebElement element1 = driver.findElement(By.id("sex-0")); element1.click();
		 * boolean btn = driver.findElement(By.id("sex-0")).isSelected();
		 * System.out.println("The Button is Selected=" + btn);
		 */

		/*
		 * List<?> element2 = driver.findElements(By.name("exp")); int btncount1 =
		 * element2.size(); System.out.println("The Number of Buttons are= " +
		 * btncount1);
		 * 
		 * WebElement element3= driver.findElement(By.id("exp-5")); element3.click();
		 * boolean btn2 = driver.findElement(By.id("exp-5")).isSelected();
		 * System.out.println("The Button is Selected=" + btn2);
		 */
		List<WebElement> radiobutton = driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("Total element is " + radiobutton.size());
		radiobutton.get(0).click();
		System.out.println(radiobutton.get(2).getAttribute("value"));
		Boolean b = driver.findElement(By.id("sex-0")).isSelected();
		System.out.println(b);
		System.out.println(radiobutton.get(0).getAttribute("value"));
		radiobutton.get(2).click();
		Boolean b1 = driver.findElement(By.id("exp-0")).isSelected();
		System.out.println(b1);
		
/*		for (int i = 0; i < radiobutton.size(); i++) {
			System.out.println(radiobutton.get(i).getAttribute("value"));
			radiobutton.get(i).click();
			radiobutton.get(1).click();
			System.out.println(radiobutton.get(1).getAttribute("value"));
			radiobutton.get(5).click();
		}
*/
			/*
			 * Thread.sleep(3000);
			 * 
			 * WebElement element = driver.findElement(By.xpath("//input[@name='sex']"));
			 * element.click(); boolean btn =
			 * driver.findElement(By.id("sex-0")).isSelected();
			 * System.out.println("The Button is Selected=" + btn);
			 * 
			 * WebElement element1 = driver.findElement(By.xpath("//input[@name='exp']"));
			 * element1.click(); boolean btn1 =
			 * driver.findElement(By.id("exp-0")).isSelected();
			 * System.out.println("The Button is Selected=" + btn1);
			 * 
			 * Thread.sleep(3000);
			 */
		

		WebElement element4 = driver.findElement(By.id("datepicker"));
		element4.sendKeys("19.02.2019");

		List<WebElement> checkBox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Total element is " + checkBox.size());
		System.out.println(checkBox.get(0).getAttribute("value"));
		checkBox.get(0).click();
		Boolean b3 = driver.findElement(By.id("profession-0")).isSelected();
		System.out.println(b3);
		System.out.println(checkBox.get(4).getAttribute("value"));
		checkBox.get(4).click();
		Boolean b4 = driver.findElement(By.id("tool-1")).isSelected();
		System.out.println(b4);
		
		/*for (int i = 0; i < checkBox.size(); i++) {
			System.out.println(checkBox.get(i).getAttribute("value"));
			checkBox.get(i).click();
			Boolean b = driver.findElement(By.id("profession-0")).isSelected();
			System.out.println(b3);*/
		}
	}


;