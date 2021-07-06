package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class captchapage {
	WebDriver driver;
	
	
	public captchapage(WebDriver driver) {
		this.driver=driver;

}
public void getext() {
	 WebElement locOfOrder =driver.findElement(By.id("imgCaptcha"));
	 Actions act = new Actions(driver);
	 act.moveToElement(locOfOrder).doubleClick().build().perform();
	 driver.findElement(By.id("imgCaptcha")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
	 driver.findElement(By.id("captchacode")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
}

	

}
