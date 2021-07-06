package com.qa.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestKenya {
	
	@Test
	public void registration() throws InterruptedException {
		
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://shopit.co.ke/profiles-add/");
		TestKenyapage r=new TestKenyapage(driver);
		
		r.typetextintextbox("email").sendKeys("mudaseer");;
	
		r.typetextintextbox("password1").sendKeys("hello");
		//r.typetextintextbox("password2").sendKeys("hello88");
		r.clickbelowmailinglists("gdpr_agreements_user_registration").click();
		r.clickbelowmailinglists("gdpr_agreements_newsletters_subscribe").click();
		r.clickbelowmailinglists("profile_mailing_list_1").click();
		r.clickonregister("Register").click();
	System.out.println(	r.gettexterror("E-mail","1","1").getText());
	System.out.println(	r.gettexterror("Password","1","1").getText());
	System.out.println(	r.gettexterror("Confirm password","1","1").getText());
		
		

}
}