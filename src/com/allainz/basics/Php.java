package com.allainz.basics;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Php {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        //click on phpMyAdmin »
       // driver.findElement(By.xpath("(//*[@class='topnav'])[2]")).click();
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();
        //b[contains(text(),'phpMyAdmin')]

        ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        
        driver.findElement(By.id("input_username")).sendKeys("admin");
        driver.findElement(By.id("input_password")).sendKeys("admin@123");
          driver.findElement(By.id("input_go")).click();
        
          driver.close();// closes the active tab
          //driver.quit();// all the browser tab and kills the driver
          //when closing the first tab we need to get session of the first window by below
          driver.switchTo().window(windows.get(0));
         System.out.println(driver.getTitle());
         
 		
          
	}

}
