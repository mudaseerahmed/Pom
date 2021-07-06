package com.qa.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Rediffemailmethodspage {
		WebDriver driver;
		
		public Rediffemailmethodspage(WebDriver driver) {
			this.driver=driver;

	}
		public WebElement textfields(String text,String num) {
		
			String fields="//td[contains(text(),'"+text+"'";
			String last=")]//following::input["+num+"]";

			String path=fields+last;
			By username=By.xpath(path);
			
		
			return driver.findElement(username);
			
		}
		public WebElement clickmethod(String text) {
			String first="//td//input[@value='"+text+"']";
			By radio=By.xpath(first);
			return driver.findElement(radio);
		}
		public WebElement clicklink(String text) {
			String textvalue="//a[contains(text(),'"+text+"')]";
			By link=By.xpath(textvalue);
			return driver.findElement(link);
			
		}
		public void clickonalert() {
			driver.switchTo().alert().accept();
		}
		
		
		public WebElement gettextemail(String text,String num) {
			String val="//td[contains(text(),'"+text+"'";
			String valu=")]//preceding::b["+num+"]";
			String vall=val+valu;
			By text1=By.xpath(vall);
			return driver.findElement(text1);
		}
		public List<WebElement>gettextofavailableemailds(){
			
			String val="//div[@id='recommend_text']//td[@class='f14']";
			By value=By.xpath(val);
			List<WebElement> n=driver.findElements(value);
			for(int i=0;i<n.size();i++) {
				System.out.println(n.get(i).getText());
			}
			return driver.findElements(value);
			
		
			
			
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
		
	//	public WebElement 
	
	
	public void gettitleofpage() {
		String title=driver.getTitle();
		System.out.println("title is "+title);
		
	}
	}
	
