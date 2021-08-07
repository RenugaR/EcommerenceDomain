package com.sample;

import org.junit.AfterClass;

import java.io.IOException;
import java.util.Date;

import org.junit.*;
import org.junit.BeforeClass;

import com.pojo.HomePagePojo;
import com.utils.LibGlobal;

public class Day5Junit2 extends LibGlobal {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class-->Browser launch");
		getDriver();
		getUrl("https://www.facebook.com/");
		String currentUrl = getCurrentUrl();
		boolean b = currentUrl.contains("facebook");// true
		Assert.assertTrue("Current url not matched", b);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass-->Tear down");
		closeBrowser();
	}

	@Test
	public void test1() throws IOException {
		System.out.println("Test1-->Business logic");
		HomePagePojo h = new HomePagePojo();
		insertType(h.getTxtUserName(), getData(0, 0));
		String attribute = getAttribute(h.getTxtUserName(), "value");
		Assert.assertEquals("UserName not matched", "selenium", attribute);
		insertType(h.getTxtPassword(), getData(0, 0));
		String attribute1 = getAttribute(h.getTxtPassword(), "value");
		Assert.assertEquals("Password not matched", "Selenium", attribute1);
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2-->Business logic");
		HomePagePojo h = new HomePagePojo();
		click(h.getBtnLogIn());
		Thread.sleep(3000);
		Assert.assertTrue("Login Failure page not matched", getCurrentUrl().contains("login"));
	}

	@Before
	public void before() {
		System.out.println("Before-->Start time of execution");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		System.out.println("After-->End time of execution");
		Date d = new Date();
		System.out.println(d);
	}
}
