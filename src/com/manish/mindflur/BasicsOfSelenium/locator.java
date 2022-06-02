package com.manish.mindflur.BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=V1PmqnsMQDsIU-ECW3-Vs1ZLi2eKZsAHupUH4MK20iAoEYu5YkeZM_uSmPkwg0hanslgx9ln7JPVh4v0GST7ZA");
//	driver.findElement(By.id("email")).sendKeys("k@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("sdgwerwqf");
//	driver.findElement(By.name("commit")).click();
//	
//	System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Your email or password is incorrect.')]")).getText());
	driver.findElement(By.linkText("Forgot Password")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("j@gmail.com");
	}

}
