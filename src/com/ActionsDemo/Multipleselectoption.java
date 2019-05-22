package com.ActionsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multipleselectoption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demos.devexpress.comaspxeditorsdemos/ListEditors/MultiSelect.aspx");
		//driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("ContentHolder_lbSelectionMode_I"));
		ele1.click();
		driver.findElement(By.id("ContentHolder_lbSelectionModeSelenium100_DDD_L_LBI1T0")).click();
		Thread.sleep(5000);
		// Perform Multiple Select
		Actions builder = new Actions(driver);
		WebElement select =
		driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		List<WebElement> options = select.findElements(By.tagName("td"));
		System.out.println(options.size());
		Action multipleSelect = builder.keyDown(Keys.CONTROL)
		.click(options.get(2))
		.click(options.get(4))
		.click(options.get(6))
		.build();
		multipleSelect.perform();
		Select seelct=new Select(ele1);
		driver.close();
		         }
		
	}


