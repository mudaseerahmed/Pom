package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Bulgariapage {
	WebDriver driver;
	
	
	public Bulgariapage(WebDriver driver) {
		this.driver=driver;

}
	public void movetochart(String text) {
		String te="//a[@aria-label='"+text+"']";
		By tex=By.xpath(te);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(tex)).perform();
	}
	
	public void gettext(String text) {
		By cl=By.className(text);
		String te=driver.findElement(cl).getText();
		te=te.replace("lv.","");
		System.out.println(te);
		Float i=Float.parseFloat(te);
		System.out.println(i);
	}
	public void entervalueinsearch(String text) {
		driver.findElement(By.id("search-field")).sendKeys(text);
	}
	public void moveclick(int text) {
		String tex="(//button[@class='btn-buy'])["+text+"]";
				By texts=By.xpath(tex);
				try {
					Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.id("search-field"))).click().perform();
			Thread.sleep(3000);
			driver.findElement(texts).click();
				}
				catch(Exception e) {
					driver.findElement(texts).click();
					
				}
	}
	public void clickonbutton() {
		
		String te="//input[@type='submit']";
		By cl=By.xpath(te);
		String tex="//p[@role='alert']";
		By teon=By.xpath(tex);
		
		driver.findElement(cl).click();
		
		System.out.println(driver.findElement(teon).getText());
	}
}
////a[@aria-label='Cart']