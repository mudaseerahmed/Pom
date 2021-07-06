package com.qa.tests;




import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class companypage {
	WebDriver driver;
	static Logger logger=LogManager.getLogger(companypage.class);
	
	public Point location;
	int x,y,x1,y1;
	public companypage(WebDriver driver) {
		this.driver=driver;

}
	public void entertext(String text,String nam) {
		By na=By.name(nam);
		
		WebElement userNameTxt = driver.findElement(na); 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		// set the text
		jsExecutor.executeScript("arguments[0].value='"+text+"'", userNameTxt);
		Reporter.log("entered"+text);
		logger.info("entered text"+text);
	}
public void entertextwithoutjavscript(String nam,String texts) {
	String na="//label[contains(text(),'"+nam+"')]//following::input[1]";
By tes=By.xpath(na);
driver.findElement(tes).sendKeys(texts);
logger.info("entered text"+texts);
}
public void validatethetextmessage(String message) {
	By error=By.cssSelector(".error");
	
	String text=driver.findElement(error).getText();
	Assert.assertEquals(message, text);
	Reporter.log("verified expected and actual"+message);
}
public void verifybuttonisdisable() {
	boolean status=driver.findElement(By.cssSelector("button")).isEnabled();
	if(status) {
		Reporter.log("button enabled",true);
		logger.info("enabled");
	}
	else {
		Reporter.log("button is disabled",true);
		logger.info("disabled");
	}
}
public void clickoncheckbox() {
	try {
	By cl=By.xpath("//span[@class='checkmark']");
	driver.findElement(cl).click();
	Reporter.log("click on checkbox",true);
	logger.info("clicked on checkbox");
}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void homepage(String text) {
String te="//span[contains(text(),'"+text+"')]";
By home=By.xpath(te);
String tex=driver.findElement(home).getText();
Assert.assertEquals(text, tex,"both are equal");
	
}
public void clickonsignin() {
	try {
	driver.findElement(By.cssSelector("a")).click();
	logger.info("clicked");
}
	catch(Exception e) {
		Reporter.log("unable to click");
		logger.info("unable to click");
	}
}
	public void clickbuttonsubmitorlogin() {
		
	try {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		logger.info("clicked");
	}
	catch(Exception e) {
		e.printStackTrace();
		logger.info("unable to click");
	}
	}
	public void validateloginpagetext() {
	String text="User details incorrect, Please check the information you have entered.";
	String texts=driver.findElement(By.xpath("//div[contains(text(),'User')]")).getText();
	Assert.assertEquals(texts, text);
	logger.info("texts are equal");
		
	}
	public void clearpassword() {
		driver.findElement(By.name("password")).clear();
	}
	public void sendkeystab() {
		try {
			
		
		driver.findElement(By.name("userName")).sendKeys(Keys.TAB);
	}
		catch(Exception e) {
			
			e.printStackTrace();
		}}
	public void gettext() {
		
	
	try{
	String texts=driver.findElement(By.xpath("//div[contains(text(),'User')]")).getText();
	System.out.println(texts);
	}
	catch(Exception e) {
		e.printStackTrace();
	
}}
	public void layoutclick(String text) {
	
	String cl="//p[text()='"+text+"']";
	By pat=By.xpath(cl);
	driver.findElement(pat).click();
	
	}
	public void layout(String ids) {
		driver.findElement(By.id(ids)).click();
		
	}
	public void clickonanytext(int text) throws InterruptedException {
		String texts="(//p[@class='listTitle'])["+text+"]";
		By pat=By.xpath(texts);
		try {
		driver.findElement(pat).click();
		System.out.println("clicked on green tickmark");
		}
		catch(Exception e) {
			driver.findElement(pat).click();
			System.out.println("clicked on green tickmark");
		}
		String textsone=driver.findElement(pat).getText();
		System.out.println(textsone);
		List<WebElement>si=driver.findElements(By.className("listTitle"));
		if(text>0 && text<si.size()) {
		String com="//span[text()='"+textsone+"']";
		By displaynot=By.xpath(com);
	int x=	driver.findElements(displaynot).size();
		if(x==0) {
			System.out.println("not displayed");
		}
		else {
			System.out.println(" displayed");
			Actions a= new Actions(driver);
			a.dragAndDropBy(driver.findElement(By.xpath("//div[@class='react-grid-item react-draggable cssTransforms react-resizable card']")), 123, 0).release().build().perform();
			Thread.sleep(4000);
			 location =driver.findElement(By.xpath("//div[@class='react-grid-item react-draggable cssTransforms react-resizable card']")).getLocation();
			 x1=location.getX();
			 y1=location.getY();
			//a.dragAndDrop(, target)
			 System.out.println(x1);
			// System.out.println(y1);
		}
	
		//String com="//span[text()='"+textsone+"']";
		//By paths=By.xpath(com);
//	System.out.println(driver.findElement(paths).getText()+"is blank");
		
		
	}
	
	
	}
	
public void logout() {
	
String logout=	"//button//img";

By log=By.xpath(logout);
driver.findElement(log).click();

}
public void locationofelement(int text) {
	
	String texts="(//p[@class='listTitle'])["+text+"]";
	By pat=By.xpath(texts);
	
	String textsone=driver.findElement(pat).getText();
	System.out.println(textsone);
	List<WebElement>si=driver.findElements(By.className("listTitle"));
	if(text>0 && text<si.size()) {
	String com="//span[text()='"+textsone+"']";
	By displaynot=By.xpath(com);
int x=	driver.findElements(displaynot).size();
	if(x==0) {
		System.out.println("not displayed");
	}
	else {
		System.out.println(" displayed");
	 location =driver.findElement(displaynot).getLocation();
x=location.getX();
y=location.getY();
System.out.println(x);
//System.out.println(y);
	
	}
	
	}
}
public void clickonclosebutton() {
	WebElement e=driver.findElement(By.className("close"));
	if(e.isDisplayed()) {
	try { 
	driver.findElement(By.className("close")).click();
	Reporter.log("click on close button");
	}
	catch(Exception eone) {
		eone.printStackTrace();
	//	driver.findElement(By.className("close")).click();
		Reporter.log("click on close button");
	}
	
	}
	
}}