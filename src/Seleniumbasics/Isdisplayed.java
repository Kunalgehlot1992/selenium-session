package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://api.cogmento.com/register/");
		Boolean b = driver.findElement(By.name("email")).isDisplayed();
		System.out.println(b);
		Boolean c = driver.findElement(By.id("terms")).isSelected();
		System.out.println(c);
		driver.findElement(By.id("terms")).click();
		Boolean cd = driver.findElement(By.id("terms")).isSelected();
		System.out.println(cd);
		Boolean d = driver .findElement(By.className("search")).isSelected();
		System.out.println(d);
		
		
		

	}

}
