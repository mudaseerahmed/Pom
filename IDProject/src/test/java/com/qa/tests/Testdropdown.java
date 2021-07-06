package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testdropdown {

public static void main(String[]args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		WebElement el=driver.findElement(By.id("searchLanguage"));
		selectoptionfromdropdown(el,"Italiano");
		selectoptionfromdropdown(el,"Dansk");
	}
public static void selectoptionfromdropdown(WebElement el,String value) {
	Select se=new Select(el);
	List<WebElement>options=se.getOptions();
	for(WebElement option:options) {
		if(option.getText().equals(value)) {
			option.click();
			
		}
		
	}
	
}
}
