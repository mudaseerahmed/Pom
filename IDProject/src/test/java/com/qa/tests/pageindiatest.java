package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pageindiatest {
	
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.fabindia.com/");
		Fabindiapage fp=new Fabindiapage(driver);

		//fp.clickoncurrencywishlistcart("CC-header-cart-empty");
	/*	fp.clickoncurrencywishlistcart("header","CC-loginHeader-wishlist-anonymous");
		fp.clickoncurrencywishlistcart("CC-signup","CC-loginHeader-createAccount");
		fp.clickbutton("CC-registerUserPane", "cc-button-primary");
	//	fp.clickbutton("CC-registerUserPane","cc-button-secondary");
		fp.entertext("First Name","Mudaseer");
		fp.entertext("Last Name:","Ahmed");
		fp.entertext("Mobile Number:","9845718861");
		fp.entertext("Email Address:","helo@gmail.com");
		fp.entertext("Referral Code:","333277");
		fp.entertext("Password:", "password");
		fp.entertext("Confirm Your Password:","password");
		fp.clickbutton("CC-registerUserPane","cc-button-secondary");
		fp.clickoncurrencywishlistcart("header","CC-header-cart-empty");
		fp.verifyenabledisable("checkout");
		*/
		fp.clickimage("search_icon", 2, "novalue");
		fp.clickimage("search_icon",3,"shirt");
		fp.clickshirt(1);
		fp.switchtotherwindow("1");
	
		fp.clickonbuttononebyone();
		fp.switchtotherwindow("0");
		fp.clickonplusorminus("price");
		
}
}
