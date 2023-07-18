package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogintoActitime {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.className("initial"));
		loginButton.click();
		//driver.findElement(By.xpath("//a[text()='View Time-Track']/parent::div")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
