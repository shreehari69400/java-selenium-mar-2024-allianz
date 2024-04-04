package com.allainz.basics;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CitiCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Task 2 1. Navigate onto https://www.citibank.co.in/ssjsps/forgetuserid.jsp
		 *  2.Choose Credit Card 3. Enter credit card number as 4545 5656 8887 9998 4.
		 * Enter cvv number 5. Enter date as “14/04/2022” 6. Click on Proceed 7. Get the
		 * text and print it “Please accept Terms and Conditions”
		 */
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;   
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		
		
		WebElement AccountType=driver.findElement(By.partialLinkText("select your product type"));
		AccountType.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.linkText("Credit Card")).click();
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.id("cvvnumber")).sendKeys("123");
		driver.findElement(By.name("DOB")).click();
		
		Select year= new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2022");
	
		Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByValue("3");	
		
		driver.findElement(By.linkText("14")).click();
		
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		
		String alertMessage=driver.findElement(By.xpath("//div[@id='ui-id-1']")).getText();
		System.out.println(alertMessage);
	    driver.close();
		
		
		
		
		
		
		

	}

	

}
