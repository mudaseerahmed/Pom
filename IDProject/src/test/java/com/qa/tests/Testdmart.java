package com.qa.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdmart {
	
	
	
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.dmart.in/");
	//	log.debug("opened dmar page");
		dmartpage d=new dmartpage(driver);
		d.validateamount(1);
	//	log.debug("entering keys");
		d.validateamount(2);
		Thread.sleep(3000);
	//	log.debug("entering text");
		d.entertext("pincodeInput", "560011", 2);
		d.entertext("pincodeInput", "", 3);
		d.entertext("scrInput","maggi noodles",1);
	//	log.debug("entered  text successfully");
		d.clickbutton();
	//	log.debug("click");
		d.validateprice();
}
}
