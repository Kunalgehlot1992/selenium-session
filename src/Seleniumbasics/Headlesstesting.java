package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.121doc.com/en/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Erectile Dysfunction')]")).click();
		System.out.println(driver.getTitle());

	}

}
