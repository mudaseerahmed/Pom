package com.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class youtubepage {
	WebDriver driver;
	
	public youtubepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void entertext(String text) {
		driver.findElement(By.id("search")).sendKeys(text);
		List<WebElement>te=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		//for(int i=0;i<te.size();i++) {
			te.get(3).click();
		//}
		
	}

}
