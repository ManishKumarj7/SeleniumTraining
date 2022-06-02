package com.mindflur.manish.MiscTopicInSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com");
		
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://new//screenshot.png"));
	}

}
