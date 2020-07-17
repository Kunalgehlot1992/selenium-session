import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googledynamicsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GehlotK\\Desktop\\Selenium set up\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(2000);
		List<WebElement>list = driver.findElements(By.xpath("//ui[@class='erkvQe']//li//div//descendant::div[@class='sbl1 sbl1p']//span"));
		System.out.println(list.size());
		

	}

}
