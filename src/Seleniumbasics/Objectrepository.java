package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Objectrepository {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\GehlotK\\eclipse-workspace\\Seleniumsessions\\src\\Seleniumbasics\\config.properties");
		p.load(ip);
		System.out.println(p.getProperty("name"));
		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
		if (browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\Chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
		}
		driver.get(p.getProperty(url));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Modeless Window')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Modeless Window')]")).click();
	

	}

}
