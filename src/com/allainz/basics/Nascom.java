package com.allainz.basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nascom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Navigate onto https://nasscom.in/ 2. Click on Login and then click on
		 * register 3. Enter First name as admin 4. Enter Last name as pass 5. Enter
		 * email address as admin@gmail.com 6. Enter company name as Google 7. Select IT
		 * Consulting from dropdown 8. No need to automate CAPTCHA 9. Click on Register
		 */
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;  
		driver.get("https://nasscom.in/ ");
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("edit-name")).sendKeys("admin");
		driver.findElement(By.id("edit-pass")).sendKeys("pass");
		driver.findElement(By.id("edit-pass")).sendKeys("pass");
		
	}

}
