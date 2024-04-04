package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//frame with index
public class Demo2Frame {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        
	       //enter the userid as jack123
	       // driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
	        //the above line will throw error if switch to frame is not used as it is inside the frame
	        driver.switchTo().frame(0);
	        
	        driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
	       
	        //Xapth--> matach the font present in the html
	        
	        driver.findElement(By.linkText("CONTINUE")).click();
	        
	        //switch to the main HTML
	        driver.switchTo().defaultContent();

		}

	}

