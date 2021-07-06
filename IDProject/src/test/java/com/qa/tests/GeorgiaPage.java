package com.qa.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeorgiaPage {
	WebDriver driver;
	
	
	public GeorgiaPage(WebDriver driver) {
		this.driver=driver;

}
	public WebElement verifytextispresentornot(String id,String type,int num) {
		String text="(//div[@id='"+id+"']//input[@type='"+type+"'])["+num+"]";
		By returndate=By.xpath(text);
		if(type.equals("text") && id.equals("depDates")) {
			System.out.println("return date is present");
			
		}
		else if(type.equals("hidden")) {
			System.out.println("return date is not present");
		}
		else if(id.equals("returnDate2")){
			System.out.println("return textbox of multiplecity is selected");
		}
		else {
			System.out.println("invalid");
		}
		return driver.findElement(returndate);
	}
	public void clickRoundonewmulti(String id) {
		if(id.equals("journeyTypeRT1")) {
			System.out.println("roundtrip is selected");
		}
		else if(id.equals("journeyTypeOW1")) {
			String text="journeyTypeOW1";
			By oneway=By.id(text);
			driver.findElement(oneway).click();
			
		}
		else if(id.equals("journeyTypeOJ1")) {
			String text="journeyTypeOJ1";
			By multi=By.id(text);
			driver.findElement(multi).click();
			System.out.println("multi is selected");
		}}
		public void selectfromdropdown(String name) {
			Select s=new Select(driver.findElement(By.id("dynamic_select")));
			s.selectByVisibleText(name);
		}
		public void sortthedrodown(String idis) {
			String ids=idis;
			By loc=By.id(ids);
			WebElement drop=driver.findElement(loc);
			Select s=new Select(drop);
			List<WebElement>a=s.getOptions();
			ArrayList org=new ArrayList();
			ArrayList temp=new ArrayList();
			for(WebElement options:a) {
				org.add(options.getText());
				temp.add(options.getText());
			}
			Collections.sort(temp);
			System.out.println(temp);
			
		}
		public void clickonfromto(String identity) {
			String ids=identity;
			By loc=By.id(ids);
			try {
			driver.findElement(loc).click();
			}
			catch(NoSuchElementException e) {
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("arguments[0].click();", driver.findElement(loc));
			////div[@class='language_bar']/a[contains(@class,'ru')]	
			}}
		
			public void clicklanguage(String lang) {
				String ids="//div[@class='language_bar']/a[contains(@class,'"+lang+"')] ";
				By loc=By.xpath(ids);
				try {
					driver.findElement(loc).click();
					}
					catch(NoSuchElementException e) {
						
						JavascriptExecutor js=(JavascriptExecutor)driver;
					    js.executeScript("arguments[0].click();", driver.findElement(loc));
					////div[@class='language_bar']/a[contains(@class,'ru')]	
					}}
			
			public void selectfromto(String ids,String texts) {
				String id=ids;
				By lo=By.id(id);
				Select s=new Select(driver.findElement(lo));
				s.selectByVisibleText(texts);
			;
			}
			public void calendar(int mon,int date,String text) {
				
				String dat="//div[@class='"+text+"']//following::input[1]";
				By locone=By.xpath(dat);
				driver.findElement(locone).click();
				String da="//table[@class='ui-datepicker-calendar']//td[@data-month="+mon+"]//a[text()="+date+"]";
				By loc=By.xpath(da);
				driver.findElement(loc).click();
			}
				
			}
			
		
	
	

