package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcompany {
	static Logger logger=LogManager.getLogger(companypage.class);
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://master.d2y5316nitao5v.amplifyapp.com/signup");
		companypage co=new companypage(driver);
		co.entertextwithoutjavscript("Name", "mudaseer");
		Thread.sleep(1000);
		//co.entertext(" ", "name");email password 12344567890 mudaseerhello123
		co.entertextwithoutjavscript("Email","mudasee3@gmail.com");
		Thread.sleep(1000);
		co.entertextwithoutjavscript("Password","12334556678899900");
		;
		co.validatethetextmessage("Password can only contain Latin letters.");
		co.entertext("","password");
		co.entertextwithoutjavscript("Password","vvv");
		co.validatethetextmessage("Password is too short - should be 8 chars minimum.");

		co.entertext("","password");
		co.entertextwithoutjavscript("Password","mudaseerhello123");
		logger.info("entered password");
		co.verifybuttonisdisable();
		co.clickoncheckbox();
		co.verifybuttonisdisable();
		co.clickbuttonsubmitorlogin();
		co.clickonsignin();
		co.entertextwithoutjavscript("Email","mudasee3@gmail.com");
		co.entertextwithoutjavscript("Password","password");
		co.clickbuttonsubmitorlogin();
		co.gettext();
		Thread.sleep(2000);
		co.validateloginpagetext();
		co.entertext("","userName");
		logger.info("entered space");
		
		co.entertextwithoutjavscript("Email","mudasee3@gmail.com");
		Thread.sleep(6000);
	//	co.clearpassword();
		co.entertext("","password");
		co.sendkeystab();
	//co.entertext("mudaseerhello123", "password");
	co.entertextwithoutjavscript("Password","mudaseerhello123");
		Thread.sleep(3000);
		//co.entertextwithoutjavscript("Password","mudaseerhello123");
		co.clickbuttonsubmitorlogin();
		Thread.sleep(3000);
		co.layout("openlayout");
		co.layoutclick("Map");
	//	co.clickonanytext("Chart");
		co.clickonanytext(1);
		Thread.sleep(3000);
	
		co.clickonanytext(1);
		co.clickonclosebutton();
		Thread.sleep(3000);
		//co.clickonclosebutton();
		
		//co.clickonanytext(2);
		co.logout();
		co.entertextwithoutjavscript("Email","mudasee3@gmail.com");
		co.entertextwithoutjavscript("Password","mudaseerhello123");
		
		co.clickbuttonsubmitorlogin();
		Thread.sleep(3000);
		co.layout("openlayout");
		co.layoutclick("Map");
		co.locationofelement(1);
		
		
}
	
}
