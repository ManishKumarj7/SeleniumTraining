package com.mindflur.manish.MiscTopicInSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//String url=driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).getAttribute("href");
		String url=driver.findElement(By.xpath("//a[contains(text(),'Broken Link')]")).getAttribute("href");

		HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int respCode=con.getResponseCode();
		System.out.println(respCode);
		
		Thread.sleep(5000L);
		driver.close();                      
		}

}
