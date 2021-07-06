package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Testitalypage {
	String act1="Tunisia";
	String act2="French";

	Xls_Reader reader = new Xls_Reader("C:\\Users\\HP\\Music\\IDProject\\src\\test\\java\\com\\qa\\tests\\country.xlsx");
	String sheetName = "Country";

		WebDriver driver;
		public Testitalypage(WebDriver driver) {
			this.driver=driver;
		}
		
		
public void clickonheadings(String cname,int num) {
	
	String name="(//span[@class='"+cname+"'])["+num+"]";
	By headers=By.xpath(name);
	driver.findElement(headers).click();
}

public void dropdown(String value1) {
	By name=By.name(value1);
	Select s=new Select(driver.findElement(name));
	
	s.selectByVisibleText(reader.getCellData(sheetName, "Country", 3));
	System.out.println(reader.getCellData(sheetName, "Language", 3));
	
Assert.assertEquals(reader.getCellData(sheetName, "Country", 3),act1);
	
	//else  {
	//Assert.assertEquals(reader.getCellData(sheetName, "Language", 2),act2);


}
public void dropdowns() {
	//By name=By.name(value1);
	//Select s=new Select(driver.findElement(name));
	//s.selectByVisibleText(reader.getCellData(sheetName, "Language", 2));
	WebElement t=driver.findElement(By.xpath("//div[contains(text(),'Select')]//following::select[2]/option"));
	String text=t.getText();
	System.out.println(text);
Assert.assertEquals(reader.getCellData(sheetName, "Language", 3),text);
}

}


