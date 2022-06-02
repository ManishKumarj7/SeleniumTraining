package com.manish.mindflur.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("//input[@name='name']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manish");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manish@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Kmanish@1");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement mni=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select mani=new Select(mni);
		mani.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("15-05-1998");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}