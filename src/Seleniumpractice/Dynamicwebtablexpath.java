package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicwebtablexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='bhargavinagalla15@gmail.com']//parent::div[@role='gridcell']//following-sibling::div[@id='1587541764016-3-uiGrid-000B-cell']//div//button//i[@class='fa fa-pencil']")).click();
		

	}

}
