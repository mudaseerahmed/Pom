import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testlo {

	

	@Test
	public void price() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.kapoorlampshades.com/product-category/ceiling-lights/");


	WebElement e3=driver.findElement(By.name("orderby"));

	Select s=new Select(e3);
	s.selectByValue("price-desc");
	String path="//div[@class='price-box']";
	List<WebElement>a=driver.findElements(By.xpath(path));


	for(int i=0;i<a.size();i++) {

	String te=a.get(i).getText();
	int n=te.length();
	// int q=te.indexOf(".00 ");
	int q=te.indexOf(" ");
	String sec=te.substring(q+1, n);


	//ssec=sec.substring(2);
	// sec=sec.substring(1);
	sec=sec.replace(",", "");
	sec=sec.replace(".00", "");
	sec=sec.replaceAll("[^0-9]","");
	System.out.println(sec);
	if(sec.equals("")) {


	}
	else {
	int pr=Integer.parseInt(sec);
	System.out.println(pr+"is first value");


	}

}

}}
