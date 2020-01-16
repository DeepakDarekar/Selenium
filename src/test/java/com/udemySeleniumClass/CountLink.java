package com.udemySeleniumClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountLink {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("http:www.ebay.com");
		System.out.println("Browser is  Maximized");
		//Count of the links on the page
		System.out.println("Count the Links availlable on Webpage");
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println("Count links availlable at footer");
		//Count of the the links at footer of the Page
		WebElement footer = driver.findElement(By.xpath("//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
			
		//Count of the links in the 2nd column of the section
		System.out.println("Count of the links in the 2nd Column of the Section");
		WebElement Col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/u1"));
		System.out.println(Col.findElements(By.tagName("a")).size());
		

		//To get the Total Link name 
		for(int i = 0;i<footer.findElements(By.tagName("a")).size();i++)
		{
			//System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
			if(footer.findElements(By.tagName("a")).get(i).getText().contains("Buy"))
			{
				System.out.println(driver.getTitle());
				footer.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
			System.out.println(driver.getTitle());	
			
	}
	
}


		