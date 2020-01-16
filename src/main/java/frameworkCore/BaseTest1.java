package frameworkCore;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest1 {
	private WebDriver driver;// Protected means can access to all derived class

	@BeforeMethod
	public void beforeMethod() {
		driver = BrowserFactory.getInstance();
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
