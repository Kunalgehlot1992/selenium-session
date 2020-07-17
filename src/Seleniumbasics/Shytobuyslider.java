package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shytobuyslider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shytobuy.uk/acne-products.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slider slider-horizontal']")));
		WebElement slider = driver.findElement(By.xpath("//div[@class='slider-track']"));
		int i = slider.getSize().width;
		System.out.println(i);
		WebElement slider1 = driver.findElement(By.xpath("//div[@class='slider-handle min-slider-handle round']"));
		Actions a = new Actions(driver);
		a.clickAndHold(slider1).moveByOffset(i/3, 0).release().build().perform();
		slider1.click();

	}

}
