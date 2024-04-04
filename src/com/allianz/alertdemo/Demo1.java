package com.allianz.alertdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
        
      driver.findElement(By.xpath("//img[@alt='Go']")).click();
      
      Thread.sleep(3000);
      
      //make sure the alert is present wait for alert present this is example of explicit wait
      WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.alertIsPresent());
      
     
      String Alerttext=driver.switchTo().alert().getText();
      System.out.println(Alerttext);
      driver.switchTo().alert().accept();
      

	}

}
