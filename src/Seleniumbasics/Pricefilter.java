package Seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pricefilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shytobuy.uk/acne-products.html");
		
		
		WebElement slider = driver.findElement(By.xpath("//div[@class='slider slider-horizontal']"));
		int i = slider.getSize().width;
		System.out.println(i);
		
		WebElement slider1 = driver.findElement(By.xpath("//div[@class='slider-handle min-slider-handle round' and @role='slider']"));
	
		Actions a = new Actions(driver);
		a.clickAndHold(slider1).moveByOffset(i/4, 0).release().build().perform();
		slider1.click();
	
	}}

//1301,308