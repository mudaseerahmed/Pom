package com.qa.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Naaptoolpage {
	WebDriver driver;
	
	
	public Naaptoolpage(WebDriver driver) {
		this.driver=driver;

}
	public void enter(String id,String text) {
		String path=id;
		By ids=By.id(path);
		driver.findElement(ids).sendKeys(text);
	
		
	}
	public void click(String path) {
		String paths="//div[@id='searchPanel']//div[@class='"+path+"']/a";
		By textbox=By.xpath(paths);
		driver.findElement(textbox).click();
	}
	
public void textofpage(int num) throws InterruptedException{
	
	String pat="//div[@id='page"+num+"'";
	
	String second="]//div[@class='item_title']/a";
	String paths=pat+second;
	System.out.println(paths);
	By pa=By.xpath(paths);
	List<WebElement>a=driver.findElements(pa);
	System.out.println(a.size());
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i).getText());
	}
	
	if(num>1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);",a);
		Thread.sleep(3000);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i).getText());
		}}
}
		
		
		public void clickon(String text) {
			
	String path="//div[@id='grid']//div[@class='item_title']//a[contains(text(),'"+text+"')]";
	
	By paths=By.xpath(path);
	driver.findElement(paths).click();
		}
		public void clickcolor(String color,String text,String texts) {
			
			if(color!="Click here to Buy") {
 String co="//div[@id='square_Details']";	
String two="//a[text()='"+color+"']"; String three="//span[contains(text(),'"+color+"')]";
String threeo=co+two;
String four="//input[@type='text']";
String five="/following::span[1]";
String nine="//following::span[2]";
String close="/following::a[1]";
By col=By.xpath(threeo);
System.out.println(col);
driver.findElement(col).click();
String six=co+four;
By seven=By.xpath(six);
String eigth=six+five;
By eigthy=By.xpath(eigth);
driver.findElement(seven).sendKeys(text);
String ten=eigth+nine;
By tens=By.xpath(ten);
String val=co+three;
String eleven="//p/a[contains(text(),'"+texts+"')]";
String twelve=co+eleven;
String cl=twelve+close;
By fours=By.xpath(cl);
By thir=By.xpath(twelve);
 By colo=By.xpath(val);
Assert.assertEquals(color, driver.findElement(colo).getText());

System.out.println(driver.findElement(colo).getText()+"--is same as "+color);
driver.findElement(eigthy).click();
System.out.println(driver.findElement(tens).getText());
driver.findElement(thir).click();
driver.findElement(fours).click();


			}
			else {
				 String co="//div[@id='square_Details']";	
				 String three="//span[contains(text(),'"+color+"')]";
				String val=co+three;
				 By colo=By.xpath(val);
				 driver.findElement(colo).click();
				
				
}
		
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
		public void price() {
			String one="(//section[@id='ShoppingCartPopup']//ul/li[@class='head_UPrice'])[2]";//following::li[1]"
			String two="//following::li[1] ";
			String three="//following::li[1]";
			By on=By.xpath(one);
			System.out.println(driver.findElement(on).getText());
			String s=driver.findElement(on).getText();
			String s2=s.replace("Rs."," ");
			System.out.println(s2);		
			String s3=s2.replace(",","");
			s3=s3.trim();
			System.out.println(s3);
			int n=Integer.parseInt(s3);
			System.out.println(n+"is integer");
			
			String four=one+two;
			String five=four+three;
			By sec=By.xpath(five);
			String s4=driver.findElement(sec).getText();
			String s5=s4.replace("Rs."," ");
			String s6=s5.replace(",","");
			s6=s6.trim();
			System.out.println(s6);
			int n1=Integer.parseInt(s6);
			System.out.println(n+n1);
			String s7=driver.findElement(sec).getText();
			String s8=s7.replace("Rs."," ");
			String s9=s8.replace(",","");
			s9=s9.trim();
			System.out.println(s9);
			
		}



}
