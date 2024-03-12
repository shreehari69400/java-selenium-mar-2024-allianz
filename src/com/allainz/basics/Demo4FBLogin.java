package com.allainz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    
	    //enter the username
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("shree@test.com");
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("123456");
       driver.findElement(By.name("login")).click();
        
 
        
        
	}

}
