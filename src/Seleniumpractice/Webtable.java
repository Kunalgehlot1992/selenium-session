package Seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://phptravels.net/admin");
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.get("https://phptravels.net/admin/locations");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//*[@id="content"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[3]
		//*[@id="content"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[3]
		//*[@id="content"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[3]
		
		String beforexpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[";
		String afterxpath = "]/td[3]";
		List<WebElement>list =driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr"));
		System.out.println(list.size());
		for (int i =1;i<=list.size();i++) {
			WebElement element = driver.findElement(By.xpath(beforexpath+i+afterxpath));
			if (element.getText().contains("Mazar-i-sharif"))
			{
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[8]/span/a[1]/i")).click();
			}
		}
		

	}

}


