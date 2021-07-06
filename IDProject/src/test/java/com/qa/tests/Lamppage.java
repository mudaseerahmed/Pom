package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lamppage {

		WebDriver driver;
		
		
		public Lamppage(WebDriver driver) {
			this.driver=driver;

	}
		public WebElement mousemove(String text,String num) {
			String texts="(//div[@class='row-container']//a[text()='"+text+"'])";
			String nums="["+num+"]";
			String both=texts+nums;
			By mouse=By.xpath(both);
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(mouse)).build().perform();
		return driver.findElement(mouse);
			
		}
public WebElement typetext(String names,boolean value) {
	String text=names;
	By namee=By.name(text);
	Boolean truefalse=driver.findElement(namee).isEnabled();
	if(value==true) {
	System.out.println("button is enabled")	;
	}
	else {
		System.out.println("button is disabled");
	}
	return driver.findElement(namee);
}
public WebElement clickonsubmenu(String text,String num) {
	String texts="(//ul[@class='sub-menu']/li/a[text()='"+text+"'])";
	String nums="["+num+"]";
	String both=texts+nums;
	By submenu=By.xpath(both);
	try {
		driver.findElement(submenu).click();
	}
	catch(Exception e) {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(submenu));
	}
	return driver.findElement(submenu);
}

public WebElement validatetext(String texts) {
	String text="//p[contains(text(),'"+texts+"')]";
	By nums=By.xpath(text);
	return driver.findElement(nums);
	
	
	
}
public WebElement mousemove(int num) {
	String texts="(//ul[@id='menu-top-menu']//a)";
	String nums="["+num+"]";
	String sum=texts+nums;
	By account=By.xpath(sum);
	
	Actions act=new Actions(driver);
	if(num==1) {
		act.moveToElement(driver.findElement(account)).build().perform();
	}
	else if(num>1 && num<6) {
		act.moveToElement(driver.findElement(account)).click().build().perform();
	}
	else {
		System.out.println("invalid input");
	}
	return driver.findElement(account);

}
public void add(String text) {
	
	String te="(//div[@class='product-wrapper']//a[text()='"+text+"'])[1]";
	
	By acc=By.xpath(te);
driver.findElement(acc).click();
	
	
}
//add to chart button
public void add() {
	String xp="//div[@class='quantity']//following::button";
	
	By xpa=By.xpath(xp);
	driver.findElement(xpa).click();
}

//move on chart and click on checkout or view chart
public void movemouseonchart(String clname,String num) {
	String cart="//div[@class='"+clname+"']";
	String ca="/following::p[@class='buttons']/a[contains(text(),'"+num+"')]";
	String two=cart+ca;
	By carts=By.xpath(cart);
	By tw=By.xpath(two);
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(carts)).build().perform();
	
	a.moveToElement(driver.findElement(tw)).click().perform();
	
	System.out.println(driver.getTitle());
}

public void validate_total(String num) {
	String nums="//input[@type='number']";
	By path=By.xpath(nums);
	driver.findElement(path).sendKeys(num);
	
	
	
}
public void verifydisabled()
{
	
	
	}
}
