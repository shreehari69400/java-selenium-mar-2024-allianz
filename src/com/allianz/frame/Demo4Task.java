package com.allianz.frame;

import java.awt.event.ActionEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 1 (Important) 
//		1.  Navigate onto http://demo.openemr.io/b/openemr/
//		2.  Update username as admin
//		3.  Update password as pass
//		4.  Select language as English (Indian)
//		5.  Click on the login button
//		6.  Click on Patient  Click New Search
//		7.  Add the first name, last name
//		8.  Update DOB as today's date 
//		driver.findElement(By.id("form_DOB")).sendKeys("2024-01-12");
//		9.  Update the gender
//		10. . Click on the create new patient button above the form
//		11. . Click on confirm create new patient button.
//		12. . Print the text from alert box (if any error before handling alert add 5 sec wait)
//		13. . Handle alert
//		14. Close the Happy Birthday popup
//		15. Get the added patient name and print in the console.
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("http://demo.openemr.io/b/openemr/");
        
        
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        
        Select language=new Select(driver.findElement(By.xpath("//*[@class='form-control'][@name='languageChoice']")));
        language.selectByValue("18");
        
        driver.findElement(By.id("login-button")).click();
        
    //    
        driver.findElement(By.xpath("//div[@class='menuSection dropdown'][1]")).click();
        driver.findElement(By.xpath("//div[@class='menuLabel px-1'][contains(text(),'New')]")).click();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
        driver.findElement(By.id("form_fname")).sendKeys("james");
        driver.findElement(By.id("form_lname")).sendKeys("Paul");
        
       
        driver.findElement(By.id("form_DOB")).sendKeys("2024-04-01");
        
        Select gender= new Select(driver.findElement(By.id("form_sex"))) ;
        gender.selectByVisibleText("Male");
        driver.findElement(By.id("create")).click();
        
        driver.switchTo().defaultContent();
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe' and @class='modalIframe w-100 h-100 border-0']")));
        driver.findElement(By.xpath("//div[@id='searchResultsHeader']//child::button[1]")).click();
        
        driver.switchTo().defaultContent();
        
        //wait for alert to be present
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        
        String alert=driver.switchTo().alert().getText();
        System.out.println(alert);
        
	}

}
