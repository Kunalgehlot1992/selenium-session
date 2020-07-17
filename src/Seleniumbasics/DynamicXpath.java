package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.121doc.com/en/");
		Thread.sleep(8000);
	List <WebElement> list	= driver.findElements(By.tagName("a"));
	 System.out.println(list.size());
	 for (int i=0;i<list.size();i++) {
		 String s = list.get(i).getText();
		 System.out.println(s);
		 
	 }
	
		driver.findElement(By.xpath("//a[@class='Login loginPopup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-cust_login_field")).sendKeys("aditya@hexpress.net");
		driver.findElement(By.xpath("//a[@class='CtaBtn NextPhase']")).click();
		
	}

}
