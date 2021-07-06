package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testnaptol {
	@Test
	public void registration() throws InterruptedException {
		
//in this site if the user clicks on roundtrip then return date is present else if the user clicks one way return date is not present
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.naaptol.com/");
		Naaptoolpage page=new Naaptoolpage(driver)
;
		
		page.enter("header_search_text", "phone");
		page.click("cart");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		page.click("search");
		page.textofpage(1);;
		page.textofpage(2);;
		page.clickon("Trendy");
		page.switchtotherwindow("1");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		page.clickcolor("Blue","560082","Terms");
		page.clickcolor("Click here to Buy", "111", "term");
		page.price();
		//page.clickcolor("Red");
	//page.clickcolor("Check");
	Actions a1=new Actions(driver);
	a1.sendKeys(Keys.ESCAPE).build().perform();
		//page.clickon("blue");
	
	//	page.textofpage(3);;
		//a.sendKeys(Keys.SPACE).build().perform();
		//page.enter("best_offer_enquiry_email", "hello@gmail.com");
}
}
