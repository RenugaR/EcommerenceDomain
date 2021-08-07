package com.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.pojo.HomePagePojo;
import com.utils.LibGlobal;

public class Day10Parameters extends LibGlobal {

	@Parameters({ "username", "password" })
	@Test
	private void test1(@Optional("Hello")String s1, String s2) throws IOException {
		getGCDriver();
		getUrl("https://www.facebook.com/");
		HomePagePojo h = new HomePagePojo();
		insertType(h.getTxtUserName(), s1);
		insertType(h.getTxtPassword(), s2);
		click(h.getBtnLogIn());
	}

}
