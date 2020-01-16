package com.udemySeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://cookbook.seleniumacademy.com/Locators.html");

		String tableXpath = "//*[@class='cart-info']/table";
		WebElement table = driver.findElement(By.xpath(tableXpath));

		// Get the rows and cols of a table
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cols = table.findElements(By.xpath(tableXpath + "/tbody//td"));

		// System.out.println("Rows:" + (rows.size() - 1));
		// System.out.println("Cols:" + cols.size() / (rows.size() - 1));

		// System.out.println(rows.get(1).getText());

		int colSize = cols.size() / (rows.size() - 1);

		System.out.println(colSize);
		// //print the contents of 1st Row and 3rd column
		//

		for (int i = 1; i < rows.size(); i++) {

			for (int j = 0; j < colSize; j++) {
				printTable(table, i, j);
			}
		}

		// WebElement thirdColOfFirstRow=colsOfFirstRow.get(2);
		//
		// WebElement inputTagInThirdColOfFirstRow =
		// thirdColOfFirstRow.findElement(By.xpath("//td/input[@type='text']"));
		//
		// System.out.println(inputTagInThirdColOfFirstRow.getAttribute("value"));
		//
		// inputTagInThirdColOfFirstRow.sendKeys("2");
		//
		// WebElement updateLinkeInThirdColOfFirstRow =
		// thirdColOfFirstRow.findElement(By.xpath("contains(text(),'Update')"));
		// updateLinkeInThirdColOfFirstRow.click();

		// WebElement searchRow = printRowDetails(table,1);
		//
		// WebElement searchRow1 = printRowDetails(table,2);

		// String products[] = new String[3];
		// products[0]="MackBook";
		// products[1]="iPhone";
		//
		// for(int i =0;i<rows.size();i++) {
		//
		// if(i%2==0) {
		// printRowDetails(table,i,products[i]);
		// }
		//
		//
		// }

		// WebElement editRow=table.findElements(By.tagName("tr")).get(2);
		// WebElement editCol = searchRow.findElements(By.tagName("td")).get(2);

		// editCol.findElement(By.tagName("input")).clear();
		// editCol.findElement(By.tagName("input")).sendKeys("4");

	}

	private static void printTable(WebElement table, int row, int col) {

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement firstRow = rows.get(row);
		//
		List<WebElement> colsOfFirstRow = firstRow.findElements(By.tagName("td"));

		System.out.println("# Cols of firstRow:" + colsOfFirstRow.size());

		System.out.println(colsOfFirstRow.get(col).getText());
	}

	@SuppressWarnings("unused")
	private static WebElement printRowDetails(WebElement table, int specifiedRow, String searchKey) {

		WebElement searchRow = table.findElements(By.tagName("tr")).get(specifiedRow);

		List<WebElement> colsForSelectedRow = searchRow.findElements(By.tagName("td"));
		// WebElement searchCol = colsForSelectedRow.get(0);
		// System.out.println(searchCol.getText());

		for (WebElement col : colsForSelectedRow) {

			if (searchKey.equals(col.getText())) {

				WebElement quantity = colsForSelectedRow.get(2);

				quantity.findElement(By.name("quantity[40]")).sendKeys("40");

				quantity.findElement(By.linkText("update")).click();
				List<WebElement> links = quantity.findElements(By.xpath("//a"));

				for (WebElement link : links) {

					link.click();
				}
			}
		}
		return searchRow;
	}

}
