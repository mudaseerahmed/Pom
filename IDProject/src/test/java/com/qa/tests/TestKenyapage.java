package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestKenyapage {
	WebDriver driver;
	
	public TestKenyapage(WebDriver driver) {
		this.driver=driver;

}
	public WebElement typetextintextbox(String text) {
		String texts="//div[@class='ty-mainbox-body']//input[@id='"+text+"']";
		By field=By.xpath(texts);
		return driver.findElement(field);
		
	}
	public WebElement clickbelowmailinglists(String text) {
		String texts="//input[contains(@id,'"+text+"') and @type='checkbox']";
		By field=By.xpath(texts);
		return driver.findElement(field);
	}
	public WebElement clickonregister(String text) {
		String texts="//button[@type='submit']//span[text()='"+text+"']";
		By field=By.xpath(texts);
		return driver.findElement(field);
		
	}
	public WebElement gettexterror(String text,String num,String num1) {

String first="//div[@class='ty-mainbox-body']//label[text()='"+text+"'";
String last="]//following::input["+num+"]//following::p["+num1+"]";
String field=first+last;
By fields=By.xpath(field);

return driver.findElement(fields);
		
	}
}
