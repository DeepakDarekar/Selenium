package com.myLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day10AlertHandling {

	@Test
	public void alert() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/AlertHandles.html");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on the confirm box
		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id='btnConfirm']"));
		ConfirmBox.click();
		//To get the Text from the pop up window 
		System.out.println(driver.switchTo().alert().getText());
		//Click on OK button
		//driver.switchTo().alert().accept();
		//Click on Cancel Button
		driver.switchTo().alert().dismiss();
		//To enter the Text
		//Aelrt aleart= driver.switchTo().alert().sendKeys("Deepak");
		//alert.accept();
 }

}