package com.qa.tests;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Wolfpages {
	
	WebDriver driver;
	
	
	public Wolfpages(WebDriver driver) {
		this.driver=driver;

}
	
	public void sendtextinput(String text,String cl) throws InterruptedException {
		String c=cl;
		int x=0;
		By cs=By.className(c);
		String word=" ";
		String te="//input";
		By tes=By.xpath(te);
		driver.findElement(tes).sendKeys(text);
		String teo=text.replaceAll("[*-+]", " ");
char bo=text.charAt(1);
char boo=text.charAt(0);
char boon=text.charAt(2);
String in=Character.toString(bo);

if(in.contains("+")) {
	
}
		System.out.println(teo);
		String arr[]=text.split("\\+");
		String zz=Arrays.toString(arr);
	
	//	System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
		
		
			 x=Integer.parseInt(arr[i])+x;
		// word=arr[i];
		}
	//	int x=Integer.parseInt(arr[0]);
		System.out.println(x);
		
	//	int y=Integer.parseInt(arr[1]);
//	System.out.println(y);
	//	int z=y+x;
		System.out.println(x);
		String fo=driver.findElement(cs).getText();
		int act=Integer.parseInt(fo);
		Thread.sleep(1000);
	System.out.println(act);
		Assert.assertEquals(act,x);
		
	}
}
