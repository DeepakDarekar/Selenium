package frameworkCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver getInstance() {
		switch (Constants.BROWSER_NAME.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "Constants.CHROME_DRIVER_PATH");
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "Constants.GECKO_DRIVER_PATH");
			driver = new FirefoxDriver();

			break;

		default:
			new RuntimeException("Invalid Browser Name :"+ Constants.BROWSER_NAME);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_TIMEOUT,TimeUnit.SECONDS);
		return driver;
	}
}
