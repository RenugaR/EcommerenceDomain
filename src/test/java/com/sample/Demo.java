package com.sample;

import org.testng.annotations.DataProvider;

public class Demo {

	@DataProvider(name = "login")
	private Object[][] getData() {
		return new Object[][] { { "Raja", "1234466" }, { "Karthik", "3456789" }, { "Gowtam", "987654" } };
	}

}
