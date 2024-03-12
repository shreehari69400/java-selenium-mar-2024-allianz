package com.allainz.basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesForceTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.  Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
//			2.  Enter first name as “John”
//			3.  Enter last name as “wick”
//			4.  Enter work email as “john@gmail.com”
//			5.  Select Job title as “IT Manager”
//			6.  Select Employees as “101-500 employees”
//			7.  Select country as “United Kingdom”
//			8.  Do not fill the phone number
//			9.  Click on check box 
//			10. Click on start my free trial 
//			11. Get the error message displayed “Enter a valid phone number”
		
			// TODO Auto-generated method stub
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;  
			driver.get("https:////www.salesforce.com/in/form/signup/freetrial-sales/");
			WebElement Firstname= driver.findElement(By.name("UserFirstName"));
			Firstname.sendKeys("John");
			
			
			WebElement Lastname= driver.findElement(By.name("UserLastName"));
			Lastname.sendKeys("wick");
			
			Select Country= new Select(driver.findElement(By.name("CompanyCountry")));
			Country.selectByVisibleText("United Kingdom");
			
			WebElement workemail= driver.findElement(By.name("UserEmail"));
			workemail.sendKeys("john@gmail.com");
			
			
			
			Select Jobtitle= new Select(driver.findElement(By.name("UserTitle")));
			Jobtitle.selectByValue("IT_Manager_AP");
			
			Select CompanyEmployees= new Select(driver.findElement(By.name("CompanyEmployees")));
			CompanyEmployees.selectByValue("350");
			
			driver.findElement(By.xpath("	//button[@class='embeddedServiceActionButton']")).click();
			
		
			WebElement Checkbox= driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
			Checkbox.click();
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
		   
			}
			
			
			
			
			
			
			
	}


