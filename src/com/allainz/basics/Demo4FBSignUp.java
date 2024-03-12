package com.allainz.basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;    
		driver.get("https://www.facebook.com");
	   driver.findElement(By.linkText("Create new account")).click();
	   
	   driver.findElement(By.name("firstname")).sendKeys("john");
	   driver.findElement(By.name("lastname")).sendKeys("wick");
	   driver.findElement(By.id("password_step_input")).sendKeys("test123");
	   driver.findElement(By.xpath("//input[@value='-1']")).click();
	   
	   Select day=new Select(driver.findElement(By.id("day")));
	   day.selectByValue("14");
	   
	   Select month=new Select(driver.findElement(By.id("month")));
	   month.selectByValue("4");
	   
	   Select year=new Select(driver.findElement(By.id("year")));
	   year.selectByVisibleText("1970");
	   
	   Select pronoun=new Select(driver.findElement(By.name("preferred_pronoun")));
	   pronoun.selectByValue("2");
	   
	   driver.findElement(By.name("websubmit")).click();
	  
	   
	}

}