package Seleniumbasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookbrokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("href")));
		List<WebElement> link = new ArrayList<WebElement>();
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i).getAttribute("href")!=null && (! list.get(i).getAttribute("href").contains("no protocol:")))
				link.add(list.get(i));
		
		}
		System.out.println(link.size());
		for (int j=0;j<link.size();j++)
		{
			
			HttpURLConnection connection = (HttpURLConnection) new URL(link.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			for (int k =1;k<=list.size();k++) {
				
			
			System.out.println(k+")"+ link.get(j).getAttribute("href")+"------"+ response);
			
			}
			break;
		}
		
		
}
}
