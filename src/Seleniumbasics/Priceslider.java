package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Priceslider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#range");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement slider = driver.findElement(By.id("slider-range"));
		WebElement slider1= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style = 'left: 15%;']"));
		int i = slider.getSize().width;
		System.out.println(i);
		Actions a = new Actions(driver);
		a.clickAndHold(slider1).moveByOffset(i/2, 0).release().build().perform();
		slider.click();
		slider.click();
	
		
		

	}

}
