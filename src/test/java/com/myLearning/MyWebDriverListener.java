package com.myLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyWebDriverListener extends AbstractWebDriverEventListener {

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Opening the URL ......");
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("URL opened in browser");
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		super.afterChangeValueOf(element, driver, keysToSend);
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		super.beforeChangeValueOf(element, driver, keysToSend);
	}
	
}
