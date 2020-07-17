package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
		driver.findElement(By.xpath("//button[@class='dropdown dropdown-toggle' and contains(text(),'Products')]")).click();
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		System.out.println(list.size());

	}

}
