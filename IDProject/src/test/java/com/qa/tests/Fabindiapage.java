package com.qa.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fabindiapage {
	public WebDriver driver;
	public Fabindiapage(WebDriver driver) {
		this.driver=driver;

}
	public void clickoncurrencywishlistcart(String div,String identity) {
		String id="(//div[@id='"+div+"']//a[@id='"+identity+"'])[1]";
		
		By path=By.xpath(id);
		try {
		driver.findElement(path).click();
		}
		catch(Exception e) {
			
			    JavascriptExecutor executor = (JavascriptExecutor) driver;
			    executor.executeScript("arguments[0].click();", driver.findElement(path));
			
		}}
	
	public void clickbutton(String ids,String cl) {
		String iden="//div[@id='"+ids+"']//button[@class='"+cl+"']";
		
By butt=By.xpath(iden);
driver.findElement(butt).click();
	
	}
public void entertext(String text,String name) {
	String tex="(//label[contains(text(),'"+text+"')]//following::input[1])[1]";
	By fields=By.xpath(tex);
	driver.findElement(fields).sendKeys(name);
}

public void verifyenabledisable(String text) {
	String texts="//div[@class='"+text+"']/a";
	By te=By.xpath(texts);
String cl=driver.findElement(te).getAttribute("data-bind");
	System.out.println(cl);
	if(cl.contains("disabled")) {
		
		System.out.println("button is disabled");
	}
	else {
		System.out.println("button is enabled");
	}
	
	
	
}

public void clickimage(String tex,int num,String shirt) {
	
	String text="(//img[@alt='"+tex+"'])["+num+"]";
	By search=By.xpath(text);
	driver.findElement(search).click();
	if(num==3) {
	String sec="//following::input[1]";
	String textbox=text+sec;
	By texts=By.xpath(textbox);
	driver.findElement(texts).sendKeys(shirt);
	driver.findElement(texts).sendKeys(Keys.ENTER);
	
	
	
	}}

	public void clickshirt(int num) {
		String text="(//img[@class='fab-product-images'])["+num+"]";
		By cl=By.xpath(text);
		driver.findElement(cl).click();
		
	}
	public void switchtotherwindow(String num) {
		Set<String>it=driver.getWindowHandles();
		Iterator<String>id=it.iterator();
		ArrayList<String>a=new ArrayList<String>();
		while(id.hasNext()) {
		a.add(id.next());
		}
		driver.switchTo().window(a.get(Integer.parseInt(num)));
		System.out.println("Switched to   "+num+" window");
	}
	
	
	public void clickonbuttononebyone() {
		
		try {
		List<WebElement>a=driver.findElements(By.id("CC-prodDetails-sku-FBProduct_x_size"));
		for(int i=0;i<(a.size())/2;i++) {
		String value=a.get(i).getAttribute("disabled");
		if(value=="disabled") {
			System.out.println("dont click");
	}
	else {
			a.get(i).click();
			System.out.println("clicked");
		
		}}}
		catch(StaleElementReferenceException e) {
			List<WebElement>a=driver.findElements(By.id("CC-prodDetails-sku-FBProduct_x_size"));
			for(int i=0;i<(a.size())/2;i++) {
			String value=a.get(i).getAttribute("disabled");
			if(value=="disabled"){
				System.out.println("dont click");
		}
		else {
			System.out.println(a.get(i).getText());
				a.get(i).click();
				System.out.println("clicked");
			
			}}}
		}
		public void clickonplusorminus(String text) {
			String tex="//h3[contains(text(),'"+text+"')]";
			By te=By.xpath(tex);
			driver.findElement(te).click();
			
		}
		



}

