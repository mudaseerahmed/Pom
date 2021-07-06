package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testtelmedpage {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.1mg.com/");
		Onemgpage on=new Onemgpage(driver);
		driver.navigate().refresh();
		//on.clickclose();
		on.entertext("srchBarShwInfo", "Telmed");

		on.clickdropdown(1);
		on.getdefaultvalue("sort-option","Relevance");
		on.clickfromdropdown("High to");
		Thread.sleep(3000);
		//on.getdefaultvalue("sort-option","Relevance");
		//on.clickfromdropdown("Low to");
		//on.close();
		on.verifyavailablesortedornot();
}
}
