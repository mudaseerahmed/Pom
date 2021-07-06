package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testmedicine {
	@Test(dataProvider="enterintextbox",dataProviderClass=Medicinemethods.class)
	public void registration(String username) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.netmeds.com/");
		Medicinemethods  obj=new Medicinemethods(driver);
		obj.enterintextbox("text");
	//driver.findElement(By.id(" ")).sendKeys(text);

}
}
