package Seleniumpractice;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartproductcount {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k = 0;
		int c=0;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/home-kitchen/home-appliances/washing-machines/fully-automatic-top-load~function/pr?sid=j9e%2Cabm%2C8qx&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Fully%20Automatic%20Top%20Load");
		
		Thread.sleep(4000);
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		List <WebElement> pagination = driver.findElements(By.xpath("//a[@class='_2Xp0TH']"));
		List <WebElement> products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		for ( i= 0;i<products.size();i++)
		{
			products.get(i);
		}
		System.out.println(i);
		for (j=0;j<pagination.size();j++)
			
		{
			if(pagination.size()>0)
			{
				
			next.click();
			Thread.sleep(3000);
			List <WebElement> products1 = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
			for (k=0;k<products1.size();k++)
			{
				products.get(k);
				
				
			}
			i=i+k;
			
				
			
		}
			
		
		
				
			

	}
		
		System.out.println(i);

}
}
