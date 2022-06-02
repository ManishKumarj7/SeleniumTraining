package com.manish.mindflur.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ChromeDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\new\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://old.mu.ac.in/distance-open-learning");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	//driver.quit();	
	}

}
