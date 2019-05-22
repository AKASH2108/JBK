package com.hiddenelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElementLocat {
	 public static void main(String[] args) throws InterruptedException { 
	     // create objects and variables instantiation     
		 System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	     // maximize the browser window     
	     driver.manage().window().maximize(); 
	     // launch the firefox browser and open the application url 
	     driver.get("www.yahoo.com"); 
	     //Set timeout     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	     //Get input tag and store in List variable name is number_of_hiddenElements 
	     List<WebElement> number_of_hiddenElements = driver.findElements(By.tagName("input")); 
	     //Print total number of Input tag 
	     System.out.println(number_of_hiddenElements.size()); 
	     for (int i = 0; i < number_of_hiddenElements.size(); i++) { 
	       // Print all hidden elements text 
	       if (number_of_hiddenElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) { 
	         //Check empty text 
	         if (!(number_of_hiddenElements.get(i).getAttribute("value").trim().isEmpty())) { 
	           //Print hidden Element texts 
	           System.out.println("Hidden Element text = " + i + " " + number_of_hiddenElements.get(i).getAttribute("value").trim()); 
	         } 
	       } 
	     } 
	     // quit Firefox browser 
	     driver.quit(); 
	   } 
	 }  
	
	
	

