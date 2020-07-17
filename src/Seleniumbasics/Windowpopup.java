package Seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Modeless Window")));
		driver.findElement(By.linkText("Modeless Window")).click();
		Thread.sleep(2000);
		
		Set <String> handler =driver.getWindowHandles();
		Iterator <String> it=handler.iterator();
		String parentwindow=it.next();
		System.out.println(parentwindow);
		String childwindow = it.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
		

	}

}
