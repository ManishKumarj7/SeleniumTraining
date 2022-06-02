package com.manish.mindflur.AjaxAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
driver.findElement(By.cssSelector(".blinkingText")).click();
Set<String> windows=driver.getWindowHandles();
Iterator<String> it=windows.iterator();
String parentId=it.next();
String childId=it.next();
driver.switchTo().window(childId);
//driver.switchTo().window(parentId);

System.out.println(driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")).getText());

	}

}
