package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Bangladeshpage {
	
	WebDriver driver;
	
	
	public Bangladeshpage(WebDriver driver) {
		this.driver=driver;

}
	
public void entertext(String name,int n,String textone) {
	
	try{String te="//label[contains(text(),'"+name+"')]//following::input["+n+"]";
	
	By tex=By.xpath(te);
	driver.findElement(tex).sendKeys(textone);
}
	catch(NoSuchElementException e) {
		
		e.printStackTrace();
	}}

public void selectfromdropdown(String iden,String value) {
try {	
	Select s=new Select(driver.findElement(By.id(iden)));
	s.selectByVisibleText(value);
	
}
catch(NoSuchElementException e) {
	
	e.printStackTrace();
}}

public void clickoncheckbox(int n) throws Exception {
String x="(//div[@class='checkbox']//label)["+n+"]";
By input=By.xpath(x);
try {
driver.findElement(input).click();
		
}
catch(Exception e) {
	   JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(input));
	    e.printStackTrace();
}


}}

