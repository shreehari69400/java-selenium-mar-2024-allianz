package com.allainz.basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.  Navigate onto https://www.medibuddy.in/
			2.  Close if any popup and Click on Login
			3.  Click on I have Corporate Account 
			4.  Click on Learn More
			5.  Click on Skip
			6.  Click on Login using Username & Password
			7.  Enter username as john 
			8.  Enter password as john123 
			9.  Click on show password 
			10. Click log in 
			11.  Get the error message shown and print it in terminal  */
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;   
		driver.get("https:////www.medibuddy.in/");
		
		//driver.findElement(By.xpath("//img[@class='show-password m-t-15 cursor-pointer']")).click();

		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.xpath("//div[@class='coperate']")).click();
		driver.findElement(By.xpath("//div[@class='m-t-10']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='m-t-25 fs-14']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='coperate']/child::a[1]")).click();
		driver.findElement(By.id("username")).sendKeys("John");
		driver.findElement(By.xpath("//button[@class='btn btn-primary loginBtn']")).click();
		driver.findElement(By.id("password")).sendKeys("John123");
		driver.findElement(By.xpath("//img[@class='show-password m-t-15 cursor-pointer']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary verifyBtn']")).click();
		String Error=driver.findElement(By.xpath("//div[@class='alert alert-danger errorTxt m-0 m-t-10 p-0']")).getText();
		System.out.println(Error);
		driver.close();
		
		

		
	}

}
