package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGeorgia {
	@Test
	public void registration() throws InterruptedException {
		
//in this site if the user clicks on roundtrip then return date is present else if the user clicks one way return date is not present

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.georgian-airways.com/");
		GeorgiaPage gp=new GeorgiaPage(driver);
	    gp.verifytextispresentornot("depDates", "text", 2);
		gp.clickRoundonewmulti("journeyTypeOW1");
		gp.verifytextispresentornot("flights","hidden",2);
		gp.clickRoundonewmulti("journeyTypeRT1");
		gp.clickRoundonewmulti("journeyTypeOJ1");
	    gp.verifytextispresentornot("returnDate2", "text", 1);
	    gp.sortthedrodown("dynamic_select");
	    gp.clickonfromto("destSelect_dep0");
	    gp.clickRoundonewmulti("journeyTypeRT1");
	    gp.selectfromto("destSelect_dep0","Batumi, Batumi (BUS)");
	    gp.clickonfromto("destSelect_arr0");
	    gp.selectfromto("destSelect_arr0", "Tbilisi, International (TBS)");
	    Thread.sleep(2000);
	    gp.calendar(6,23,"departure");
	 //   gp.calendar(6,2,"return");
	    
	 //   gp.clicklanguage("ge");
	 //   gp.clicklanguage("ru");
	   
	    
	   // gp.selectfromdropdown("Tbilisi (TBS)");
		
		
}
}

