package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_sendkeys(WebElement element ,String fieldname,String value) {
		try {
			element.sendKeys(value);	
			test.log(Status.PASS, fieldname +"=value succesfully send="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, fieldname +"=unable to send value ="+e);
		}	
	}
	
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "click succesfully ="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, "unable to click "+e);
		}
	}
	
	public static void custom_HandleDropDown(WebElement element,String text,String fieldname) {
		try {
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println("unable to Handle DropDown "+fieldname);
		}
	}
	
	
	
	
	
	
	

}
