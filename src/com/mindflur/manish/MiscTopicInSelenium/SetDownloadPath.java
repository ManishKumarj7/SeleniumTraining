package com.mindflur.manish.MiscTopicInSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetDownloadPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		options.setAcceptInsecureCerts(true);

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "C://new");

		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
