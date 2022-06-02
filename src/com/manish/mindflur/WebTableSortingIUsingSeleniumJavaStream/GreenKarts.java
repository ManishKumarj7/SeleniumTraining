package com.manish.mindflur.WebTableSortingIUsingSeleniumJavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKarts {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://new//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000L);

//1st step:-Click the Column
		driver.findElement(By.xpath("//tr/th[1]")).click();
//2nd Step:-Capture All Web elements in the list
		Thread.sleep(3000L);
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
//3rd Step :-Capture text of All Web Elements into a new List
		Thread.sleep(3000L);
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
//4th Step :- Sort the original List. (Step-3)
		Thread.sleep(3000L);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
//5th Step :- Compare the Original List and Sorted List
		Thread.sleep(3000L);
		Assert.assertTrue(originalList.equals(sortedList));

		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice
		Thread.sleep(3000L);
		do

		{

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice"))

					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			if (price.size() < 1)

			{

				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}

		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;

	}
}
