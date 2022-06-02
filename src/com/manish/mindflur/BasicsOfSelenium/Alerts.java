package com.manish.mindflur.BasicsOfSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		String text = "Rahul";

		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(5000L);

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000L);

		driver.switchTo().alert().accept();
Thread.sleep(5000L);
driver.findElement(By.id("confirmbtn")).click();
Thread.sleep(5000L);

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000L);

		driver.switchTo().alert().dismiss();

	}

}