package Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		String beforexpath = "//*[@id=\"table\"]/tbody/tr[";
		String afterxpath = "]/td[2]";
		List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"table\"]/tbody/tr"));
	
		System.out.println(list.size());
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("closesubscribe")));
		driver.findElement(By.className("closesubscribe")).click();
		Thread.sleep(3000);
		
		for (int i=1;i<list.size();i++)
		{
			
			if (list.get(i).getText().contains("selenium-webdriver.com"))
			{
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/table/tbody/tr["+i+"]/td[1]/input")).click();
				break;
			}
		}

	}
	
	

	

}

//*[@id="table"]/tbody/tr[2]/td[2]
