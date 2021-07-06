package com.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Onemgpage {
WebDriver driver;
	
	public Onemgpage(WebDriver driver) {
		this.driver=driver;
	}
	
public void close() {
	driver.findElement(By.xpath("//span[@title='Close']")).click();
}
public void entertext(String id,String tes) {
	try{String text=id;
	By te=By.id(text);
	driver.findElement(te).clear();
	driver.findElement(te).sendKeys(tes);
	}
	catch(NoSuchElementException e) {
		e.printStackTrace();
	}
}

public void clickdropdown(int n) {
	String tex="(//li[@class='styles__search-item___CYeTh'])["+n+"]";
	By texts=By.xpath(tex);
	driver.findElement(texts).click();
}
public void movemouseonmenu(String text) {
	String te="//span[@itemprop='name' and text()='"+text+"']";
	By texts=By.xpath(te);
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(texts)).perform();
}
public void clickclose() {
	driver.findElement(By.cssSelector(".style__close-icon___3FflV")).click();
}
public void closeon() {
	driver.findElement(By.cssSelector(".style__close___1l-EN")).click();
}
public void entertexts(String id,String tes) {
	String text=id;
By na=By.id(text);
String drop="//li[text()='"+tes+"']";
By drops=By.xpath(drop);

WebElement userNameTxt = driver.findElement(na);
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
// set the text

jsExecutor.executeScript("arguments[0].value='"+tes+"'", userNameTxt);
if(tes.equals("")) {
	System.out.println("dont click");
}
else {
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement w=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(drops)));
	w.click();
	//Actions a=new Actions(driver);
	//a.moveToElement(driver.findElement(drops)).click().perform();;
}
Reporter.log("entered"+tes);
jsExecutor.executeScript("arguments[0].click();", userNameTxt);
}
public void click() {
	driver.findElement(By.id("location-selector")).click();
}
public void getdefaultvalue(String identity,String texts) {
	String ids=identity;
	By ides=By.id(ids);
	String text=driver.findElement(ides).getText();
	
	if(text.equals(texts)) {
		System.out.println("default value is set");
		driver.findElement(ides).click();
	}
	else {
		System.out.println("not set");
		driver.findElement(ides).click();
	}
	
}

public void clickfromdropdown(String text) {
	
	String te="//li[contains(text(),'"+text+"')]";
	By path=By.xpath(te);
	driver.findElement(path).click();
	//div[text()='ADD']//preceding::div[contains(@class,'price-tag')]
	
}
public void verifyavailablesortedornot() {
	String price="//div[text()='ADD']//preceding::div[contains(@class,'price-tag')]";
	By xpaths=By.xpath(price);
	List<WebElement>prices=driver.findElements(xpaths);
	for(int i=1;i<prices.size();i++) {
		String pr=prices.get(i-1).getText();
		String ru=pr.replace("MRP","");
		ru=ru.substring(1);
		//System.out.println(ru);
	double d=Double.parseDouble(ru);
//System.out.println(d);
String prone=prices.get(i).getText();
String ruone=prone.replace("MRP","");
ruone=ruone.substring(1);
//System.out.println(ru);
double done=Double.parseDouble(ruone);
//System.out.println(done);
if(d>=done) {
	System.out.println("pass"+d+"greater than"+done);
}
else {
	System.out.println("fail");
}

		
	}
	
}
}
