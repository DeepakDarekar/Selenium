package com.myLearning;
//To Create the Hub
//java -jar selenium-server-standalone-3.141.59.jar -role hub 
//To Create the Grid Node Server 
//java  -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub  http://192.168.0.112:4444/grid/register 

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day21SeleniumGridWithDataProvider {

	@Test(dataProvider = "getData")
	public void gridTest(String browserName, String URL) throws MalformedURLException {
		// TODO Auto-generated method stub

		String baseUrl = "http://192.168.1.8:4444/wd/hub";
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setBrowserName(browserName);

		WebDriver driver = new RemoteWebDriver(new URL(baseUrl), capabilities);

		driver.get(URL);

	}

	@DataProvider(parallel = true)
	public Object[][] getData() {

		// Rows - No of times test has to be repeated
		// Cols - No of parameters in test data
		Object[][] data = new Object[2][2];

		data[0][0] = "chrome";
		data[0][1] = "https://www.amazon.in/";

		data[1][0] = "chrome";
		data[1][1] = "https://www.amazon.in/";

		return data;

	}

}
