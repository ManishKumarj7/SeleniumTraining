package com.manish.mindflur.BasicsOfSelenium;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Dropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
Thread.sleep(2000L);

WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Thread.sleep(2000L);

Select dropdown=new Select(staticDropdown);
Thread.sleep(2000L);
dropdown.selectByIndex(3);
Thread.sleep(2000L);
System.out.println(dropdown.getFirstSelectedOption().getText());

dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());

}

}