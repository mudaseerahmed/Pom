package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testc {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Newchrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	List<WebElement>webelement=	driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	for(int i=0;i<webelement.size();i++) {
		if(i<3) {
			webelement.get(i).click();
		}
	}
}
}
