package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

 public  class Launchdriver {
	
public void driver()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php");
	driver.findElement(By.name("firstname")).sendKeys("Kunal");
	driver.findElement(By.name("lastname")).sendKeys("Gehlot");
	driver.findElement(By.name("reg_email__")).sendKeys("7999084600");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Kunal10#");
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByVisibleText("28");
	Select month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("Jan");
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("1992");
	driver.findElement(By.id("u_0_7")).click();
	driver.findElement(By.id("u_0_14")).click();
}

}
