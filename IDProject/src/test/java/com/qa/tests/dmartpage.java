package com.qa.tests;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class dmartpage {
	WebDriver driver;
	////p[text()='You Pay' or text()='DMart']//following::span[2]
	
	public dmartpage(WebDriver driver) {
		this.driver=driver;

}
	public void entertext(String identity,String text,int n) {
		
		String id="//input[@id='"+identity+"']";
		String two="//following::button["+n+"]";
		String three=id+two;
		By texts=By.xpath(id);
		By four=By.xpath(three);
driver.findElement(texts).sendKeys(text);
Reporter.log("entered"+ text);
driver.findElement(four).click();
Reporter.log("clicked");

	}
	public void clickbutton() throws InterruptedException {
		List<WebElement>a=driver.findElements(By.xpath("//p[text()='You Pay' or text()='DMart']//following::span[2]//following::button"));
		List<WebElement>c=driver.findElements(By.xpath("//p[text()='You Pay' or text()='DMart']//following::span[2]"));
		List<WebElement>b=driver.findElements(By.xpath("//button[contains(@class,'disable')]"));
		for(int i=0;i<b.size();i++) {
			System.out.println("dont click");
			
	}
		
	//	for(int i=0;i<c.size();i++) {
		
		for(int j=0;j<a.size();j++) {
			System.out.println(a.size());
			WebElement bu=driver.findElement(By.xpath("//button[contains(@class,'disable')]"));
	String tex=bu.getAttribute("class");
	System.out.println(tex+"is not");
	if(tex.contains("disable")) {
		System.out.println("disabled");
	}
			
	else if(tex.endsWith("fullWidth"))
		System.out.println(a.size());
if(a.get(j).isEnabled()) {
//	String text=c.get(i).getText();
//	int n=Integer.parseInt(text);
//	System.out.println(n+" "+i);
	a.get(j).click();
	Thread.sleep(3000);
}
else {
	System.out.println("dont click");
}
			
		
			System.out.println("clicked");
		
	
			
		}
		}
//	}
	
	public void validateamount(int num) {
		String path="(//span[@class='MuiIconButton-label']//span)";
		
				
				String nums="["+num+"]";
				
				String two=path+nums;
				By three=By.xpath(two);
				String text=driver.findElement(three).getText();
				

		if(num==2) {
			String no=" ";
			text=text.trim();
			int n=text.length();
			for(int i=0;i<n;i++) {
				char c=text.charAt(i);
				if(Character.isDigit(c)) {
					no=no+c;
					no=no.trim();
					no=no.toString();
				System.out.println(no);
					int x=Integer.parseInt(no);
					Assert.assertEquals(x, 0);
					System.out.println("count is "+x);
					break;
					
				}
				//log.debug("validated count");
			}
			
			
		}
		else {
		int num1=Integer.parseInt(text);
		Assert.assertEquals(num1, 0);
		System.out.println("intial amount is rupees  --"+num1);
	}
		
	
		
	
}
	
	public void validateprice() throws InterruptedException {
		List<WebElement>c=driver.findElements(By.xpath("//p[text()='You Pay']//following::span[2]"));
		WebElement text=driver.findElement(By.xpath("//span[@class='MuiIconButton-label']//span[contains(@class,'amountCntr')]"));
		String rupees=text.getText();
		String numberOnly = rupees.replaceAll("[^0-9]", "");
		numberOnly=numberOnly.trim();
		int ro=Integer.parseInt(numberOnly);
		int y=0;
		for(int i=0;i<c.size();i++) {
			System.out.println(c.size());
			System.out.println(i);
		String ru=	c.get(i).getText();
		Thread.sleep(3000);
		System.out.println(ru);
			int x=Integer.parseInt(ru);
			y=y+x;
		
			
		}
		Assert.assertEquals(y, ro);
		
	}
}