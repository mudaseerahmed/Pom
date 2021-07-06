package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fabshirtpage {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	public Fabshirtpage(WebDriver driver) {
		this.driver=driver;

}
	
	public void scrollthecolor(String text) {
	
		String colo="//span[text()='"+text+"']";
		By co=By.xpath(colo);
		WebElement el=driver.findElement(co);
		js=(JavascriptExecutor)driver;
		try {
		js.executeScript("arguments[0].scrollIntoView(true);",el);
		
	}
		catch(Exception e) {
			
			e.printStackTrace();
		}}
	//(//div[@class='facet-block'])[3]

	public void clickonplusicon(String txt) {
		String tex="//h3[text()='"+txt+"']";
		By cl=By.xpath(tex);
		try {
		
		driver.findElement(cl).click();
		}
		catch(Exception e) {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", driver.findElement(cl));
	}
		
}
}