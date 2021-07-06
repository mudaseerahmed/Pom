package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Italyairlinetests {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.alitalia.com/en_us");
		Testitalypage te=new Testitalypage(driver);
		te.clickonheadings("lang",2);
		te.dropdown("country");
		te.dropdowns();
//	te.dropdown("lang");
	
}
}