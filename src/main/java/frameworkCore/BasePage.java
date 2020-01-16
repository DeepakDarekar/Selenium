package frameworkCore;

//All common code for pages shopuld go here 

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}

	protected WebDriver driver() {
		return driver;
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

}
