package Seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3schoolssearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/php/php_ajax_livesearch.asp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@onkeyup='showResult(this.value)']")).sendKeys("CSS");
		List<WebElement>list=driver.findElements(By.xpath("//div[@id='livesearch']//a"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++)
		{
			
			if (list.get(i).getText().contains("CSS background Property"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}
