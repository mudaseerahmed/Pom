package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testonemg {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.1mg.com/");
		Onemgpage on=new Onemgpage(driver);
		//on.close();
		
		driver.navigate().refresh();
		on.clickclose();
		on.entertext("srchBarShwInfo", "crocin ");
		
		//on.close();
		on.clickdropdown(4);
		on.entertext("srchBarShwInfo", "crocin ");
		
		on.clickdropdown(2);
		//on.closeon();
		on.movemouseonmenu("Featured");
		on.movemouseonmenu("Diabetes");
		on.movemouseonmenu("COVID Test & Prevention");
		on.entertexts("location-selector","");
		on.click();
		on.entertexts("location-selector","Goa");
		
		//on.entertexts("location-selector","pune");
		
}

}
