package frameworkCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
	private WebDriver driver;// Protected means can access to all derived class

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		this.driver = (WebDriver) new ChromeDriver();

	}

	@AfterMethod
	public void cleanUp() {
		if (driver != null) {
			driver.quit();
		}
	}
	protected WebDriver driver() {
		return driver;
	}
}
