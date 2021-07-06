package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testlampscromption {
	
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.crompton.co.in/product-category/consumer-lighting/conventional-lamps/ftl-lamps/");
		Cromptonpage co=new Cromptonpage(driver);
		co.clicktwice(1);
		co.clicktwice(2);
		co.clicktwice(3);
		co.clicktwice(4);

}
}
