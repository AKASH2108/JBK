package com.ActionsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		Actions builder = new Actions(driver);
		//builder.contextClick(ele).build().perform();
	//builder.click(ele);
		//Thread.sleep(20);
		builder.moveToElement(search).sendKeys("java").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		System.out.println("executed properly");
	}

}
