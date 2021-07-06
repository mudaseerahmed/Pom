package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Cromptonpage {
	WebDriver driver;
	
	
	public Cromptonpage(WebDriver driver) {
		this.driver=driver;

}
	public void clicktwice(int nu) {
		String num="(//h3)["+nu+"]";
		
		By nums=By.xpath(num);
		for(int i=0;i<2;i++) {
		try {
			driver.findElement(nums).click();
		}		
		catch(Exception e) {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", driver.findElement(nums));
		}
	//	}
	}
}}
