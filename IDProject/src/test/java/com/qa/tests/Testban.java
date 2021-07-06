package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testban {
	@Test
	public void registration() throws Exception {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://token.bdcgny.org/mail");
		Bangladeshpage ob=new Bangladeshpage(driver);
		ob.entertext("Your Name", 1,"Mudaseer");
		ob.entertext("Return Mail Type", 2,"23455");
		ob.selectfromdropdown("return_type", "UPS");
		ob.selectfromdropdown("department[0]","Visa");
		ob.selectfromdropdown("service0","Visa");
		ob.entertext("Name*",1,"Ahmed");
		ob.clickoncheckbox(1);
		ob.clickoncheckbox(2);
}
}
