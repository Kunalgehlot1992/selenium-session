package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		String before = "//*[@id='customers']/tbody/tr[";
				String after = "]/td[1]";
				
				List <WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
				System.out.println(rows.size());
				for (int i=2;i<=rows.size();i++)
				{
					WebElement element = driver.findElement(By.xpath(before+i+after));
					System.out.println(element.getText());
					if (element.getText().equals("Ernst Handel"))
					{
						System.out.println("Company name is :" +element.getText() );
						System.out.println("Company name is positioned at:" +i-1);
						break;
					}
				}
				
			
				
		

	}

}
