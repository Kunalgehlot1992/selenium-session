package Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntrasearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans");
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']//ul//li[@class='desktop-suggestion null']"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i).getText().contains("Jeans For Girls"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}

//div[text()='bhargavinagalla15@gmail.com']//parent::div[@role='gridcell']//following-sibling::div[@id='1587541764016-3-uiGrid-000B-cell']//div//button//i[@class='fa fa-pencil']


//div[@class=' desktop-autoSuggest desktop-showContent']//ul//li[@class='desktop-suggestion null']