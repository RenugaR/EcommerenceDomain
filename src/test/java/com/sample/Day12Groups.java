package com.sample;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.*;

import com.pojo.HomePagePojo;
import com.utils.LibGlobal;

public class Day12Groups extends LibGlobal {
	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeClass-->browser launch");
		getDriver();
		getUrl("https://www.facebook.com/");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass-->Close browser");
		closeBrowser();
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod-->Execution start time");
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod-->Execution end Time");
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	private void test1() throws IOException {
		HomePagePojo h = new HomePagePojo();
		insertType(h.getTxtUserName(), getData(0, 0));
		insertType(h.getTxtPassword(), getData(0, 2));
	}

	@Test(groups = { "smoke" })
	private void test2() {
		HomePagePojo h = new HomePagePojo();
		click(h.getBtnLogIn());
	}
}
