package com.qa.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class flowerbulbspage {
	WebDriver driver;
	public flowerbulbspage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void moveslider() {
		By slider=By.className("noUi-base");
		
		
	boolean sl=driver.findElement(slider).isDisplayed();
	Dimension s2=driver.findElement(slider).getSize();
	
	int widthslider=s2.getWidth();
	int xcord=driver.findElement(slider).getLocation().getX();
	Actions a=new Actions(driver);
a.moveToElement(driver.findElement(slider)).click()
.dragAndDropBy(driver.findElement(slider), xcord+widthslider,0).build().perform();
	//.dragAndDropBy(driver.findElement(slider), xcord+s2,0).build().perform();
		WebElement second=driver.findElement(By.xpath("(//div[@class='noUi-touch-area'])[2]"));
		a.moveToElement(driver.findElement(slider)).click().dragAndDropBy(second, -30, 0).build().perform();
//a.dragAndDrop(src, des).perform();
		
	
	}

}
