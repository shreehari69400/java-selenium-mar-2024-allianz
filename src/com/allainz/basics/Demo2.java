package com.allainz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
    //get title print it
    //get current URL and print it
    //get page source and print it 
    String title=driver .getTitle();
    System.out.println("title "+ title);
    String Page_source= driver.getPageSource();
   System.out.println("Page Source"+Page_source);
   String Current_Url=driver.getCurrentUrl();
   System.out.println("Current URL"+Current_Url);
   driver.quit();
	}

}
