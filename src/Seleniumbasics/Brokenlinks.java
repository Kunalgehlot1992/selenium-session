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

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> linkedlist = new ArrayList <WebElement>();
		for (int i =0;i<list.size();i++)
		{
			if (list.get(i).getAttribute("href") !=null &&(! list.get(i).getAttribute("href").contains("javascript")&&(! list.get(i).getAttribute("href").contains("no protocol:"))))
{
	linkedlist.add(list.get(i));
}
		}
		System.out.println(linkedlist.size());
		for (int j=0;j<linkedlist.size();j++)
		{
			HttpURLConnection connection =(HttpURLConnection) new URL(linkedlist.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String message = connection.getResponseMessage();
			System.out.println(linkedlist.get(j).getAttribute("href")+"-----"+ message);
					
		}

	}

}
