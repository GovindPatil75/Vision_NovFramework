package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	// encapsulation ---> data hiding + Abstraction
	// this ----> current class instance variable refer karta hai
    WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private  WebElement Emailld;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
    private  WebElement password;	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private  WebElement loginbtn;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmailld() {
		return Emailld;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
