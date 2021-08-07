package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.LibGlobal;

public class HomePagePojo extends LibGlobal {
	// POJO-->Plain Old Java Object
	// 1.declare all variables in private
	// 2.Use getters

	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//input[@id='email']") 
		private WebElement txtUserName;


	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogIn;

	// generate getters-->right click class-->Click Source
	// -->Select getters and Setters-->Select getters-->click finish
	

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

}
