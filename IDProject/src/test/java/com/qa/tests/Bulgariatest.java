package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bulgariatest {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.ebag.bg/en/");
		Bulgariapage bg=new Bulgariapage(driver);
		bg.movetochart("Cart");
		bg.gettext("price-text");
		bg.entervalueinsearch("tomatoes");
		bg.movetochart("Cart");
		bg.moveclick(1);
		bg.moveclick(1);
		bg.movetochart("Cart");
	//	Thread.sleep(3000);
		bg.clickonbutton();
	//	bg.gettext("price-text");
		
}
}
