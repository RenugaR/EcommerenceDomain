package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Sample {

	WebDriver driver;

	@Test(dataProvider = "login", dataProviderClass = Demo.class)
	private void test(String s1, String s2) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Online3PMCucumberFramework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s1);
		SoftAssert s = new SoftAssert();
		s.assertEquals(s1, txtUserName.getAttribute("value"), "Username not matched");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);
		s.assertEquals(s2, txtPass.getAttribute("value"), "password not matched");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		s.assertTrue(driver.getCurrentUrl().contains("login"), "User not navigated to login failure page");
		s.assertAll();
		driver.close();
	}
}
