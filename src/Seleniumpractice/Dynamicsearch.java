package Seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("printed");
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='ac_results']//ul//li"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i).getText().contains("Printed Chiffon Dress"))
			{
				list.get(i).click();
				break;
			}
		}
		

	}

}

//*[@id="ui-datepicker-div"]/table
//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[4]/a
