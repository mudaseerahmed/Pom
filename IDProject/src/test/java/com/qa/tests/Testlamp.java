package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testlamp {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.kapoorlampshades.com/");
		Lamppage lr=new Lamppage(driver);
		lr.mousemove("Shop", "2");
		lr.clickonsubmenu("Checkout", "2");
	String tx=lr.validatetext("Your cart").getText();
	Assert.assertEquals(tx,"Your cart is currently empty.");
		
		
		//lr.mousemove("OUR CLIENTS","2");
		lr.typetext("s",true).sendKeys("tttt");
		lr.typetext("s",true).sendKeys(Keys.RETURN);
		String text=lr.validatetext("No products were found").getText();
		Assert.assertEquals(text,"No products were found matching your selection.");
	
		
		
		lr.mousemove(1);
		lr.mousemove(5);
		
		
		lr.typetext("s",true).sendKeys("lamps");
		lr.typetext("s",true).sendKeys(Keys.RETURN);
		lr.add("KLS019076/01");
		lr.add();
		lr.movemouseonchart("cart-toggler", "Checkout");
		Thread.sleep(2000);
		lr.movemouseonchart("cart-toggler", "Cart");
		lr.typetext("update_cart",false);
	lr.typetext("cart[bafd1b75c5f0ceb81050a853c9faa911][qty]",true).sendKeys("2");
	
	//	lr.typetext("EMAIL").sendKeys("mudaseer@gmail.com");
		
}
}