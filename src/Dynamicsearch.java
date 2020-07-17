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
		driver.get("https://www.121doc.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("headerSearch")).sendKeys("viagra");
		Thread.sleep(5000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@id='headerSearchHits']//div/descendant::h2"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			Thread.sleep(2000);
			if (list.get(i).getText().contains("Cialis"))
{
	list.get(i).click();
	break;
}
		}

	}

}
