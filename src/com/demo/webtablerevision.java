package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablerevision {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		// locating webtable
		// WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		List l1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(l1.size());
		// Retrieving all rows
		for (int i = 2; i <= l1.size(); i++) {
			List<WebElement> l2 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td"));
			for (int j = 1; j < l2.size(); j++) {
				String s1 = l2.get(j).getText();
				System.out.println(s1);
				// System.out.println("the no of columns in"+i+"="+s1);
			}
			System.out.println();}
		
	
		driver.quit();}}