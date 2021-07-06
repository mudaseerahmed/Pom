package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsouthafrica {
	
	@Test
	public void registration() throws InterruptedException {
		


		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
driver.get("https://www.bidorbuy.co.za/jsp/registration/UserRegistration.jsp");
Testsouthafricapage ts=new Testsouthafricapage(driver);
Thread.sleep(4000);
ts.clickbutton("account");
System.out.println(ts.geterrortext("1").getText());
System.out.println(ts.geterrortext("2").getText());
System.out.println(ts.geterrortext("3").getText());
System.out.println(ts.geterrortext("4").getText());
System.out.println(ts.geterrortext("5").getText());
System.out.println(ts.geterrortext("6").getText());
ts.Entertext("Surname").sendKeys("helo");
ts.Entertext("Name").sendKeys("how");
ts.Entertext("Email").sendKeys("how");
ts.Entertext("Confirm Email").sendKeys("how");
ts.Entertext("Mobile").sendKeys("1288776");
ts.Entertext("Password").sendKeys("how");
ts.clickontop("Sell on bidorbuy");
ts.clickontop("Stores");
ts.clickontop("Promotions");

}
	
}

