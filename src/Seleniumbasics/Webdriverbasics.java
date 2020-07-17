package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getCurrentUrl());
		String tile = driver.getTitle();
		
		
		if(tile.equals("Downloads")) {
			System.out.println("Title is as expected");
		
			
		}
		else
		{
			System.out.println("Title is not as expected");
		}
		String s = driver.getPageSource();
		System.out.println(s);
		driver.quit();

	}

}
