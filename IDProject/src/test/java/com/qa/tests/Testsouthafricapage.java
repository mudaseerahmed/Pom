package com.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testsouthafricapage {
	WebDriver driver;
	
	public Testsouthafricapage(WebDriver driver) {
		this.driver=driver;


	
}
	public WebElement geterrortext(String num) {
		String first="(//div[@class='invalid-feedback'])["+num+"]";
		By text=By.xpath(first);
		return driver.findElement(text);
	}
	
	public WebElement clickbutton(String text) {
		String texts="//button[contains(text(),'"+text+"')]";
	
		By button=By.xpath(texts);
		try {
			driver.findElement(button).click();
		}
		catch(Exception e) {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", driver.findElement(button));
		}
		
		
		//Actions actions = new Actions(driver);
	//	for(int i=0;i<100;i++) {
//actions.moveToElement(driver.findElement(button)).click().build().perform();
	//	}
	//	actions.moveToElement(button).click().build().perform();
		return driver.findElement(button);
	}
	public WebElement Entertext(String text) {
		String texts="//label[text()='"+text+"']//following::input[1]";
		By te=By.xpath(texts);
		
		return driver.findElement(te);
		
				
	}
	
	public WebElement clickontop(String text) {
		String texts="//div[@class='top-bar']//a[text()='"+text+"']";
		By te=By.xpath(texts);
	
		try {
			driver.findElement(te).click();
		}
		catch(Exception e) {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", driver.findElement(te));
		}
		return driver.findElement(te);
		
	
		
		
		
	
}
}