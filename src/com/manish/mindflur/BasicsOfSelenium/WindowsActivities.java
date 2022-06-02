package com.manish.mindflur.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class WindowsActivities {



public static void main(String[] args) {

// TODO Auto-generated method stub



	System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

driver.navigate().to("http://facebook.com");

driver.navigate().back();

driver.navigate().forward();

}



}

