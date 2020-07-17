package Seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Euroclinix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.euroclinix.net/en/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.id("homeBannerSearch"));
		
		search.sendKeys("Viagra");
		search.click();
		Thread.sleep(4000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='bannerSearchPop']//div/descendant::h2"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++)
		{
			
			if (list.get(i).getText().contains("Cialis"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}
