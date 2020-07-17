package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")));
		driver .findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		driver.navigate().to("https://www.facebook.com/r.php");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//driver.get("https://www.spicejet.com/");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='highlight-addons']")));
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();

	}

}
