package com.manish.mindflur.BasicsOfSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class updateDropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");



driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]/a")).click();
System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

Thread.sleep(10000L);
driver.close();
}



}