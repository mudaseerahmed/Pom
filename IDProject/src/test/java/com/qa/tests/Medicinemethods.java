package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Medicinemethods {
	

		WebDriver driver;
		
		
		public Medicinemethods(WebDriver driver) {
		this.driver=driver;

}
@DataProvider
public Object[][]enterintextbox(String text){
	driver.findElement(By.id("search")).sendKeys(text);
	Object[][]data=new Object[4][1];
	data[0][0]="honey";
	data[0][1]="mask";
	data[0][2]="n95";
	data[0][3]="feliz";
	return data;

	
}

}
