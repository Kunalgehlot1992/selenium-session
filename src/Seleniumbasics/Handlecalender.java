package Seleniumbasics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlecalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker2")));
		driver.findElement(By.id("datepicker2")).click();
		String date = "30-April-2021";
		String date1[] = date.split("-");
		String day = date1[0];
		String month = date1[1];
		String year = date1[2];
		Select month1 = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month1.selectByVisibleText(date1[1]);
		Select year1 = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year1.selectByVisibleText(date1[2]);
		String beforexpath = "/html/body/div[2]/div/div[2]/div/table/tbody/tr[";
		String afterxpath = "]/td[";
		String val = null;
		for (int row =1;row<=6;row++)
		{
			for (int col=1;col<=7;col++)
			{
				try
				{
				 val = driver.findElement(By.xpath(beforexpath+row+afterxpath+col+"]")).getText();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Please select correct date");
					break;
					
				}
				if (val.equals(day)) {
					driver.findElement(By.xpath(beforexpath+row+afterxpath+col+"]")).click();
					break;
				}
			}
		}
		
		
			
		
		
		

	}

}



