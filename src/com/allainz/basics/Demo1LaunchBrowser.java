package com.allainz.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver= new ChromeDriver();
		//WebDriver driver= new ChromeDriver();
		//driver=new EdgeDriver();
		//driver.get("https://www.facebook.com/");
		
		WebDriver driver=null;
		String browser="edge";
		
		if (browser.equalsIgnoreCase("ch"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}

		WebDriver driver1= new ChromeDriver();
		
		driver.get(("https://www.facebook.com"));
		driver1.close();
		
	}

}
