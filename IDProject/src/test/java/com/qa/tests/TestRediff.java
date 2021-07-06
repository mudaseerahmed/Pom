package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestRediff {
	
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Newchrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Rediffemailmethodspage r=new Rediffemailmethodspage(driver);
		//r.textfields("Mobile").sendKeys("9845718861");
		//generic method textfields to type the text in  the textfield
		r.textfields("Full","1").sendKeys("howarey");
		r.textfields("Choose","1").sendKeys("howarey");
		r.textfields("Password","1").sendKeys("howarey");
		r.textfields("Retype","1").sendKeys("howarey");
		r.textfields("Alternate","1").sendKeys("howarey");
//r.textfields("Mobile","2").click();
	//	Thread.sleep(4000);
		r.textfields("Mobile","2").sendKeys("9845718861");
		r.textfields("Enter the","1").click();
		r.textfields("Enter the","1").sendKeys("howarey");
		
		r.clickmethod("f").click();
		r.clickmethod("m").click();
		r.clickmethod("Check availability").click();
		r.gettextofavailableemailds();
		Thread.sleep(4000);
		System.out.println(r.gettextemail("Choose","1").getText());
		r.clickmethod("Create my account >>").click();
		r.clickonalert();
		//r.clicklink("Home").click();
		r.clicklink("terms").click();
		r.switchtotherwindow("1");
		r.gettitleofpage();
		
		r.switchtotherwindow("0");
		r.gettitleofpage();
		//r.clicklink("privacy").click();
	//	r.gettextemail("Full", "2");
		
		
}

}
