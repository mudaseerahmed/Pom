import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testone {
//handling combotree jquery
public static void main(String[]args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
driver.findElement(By.id("justAnInputBox")).click();
selectchoice(driver,"choice 2","choice 2 1");


}



public static void selectchoice(WebDriver driver,String...value) {
	List<WebElement>choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
	if(!value[0].equals("all")) {
		
		for(WebElement item:choicelist) {
			String text=item.getText();
			for(String val:value) {
				if(text.equals(val)){
					
					item.click();
					break;
					
				}
			}
			
			
		}
	}
	
	
	
}
}
