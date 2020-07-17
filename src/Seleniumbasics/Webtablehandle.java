package Seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtablehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		
		String beforexpath = "//*[@id=\"table\"]/tbody/tr[";
		String afterxpath = "]/td[2]";
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='closesubscribe']")));
		driver.findElement(By.xpath("//a[@class='closesubscribe']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"table\"]/tbody/tr"));
		System.out.println(list.size());
		
		
		for (int i=2;i<=list.size();i++)
		{
			WebElement element = driver.findElement(By.xpath(beforexpath+i+afterxpath));
			System.out.println(element.getText());
			if (element.getText().contains("facebook.com")) {
				driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}
		

	}

}
