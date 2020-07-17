package Seleniumpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandle {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\GehlotK\\eclipse-workspace\\Seleniumsessions\\src\\Seleniumpractice\\config.properties");
		pr.load(f);
		String browser = pr.getProperty("browser");
		if (browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait (driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("linkxpath"))));
		driver.findElement(By.xpath(pr.getProperty("linkxpath"))).click();
		Thread.sleep(2000);
		Set <String> s =driver.getWindowHandles();
		Iterator<String> it =s.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		

	}

}
