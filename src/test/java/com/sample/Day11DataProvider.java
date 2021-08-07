package com.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day11DataProvider  {
	WebDriver driver;

	@Test(dataProvider = "login",dataProviderClass=Day10Parameters.class)
	public void test1(String s1, String s2) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Online3PMCucumberFramework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("facebook"));
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		s.assertTrue(driver.getCurrentUrl().contains("login"), "User not navigated to failure page");
		s.assertAll();
	}
}
