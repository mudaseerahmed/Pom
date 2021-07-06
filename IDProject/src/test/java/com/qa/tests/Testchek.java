package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testchek {
	
	@Test
	public void registration() throws InterruptedException {
		
//in this site if the user clicks on roundtrip then return date is present else if the user clicks one way return date is not present
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Newchrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.switchTo().frame("iframeResult");
		List<WebElement>dr=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<dr.size();i++) {
			dr.get(dr.size()-1).click();
		}
		

}
}
