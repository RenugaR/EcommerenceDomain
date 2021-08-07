package com.sample;

import org.testng.annotations.Test;

public class Day9Prio {

	@Test(priority = -7)
	private void test1() {
		System.out.println("Test1");
	}

	@Test(priority = 2)
	private void test2() {
		System.out.println("Test2");
	}

	@Test(priority = -2, enabled = false)
	private void test5() {
		System.out.println("Test5");
	}

	@Test(priority = 5)
	private void test3() {
		System.out.println("Test3");
	}

	@Test(invocationCount = 5)
	private void test4() {
		System.out.println("Test4");
	}

}
